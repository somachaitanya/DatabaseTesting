import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String SqlUrl = "jdbc:sqlserver://AAPNA-LAP-183\\SQLEXPRESS;user=sa;password=pass@123;databaseName=Apartment";
//		String SqlUrl = "jdbc:sqlserver://localhost:1433;databaseName=Apartment";
//		Connection con = DriverManager.getConnection(SqlUrl, "sa", "pass@123");
		Connection con = DriverManager.getConnection(SqlUrl);
		
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("SELECT flatowner FROM FLATS_INFO where FlatNo = '103'");
		
		while(rs.next()) {
			System.out.println(rs.getString("Flatowner"));
		}

	}

}
