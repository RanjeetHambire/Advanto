package string;

public class StringBuilder_method {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Progrmer");
		sb.insert(1, "hello");
		sb.replace(1, 6, "Bye");
		sb.delete(1,4);
		sb.reverse();
		
		System.out.println(sb);
		
		// capacity() - denotes the amount of space available to store new characters
		System.out.println("Capacity => " + sb.capacity());

	}

}
