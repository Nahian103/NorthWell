//array, int[] numbers = {23, 423, 12, 598, 200, 112}; , find the total of all the values in the array.

package recap3;

public class Class2Q1 {

	public static void main(String[] args) {
		 
		int[] numbers = {454,767,777,4523};
		int sum = 0;
		for (int a = 0; a < numbers.length; a++)
			sum = sum+numbers[a];
		System.out.println("Total = " +sum);
	}

}
