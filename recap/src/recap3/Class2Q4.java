// array int[] intArray2 = { 61, 17, 58, 39, 10 };, find the average of all the values

package recap3;

public class Class2Q4 {

	public static void main(String[] args) {
		int[] intArray2 = {11,22,33,44,55,66,77,88};
		double sum = 0;
		for(int i=0; i<intArray2.length; i++) {
			sum+= intArray2[i];
		}
		double average = sum / intArray2.length;
		System.out.println("Avg of array is "+average);
		


	}

}
