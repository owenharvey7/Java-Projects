import java.util.Scanner;

public class HarveyOwenArabicToRomanNumerals {
	public static void main(String[] args) {
		boolean right = false;//Creates boolean to allow for the program repeat
		
        @SuppressWarnings("resource")//Suppresses the scanner warning
		Scanner input = new Scanner(System.in);

    	System.out.println("Convert any Arabic number between 1 and 3999 to a Roman Numberal!");//Title for program
    	do {//Start loop
		System.out.println("\nEnter an intiger (enter -1 to quit):");//User inputs Arabic numeral
        int value = input.nextInt();//Stores users choice
        
        
        if ((value <= 3999) && (value > 0)) {//user inputs a number and it calls upon the arabicToRoman method
            System.out.println(arabicToRoman(value));
        }
        else if(value==-1) {//User chooses to exit
        	System.out.println("You have entered -1 and chosen to quit, have a nice day!");
        	System.exit(0);
        }
        else if(value>3999) {//If the user inputs anything greater than 3,999
        	System.out.println("The number you have put it in is above the 3,999 limit, please try again:");
        }
        else if(value<-1) {//If the user inputs a negative numbers
        	System.out.println("The romans did not have a symbol to represent a negatives, please try again:");
        }
        else if(value==0) {//If the user inputs a 0
        	System.out.println("The romans did not have a symbol to represent zero, please try again:");
        }
        
	}while(!right);
}
public static String arabicToRoman(int arabic) {
	 String n = "";//Store the string
	//All the Roman numerals below with corresponding Arabic numerals
	while(arabic>=1000) {
		n += "M";
		arabic -= 1000;
	}
	while(arabic>=900) {
		n += "CM";
		arabic -= 900;
	}
	while(arabic>=500) {
		n += "D";
		arabic -= 500;
	}
	while(arabic>=400) {
		n += "CM";
		arabic -= 400;
	}
	while(arabic>=100) {
		n += "X";
		arabic -= 100;
	}
	while(arabic>=90) {
		n += "XC";
		arabic -= 90;
	}
	while(arabic>=50) {
		n += "L";
		arabic -= 50;
	}	
	while(arabic>=40) {
		n += "XL";
		arabic -= 40;
	}	
	while(arabic>=10) {
		n += "X";
		arabic -= 10;
	}
	while(arabic>=9) {
		n += "IX";
		arabic -= 9;
	}
	while(arabic>=5) {
		n += "V";
		arabic -= 5;
	}
	while(arabic>=4) {
		n += "IV";
		arabic -= 4;
	}
	while(arabic>=1) {
		n += "I";
		arabic -= 1;	
	}
	
	return n;	
}
}
//In this program I thought it would be pretty simple I did the numerals first which I put from 1 at the top to 1,000 at the bottom which didn't run right so I fliped it and the it worked. With numbers like 4 the boundaries of it were tricky to not get something like IIII and instead get IV. When you run it and put an invalid number like a negative it tells you and asks for a new input, while if you put a number like 0 it does the same.  
