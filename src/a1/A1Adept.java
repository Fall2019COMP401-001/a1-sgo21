package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// items in store total 
		
		int count  = scan.nextInt();
		
		// feed items and prices into arrays
		
		String [] itemName = new String [count];
		double[] price = new double [count];
		for (int i=0; i<count; i++) {
			itemName [i] = scan.next(); 
			price [i]= scan.nextDouble(); 
		}
	
		// total customers
		
		int customers = scan.nextInt(); 
		
		String[] firstName = new String[customers];
		String[] lastName = new String[customers];

		for (int j=0; j<customers; j++) {
			firstName[j] = scan.next(); 
			lastName [j] = scan.next(); 
			int totalqty = scan.nextInt();
			
			double mult = 0;
			double [] multarray = new double [totalqty]; 
				
			for (int k=0; k<totalqty; k++) {
				int eachqty = scan.nextInt();
				String purchasedItem = scan.next();
					for (int p=0; p<count; p++) {
					if (purchasedItem == itemName[p]) {
						mult += (price[p] * eachqty);
						} 
					multarray[p] = mult; 		
					}
		System.out.println("Biggest: " + firstName[j] + lastName[j] + findValueMax(multarray));
		System.out.println("Smallest: " + firstName[j] + lastName[j] +findValueMin(multarray));
				}
		}
}
static double findValueMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}

	/* findValueMax
	 * Finds and returns the maximum value in an array of integers
	 * 
	 * Input: array of integers values
	 * 
	 * Output: maximum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static double findValueMax(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}
}


