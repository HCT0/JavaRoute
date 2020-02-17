package File;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
public class FileMethods {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File\\lol.exe");
		System.out.println("文件是否存在"+f.exists());
		System.out.println("file 是不是文件"+f.isFile());
		System.out.println("file 是不是文件夹"+f.isDirectory());
		System.out.println("file文件的长度"+f.length());
		
		//查看文件最后的修改时间
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss SSS");
		long time = f.lastModified();
		Date t = new Date(time);
		String str = sdf.format(t);	
		System.out.println("文件的最后的修改时间:"+str );
		//文件重命名
		File f2 = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File\\dota.exe");
		f.renameTo(f2);
		System.out.println(f.listRoots());
		
		
		//创建与文件同名的文件夹	
		//f.mkdir();
		
		//创建与文件同名的文件
		f2.createNewFile();
		f.createNewFile();
		
		//删除文件
		//f.deleteOnExit();
		//f.delete();
		
		//返回上一层文件夹,字符串形式
		System.out.println(f.getParent());
		//返回父类文件夹,文件形式
		System.out.println(f.getParentFile());
		
	}
}
