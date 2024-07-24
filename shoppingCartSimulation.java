package Lab_3;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartSimulation { 

	public static void main(String[] args) {
		ArrayList<String> cart = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Shopping Cart Simulation!");

		// This Block of code is used to add up to 5 items to the cart
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter item " + i + " to add to the cart (or type 'done' to finish): ");
			String item = scanner.nextLine().trim();

			if (item.equalsIgnoreCase("done")) {
				break;
			}

			cart.add(item);
		}

		// Print out the list of items in the cart
		System.out.println("\nItems in your cart:");
		if (cart.isEmpty()) {
			System.out.println("Your cart is empty.");
		} else {
			for (String item : cart) {
				System.out.println("- " + item);
			}
		}

		scanner.close();
		System.out.println("\nThank you for using the Shopping Cart Simulation!");
	}
}
