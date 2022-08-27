//Replace all vowels from the following string "Here’s how it works"

package recap3;

public class Class1Q4 {

	public static void main(String[] args) {
		String a = "here's how it works";
    	System.out.println(a);
    	//a = a.replace('e', ' ');
    	//a = a.replace('i', ' ');
    	//a = a.replace('o', ' ');
    			// System.out.println(a);
    			a= a.replaceAll('a','e','i','o','u', ' ');
    			System.out.println(a);
    }
	}

