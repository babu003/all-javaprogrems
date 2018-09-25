import java.sql.*;
public class ConnectionDemo1
{
   public static void main(String args[])
   {
     try
      {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ localhost:1522/XE","system","system");
       Statement stmt=con.createStatement();
         stmt.execute("create table student(sno number(9))");
       System.out.println("table created");
      }catch(Exception e)
        {
          System.err.println(e);
        }
     }
}