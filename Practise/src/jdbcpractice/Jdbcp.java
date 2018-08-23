package jdbcpractice;
import java.sql.*;
public class Jdbcp
{
	public static void main(String[] args) 
	{
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
	System.out.println("connexted succesfully");
	Statement st=con.createStatement();
	int result =st.executeUpdate("insert into student values(11,'mahesh','9999-09-09','milpitas','gmail',99999)");
	}
	catch(ClassNotFoundException | SQLException e )
	{
		e.printStackTrace();
	}
	}

}
