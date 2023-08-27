package task;

public class unicodeConvertor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int codepoint1 = 87;  
	       int codepoint2 = 90;  
	    //  Convert the codepoints to char primitives.  
	        char ch1 = (char)codepoint1;  
	        char ch2 = (char)codepoint2;  
	    // Convert the code point to lower case respectively.  
	    char lower1 = Character.toLowerCase(ch1);  
	        char lower2 = Character.toLowerCase(ch2);  
	    // Print the result.  
	System.out.println("The character '" + ch1 + "' can be represented in lower case as " + lower1);  
	System.out.println("The character '" + ch2 + "' can be represented in lower case as " + lower2);  
	      
	}
}
