package File;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
/*实现文件1 复制到文件2 */
public class GeneralExercises1 {
	public static void copyFile(String srcFile, String destFile){
		srcFile = srcFile.replaceAll("\\\\","\\\\\\\\");
		destFile = destFile.replaceAll("\\\\","\\\\\\\\");
		File f1 = new File(srcFile);
		File f2 = new File(destFile);
		//进行源文件的内容的读取
		StringBuffer sb = new StringBuffer();
		String line;
		try(
				FileReader fr = new FileReader(f1);
				BufferedReader br = new BufferedReader(fr)
				){
				while((line = br.readLine())!= null) {
					sb.append(line);
				}
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
		//将源文件的内容写入目标文件
		try(
				FileWriter fw = new FileWriter(f2);
				PrintWriter pw = new PrintWriter(fw);
				){
			pw.print(sb);//写入到指定文件;
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
		
		}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入源文件路径");
		String srcFile = s.nextLine();
		System.out.println("请输入目标文件路径");
		String destFile = s.nextLine();
		copyFile(srcFile,destFile);
	}
}
