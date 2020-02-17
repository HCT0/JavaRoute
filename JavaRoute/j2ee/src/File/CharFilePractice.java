package File;
import java.io.*;


/*
 * 进行文件的简单加密
 * a-z和A-Z +1
 * 1-8加1 9变成 0
 * 
 * */
public class CharFilePractice {
	public static void main(String[] args) {
		File f = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File\\CharFilePractice.txt");
		char all[] = new char[(int) f.length() ];
		try(FileReader fr = new  FileReader(f)){//进行加密前的读取
			
			fr.read(all);
			System.out.println("加密前的文件");
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
		System.out.println("加密后的文件");
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
