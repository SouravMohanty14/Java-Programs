import java.io.*;
public class Employee implements Serializable
{
	private String empID, empName;
	int salary;
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
public class EmployeeReadDemo
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis = new FileInputStream("E:\\Employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp = (Employee)ois.readObject();
			System.out.println(emp);
			ois.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception arised :"+e);
		}
	}

}
