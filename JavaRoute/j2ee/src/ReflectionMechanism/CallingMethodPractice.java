package ReflectionMechanism;
import java.lang.reflect.*;
import java.io.*;
import LOL.*;
public class CallingMethodPractice {
	public static void main(String[] args) {
		File f = new File("C:\\������\\j2ee\\src\\ReflectionMechanism\\Hero.config");
		try(//���ļ�����ȡ�ļ�
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
		){
				String line = null ;
				String allDate[] = new String[5];
				int i = 0;//ûһ��һ�еĶ�ȡ���ݣ�Ȼ������ַ�������
				while((line = br.readLine()) != null) {
					allDate[i] = line;
					i++;
				}
				//������������
				try {
					
					//ʹ�÷�����ƴ�������
					Class class1 = Class.forName(allDate[0]);
					Constructor c1 = class1.getConstructor();
					Aphero h1 = (Aphero) c1.newInstance();
					//���õ�һ�����������
					Field f1 = h1.getClass().getField("name");
					f1.set(h1,allDate[3]);
					
					//ʹ�÷�����ƴ����ڶ�������
					Class class2 = Class.forName(allDate[2]);
					Constructor c2 = class2.getConstructor();
					Adhero h2 = (Adhero)c2.newInstance();
					//���õڶ������������
					Field f2 = h2.getClass().getField("name");
					f2.set(h2, allDate[1]);
									
					//���õ�һ������Ĺ�������
					Method m1 = h1.getClass().getMethod("attackHero",String.class);
					m1.invoke(h1,h2.name);//���� ����
					
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

