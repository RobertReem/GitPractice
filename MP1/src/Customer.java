import java.util.Scanner;
public class Customer {
	
	private String name;
	private Address address;
	
	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	public static Customer enterCustomerInfo() {
		Scanner kb = new Scanner(System.in);
		String name;
		String streetAddress;
		String city;
		String state;
		Integer zip;
		
		System.out.println("Follow the prompts to order pizza");
		System.out.println("What is your name?");
		name = kb.nextLine();
		
		System.out.println("What Street Address shall we drop off your order?");
		streetAddress = kb.nextLine();
		System.out.println("What City are we delivering within?");
		city = kb.nextLine();
		System.out.println("Which State?");
		state = kb.nextLine();
		System.out.println("What is the zip code?");
		zip = kb.nextInt();
		
		Address address = new Address(streetAddress, city, state, zip);
		Customer customer = new Customer(name, address);
		
		return customer;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
	
}
