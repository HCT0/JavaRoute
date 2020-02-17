package Jdbc;
import java.sql.*;
public class JdbcOptimization {
	public static void main(String[] args) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功 ！");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "root");
				Statement s = c.createStatement();
		){
			String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
			s.execute(sql);
			
			System.out.println("执行语句成功！");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	
	}
}
