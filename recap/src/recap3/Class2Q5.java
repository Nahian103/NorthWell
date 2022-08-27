// Given an array int[] intArray2 = { 61, 17, 58, 39, 10 };, find the largest values in the array

package recap3;

public class Class2Q5 {

	public static void main(String[] args) {
		int[] intArray2 = { 897, 9047, 7758, 8739, 8910 };
		int max = intArray2[0];
		
		for(int i = 0; i<intArray2.length; i++) {
			if(intArray2[i] > max) {
				max = intArray2[i];
			}
		}
		System.out.println(max);
		

	}

}

