import java.util.Scanner;

public class Table {
	Scanner sc = new Scanner(System.in);
	
//Method with one user input and 12 iteration	
	public void Twelve() {
//		Ask user for a value
		System.out.println("Please enter a value:");
		int number = sc.nextInt();
		for (int i=1; i<=12; i++) {
			System.out.println(number*i);
		}	
	}
//	Method with two user input
	public void StretchOne() {
//		Ask user for a value
		System.out.println("Please enter a value:");
		int number = sc.nextInt();
//		Ask user number of iteration		
		System.out.println("Enter iteration:");
		int iteration = sc.nextInt();
//		iterate with for loop
		for (int j=1; j<=iteration; j++) {
			System.out.println(number*j);
		}
	}
//Method with one input with two value
	public void StretchTwo() {
//		Ask user for values
		System.out.println("Enter number and iteration separate by comma:");
//		reading values as string
		String values = sc.nextLine();	
//		converting string into array of two values using split()
		String[] myArray = values.split(",");
//		converting string into integer for iteration
		int number = Integer.parseInt(myArray[0]);
		int iteration = Integer.parseInt(myArray[1]);
//		iteration with for loop
		for (int i=1; i<=iteration; i++) {
			System.out.println(number*i);
		}
	}
}
