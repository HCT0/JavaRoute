package File;
import java.util.*;
import java.io.File;
public class FileTest {	
	public static void main(String[] args) {
		File f = new File("F:\\�����ļ�\\�����\\java·��\\j2ee\\src\\File");
		System.out.println(f.getAbsolutePath());
		File f2 = new File("LOL.exe");
		System.out.println(f2.getAbsolutePath());
		//������ļ�����һ��Ŀ¼
		System.out.println(f.getParentFile());
		//�� f Ϊ��Ŀ¼����Ȼ����Ĭ��Ŀ¼
		File f3 = new File(f,"lol��exe");
		System.out.println(f3.getAbsolutePath());
	}
}
