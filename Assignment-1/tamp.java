import java.util.Scanner;

public class tamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will help you to calculate the total price of car items you wish to order.");

        System.out.println("Hello, what is your name?");
        String uName = scanner.nextLine();

        System.out.println("Hello " + uName);

        Float totalPrice = 0f;
        Integer count = 0;

        while (true) {
            System.out.print("Please enter the price of each item you wish to order (Enter -1 to finish): ");
            Float price = scanner.nextFloat();
            if (price == -1) {
                break;
            }
            totalPrice += price;
            count++;
        }

        System.out.print("Please enter the make of the car you wish to order parts for: ");
        String carMake = scanner.next();

        Float additionalRate = 0f;

        switch (carMake) {
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
        }
        Float additionalCharge = totalPrice * additionalRate / 100;

        System.out.println("Note: the makes of Ford, Toyota, Hyundai, Tesla, and Subaru incur additional fees");

        Float shippingFee = 0f;

        if (count >= 10) {
            shippingFee = 0.10f;
            System.out.println("Number of items ordered is greater than 10. Applying additional fee at 10%");
        } else if (count >= 5 && count < 10) {
            shippingFee = 0.5f;
            System.out.println("Number of items ordered is greater than 5. Applying additional fee at 5%");
        }

        Float shippingCharge = (totalPrice + additionalCharge) * shippingFee / 100;

        final Float HST = 0.13f;

        System.out.println(uName + ",");
        System.out.println("For the order of " + count + " items");
        System.out.println("The order price is $" + totalPrice);
        System.out.println("Ordering parts from " + carMake + " charges for an additional rate of " + additionalRate + " percent");
        System.out.println("There is also an additional fee of " + shippingFee + " percent");
        Float finalPrice = Math.round(totalPrice * HST) / 100.f;
        Float avgPrice = finalPrice / count;
        System.out.printf("The final price with tax comes to $%.2f with an average price of $%.2f per item", finalPrice, avgPrice);
    }
}
