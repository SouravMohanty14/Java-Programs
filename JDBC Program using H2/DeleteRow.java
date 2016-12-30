import java.util.*;
import java.sql.*;
public class DeleteRow {
	public static void main(String[] args)
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			
			PreparedStatement psmt = conn.prepareStatement("delete from Student where studentid=?");
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the Student ID to be deleted:");
			int sid = in.nextInt();
			psmt.setInt(1, sid);
			int row_eff = psmt.executeUpdate();
			System.out.println(row_eff+" row effected");
			in.close();
			psmt.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised: "+e);
		}

	}

}
