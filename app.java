package sd;

import java.util.Arrays;
import java.util.Scanner;

public class app {
	
// Below is the options for the menu
	
	public static void main(String[] args) {
		 System.out.println("1 – Add an airlines");
		 System.out.println("2 – Display all the airlines");
		 System.out.println("3 – Add a rating for a given airline");
		 System.out.println("4 – Display all the ratings for a given airline");
		 System.out.println("5 – Calculate and display the average rating for each airline");
		 System.out.println("6 – Display the best airline based on the average rating");
		 System.out.println("7 – Exit application");
		 
// below is a message for the key to press to start the program
		 
		 System.out.println("press any key except option 7 to start program");
		
		 Scanner input = new Scanner(System.in);
//below is where the user inputs a selection of an option
		 String keyboard = input.nextLine();
// this is where the items inputed by the user is stored
		 String [] itemsList= new String[3];
// this is the creation of instance item object 
		 items itemsObject = new items();
// below is a 2d array to store the user ratings
		int [][] ratings= new int[3][3];
// an instance of the rating object is created
		rating ratingObject = new rating();
		
		
		
		 
// statement below runs to prompt user for an input 		
		System.out.println("select option from menu");
// the loop body will run as long as the input isn't 7
		 while(!"7".equals(keyboard)) {
// message to prompt user to enter menu option
			 System.out.println("enter menu option");
// menu option is inputed by user
			 keyboard = input.nextLine();			 
// if the option is 1 run if code block 			
			 if("1".equals(keyboard)) {
// prints the the statement below if condition is met 
				 System.out.println("enter 3 airline");
// loop through the empty array to add items with each iteration
				 for(int i = 0 ; i<itemsList.length;i++) {
// user input is stored inside keyboard variable				
					 keyboard = input.nextLine();
// with each loop cycle the index is equal to the keyboard
					 itemsList[i]=keyboard;
					}
// the array setItems which is an array of items is added into the instance object of inputItems
				 itemsObject.setItems(itemsList);
// the array setItems which is an array of items is added into the instance object of inputRatings			 
				 ratingObject.setItems(itemsList);
				 
// the loop body will run if input is not equal to  exit		
				 while((!"exit".equals(keyboard))) {
// prints the following statement when condition is true
					 System.out.println("maximum of 3 airlines , please type exit to return to option menu");
// the user inputs a value which will be checked against the while loop condition
					 keyboard = input.nextLine();
				 }
						 
			 }
			 
			 
			 
// if option 2 is selected run the code block below 				 
			 if("2".equals(keyboard)) {
				 System.out.println("the list of airlines is");
// the inputItems uses method displayItems() to display array from option 1
				 itemsObject.displayItems();
// the loop body will run if input is not equal to  exit	 
				 while((!"exit".equals(keyboard))) {
// prints the following statement when condition is true
					 System.out.println("enter exit to return to option menu and select option 3 if airlines have been entered");
					 System.out.println("enter exit to return to option menu and select option 1 if airlines have not been entered");
// the user inputs a value which will be checked against the while loop condition
					 keyboard = input.nextLine();
					 
					 
				 }
			 }
			 
			 
			 
			 
			 
// if option 3 is selected run the code block below 				 
			 if("3".equals(keyboard)) {
// itemsArray is an array variable to get array of items provided by user inside the inputItems object
				 String[] itemsArray = itemsObject.getItems();			 
// prints the statement below if condition is met			
				 System.out.println("enter airline");
// user inputs name of airline to be checked in array  arrItems
				 keyboard = input.nextLine();
				 
// iterates over all the elements in the arrItems array
				 for(int i=0; i<itemsArray.length;i++) {
					 while(true) {
// if the user input from keyboard matches the element the loop breaks
							if(itemsArray[0].equals(keyboard)|| itemsArray[1].equals(keyboard) || itemsArray[2].equals(keyboard)) {
								break;
							}else {
// if the input from keyboard does not match the array elements	prints statements below						
								System.out.println("airline doesnt exist");
								System.out.println("enter airline");
// user inputs airline name if it does not match 
								keyboard = input.nextLine();
								
						 
							}
						 }
// if the element equals the elements in the array arrItems					 
					 if(itemsArray[i].equals(keyboard)) {
// in each iteration a rating is added to the setRating array 
						 for(int j =0;j<ratings[i].length;j++) {
							 System.out.println("enter 3 ratings");
// rating from the user
							 int rating = input.nextInt();
// within a array an element of a rating is added 
							 ratings[i][j]=rating;
// the ratings are added into the inputRatings instance object 
							 ratingObject.setRatings(ratings);

							  
						 }
						 
						 
					 }
					 	 
					 
				 }
// if exit is not input by user the while loop body runs 
				 while((!"exit".equals(keyboard)))  {
// prints the statement if the condition is met 
					 System.out.println("maximum of 3 ratings per airline, type exit to return to  to option menu");
// the user input will be validate in while loop 
					 keyboard = input.nextLine();
					
				 }
		
					 }

			 
			 
			 
			 
			 
			 
// if option 4 is selected run the code block below 			 
			 if("4".equals(keyboard)) {
// arrItems is an array variable to get array of items provided by user inside the inputItems object
				 String[] itemsArray = itemsObject.getItems();
// while loop runs until a element matches the elements in array arrItems			 
				 while(true) {
// prints the statement if the condition is met 
					 System.out.println("enter airline");
// name of the airline is inputed by user
					 keyboard = input.nextLine();
// if the user input from keyboard matches the element the loop breaks
						if(itemsArray[0].equals(keyboard)|| itemsArray[1].equals(keyboard) || itemsArray[2].equals(keyboard)) {
// the method displayRatings() will take user input of item and it will match it with corresponding rating 
							ratingObject.displayRatings(keyboard); 
							break;
						}else {
// if item doesn't match any element in the array of arrItems							
							System.out.println("airline doesnt exist");
						
					 
						}
					 }	 
			 }
			 
			 
			 
// if option 5 is selected run the code block below 				 
			 if("5".equals(keyboard)) {
// based on ratings provided  for list of items in option 3 the inputRating calculates average of each item		 
				 ratingObject.calculateAvergage();
				 
			 }
			 
			 
			 
// if option 6 is selected run the code block below 				 
			 if("6".equals(keyboard)) {
// based on ratings provided  for list of items in option 3 the inputRating calculates the highest average	 
				 ratingObject.calculateBest();
					 
				 }
			 
			 
			 
		 }
		 
		 
	}

} 

























