import java.util.Scanner;
import java.util.Arrays;

public class Order {
	
	
	public static void main(String[] args) {
		Customer customer =  Customer.enterCustomerInfo();
		Pizza[] order = enterPizzaDetails();
		
		System.out.println(orderConfirmation(customer, order));
	}
	
	/*
	 * public static String printOrder(Customer customer, int numOfPizzas, Pizza[]
	 * pizzas) { String orderDetails;
	 * 
	 * orderDetails = customer.toString() + " " + pizzas.toString();
	 * 
	 * return orderDetails.toString(); }
	 */
	
	
	public static Pizza[] enterPizzaDetails() {
		Scanner kb = new Scanner(System.in);
		
		String size;
		int numOfToppings;
		
		String[] toppings;

		int numOfPizzas;
		
		System.out.println("how many pizzas would you like?");
		numOfPizzas = kb.nextInt();
		kb.nextLine();
		
		System.out.println("");
		
		Pizza[] pizzas = new Pizza[numOfPizzas];
		
		for(int i=0; i < numOfPizzas; i++) {
			System.out.println("What size pizza would you like for pizza number " + (i+1));
			size = kb.nextLine();
			kb.nextLine();
			
			System.out.println("How many toppings would you like on pizza number " + (i+1));
			numOfToppings = kb.nextInt();
			kb.nextLine();
			System.out.println("");
			
			toppings = new String[numOfToppings];
			System.out.println(Pizza.listOfToppings());
			System.out.println("");
			
			for(int j=0; j < numOfToppings; j++) {
				System.out.println("For topping number " + (j+1));
				toppings[j] = kb.nextLine();
			}
			
			pizzas[i] = new Pizza(size, numOfToppings, toppings);
			
		}

		kb.close();
		return pizzas;
		
	}

public static String orderConfirmation(Customer customer, Pizza[] pizza) {
	String orderConfirmation;
	
	orderConfirmation = "\nOrder Confirmation:\n----------------\n";
	orderConfirmation = orderConfirmation + " " + customer.toString() + "\n";
	for(int i=0; i < pizza.length; i++) {
	orderConfirmation = orderConfirmation + " " + pizza[i].toString();
	}
	
	return orderConfirmation;
}
}

