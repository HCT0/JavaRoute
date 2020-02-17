package File;
import java.io.*;
import java.util.*;
public class GeneralExercises3 {
	public static void findWord(String fileLocation ,String word) {
		File f = new File(fileLocation.replaceAll("\\\\","\\\\\\\\"));//��������ԭ��
		File [] fileList  = f.listFiles();
		for(File f2 : fileList) {
			if(f2.isFile()) {
				try(
						FileReader fr = new FileReader(f);
						BufferedReader br = new BufferedReader(fr);
						){
					String line  = null;
					while((line = br.readLine()) != null) {
						if(line.contains(word))
							System.out.println("����Ŀ�������ļ���"+f2.getAbsolutePath()+f2.getName());
					}
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
			else {
				findWord(f2.getAbsolutePath()+"\\",word);//�ݹ����
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������Ҫ�����ĵĵ���");
		String word = s.nextLine();
		System.out.print("������Ҫ�����ļ�·��");
		String fileLocation = s.nextLine();
		findWord(fileLocation,word);
	}
}
