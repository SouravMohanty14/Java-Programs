package model;

public class LoginCredential
{
	private String uname, passwd;
	//jdbc code
	public boolean checkLogin()
	{
		if(uname.equals("Sourav") && passwd.equals("123456"))
			return true;
		else
			return false;
		}
	public void setUname(String uname)
	{
		this.uname = uname;
		}
	public void setPasswd(String passwd)
	{
		this.passwd = passwd;
		}
	public String getUname()
	{
		return uname;
		}
	public String getPasswd()
	{
		return passwd;
		}
	}
