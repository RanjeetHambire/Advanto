package ArrayList_practice;
import java.util.*;

public class traverse_Iterator {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		
//		BY USING iTERATTOR INTERFACE
		System.out.println("TRAVERSING THROUGH USING iTERATOR INTERFACE =>");
		Iterator it = list.iterator();  // getting the Iterator 
		while(it.hasNext()) {           // check if iterator has next element
			System.out.println(it.next());  // print element and point to the next
		}
		
		// TRAVERSING THROUGH USING FOR EACH LOOP
		System.out.println("TRAVERSING THROUGH USING FOR EACH LOOP =>");
		for(Integer li:list) {
			System.out.println(li);
		}
		
		// TRAVERSING THROUGH USING FOR LOOP
		System.out.println("TRAVERSING THROUGH USING FOR EACH LOOP =>");
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//TRAVERSING THROUGH USING ForEach() METHOD
		//new feature, introduced in Java 8.  
		
		System.out.println("TRAVERSING THROUGH USING FOR EACH METHOD()");
		list.forEach(a->{ //Here, we are using lambda expression  
            System.out.println(a);  
          }); 
		
		// TRAVERSING THROUGH USING ForEachRemaining() METHOD
		System.out.println("TRAVERSING THROUGH USING ForEachRemaining() METHOD");
		 Iterator<Integer> itr=list.iterator();  
         itr.forEachRemaining(a-> //Here, we are using lambda expression  
         {  
       System.out.println(a);  
         });  
	}
}
