package File;
import java.io.*;
public class FileInputStreamPractice2 {
	/*
	 * ����ļ�����װ�ļ�
	 * �𣺽�����k���ļ���Ϊ100kһ��
	 * ��ϣ�������������Ϊһ���ļ�
	 * �ر�������try���Զ����йر�
	 * Ҳ������finally���йر�
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\File\\filebackup.chm");
		String str1 = "filebackup-";
		String str2 =".chm";
		try(FileInputStream fis = new FileInputStream(f);){//�����ļ��Ĳ��
			byte[] str3 = new byte[(int)f.length()];
			byte[] str4 = new byte[1024000];
			fis.read(str3);
			int i=0;
			if(f.length()>102400) {	
				while(i < f.length()){
					str4[i % 102400 ]=str3[i];
					if(i % 102400 == 0 ) {
						String str5 = str1+i/102400+str2;//��װ�ļ�����
						@SuppressWarnings("resource")
						FileOutputStream fos = new FileOutputStream(str5);
						fos.write(str4);
					}
				}
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}