package File;
import java.io.*;

public class FilePractice {
	static File fileName1;
	static File fileName2;
 	public void searchFile(File f) {
 		File [] fs = f.listFiles();
 		if(null == fs)
 			return ;
 		for (File f2 : fs) {
 			if(f2.exists()) {
				if(f2.isDirectory()) {
					searchFile(f2);
				}
				else 
				{
					if(f2.length() > fileName1.length()) {
						fileName1 = f2;
					}
					if(f2.length() < fileName2.length()) {
						if(f2.length() != 0) 
							fileName2 = f2;	
					}	
				}	
			}
 			else {
 				continue;
 			}
		}
	}
	public static void main(String[] args) {
		float t1 = System.currentTimeMillis();
		File f = new File("C:\\WINDOWS");
		if(f.exists())
			System.out.println("�ļ�����");
		FilePractice fp = new FilePractice();
		File [] fs = f.listFiles();
		if(null == fs)
			System.out.println("�����ļ�����ʧ��");
		fileName1 = fs[0];
		fileName2 = fs[0];
		fp.searchFile(f);
		System.out.println("�����ļ���:"+fileName1.getAbsolutePath()+"�ļ��Ĵ�СΪ"+fileName1.length()+"�ֽ�");
		System.out.println("�����ļ���:"+fileName2.getAbsolutePath()+"�ļ��Ĵ�СΪ"+fileName2.length()+"�ֽ�");
		float t2 = System.currentTimeMillis()-t1;
		System.out.println("�ܼƻ���ʱ��Ϊ:"+t2);
	}
}
