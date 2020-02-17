package Jdbc;
import java.sql.*;

public class GetMetaData {
	public static void main(String[] args) {
		//������������
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���ݿ��������سɹ� ��");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = null;
		try(
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "root");
	            PreparedStatement ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);//������һ����������id ��
				
		){
			DatabaseMetaData dbmd = c.getMetaData();
			// ��ȡ���ݿ��������Ʒ����
			System.out.println("���ݿ��Ʒ����:\t"+dbmd.getDatabaseProductName());
            // ��ȡ���ݿ��������Ʒ�汾��
            System.out.println("���ݿ��Ʒ�汾:\t"+dbmd.getDatabaseProductVersion());
            // ��ȡ���ݿ�������������ͱ���֮��ķָ��� ��test.user
            System.out.println("���ݿ�ͱ��ָ���:\t"+dbmd.getCatalogSeparator());
            // ��ȡ�����汾
            System.out.println("�����汾:\t"+dbmd.getDriverVersion());
            // ��ȡ���ݿ�����
            ResultSet rs = dbmd.getCatalogs();
            while (rs.next()) {
                System.out.println("���ݿ�����:\t"+rs.getString(1));
            }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}