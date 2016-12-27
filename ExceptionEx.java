import java.util.*;
class ExceptionEx
{
 public static void main(String args[])
 {
  int num1,num2,result;
  Scanner in = new Scanner(System.in);
  try
   {
   System.out.println("Enter first number: ");
   num1 = in.nextInt();
   System.out.println("Enter the second number: ");
   num2 = in.nextInt();
   result = num1/num2;
   System.out.println("Division of two numbers = "+result);
   }
  catch(ArithmeticException ae)
  {
   System.out.println("Cannot divide by 0");
  }
  catch(InputMismatchException me)
  {
   System.out.println("Wrong input"); 
  }
  catch(Exception e) //For any other unexcepted Exception
  {
   System.out.println(e);
  }
  finally
  {
   in.close();
   System.out.println("Scanner closed");
  }
 }
}
