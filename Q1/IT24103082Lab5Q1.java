import java.util.Scanner;
public class IT24103082Lab5Q1{
	public static void main(String[]args){
		int number1;//Declaring the variable
		int number2;//Declaring the variable
		int number3;//Declaring the variable
		int smallest;//Declaring the variable
		int largest;//Declaring the variable
		
		Scanner input=new Scanner(System.in);//create scanner object

		System.out.print("Enter the first integer: ");//Display the output
		number1=input.nextInt();
		
		System.out.print("Enter the second integer: ");//Display the output
		number2=input.nextInt();

		System.out.print("Enter the third integer: ");//Display the output
		number3=input.nextInt();

		smallest=number1;
		largest=number1;

		if(number2<smallest)
			{
				smallest=number2;
			}
		if(number3<smallest)
			{
				smallest=number3;
			}

		if(number2>largest)
			{
				largest=number2;
			}
		if(number3>largest)
			{
				largest=number3;
			}
		System.out.println();//Display the output
		System.out.println();//Display the output
		

		System.out.println("User entered numbers are:  "+number1+" "+number2+" "+number3);//Display the output
		System.out.println("The smallest number is: "+smallest);
		System.out.println("The largest number is: "+largest);
		
		}
}

		




		

