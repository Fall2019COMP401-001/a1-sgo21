package a1;


import java.util.Scanner;


public class A1Jedi {
	
	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
	 
			
			int count  = scan.nextInt();
			
			// customers amounts, items, and price arrays
			// changed amountItems[] to a [][] array
			//ignore price
			int [][] amountItems = new int[count][2]; 
			String [] itemName = new String [count];
			double[] price = new double [count];
			
			Boolean[] duplicate = new Boolean [count]; 
			
			//putting all items in an array; ignore price array input
			for (int i=0; i<count; i++) {
				itemName [i] = scan.next(); 
				price [i]= scan.nextDouble(); 
			}
		
			// total customers; ignore price array
			
			int customers = scan.nextInt(); 
			
			int [] custAmount =  new int[customers]; 
			String[] custName = new String[customers];
			double [] priceArray =  new double[customers]; 
			
			// going through each customer; ignore customer names for jedi

			for (int j=0; j<customers; j++) {
				String firstName =  scan.next();
				String lastName = scan.next();
				
				int totalqty = scan.nextInt();
				String purchasedItem;
									
				for (int n=0; n<totalqty; n++) {
					int eachqty = scan.nextInt();
					purchasedItem = scan.next();
					
					
					for (int p=0; p<itemName.length; p++) {
						if (purchasedItem.equals(itemName[p])) {
							amountItems[p][0] += eachqty;
							
							// look for customer purchased duplicates of an item and account for those duplicates by adding on
							for (int d=0; d<amountItems.length; d++) { 
								duplicate[d] = true; 
							}
	
							if (duplicate[p]) {
								duplicate[p] = false ;
								amountItems[p][1] += 1; 
							}
						}
					}
				
				}
				
			}
			for (int i=0; i<count; i++) {
				if (amountItems[i][0] == 0) {
					System.out.println("No customers bought " + itemName[i]); ;
				} else {
					System.out.println(amountItems[i][1] + " customers bought " + amountItems[i][0] + " " + itemName[i]); 
				}
			}
			scan.close(); 
			
		}

}
