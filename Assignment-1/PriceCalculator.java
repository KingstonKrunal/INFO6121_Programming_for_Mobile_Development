
/**
 * Program Name: PriceCalculator
 * Author: Krunal Shah
 * Date: 2021/10/01
 * Purpose: The program is used to take prices of car parts and print total amount by adding taxes, shipping charges, additional charges based on car making model like Tesla, Ford, Subaru, etc. if applicable.
 */

import java.util.Scanner;

public class PriceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Help to scan input from users.

        System.out.println("This program will help you to calculate the total price of car items you wish to order.");

        // Read name of user
        System.out.println("Hello, what is your name?");
        String uName = scanner.nextLine(); // store name entered by the user

        // Checking if entered name is blank
        while (uName.isBlank()) {
            System.err.println("Name entered is empty, please enter your name again");
            uName = scanner.nextLine();
        }

        System.out.println("Hello " + uName); // print user name

        Float totalPrice = 0f;
        Integer count = 0;

        // Loop to read prices
        while (true) {
            System.out.print("Please enter the price of each item you wish to order (Enter -1 to finish): ");
            Float price = scanner.nextFloat(); // scan prices entered by the user

            // Break loop if price is equal to -1
            if (price == -1) {
                break; // break the loop
            } else if (price < 1) { // Checking for invalid price
                System.out.println("Please enter a valid price (more than 1)");
                continue; // continue the loop from this step
            }

            totalPrice += price; // this will add price into total price
            count++; // count will increase by 1
        }

        // exit if no prices were entered
        if (count == 0) {
            System.out.println("No prices for parts were added. See you next time!!");
            scanner.close(); // this will close the scanner object
            return; // end the program
        }

        System.out.print("Please enter the make of the car you wish to order parts for: ");
        String carMake = scanner.next(); // store the car make entered by the user

        Float additionalRate = 0f;

        // decide and calculate additional rate based on car make
        switch (carMake.toLowerCase()) {
            case "ford":
                additionalRate = 5f;
                break;
            case "toyota":
                additionalRate = 20f;
                break;
            case "hyundai":
                additionalRate = 25f;
                break;
            case "tesla":
                additionalRate = 37f;
                break;
            case "subaru":
                additionalRate = 50f;
                break;
            default:
                break;
        }

        Float additionalCharge = totalPrice * additionalRate / 100; // calculate aditional charge

        System.out.println("Note: the makes of Ford, Toyota, Hyundai, Tesla, and Subaru incur additional fees"); // note for user

        Float shippingFee = 0f;

        // decide and calculatge shipping rate based on count
        if (count >= 10) {
            shippingFee = 10f; // declaring shipping fee percentage
            System.out.println("Number of items ordered is greater than 10. Applying additional fee at 10%");
        } else if (count >= 5 && count < 10) {
            shippingFee = 5f; // declaring shipping fee percentage
            System.out.println("Number of items ordered is greater than 5. Applying additional fee at 5%");
        }

        Float shippingCharge = (totalPrice + additionalCharge) * shippingFee / 100; // calculate the shipping charges

        // calculate final price
        final Float HST = 0.13f; // HST percentage - 13%

        // total charges including additional charge and shipping charge without HST
        Float totalIncCharges = totalPrice + additionalCharge + shippingCharge;

        // Final Output with every data
        System.out.println(uName + ","); // Name
        System.out.println("For the order of " + count + " items"); // total items added by user
        System.out.println("The order price is $" + totalPrice); // total price

        if (additionalRate > 0) { // check if additional rate is more than 0, otherwise this will not be printed
            System.out.println("Ordering parts from " + carMake + " charges for an additional rate of " + additionalRate
                    + " percent");
        }

        if (shippingFee > 0) { // check if shipping fee was applied or not
            System.out.println("There is also an additional fee of " + shippingFee + " percent");
        }

        if (!totalIncCharges.equals(totalPrice)) { // if additional charge and shipping fee are not there, this will not
                                                   // be printed
            System.out.printf("The price with additional fees and shipping is $%.2f\n", totalIncCharges);
        }

        // total price with HST
        Float finalPrice = Math.round((totalIncCharges + totalIncCharges * HST) * 100) / 100.f;

        // calculate average price
        Float avgPrice = finalPrice / count;

        // print final price with taxes and also print average price
        System.out.printf("The final price with tax comes to $%.2f with an average price of $%.2f per item", finalPrice,
                avgPrice);

        scanner.close();
    }
}
