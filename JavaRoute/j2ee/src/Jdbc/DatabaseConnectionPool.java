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
		//连接池的创建,根据size 创建
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
			while(cs.isEmpty()) {//如果连接池是空的,则将需要连接的线程阻塞,让出空间
				try {
					this.wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			//当连接池不是空的时候,将第一个Connection 返回,然后删除
			//ArrayList 的源代码格式
			// public E remove(E index)
			// E 跟 初始化ArrayList 类型一样
			Connection c  = cs.remove(0);//写法特别
			return c;
		}
		
		
		public synchronized void returnConnection(Connection c) {
			cs.add(c);
			this.notifyAll();
		}
}
