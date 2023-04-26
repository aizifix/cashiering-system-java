import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ---------------------------- SECTIONS : THESE CAN BE ADDED OR UPDATED -----------------------------------
        // MEAT SECTION
        String[] productNames = {"Chicken Fillet", "Beef Steak", "Pork Belly", "Fish Fillet", "Chicken Wings"};
        double[] productPrices = {200.00, 320.00, 450.00, 550.00, 480.00};

        // MEDICAL SUPPLIES
        String[] medicalNames = {"Alcohol", "Bandage", "Plaster", "Cotton Buds", "Sanitizer"};
        double[] medicalPrices = {35.00, 25.00, 50.00, 70.00, 55.00};

        // HOUSEHOLD ITEMS
        String[] householdNames = {"Refrigerator", "Television", "Sofa", "Airconditioner", "Lamp"};
        double[] householdPrices = {9500.00, 5000.00, 7200.00, 13300.00, 2500.00};
        
        // APPARELS
        String[] apparelNames = {"T-shirt", "Shorts", "Jacket", "Jogger Pants", "Shoes"};
        double[] apparelPrices = {350.00, 420.00, 1200.00, 530.00, 2500.00};    
        
        // SCHOOL SUPPLIES
        String[] schoolNames = {"Pencil", "Ballpen", "Yellow Paper", "Bondpaper", "Glue"};
        double[] schoolPrices = {25.00, 50.00, 30.00, 70.00, 45.00};
        
        int[] productQuantity = new int[5];
        int[] medicalQuantity = new int[5];
        int[] householdQuantity = new int[5];
        int[] apparelQuantity = new int[5];
        int[] schoolQuantity = new int[5];
        
        // ---------------------------- CHANGABLE VAT RATE ---------------------------------------------------------
        double vatRate = 0.01;

        boolean continueShopping = true;

        while (continueShopping) {
            System.out.format("-------------------[ CASHIERING SYSTEM ]------------------+%n");
            System.out.format("|                         SECTIONS                        |%n");
            System.out.format("+---------------------------------------------------------+%n");
            System.out.format("|1. Meat Section  2. Medical Supplies  3. Household Items |%n");
            System.out.format("|4. Apparels      5. School Supplies   6. Checkout        |%n");
            System.out.format("+---------------------------------------------------------+%n");

            System.out.print("Enter choice : ");
            int choice = scanner.nextInt();

            if (choice == 1) {
            	boolean inMeatSection = true;
            	while (inMeatSection) {
            		 // DISPLAY MEAT SECTION
                    System.out.format("+-------------------+---------+%n");
                    System.out.format("| Meat Section      | Price   |%n");
                    System.out.format("+-------------------+---------+%n");
                    System.out.format("| 1. Chicken Fillet | P200.00 |%n");
                    System.out.format("| 2. Beef Steak     | P320.00 |%n");
                    System.out.format("| 3. Pork Belly     | P450.00 |%n");
                    System.out.format("| 4. Fish Fillet    | P550.00 |%n");
                    System.out.format("| 5. Chicken Wings  | P480.00 |%n");
                    System.out.format("+-------------------+---------+%n");
                    System.out.print("Basket : ");
                    int productIndex = scanner.nextInt() - 1;
                    productQuantity[productIndex]++;

                    System.out.println(productNames[productIndex] + " added!");

                    System.out.print("\nWould you like to order or proceed? Yes or No\nAnswer : ");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("No")) {
                        inMeatSection = false;
                    }
            	}
               
            } else if (choice == 2) {
            	boolean inMedicalSection = true;
            	while (inMedicalSection) {
            		// DISPLAY MEDICAL SUPPLIES
                    System.out.format("+-------------------+---------+%n");
                    System.out.format("| Medical Supplies  | Price   |%n");
                    System.out.format("+-------------------+---------+%n");
                    System.out.format("| 1. Alcohol        | P35.00  |%n");
    				System.out.format("| 2. Bandage        | P25.00  |%n");
    				System.out.format("| 3. Plaster        | P50.00  |%n");
    				System.out.format("| 4. Cotton Buds    | P70.00  |%n");
    				System.out.format("| 5. Sanitizer      | P55.00  |%n");
    				System.out.format("+-------------------+---------+%n");
    				System.out.print("Basket : ");
    				int productIndex = scanner.nextInt() - 1;
    				medicalQuantity[productIndex]++;
    				
    	            System.out.println(medicalNames[productIndex] + " added!");

    	            System.out.print("\nWould you like to order or proceed? Yes or No\nAnswer : ");
    	            String answer = scanner.next();
    	            if (answer.equalsIgnoreCase("No")) {
    	                inMedicalSection = false;
    	            }
            	}
                
	        } else if (choice == 3) {
	        	boolean inHouseholdSection = true;
	        	while(inHouseholdSection) {
	        		 // DISPLAY HOUSEHOLD ITEMS
	                System.out.format("+-------------------+------------+%n");
	                System.out.format("| Household Items   | Price      |%n");
	                System.out.format("+-------------------+------------+%n");
	                System.out.format("| 1. Refrigerator   | P9,500.00  |%n");
	                System.out.format("| 2. Television     | P5,000.00  |%n");
	                System.out.format("| 3. Sofa           | P7,200.00  |%n");
	                System.out.format("| 4. Airconditioner | P13,300.00 |%n");
	                System.out.format("| 5. Lamp           | P2,500.00  |%n");
	                System.out.format("+-------------------+------------+%n");
	                System.out.print("Basket : ");
	                int productIndex = scanner.nextInt() - 1;
	                householdQuantity[productIndex]++;
	                
	                System.out.println(householdNames[productIndex] + " added!");

	                System.out.print("\nWould you like to order or proceed? Yes or No\nAnswer : ");
	                String answer = scanner.next();
	                if (answer.equalsIgnoreCase("No")) {
	                    inHouseholdSection = false;
	                }
	        	}
               
            } else if (choice == 4) {
            	boolean inApparelSection = true;
            	while(inApparelSection){
            		 // DISPLAY APARREL ITEMS
                    System.out.format("+-------------------+------------+%n");
                    System.out.format("| Apparels          | Price      |%n");
                    System.out.format("+-------------------+------------+%n");
                    System.out.format("| 1. T-shirt        | P350.00    |%n");
                    System.out.format("| 2. Shorts         | P420.00    |%n");
                    System.out.format("| 3. Jacket         | P1,200.00  |%n");
                    System.out.format("| 4. Jogger Pants   | P530.00    |%n");
                    System.out.format("| 5. Shoes          | P2,500.00  |%n");
                    System.out.format("+-------------------+------------+%n");
                    System.out.print("Basket : ");
                    int productIndex = scanner.nextInt() - 1;
                    apparelQuantity[productIndex]++;
                    
                    System.out.println(apparelNames[productIndex] + " added!");

                    System.out.print("\nWould you like to order or proceed? Yes or No\nAnswer : ");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("No")) {
                        inApparelSection = false;
                    } 
            	}
               
                
            } else if (choice == 5) {
            	boolean inSchoolSection = true;
            	while(inSchoolSection) {
            		   // DISPLAY SCHOOL SUPPLIES
                    System.out.format("+-------------------+------------+%n");
                    System.out.format("| School Supplies   | Price      |%n");
                    System.out.format("+-------------------+------------+%n");
                    System.out.format("| 1. Pencil         | P25.00     |%n");
                    System.out.format("| 2. Ballpen        | P50.00     |%n");
                    System.out.format("| 3. Jacket         | P30.00     |%n");
                    System.out.format("| 4. Jogger Pants   | P70.00     |%n");
                    System.out.format("| 5. Shoes          | P45.00     |%n");
                    System.out.format("+-------------------+------------+%n");
                    System.out.print("Basket : ");
                    int productIndex = scanner.nextInt() - 1;
                    schoolQuantity[productIndex]++;
                    
                    System.out.println(schoolNames[productIndex] + " added!");

                    System.out.print("\nWould you like to order or proceed? Yes or No\nAnswer : ");
                    String answer = scanner.next();
                    if (answer.equalsIgnoreCase("No")) {
                        inSchoolSection = false;
                    }
            	}
             
                
            } else if (choice == 6) {
                double total = 0;
                System.out.println("\nBasket :");
                for (int i = 0; i < productQuantity.length; i++) {
                    if (productQuantity[i] > 0) {
                        System.out.println(productNames[i] + " x " + productQuantity[i]);
                        total += productPrices[i] * productQuantity[i];
                    }
                }
                for (int i = 0; i < medicalQuantity.length; i++) {
                    if (medicalQuantity[i] > 0) {
                        System.out.println(medicalNames[i] + " x " + medicalQuantity[i]);
                        total += medicalPrices[i] * medicalQuantity[i];
                    }
                }
                for (int i = 0; i < householdQuantity.length; i++) {
                	if (householdQuantity[i] > 0) {
                		System.out.println(householdNames[i] + " x " + householdQuantity[i]);
                		total += householdPrices[i] * householdQuantity[i];
                	}
                }
                for (int i = 0; i < apparelQuantity.length; i++){
                	if(apparelQuantity[i] > 0) {
                		System.out.println(apparelNames[i] + " x " + apparelQuantity[i]);
                		total += apparelPrices[i] * apparelQuantity[i];
                	}
                }
                for (int i = 0; i < schoolQuantity.length; i++) {
                	if(schoolQuantity[i] > 0) {
                		System.out.println(schoolNames[i] + " x " + schoolQuantity[i]);
                		total += schoolPrices[i] * schoolQuantity[i];
                	}
                }
                
                System.out.printf("Price : P %.2f%n", total);
                
                System.out.print("\nEnter amount : P ");
                double amount = scanner.nextDouble();

                double vat = total * vatRate;
                double totalPrice = total + vat;

                while (amount < totalPrice) {
                    System.out.println("\nInsufficient amount");
                    System.out.print("Add amount : P ");
                    amount = scanner.nextDouble();     
                }

                double change = amount - totalPrice;
                

                System.out.format("+-----------------------------------+%n");
                System.out.format("|              RECEIPT              |%n");
                System.out.format("+-----------------------------------+%n");
                
                
                for (int i = 0; i < productQuantity.length; i++) {
                    if (productQuantity[i] > 0) {
                        System.out.format(" %s x %d : P%.2f%n", productNames[i], productQuantity[i], productPrices[i] * productQuantity[i]);
                    }
                }
                for (int i = 0; i < medicalQuantity.length; i++) {
                    if (medicalQuantity[i] > 0) {
                        System.out.format(" %s x %d : P%.2f%n", medicalNames[i], medicalQuantity[i], medicalPrices[i] * medicalQuantity[i]);
                    }
                }
                for (int i = 0; i < householdQuantity.length; i++) {
                	if (householdQuantity[i] > 0) {
                		System.out.format(" %s x %d : P%.2f%n", householdNames[i], householdQuantity[i], householdPrices[i] * householdQuantity[i]);
                	}
                }
                for (int i = 0; i < apparelQuantity.length; i++) {
                	if (apparelQuantity[i] > 0) {
                		System.out.format(" %s x %d : P%.2f%n", apparelNames[i], apparelQuantity[i], apparelPrices[i] * apparelQuantity[i]);
                	}
                }
                for (int i = 0; i < schoolQuantity.length; i++) {
                	if (schoolQuantity[i] > 0) {
                		System.out.printf(" %s x %d : P%.2f%n", schoolNames[i], schoolQuantity[i], schoolPrices[i] * schoolQuantity[i]);
                	}
                }
                
                System.out.format("+-----------------------------------+%n");
                System.out.format(" VAT : P%.2f%n", vat);
                System.out.format("+-----------------------------------+%n");
                System.out.format(" Total : P %.2f%n", totalPrice);
                System.out.format(" Amount received : P%.2f%n", amount);
                System.out.format(" Change : P%.2f%n", change);
                System.out.format("+-----------------------------------+%n");

                System.out.println("\nThank you for your order!");
                break;
            }
        }
    }
  
}
