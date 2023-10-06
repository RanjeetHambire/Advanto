package LinkedList;

import java.util.*;
public class reverse_Linked {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Ranjeet");
		ll.add("Vaishu");
		ll.add("Manu");
		ll.add("Laxmi");
		
		System.out.println(ll);
		
		Collections.reverse(ll);
		
//		Collections.sort(ll);
		
		System.out.println(ll);
		
		Iterator itr = ll.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
