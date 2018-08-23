import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCcs {

	public static void main(String[] args)
	{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connected sucessfully");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
		Statement st =con.createStatement();
		int rst=st.executeUpdate("insert into product values(18,'laptop',8888,'india','8888-08-08')");
		ResultSet rs=st.executeQuery("select * from product");
		ResultSetMetaData rsmd= rs.getMetaData();
		for(int i=1; i <= rsmd.getColumnCount();i++)
		{			
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		
		System.out.println("\n=========================================================================");
		while(rs.next())
		{
			for(int i=1; i <= rsmd.getColumnCount();i++)
			{			
				System.out.print(rs.getString(i)+"\t\t");
			}
			System.out.println();
			
		}
	}
	catch(ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}
}
}