package LinkedList;
import java.util.*;
public class linkedListes_addAll {
	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<String>();
		
		ll.add("Ranjeet");
		ll.add("Vaishu");
		ll.add("Manu");
		ll.add("Laxmi");
		
		LinkedList<String>ll2=new LinkedList<String>();
		ll.offer("Shreya"); 		
		ll.push("Prathmesh");
		
		System.out.println(ll);
		System.out.println(ll2);
		
		ll2.addAll(ll);
		System.out.println(ll2);
	}
}
