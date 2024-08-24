import java.util.Scanner;
public class IT24103082Lab5Q2{
	public static void main(String[]args){
		int newMembers;//Declaring the variable

		Scanner input=new Scanner(System.in);//Create a scanner object
	
		System.out.print("Enter the number of new members introdused: ");
		newMembers=input.nextInt();

		System.out.println();
		System.out.println();

		

		if(newMembers<0)
			{
				System.out.print("Input must be number 0 or greater");
			}
		else
			{
				
				switch(newMembers){
					case 0:
						System.out.println("No Prize");
						break;


					case 1:
						System.out.println("Prize is a pen");
						break;
						
					case 2:
						System.out.println("Prize is a umbrella");
						break;
				
					case 3:
						System.out.println("Prize is a Bag");
						break;
				
					case 4:
						System.out.println("Prize is a Travelling chair");
						break;
					default:
						System.out.println("Prize is a Head phone");
				}
			}
						
			
			
	}
}	
			
				
			
				
		
			
			
			

		

		
		