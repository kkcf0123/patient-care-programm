package ȯ�ڰ���;
import java.sql.*;

//�����ͺ��̽� ���� Ŭ����.
public class DBUtil {
	static final String driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/jdbc";
	
	public static Connection getConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,"root","1584");
		return con;
	}
}
