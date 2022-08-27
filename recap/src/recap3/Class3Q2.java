//Write a function that takes a string as an input and returns a new string with all the vowels removed

package recap3;

public class Class3Q2 {

	public static void main(String[] args) {
		String a = "eid mubarak";
		System.out.println(a);
		a = a.replaceAll("[aeiou]", "^");

		System.out.println(a);
	}
}