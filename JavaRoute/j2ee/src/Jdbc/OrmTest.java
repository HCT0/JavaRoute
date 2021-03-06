package Jdbc;
import LOL.*;
import java.sql.*;
/*
 *   ORM  的使用 , 将数据库的数据 一个的组装到对象中去，然后再返回即可
 * */
public class OrmTest {
	//	获取指定 id 的Hero 对象
	public static Hero get(int id ){
		Hero hero = null;
		//加载驱动程序
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
			String sql = "select * from hero where id = " + id;
			ResultSet rs = s.executeQuery(sql);
			// 因为id是唯一的，ResultSet最多只能有一条记录
            // 所以使用if代替while
            if (rs.next()) {
                hero = new Hero();
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                hero.name = name;
                hero.hp = hp;
                hero.damage = damage;
                hero.id = id;
            }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return hero;
	}
	public static void main(String[] args) {
		Hero h1 = get(22);
		System.out.print(h1.name);
	}
}
