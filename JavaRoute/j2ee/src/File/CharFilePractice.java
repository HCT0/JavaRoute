package File;
import java.io.*;


/*
 * �����ļ��ļ򵥼���
 * a-z��A-Z +1
 * 1-8��1 9��� 0
 * 
 * */
public class CharFilePractice {
	public static void main(String[] args) {
		File f = new File("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\File\\CharFilePractice.txt");
		char all[] = new char[(int) f.length() ];
		try(FileReader fr = new  FileReader(f)){//���м���ǰ�Ķ�ȡ
			
			fr.read(all);
			System.out.println("����ǰ���ļ�");
			for(char b : all) {
				System.out.print(b);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0 ; i <all.length ;i++ ) {
			if(9==all[i]) {
				all[i]=0;	
			}
			if(all[i] >= '0' && all[i]<='8')
				all[i]++;
			if(all[i] >= 'a' && all[i]<='z')
				all[i]++;
			if(all[i] >= 'A' && all[i]<='Z')
				all[i]++;
		}
		System.out.println();
		System.out.println("���ܺ���ļ�");
		for(char b : all) {
			System.out.print(b);
		}
		try(FileWriter fw = new FileWriter(f)){
			fw.write(all);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
	
	}
}
