package ArrayList_practice;

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

public class Book_Store {
	public static void main(String[] args) {
		
		ArrayList<book> list =new ArrayList<book>();
		
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
