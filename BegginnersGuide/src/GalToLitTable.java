/*
 * Try this 1-2
 * 
 * This Program displays a conversion table of gallons to liters
 * 
 * Call this program "GalToLitTable.java
 */
public class GalToLitTable {
	public static void main(String[] args) {
		double gallons, liters;
		int counter;
		
		counter = 0; // <-----------Line counter is initially set to zero
		for(gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is " + liters + " liters.");
			
			counter++; // <--------increment the line counter with each loop iteration
			// every 10th line print a blank line
			if(counter == 10) {
				System.out.println(); // <------------if counter is 10, output a blank line  
				counter = 0;
			}
		}
	}

}
