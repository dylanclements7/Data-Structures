import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pizza {
        int Price;
        String toppings;
        //initializes variables
        public void constructor(ArrayList<String> arrayToppings, int numberToppings){
            Price = 14 + 2*numberToppings;
            //sets price
            StringBuilder ToppingBuilder = new StringBuilder();
            //converts the array to a string
            for (int i = 0; i < numberToppings; i++) {
                ToppingBuilder.append(arrayToppings.get(i));
                if (i != numberToppings - 1) {
                    ToppingBuilder.append(", ");
                }
            }
            toppings = ToppingBuilder.toString();
        }
        public String toString(){
            //displays the inforation as a string
            return "Toppings are: "+toppings +". Price is: $"+ Price+".";
        }
    }
