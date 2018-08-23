import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbccallableProcedure {

	public static void main(String[] args)
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
		CallableStatement cst=con.prepareCall("{call add_emoloyee(?,?,?,?,?,?)}");
		cst.setInt(1, 17);
		cst.setString(2, "gk");
		cst.setInt(3, 55);
		cst.setInt(4, 54545);
		cst.setString(5, "webdev");
		cst.setString(6, "eee");
		cst.execute();
		System.out.println("record inserted");
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
