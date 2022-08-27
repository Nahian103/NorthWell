package Review1;

public class Class2 {

		
		public static void main(String[] args) {
			double[] intArray2 = {3.4,78.9,100.9,50,67.2};
			double sum = 0;
			for(int i=0; i<intArray2.length; i++) {
				sum+= intArray2[i];
			}
			double average = sum / intArray2.length;
			System.out.println("Avg of array is "+average);
			


		}

	}

    
	