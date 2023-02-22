import java.util.*;

public class RestaurantArrayEg {
    public static void main(String[] args) {
        // Define the restaurant menu as an array
        String menu[] = {"Paneer Tikka","Chicken Tikka","Spring rolls","Pasta","Cheeseburger","French-Fries","Chicken wings","Coffee","Iced Tea","Beer"};
		
		System.out.println("Welcome! \n Today's menu:\n\n  Starters:\n Paneer Tikka \n Chicken Tikka \n Spring rolls \n\n Main Course: \n Pasta \n Cheeseburger \n French-Fries \n Chicken wings \n\n Drinks: \n Coffee \n Iced Tea \n Beer \n");		
        double prices[] = {175, 235, 180, 150, 145, 220, 295, 65, 60, 90};
        
        //  user will place an order
        Scanner input = new Scanner(System.in);
        List<String> order = new ArrayList<>();
        while (true) {
            System.out.println("Please enter an item from the menu (or enter done to finish): ");
            String item = input.nextLine();
            if (item.equals("done")) {
                break;
            } else if (!Arrays.asList(menu).contains(item)) {
                System.out.println("Sorry, that item is not on the menu.");
            } else {
                order.add(item);
            }
        }
        
        // Print the order and total cost
        System.out.println("You ordered:");
        double totalCost = 0.0;
        for (String item : order) {
            int index = Arrays.asList(menu).indexOf(item);
            double price = prices[index];
            System.out.println("- " + item + " ($" + price + ")");
            totalCost += price;
        }
        System.out.println("Total cost: $" + totalCost);
    }
}
