package File;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
/*ʵ���ļ�1 ���Ƶ��ļ�2 */
public class GeneralExercises1 {
	public static void copyFile(String srcFile, String destFile){
		srcFile = srcFile.replaceAll("\\\\","\\\\\\\\");
		destFile = destFile.replaceAll("\\\\","\\\\\\\\");
		File f1 = new File(srcFile);
		File f2 = new File(destFile);
		//����Դ�ļ������ݵĶ�ȡ
		StringBuffer sb = new StringBuffer();
		String line;
		try(
				FileReader fr = new FileReader(f1);
				BufferedReader br = new BufferedReader(fr)
				){
				while((line = br.readLine())!= null) {
					sb.append(line);
				}
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
		//��Դ�ļ�������д��Ŀ���ļ�
		try(
				FileWriter fw = new FileWriter(f2);
				PrintWriter pw = new PrintWriter(fw);
				){
			pw.print(sb);//д�뵽ָ���ļ�;
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
		
		}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������Դ�ļ�·��");
		String srcFile = s.nextLine();
		System.out.println("������Ŀ���ļ�·��");
		String destFile = s.nextLine();
		copyFile(srcFile,destFile);
	}
}
