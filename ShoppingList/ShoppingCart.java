import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> OrderArray = new ArrayList<>();
        //creates cart array
        int x=1;
        while(x==1){
            //program will run until exited
            System.out.println("Cart: "+OrderArray);
            //prints the cart
            Scanner CartScanner = new Scanner(System.in);
            System.out.println("What would you like to do?: "+"\n"+"[1]Add an item"+"\n"+"[2]Remove an Item"+"\n"+"[3]See Total"+"\n"+"[0]Checkout");
            int Choice = CartScanner.nextInt();
            //takes user input of what to do, add, remove, total, or exit
            if (Choice == 1){
                ItemOrder new_Order = new ItemOrder();
                OrderArray.add(new_Order.Order().toString()+","+new_Order.get_Quantity());
                //creates a new order and adds the information to the array
            }
            if (Choice == 2){
                Scanner RemovalScan = new Scanner(System.in);
                System.out.println("What is the name of the item you would like to remove?");
                String RemoveName = RemovalScan.nextLine();
                //takes the name of the item they want to remove
                ArrayList<String> newArray = new ArrayList<>();
                for (String item : OrderArray) {
                    if (item.contains(RemoveName)) {
                        continue;
                    }
                    else{
                        newArray.add(item);
                    }
                }
                //creates a proxy array that stores all items that are not the one the user is removing
                OrderArray = newArray;
                //makes the original array the proxy
            }
            if (Choice == 3){
                int Total = 0;
                for (String item : OrderArray) {
                    String[] arrofStr = item.split(",");
                    Total += Integer.parseInt(arrofStr[1])*Integer.parseInt(arrofStr[2]);
                }
                //splits the strings in the cart array and multiplies the costs by their amounts, then adds the products
                System.out.println("Total is: $"+Total);
                //prints the total
            }
            if (Choice==0){
                x = 2;
            }
            //exits the loop, ending the program
        }
}}
