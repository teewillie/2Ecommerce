/**
 * @class: Ecommerce
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: September 20, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:Write a program that simulates a basic e-commerce system.
 * The user can choose between buy, sell, and inventory. If the user chooses to buy,
 * check if the item is in stock. If the user chooses to sell, you will create the program to
 * ensure they don't exceed the inventory limit. The initial inventory is 50, inventory limit
 * is 100.  - You will need to use switch-case, if-else (class name: Ecommerce)
 */

import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inventory = 50;
        int inventoryLimit = 100;

        System.out.print("Enter your choice: buy, sell, or inventory: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "buy":
                System.out.print("Enter the amount to buy: ");
                int buyAmount = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                if (buyAmount <= 0) {
                    System.out.println("Invalid amount!");
                } else if (inventory + buyAmount > inventoryLimit) {
                    System.out.println("Inventory limit exceeded!");
                } else {
                    inventory += buyAmount;
                    System.out.println("Bought " + buyAmount + " items.");
                    System.out.println("Current inventory: " + inventory);
                }
                break;

            case "sell":
                System.out.print("Enter the amount to sell: ");
                int sellAmount = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                if (sellAmount <= 0) {
                    System.out.println("Invalid amount!");
                } else if (inventory - sellAmount < 0) {
                    System.out.println("Not enough items in inventory!");
                } else {
                    inventory -= sellAmount;
                    System.out.println("Sold " + sellAmount + " items.");
                    System.out.println("Current inventory: " + inventory);
                }
                break;

            case "inventory":
                System.out.println("Current inventory: " + inventory);
                break;

            default:
                System.out.println("Unknown choice!");
        }

        scanner.close();
    }
}
