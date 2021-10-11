package sd;

import java.util.Arrays;



public class rating {
// instance variable that holds array of items
	private String [] items = new String[3];
// instance variable that holds 2d array of ratings for items
	private int [][] ratings = new int[3][3];
// instance variable to hold the average of each item
	private double[] averageRatings = new double[3];
// instance variable to hold the value of a item
	private String userItem;
	
	
// retrieves the list of items from user with method items() and assigns it to instance variable items
	public void setItems(String[] item) {
// sets the instance variable items value to item from user
		this.items =item; 
	}
// retrieves the list of ratings from the user with method ratings() and assigns it to instance variable ratings
	public void setRatings(int [][] rating) {
// sets the instance variable of ratings to ratings from user 
		this.ratings =rating; 
	}

// member method displayRating() displays rating based provided item
	public void displayRatings(String item) {
// sets the instance variable of userItem to item from user
		this.userItem= item;
// the for loop iterates through the items array
		for(int i =0;i<items.length;i++) {
// if the item is a match from the item array
		if(items[i].equals(userItem)) {
// it prints out the name of the item on each iteration
			System.out.println("the name of airline is "+ items[i]);
// the for loop iterates through ratings array
			for(int j = 0; j<ratings[i].length;j++) {
// below it prints the message and corresponding rating 
				System.out.println("the ratings are");
				System.out.println((ratings[i][j]));

			}
		 }
		}
	}
		
// the member method of getRating retrieves the rating from the instance variable ratings
	public int[][] getRating() {
// the method returns the instance variable value of rating
		return ratings;	
	}

	
// the member method that calculate the average from ratings array
	public void calculateAvergage() {
// local variable to add the ratings to.
		double sum =0;
// the for loop iterates through items array 		
		for(int i =0;i<items.length;i++) {
// the for loop iterates through group of ratings of an item
			for(int j = 0; j<ratings[i].length;j++) {
// with each iteration it add a rating element to sum variable
				sum = sum +ratings[i][j];
				}
// with each iteration the average of each item is added to averageRating array
				averageRatings[i]= (sum/items.length);
// prints out the item and the corresponding average 
				System.out.println("the name of airline is "+ items[i]);
				System.out.println("the average is "+averageRatings[i]);
// the sum is reset after before the next iteration begins
				sum =0;
			}	
	}
	
// the member method calculateBest calculates the highest average from averageRatings array	
	public void calculateBest() {
// sets the local variable max to keep track of highest value		
		double max = 0;
// sets the local variable  of the item of the highest average
		String item = null ;
		
// a for loop to iterate through the items array	
			for(int i =0; i<items.length;i++) {
// a for loop to iterate through the averageRating array				
				for(int j = 0; j<averageRatings.length;j++) {
// if the average rating is higher than max value 
					  if (averageRatings[j] > max){
// the max value is set to the averageRating
					      max = averageRatings[j];
// the item is assigned to the value of item
					      item = items[j];
					     }
				}
					
			}
// the highest value is printed out along with the corresponding item			
			System.out.println("the highest average is "+max);
			System.out.println("name of the airline with highest average "+item);
				
	}	
}
