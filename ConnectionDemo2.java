import java.sql.*;
class  ConnectionDemo2
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/xe","system","system");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student values(5)");
			System.out.println("one record  is sucessfully inserted");
			
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
		
	}
}
