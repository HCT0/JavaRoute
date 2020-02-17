package File;
import java.io.*;

/*
 * 缓冲区写入
 * flush的介绍
 * 
 * */
public class FileBufferWriter {
	public static void main(String[] args) {
		File f = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File\\BufferWriterPractice.txt");
		try(
				FileWriter fw = new FileWriter(f); 
				PrintWriter pw = new PrintWriter(fw);
				){
			 	pw.println("garen kill teemo");//使用缓冲区的方法,进行写入，当缓冲区满了则会进行写入
			 	pw.flush(); //flush 强制进行数据的写入，就算缓冲区没有满
	            pw.println("teemo revive after 1 minutes");
	            pw.println("teemo try to garen, but killed again");	
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
