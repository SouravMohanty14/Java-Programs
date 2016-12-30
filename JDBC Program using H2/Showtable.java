import java.sql.*;
public class Showtable
{
	public static void main(String[] args) {
		try{
			//Using Generic H2 (Server)
			Class.forName("org.h2.Driver"); //Driver Class value
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa",""); //JDBC URL Value,Username.Password
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Student");
			//Adding Column names
			ResultSetMetaData rsmd = rs.getMetaData();
			int cc = rsmd.getColumnCount();
			for(int i=1;i<=cc;i++)
			{
				System.out.print(rsmd.getColumnName(i)+" ");
			}
			System.out.println();
			//Printing Column data
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"      ");
				System.out.print(rs.getString(2)+"    ");
				System.out.println(rs.getString(3)+" ");
			}
			stmt.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}

	}

}
