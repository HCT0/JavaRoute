package File;
import java.util.*;
import java.io.File;
public class FileTest {	
	public static void main(String[] args) {
		File f = new File("F:\\代码文件\\代码库\\java路线\\j2ee\\src\\File");
		System.out.println(f.getAbsolutePath());
		File f2 = new File("LOL.exe");
		System.out.println(f2.getAbsolutePath());
		//输出本文件的上一层目录
		System.out.println(f.getParentFile());
		//以 f 为父目录，不然则是默认目录
		File f3 = new File(f,"lol。exe");
		System.out.println(f3.getAbsolutePath());
	}
}
