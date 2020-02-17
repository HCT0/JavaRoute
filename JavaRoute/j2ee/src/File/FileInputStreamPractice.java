package File;
import java.io.*;
public class FileInputStreamPractice {
	/*
	 * 当输入的文件的父类文件不存在
	 * 新进行检测文件的存在性的检测
	 * 不存在则进行创建，文件夹
	 * */
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\代码文件\\代码库\\java  路线\\j2ee\\src\\File");
		if(!f.getParentFile().exists()) {//如果上一次不存在，则创建
			f.mkdirs();
		}
		FileOutputStream fis = new FileOutputStream(f);
		fis.write(null);
		fis.close();
	}
}
