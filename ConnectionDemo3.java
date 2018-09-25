import java.sql.*;
class ConnectionDemo3 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/xe","system","system");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("select * from dept");
			ResultSetMetaData rm=rs.getMetaData();
			int n=rm.getColumnCount();
			
			System.out.println();
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.print(rs.getString(2));
				System.out.print(rs.getString(3));
				System.out.println();
				
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		
	}
}
