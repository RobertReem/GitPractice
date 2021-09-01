import java.util.Arrays;

public class Pizza {
 String size;
 Integer numberOfToppings;
 String[] toppings;
 
 public Pizza(String size, Integer numberOfToppings, String[] toppings) {
	 this.size = size;
	 this.numberOfToppings = numberOfToppings;
	 this.toppings = toppings;
 }
 public static String listOfToppings() {
	 return "Your choices are:\n" +
			 "Pepperoni\n" +
			 "Bacon\n" +
			 "Sausage\n" +
			 "Pineapple\n" +
			 "Mushroom\n" +
			 "Olives";
 }
@Override
public String toString() {
	return " \n Pizza [size=" + size + ", numberOfToppings=" + numberOfToppings + ", toppings=" + Arrays.toString(toppings) + "]";
}
 
}
