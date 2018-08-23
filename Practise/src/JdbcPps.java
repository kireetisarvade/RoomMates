import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPps 
{
	public static void main(String[] args)
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connection established");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahesh","root","mahesh3945");
		PreparedStatement pps=con.prepareStatement("insert into product values(?,?,?,?,?)");
		pps.setInt(1, 22);
		pps.setString(2, "sony");
		pps.setInt(3, 5555);
		pps.setString(4, "india");
		pps.setString(5, "5656-05-05");
		int rst=pps.executeUpdate();
		System.out.println("data inserted");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();  
		}
}
}