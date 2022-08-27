//Write a function that takes a double array as input and return the total of all the values in the array
package recap3;

public class Class3Q3 {

	public static void main(String[] args) {			 
			double[] numbers = {.00,87.99,76.99,96.00};
			double sum = 0.0;
			for (int a = 0; a < numbers.length; a++)
				sum= sum+numbers[a];
			System.out.println("Total is "+ sum);
		}

	}

	
