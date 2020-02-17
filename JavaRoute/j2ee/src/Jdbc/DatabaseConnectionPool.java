package Jdbc;
import java.sql.*;
import java.util.*;
public class DatabaseConnectionPool {
	ArrayList<Connection> cs = new ArrayList<>();
	
		int size;
		public DatabaseConnectionPool(int size) {
			this.size = size ;
			init();
		}
		//���ӳصĴ���,����size ����
		public void  init() {
			try {
	            Class.forName("com.mysql.jdbc.Driver");
	            for (int i = 0; i < size; i++) {
	                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root", "admin");
	                cs.add(c);
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}
		public synchronized Connection getConnection() {
			while(cs.isEmpty()) {//������ӳ��ǿյ�,����Ҫ���ӵ��߳�����,�ó��ռ�
				try {
					this.wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			//�����ӳز��ǿյ�ʱ��,����һ��Connection ����,Ȼ��ɾ��
			//ArrayList ��Դ�����ʽ
			// public E remove(E index)
			// E �� ��ʼ��ArrayList ����һ��
			Connection c  = cs.remove(0);//д���ر�
			return c;
		}
		
		
		public synchronized void returnConnection(Connection c) {
			cs.add(c);
			this.notifyAll();
		}
}
