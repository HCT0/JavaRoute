package Jdbc;
import java.sql.*;
public class PreparedStatementTest {
	public static void main(String[] args) {
		//������������
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���ݿ��������سɹ� ��");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "insert into hero values(null,?,?,?)";
		try(
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "root");
	            PreparedStatement ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);//������һ����������id ��
				
		){
			ps.setString(1,"timo");
			ps.setFloat(2,313.0f);
			ps.setInt(3,50);
			//ִ�����
			ps.execute();
			ResultSet rs = ps.getGeneratedKeys();//��ȡ������
			if (rs.next()) {//���������
                int id = rs.getInt(1);
                System.out.println(id);
            }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}