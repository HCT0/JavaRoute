package Jdbc;
import java.sql.*;
public class JdbcConnection {
	public static void main(String[] args){
		
		Connection c = null;
		Statement s = null;
		//������������
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���ݿ��������سɹ� ��");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//��������
		try {
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "root");
			System.out.println("���ӳɹ�");
			
			s = c.createStatement();
			System.out.println("����statement �ɹ�");
		
			//ִ�����
			String sql = "insert into hero values(null,"+"'��Ī'"+","+313.0f+","+50+")";
			s.execute(sql);
			
			System.out.println("ִ�����ɹ���");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(s != null) {
				try {
					s.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(c != null){
				try {
					c.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			
			
			}
		}
		
		
		
	}
}