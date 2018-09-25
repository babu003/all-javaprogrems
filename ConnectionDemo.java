import java.sql.*;
class  ConnectionDemo
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("orcle.jdbc.driver.OrcleDriver");
			Connection con=DriverManager.getConnection("jdbc:orcle:oci8:@xe","system","narendra");
			System.out.println("connection is established");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
}
