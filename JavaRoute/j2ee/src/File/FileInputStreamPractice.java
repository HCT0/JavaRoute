package File;
import java.io.*;
public class FileInputStreamPractice {
	/*
	 * ��������ļ��ĸ����ļ�������
	 * �½��м���ļ��Ĵ����Եļ��
	 * ����������д������ļ���
	 * */
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\File");
		if(!f.getParentFile().exists()) {//�����һ�β����ڣ��򴴽�
			f.mkdirs();
		}
		FileOutputStream fis = new FileOutputStream(f);
		fis.write(null);
		fis.close();
	}
}
