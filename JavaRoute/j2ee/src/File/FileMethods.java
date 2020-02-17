package File;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
public class FileMethods {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\File\\lol.exe");
		System.out.println("�ļ��Ƿ����"+f.exists());
		System.out.println("file �ǲ����ļ�"+f.isFile());
		System.out.println("file �ǲ����ļ���"+f.isDirectory());
		System.out.println("file�ļ��ĳ���"+f.length());
		
		//�鿴�ļ������޸�ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss SSS");
		long time = f.lastModified();
		Date t = new Date(time);
		String str = sdf.format(t);	
		System.out.println("�ļ��������޸�ʱ��:"+str );
		//�ļ�������
		File f2 = new File("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\File\\dota.exe");
		f.renameTo(f2);
		System.out.println(f.listRoots());
		
		
		//�������ļ�ͬ�����ļ���	
		//f.mkdir();
		
		//�������ļ�ͬ�����ļ�
		f2.createNewFile();
		f.createNewFile();
		
		//ɾ���ļ�
		//f.deleteOnExit();
		//f.delete();
		
		//������һ���ļ���,�ַ�����ʽ
		System.out.println(f.getParent());
		//���ظ����ļ���,�ļ���ʽ
		System.out.println(f.getParentFile());
		
	}
}
