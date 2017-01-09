package model;
public class LogicCredential
{
 private string uname, passwd;
 //jdbc code
 public boolean CheckLogin()
  {
  if(uname.equals("Sourav") && passwd.equals("123456"))
  return true;
  else
  return false;
  }
 void setuname(String uname)
 {
 this.uname = uname;
 }
 void setpasswd(String passwd)
 {
 this.passwd = passwd;
 }
 String getuname()
 {
 return uname;
 }
 String getpasswd()
 {
 return passwd;
 }
}