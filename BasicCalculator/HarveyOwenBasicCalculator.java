import java.util.Scanner;
import java.util.Random; 



public class HarveyOwenBasicCalculator {

		public static void main(String[] args) {
		 int num1=0,num2=0,option,ex;
		 do
		 {
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 System.out.println("\tBasic Math Calculator");
		 System.out.println("\tEnter your choice from the following menu:");
		 System.out.println("1.\tAddition");
		 System.out.println("2.\tSubtraction");
		 System.out.println("3.\tMultiplication");
		 System.out.println("4.\tDivision");
		 System.out.println("5.\tGenerate Random number");
		 System.out.println("If you chose option 5 the first number will be the lower limit and the second will be the upper limit");
		 option = sc.nextInt();
		 if(option!=6){
		 System.out.println("Enter the first number");
		 num1=sc.nextInt();
		 System.out.println("Enter the second number");
		 num2=sc.nextInt();
		 }
		 else
		 break;
		 switch(option)
		 {
		 case 1:System.out.println("You chose the addition of " + num1 + " and " +num2+ " the total is " +(num1+num2));
		 break;
		 case 2:System.out.println("You chose the subtraction of " + num1 + " and " +num2+ " the total is " +(num1-num2));
		 break;
		 case 3:System.out.println("You chose the multiplication of " + num1 + " by " +num2+ " the total is " +(num1*num2));
		 break;
		 case 4: if(num2==0)
		 System.out.println("Error! In Division denominator cannot be 0!");
		 else{
		 System.out.println("You chose the division of "+num1+" by "+num2+" quotient is "+(num1/num2)+" and remainder is "+(num1%num2));} 
		 break;
		 case 5:Random rand = new Random();
		 int rand_int1 = rand.nextInt(num1 + num2); 
	     System.out.println("The random intigers is: "+rand_int1);  
		 break;
		 default: System.out.println("Invalid choice "+option+ " was not an option");
		 }
		 System.out.println("Do you want to continue?1.Yes 2.No");
		 ex=sc.nextInt();
		 }while(ex==1);System.out.println("Thank you for using the basic calculator!");
		 }
		}