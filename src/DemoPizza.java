import java.util.ArrayList;
import java.util.Scanner;
public class DemoPizza {
    public static void main(String[] args) {
        int ToppingsAmount = 0;
        String DeliveryAddress;
        //initialize variables
        ArrayList<String> ArrayToppings = new ArrayList<>();
        Scanner DorNo = new Scanner(System.in);
        System.out.println("Is your pizza for: Delivery[1] or Pickup[2]");
        int Dbool = DorNo.nextInt();
        //asks whether it is delivery or not, then goes down the proper path
        if (Dbool == 1) {
            DeliveryPizza new_DeliveryPizza = new DeliveryPizza();
            Scanner DeliveryToppingResponse = new Scanner(System.in);
            //rather than having to enter a quit constant, the user enters how many toppings they want here
            System.out.println("Enter number of toppings: ");
            ToppingsAmount = DeliveryToppingResponse.nextInt();
            //checks if there are too many toppings
            if (ToppingsAmount>10){
                System.out.println("Toppings amount exceeded");
                return;
            }
            //asks for each topping and hands them to the proper object
            for (int i = 1; i <= ToppingsAmount; ++i) {
                Scanner ToppingResponse = new Scanner(System.in);
                System.out.println("Enter Topping" + "[" + i + "]" + "here:");
                String inputName = ToppingResponse.nextLine();
                ArrayToppings.add(inputName);
            }
            Scanner AddressResponse = new Scanner(System.in);
            System.out.println("Enter Address: ");
            DeliveryAddress = AddressResponse.nextLine();
            new_DeliveryPizza.constructor(ArrayToppings, ToppingsAmount, DeliveryAddress);
            //CREATIVE ASPECT if the user wants pineapple this prevents them from obtaining it and shuns them
            if (new_DeliveryPizza.toppings.contains("pineapple")){
                System.out.println("EEEEEEEEEEWWWWWWWWWWWWWWWWW");
                return;
            }
            //displays the object for delivery
            System.out.println(new_DeliveryPizza.toString());
            return;
        }
        Pizza new_Pizza = new Pizza();
        Scanner PizzaToppingResponse = new Scanner(System.in);
        System.out.println("Enter number of toppings: ");
        ToppingsAmount = PizzaToppingResponse.nextInt();
        //checks to see if the user entered too many toppings
        if (ToppingsAmount>10){
            System.out.println("Toppings amount exceeded");
            return;
        }
        //asks for each topping and hands them to the proper object
        for (int i = 1; i <= ToppingsAmount; ++i) {
            Scanner ToppingResponse = new Scanner(System.in);
            System.out.println("Enter Topping" + "[" + i + "]" + "here:");
            String inputTopping = ToppingResponse.nextLine();
            ArrayToppings.add(inputTopping);
        }
        new_Pizza.constructor(ArrayToppings, ToppingsAmount);
        //CREATIVE ASPECT if the user wants pineapple this prevents them from obtaining it and shuns them
        if (new_Pizza.toppings.contains("pineapple")){
            System.out.println("EEEEEEEEEEWWWWWWWWWWWWWWWWW");
            return;
        }
        //displays the object for pickup
        System.out.println(new_Pizza.toString());
    }
}