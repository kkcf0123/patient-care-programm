package ȯ�ڰ���;
import java.sql.*;

//�����ͺ��̽��� ��� ������ �߰��ϴ� Ŭ����
public class EmployeeDAO {
	
	public EmployeeVO getEmployeeregiste(EmployeeVO evo) throws Exception {
		String dml = "insert into employee"
				 	+ " (name,birth,sex,phone,email)"
				 	+ "values "
				 	+ " (?,    ?,    ?,    ?,     ?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;
		
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement(dml);
			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getBirth());
			pstmt.setString(3, evo.getSex());
			pstmt.setString(4, evo.getPhone());
			pstmt.setString(5, evo.getEmail());
			
			
			int i = pstmt.executeUpdate();
			retval = new EmployeeVO();
			retval.setStatus(i+"");
		} catch(SQLException e) {
			System.out.println("e=["+e+"]");
		} catch(Exception e) {
			System.out.println("e=["+e+"]");
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException e) {
			}
		}
		return retval;
	}
}
