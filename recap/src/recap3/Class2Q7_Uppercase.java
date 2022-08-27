//Given an array String[] brands = {"Verizon", "Adidas", "BMW", "Ford", "Mazda","Exxon", "Google", }; convert all the values to UpperCase.

package recap3;

public class Class2Q7_Uppercase {

	public static void main(String[] args) {
	String[] brands = {"Verizon", "Adidas", "BMW", "Ford", "Mazda","Exxon", "Google"};
	for(int i=0; i<brands.length; i++) {
		brands[i] = brands[i].toUpperCase();
		System.out.println(brands[i]);

}}}
