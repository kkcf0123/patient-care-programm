package 환자관리;
import java.sql.*;

//데이터베이스 연동 클래스.
public class DBUtil {
	static final String driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/jdbc";
	
	public static Connection getConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,"root","1584");
		return con;
	}
}
