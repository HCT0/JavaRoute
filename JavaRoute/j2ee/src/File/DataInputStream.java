package File;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 数据流，进行int string boolean 的读取*/
public class DataInputStream {
	public static void main(String[] args) {
		write();
		read();
	}
		private static void read() {
			File f = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File\\DataInputStream.txt");
			try(
					FileOutputStream fos = new FileOutputStream(f);
					DataOutputStream dos = new DataOutputStream(fos);
			){
					dos.writeBoolean(true);
					dos.writeInt(300);
					dos.writeUTF("this is a test line");
			}
			catch(IOException e){
				e.printStackTrace();
			}
		
		}
		
		private static void write() {
			File f = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File\\DataInputStream.txt");
			try(
				FileInputStream fis  = new FileInputStream(f);
               // DataInputStream dis =new DataInputStream(fis);//
			){
				//boolean n = dis.readBoolean();	
				//int i = dis.readInt();
				//String str =dis.readUTF();
			}
			catch(IOException e ) {
				e.printStackTrace();
			}	
		
		}
}