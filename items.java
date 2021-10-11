package sd;
import java.util.Arrays;

	
	public class items {
// instance variable to hold array of items
	private String [] items = new String[3];


// member method to retrieve array of items from user and assign to instance variable items
	 public void setItems(String [] item) {
// this sets the instance variable items value to item received from addItems() method
		this.items=item;	 
	  }
	 
	 
// member method to display the content of the array
	  public void displayItems() {
// check to see if there is nothing in the element array
		  if(items[0]==null & items[1]==null & items[2] ==null) {
// if there is no elements at each index the statement below will run
				 System.out.println("empty list of airlines");
			 }else {
// if there is elements at each index array is not empty
				 System.out.println(Arrays.toString(items));
			 }
	  }

	  
// member method to get the value of the instance variable items
	  public String [] getItems() {
// returns the string of items set in the instance variable items
		return items;
		  
	  } 
}
