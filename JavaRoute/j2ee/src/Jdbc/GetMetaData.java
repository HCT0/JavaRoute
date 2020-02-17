package Jdbc;
import java.sql.*;

public class GetMetaData {
	public static void main(String[] args) {
		//加载驱动程序
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功 ！");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = null;
		try(
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "root");
	            PreparedStatement ps = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);//设置了一个自增长的id 列
				
		){
			DatabaseMetaData dbmd = c.getMetaData();
			// 获取数据库服务器产品名称
			System.out.println("数据库产品名称:\t"+dbmd.getDatabaseProductName());
            // 获取数据库服务器产品版本号
            System.out.println("数据库产品版本:\t"+dbmd.getDatabaseProductVersion());
            // 获取数据库服务器用作类别和表名之间的分隔符 如test.user
            System.out.println("数据库和表分隔符:\t"+dbmd.getCatalogSeparator());
            // 获取驱动版本
            System.out.println("驱动版本:\t"+dbmd.getDriverVersion());
            // 获取数据库名称
            ResultSet rs = dbmd.getCatalogs();
            while (rs.next()) {
                System.out.println("数据库名称:\t"+rs.getString(1));
            }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
