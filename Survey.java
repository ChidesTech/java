import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How much do you spend on coffee?");
        double priceOfCoffe = scanner.nextDouble();
        System.out.println("How much do you spend on food?");
        double priceOfFood = scanner.nextDouble();
        System.out.println("How many times a week do you buy coffee?");
       int numberOfCoffeePurchase = scanner.nextInt();
        System.out.println("How many times a week do you buy food?");
       int numberOfFoodPurchase = scanner.nextInt();

       scanner.close();
       System.out.println("Thank you " + name );
       System.out.println("You spend NGN " + priceOfCoffe * numberOfCoffeePurchase + " on coffee a week" );
       System.out.println("And you spend NGN " + priceOfFood* numberOfFoodPurchase + " on food a week" );

        
    }
}
