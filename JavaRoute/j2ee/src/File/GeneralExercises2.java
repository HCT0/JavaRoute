package File;
import java.io.*;
import java.util.*;

public class GeneralExercises2 {
	public static void copyFolder(String srcFolder, String destFolder){
		File f1 = new File(srcFolder.replaceAll("\\\\","\\\\\\\\"));
		File [] filelist1 = f1.listFiles();
		for(File f3 :filelist1) {
			if(f3.isDirectory())
				copyFolder(f3.getAbsolutePath(),destFolder+"\\"+f3.getName());//�������ļ���
			else {//���ļ�����Ŀ��Ŀ¼���и���
				File fileTest = new File(destFolder,f3.getName());
				//new File(�ļ���ַ���ļ�����)
				try {
					fileTest.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ԴĿ¼��ַ");
		String srcFile = s.nextLine();
		System.out.println("������Ŀ��Ŀ¼��ַ");
		String destFile = s.nextLine();
		copyFolder(srcFile,destFile);
	}
}
