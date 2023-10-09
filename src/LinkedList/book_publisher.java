package LinkedList;

import java.util.*;

class book{
	int id;
	String name, author, publisher;
	int quantity;
	
	book(int id, String name, String author, String publisher, int quantity){
		this.id =id;
		this.name=name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class book_publisher {

	public static void main(String[] args) {
		
		LinkedList<book> list =new LinkedList<book>();
		
		book b1 = new book(1, "  java  ", "James Gosling  ", "Swapnali BAnsode  ", 100);
		book b2 = new book(2, "  java  ", "James Gosling  ", "Swapnali BAnsode  ", 100);
		book b3 = new book(3, "  java  ", "James Gosling  ", "Swapnali BAnsode  ", 100);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(book b:list) {
			System.out.println(b.id + b.name + b.author + b.publisher + b.quantity);
		}

	}

}
