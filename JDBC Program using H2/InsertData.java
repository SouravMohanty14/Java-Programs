import java.sql.*;
import java.util.*;
public class InsertData
{
	public static void main(String[] args)
	{
		try{
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		PreparedStatement psmt = conn.prepareStatement("insert into Student values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student ID:");
		int sid = sc.nextInt();
		System.out.println("Enter the Student Name:");
		String sname = sc.next();
		System.out.println("Enter the Student Course:");
		String course = sc.next();
		psmt.setInt(1, sid);
		psmt.setString(2, sname);
		psmt.setString(3, course);
		int row_eff = psmt.executeUpdate();
		System.out.println(row_eff+" Row effected");
		sc.close();
		psmt.close();
		conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		

	}

}
