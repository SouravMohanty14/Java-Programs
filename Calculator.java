import java.util.Scanner;

class Calculator
{
	void Add(int a,int b) //Method to Add two numbers
	{
		int sum = a+b;
		System.out.println("Sum of the two numbers ="+sum);
	}
	void Sub(int a,int b) //Method to Subtract two numbers
	{
		int diff = a-b;
		System.out.println("Difference of the two numbers ="+diff);
	}
	void Mul(int a,int b) //Method to Multiply two numbers
	{
		int multi = a*b;
		System.out.println("Multiplication of the two numbers ="+multi);
	}
  void Div(int a,int b) //Method to Divide two numbers
	{
		int div = a/b;
		System.out.println("Division of the two numbers ="+div);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int choice,x,y;
		System.out.println("Enter your choice: 1.Add 2.Sub 3.Mul 4.Div");
		choice = in.nextInt();
		Calculator obj = new Calculator();
		System.out.println("Enter the 2 integers");
		x = in.nextInt();
		y = in.nextInt();
		if(choice == 1)
		{
			obj.Add(x, y);
		}
		else if(choice == 2)
		{
			obj.Sub(x, y);
		}
		else if(choice == 3)
		{
			obj.Mul(x, y);
		}
        else if(choice == 4)
        {
            obj.Div(x, y);
        }
		else
		{
			System.out.println("Wrong choice");
		}
				
	}
}
