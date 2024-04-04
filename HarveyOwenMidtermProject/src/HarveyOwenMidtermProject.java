import java.util.Scanner;

public class HarveyOwenMidtermProject {

public static int main(String[] args) {
	displayMenu();
		boolean right = false;//Creates boolean to allow for the program repeat
		 @SuppressWarnings("resource")//Suppresses the scanner warning
			Scanner input = new Scanner(System.in);
    	do {//Start loop
		System.out.println("Hello World");
        @SuppressWarnings("unused")
		int choice = input.nextInt();//Stores users choice

        

    	}while(!right);
    	return displayMenu();
	}

static int displayMenu() {
		  @SuppressWarnings("resource")//Suppresses the scanner warning
			Scanner input = new Scanner(System.in);
	        System.out.println("\tLending Library");
	        System.out.println("1.\tAdd new Item");
	        System.out.println("2.\tMark an item as on loan");
	        System.out.println("3.\tList all items");
	        System.out.println("4.\tMark an item as returned");
	        System.out.println("5.\tQuit");
	        int choice = input.nextInt();//Stores users choice

	        
	        return choice;
			
		
	        
	}

void addNewItem(String title, String format) {
	
}

void markItemOnLoan(String title, String name, String date) {

}

String[] listAllItems() {
	

	return null;
}



}