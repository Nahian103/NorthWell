//Write a function that takes an integer as an input and return true if the number is odd else it returns false.

package recap3;

public class Class3Q1 {

	public static void main(String[] args) {
		
        System.out.println(isEven(34));
        System.out.println(isOdd(33));
        System.out.println(isEven(3));
        System.out.println(isOdd(4));
        System.out.println(isOdd(3));
	}
	
	public static boolean isEven(int a) {
		if(a % 2 == 0) {
			return true;
		}else {
			return false;}
		}
		
		public static boolean isOdd(int a) {
			if(a % 2 == 0) {
				return false;
			}else {
				return true;
			}
	}

}