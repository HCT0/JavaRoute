package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jTest {
	//����������ƻ�ȡ��־����
	static Logger log =  Logger.getLogger(Log4jTest.class);
	public static void main(String[] args) {
		//ʹ��properties ��������
		//PropertyConfigurator.configure("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\log4j\\log4j.properties");
		PropertyConfigurator.configure("F:\\�����ļ�\\�����\\java  ·��\\j2ee\\src\\log4j\\log4j.xml");
				
		//����Ĭ������
		//BasicConfigurator.configure();
		
		//����log ����ļ���
		log.setLevel(Level.TRACE);
		
		log.trace("������Ϣ");
		log.debug("������Ϣ");
		log.info("�����Ϣ");
		
		//Thread��sleep(1000);
		log.warn("������Ϣ");
		log.error("������Ϣ");
		log.fatal("������Ϣ");
		
	}
}