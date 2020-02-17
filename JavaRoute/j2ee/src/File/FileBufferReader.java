package File;
import java.io.*;

/*
 * 缓冲区的读入
 * 
 * 
 * */
public class FileBufferReader {	
	public static void main(String[] args) {
		File f = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File\\FileBufferPractice.txt");
		try(
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				){
			while(true) {//进行无线的循环
				String line = br.readLine();//读取一行到缓冲区
				if(line == null )
					break;
				System.out.println(line);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
