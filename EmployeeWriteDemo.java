import java.io.*;
public class Employee implements Serializable
{
	private String empID, empName;
	int salary;
	private static final long serialVersionUID = 1L;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
}

public class EmployeeWriteDemo
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("E:\\Employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Employee obj = new Employee();
			obj.setEmpID("E11101");
			obj.setEmpName("Sourav");
			obj.setSalary(30000);
			oos.writeObject(obj);
			System.out.println("Object successfully written");
			oos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
