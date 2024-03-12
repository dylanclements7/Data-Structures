import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ItemOrder {
    int Quantity;
    //initializes Quantity
    public Item Order(){
        Item new_Item = new Item();
        //makes a new item object, CREATIVE ASPECT is that the user can define any product, they are not limited to a database
        Scanner ItemNameScan = new Scanner(System.in);
        System.out.println("What is the name of the item?");
        String ItemName = ItemNameScan.nextLine();
        new_Item.set_ItemName(ItemName);
        //takes the name and sets it
        Scanner ItemCostScan = new Scanner(System.in);
        System.out.println("How much does "+ItemName+" cost?");
        int ItemCost = ItemCostScan.nextInt();
        new_Item.set_Cost(ItemCost);
        //takes the cost and sets it
        Scanner ItemQuantityScan = new Scanner(System.in);
        System.out.println("How many "+ItemName+" would you like to purchase?");
        Quantity = ItemQuantityScan.nextInt();
        //takes the quantity and sets it in ItemOrder
        return new_Item;
        }
    public int get_Quantity(){
        return Quantity;
    }
    //returns the quantity for the specific order the cart is querying
}
