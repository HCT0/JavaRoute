package File;
import java.io.*;
import java.util.Scanner;
public class AutoCreateClassTest {
	public static void main(String[] args) {
		File f = new File("C:\\������\\j2ee\\src\\File\\AutoCreateClassTest.txt");
		String str [] = new String[3];
		//�ӿ���̨��ȡ����
		Scanner s = new Scanner(System.in);
		System.out.println("�������������");
		str[0] = s.nextLine();
		System.out.println("���������Ե�����");
		str[1] = s.nextLine();
		System.out.println("���������Ե�����");
		str[2] = s.nextLine();
		System.out.println("����̨��ȡ���ݳɹ�");
		//���ļ������ݽ����滻���õ����ϸ�ʽ����
		StringBuffer sb = new StringBuffer();
		try(
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
		){
			while(true) {
				String Line = br.readLine();//��ģ��һ��һ�еĶ�ȡ
				if(Line == null)
					break;
				if(Line.contains("@class@"))
					Line = Line.replace("@class@",str[0]);
				if(Line.contains("@type@"))
					Line = Line.replace("@type@",str[1]);
				if(Line.contains("@property@"))
					Line = Line.replace("@property@",str[2]);
				System.out.println(Line);
				sb.append(Line);//���뵽�ı���
				sb.append("\n");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("class�ļ��滻�ɹ���");
		//������д���ļ�
		File backupfile = new File("C:\\������\\j2ee\\src\\File\\AutoCreateClassBackupFile.txt");
		try(
			FileWriter fw = new FileWriter(backupfile);
			PrintWriter pw = new PrintWriter(fw)
		){
			pw.println(sb);
			pw.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
