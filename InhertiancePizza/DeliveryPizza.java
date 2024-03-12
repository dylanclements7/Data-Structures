import java.util.ArrayList;

public class DeliveryPizza  extends Pizza{
    int DeliveryFee;
    String DeliveryAddress;
    String toppings;
    int TotalPrice;
    public void constructor(ArrayList<String> arrayToppings, int numberToppings, String new_DeliveryAddress){
        //sets price
        Price = 14 + 2*numberToppings;
        StringBuilder ToppingBuilder = new StringBuilder();
        //converts the array to a string seperated by commas
        for (int i = 0; i < numberToppings; i++) {
            ToppingBuilder.append(arrayToppings.get(i));
            if (i != numberToppings - 1) {
                ToppingBuilder.append(", ");
            }
        }
        toppings = ToppingBuilder.toString();
        DeliveryAddress = new_DeliveryAddress;
        //sets the delivery fee depending on price
        if (Price>18){
            DeliveryFee = 3;
        }
        else{
            DeliveryFee = 5;
        }
        TotalPrice = DeliveryFee+Price;
    }
    public String toString(){
        //displays information
        return "Toppings are: "+toppings +". Price is: $"+ Price+ ". Delivery fee is: $"+DeliveryFee+". This is being delivered to: "+DeliveryAddress+". Your total is: $"+TotalPrice+".";
    }
}
