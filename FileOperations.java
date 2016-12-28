import java.io.*;
import java.util.*;
class FileOperations
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  try
  {
  FileOutputStream fos = new FileOutputStream("D:\\Sourav_Java\\FileEx.txt"); 
  System.out.println("Enter text to write in file");
  String str2 = in.nextLine();
  for(int i = 0;i<str2.length();i++)
  {
   fos.write(str2.charAt(i));
  }
  System.out.println("Content to file written successfully");
  fos.close();
  }
  catch(Exception e)
  { 
   System.out.println("Exception arised: "+e);
  }
  try
   {
   FileInputStream fis = new FileInputStream("D:\\Sourav_Java\\FileEx.txt");
   int avail = fis.available();
   System.out.println("Number of bytes: "+ avail);
   }
  catch(Exception e)
   {
    System.out.println(e);
   }
 }
}
