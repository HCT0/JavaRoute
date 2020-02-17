package File;
import java.io.*;
import java.util.Scanner;
public class AutoCreateClassTest {
	public static void main(String[] args) {
		File f = new File("C:\\代码区\\j2ee\\src\\File\\AutoCreateClassTest.txt");
		String str [] = new String[3];
		//从控制台获取数据
		Scanner s = new Scanner(System.in);
		System.out.println("请输入类的名称");
		str[0] = s.nextLine();
		System.out.println("请输入属性的类型");
		str[1] = s.nextLine();
		System.out.println("请输入属性的名称");
		str[2] = s.nextLine();
		System.out.println("控制台获取数据成功");
		//将文件的内容进行替换，得到符合格式的类
		StringBuffer sb = new StringBuffer();
		try(
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
		){
			while(true) {
				String Line = br.readLine();//将模板一行一行的读取
				if(Line == null)
					break;
				if(Line.contains("@class@"))
					Line = Line.replace("@class@",str[0]);
				if(Line.contains("@type@"))
					Line = Line.replace("@type@",str[1]);
				if(Line.contains("@property@"))
					Line = Line.replace("@property@",str[2]);
				System.out.println(Line);
				sb.append(Line);//加入到文本中
				sb.append("\n");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("class文件替换成功！");
		//将内容写入文件
		File backupfile = new File("C:\\代码区\\j2ee\\src\\File\\AutoCreateClassBackupFile.txt");
		try(
			FileWriter fw = new FileWriter(backupfile);
			PrintWriter pw = new PrintWriter(fw)
		){
			pw.println(sb);
			pw.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
