package File;
import java.io.*;
/*
 * 字符流的读入与写入
 * FileReader 和FileWriter
 * 
 * */
public class CharFile {
	public static void main(String[] args) {
		File f = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File\\lol.txt");
		String str = null;
		try(FileReader fr = new FileReader(f)){
			char all [] = new char[(int) f.length()];
			fr.read(all);
			for (char b : all) {
				System.out.println(b);
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileWriter fw = new FileWriter(f)){
			str ="adfasd";
			fw.write(str);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
