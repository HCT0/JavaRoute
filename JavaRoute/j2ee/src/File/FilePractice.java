package File;
import java.io.*;

public class FilePractice {
	static File fileName1;
	static File fileName2;
 	public void searchFile(File f) {
 		File [] fs = f.listFiles();
 		if(null == fs)
 			return ;
 		for (File f2 : fs) {
 			if(f2.exists()) {
				if(f2.isDirectory()) {
					searchFile(f2);
				}
				else 
				{
					if(f2.length() > fileName1.length()) {
						fileName1 = f2;
					}
					if(f2.length() < fileName2.length()) {
						if(f2.length() != 0) 
							fileName2 = f2;	
					}	
				}	
			}
 			else {
 				continue;
 			}
		}
	}
	public static void main(String[] args) {
		float t1 = System.currentTimeMillis();
		File f = new File("C:\\WINDOWS");
		if(f.exists())
			System.out.println("文件存在");
		FilePractice fp = new FilePractice();
		File [] fs = f.listFiles();
		if(null == fs)
			System.out.println("创建文件数组失败");
		fileName1 = fs[0];
		fileName2 = fs[0];
		fp.searchFile(f);
		System.out.println("最大的文件是:"+fileName1.getAbsolutePath()+"文件的大小为"+fileName1.length()+"字节");
		System.out.println("最大的文件是:"+fileName2.getAbsolutePath()+"文件的大小为"+fileName2.length()+"字节");
		float t2 = System.currentTimeMillis()-t1;
		System.out.println("总计话的时间为:"+t2);
	}
}
