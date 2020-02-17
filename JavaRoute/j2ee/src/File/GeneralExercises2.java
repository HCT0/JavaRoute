package File;
import java.io.*;
import java.util.*;

public class GeneralExercises2 {
	public static void copyFolder(String srcFolder, String destFolder){
		File f1 = new File(srcFolder.replaceAll("\\\\","\\\\\\\\"));
		File [] filelist1 = f1.listFiles();
		for(File f3 :filelist1) {
			if(f3.isDirectory())
				copyFolder(f3.getAbsolutePath(),destFolder+"\\"+f3.getName());//进入子文件夹
			else {//是文件则在目标目录进行复制
				File fileTest = new File(destFolder,f3.getName());
				//new File(文件地址，文件名字)
				try {
					fileTest.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入源目录地址");
		String srcFile = s.nextLine();
		System.out.println("请输入目标目录地址");
		String destFile = s.nextLine();
		copyFolder(srcFile,destFile);
	}
}
