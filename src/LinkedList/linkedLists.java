package LinkedList;

import java.util.*;
public class linkedLists {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Ranjeet");
		ll.add("Vaishu");
		ll.add("Manu");
		ll.add("Laxmi"); // Add Element add at end 
		
		ll.offer("Shreya"); //Same as add at end
		
		ll.push("Prathmesh"); // Add element at First 
		
		System.out.println(ll);
		
		System.out.println(ll.peek()); // Return 1ST Element
		ll.pop(); // remove 1st Element
		ll.remove(0); // Remove at Front side
		
		ll.set(3, "Aditya");
		
		ll.indexOf("Manu");
		
		
		
		System.out.println(ll);
		
	}

}
