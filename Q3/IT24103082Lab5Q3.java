import java.util.Scanner;
	public class IT24103082Lab5Q3{
		public static void main(String[]args){
			Scanner input=new Scanner(System.in);//Create scanner object
			
			System.out.print("Enter Start date: ");
			double startDate=input.nextDouble();
			
			System.out.print("Enter End date: ");
			double endDate=input.nextDouble();

			System.out.println();
			System.out.println();

			if(startDate<1||startDate>31||endDate<1||endDate>31)//Validation
				{
					System.out.print("Error:Days must be 1 and 31 ");//Display the output
					
					return;
				}
			if(startDate>=endDate)
				{
					System.out.print("Error:Start date must be less than End date ");//Display the output
					return;
				}

					

			final double ROOM_CHARGE_PER_DAY=48000.00;//Declaring the constant
			final double DISCOUNT_3_TO_4_DAYS=0.1;//Declaring the consatant
			final double DISCOUNT_5_OR_MORE_DAYS=0.2;//Declaring the constant
			final double DISCOUNT_LESS_THAN_3_DAYS=0;//Declaring the constant


			System.out.println("Room charge per day: "+ROOM_CHARGE_PER_DAY);

			double reservedDays=endDate-startDate;//Calculation
			System.out.println("Number of days reserved: "+reservedDays);
			
			double discountRate=0;
			if(reservedDays>=3||reservedDays<=4)
				{
					 discountRate=DISCOUNT_3_TO_4_DAYS;
				}
			else if(reservedDays>=5)
				{
					discountRate= DISCOUNT_5_OR_MORE_DAYS;
				}
			else if(reservedDays<3)
				{
					discountRate=DISCOUNT_LESS_THAN_3_DAYS;
				}

			double totalAmountBeforeDiscount=(reservedDays* ROOM_CHARGE_PER_DAY);//Calculation		
			double discountAmount=totalAmountBeforeDiscount*discountRate;//Calculation
			double totalAmount=totalAmountBeforeDiscount-discountAmount;//Calculation


			System.out.println("Total amount to be paid: "+totalAmount);
	}
}


			
			
				