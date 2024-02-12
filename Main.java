//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BigY pizza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Please select only one.");
        JCheckBox smallSize = new JCheckBox("Small");
        JCheckBox medSize = new JCheckBox("Medium");
        JCheckBox largeSize = new JCheckBox("Large");
        frame.add(label);
        frame.add(smallSize);
        frame.add(medSize);
        frame.add(largeSize);
        frame.add(label);
        frame.setVisible(true);

        Scanner response = new Scanner(System.in);
        System.out.println("""
                What size of pizza would you like?
                [1] Small ($5)
                [2] Medium ($10)
                [3] Large ($15)""");
        int answerSize = response.nextInt();
        String size = "";
        int base = 0;
        if (answerSize == 1 || answerSize == 2 || answerSize == 3){
            if (answerSize == 1){
                base += 5;
                size = "small";
            }
            if (answerSize == 2){
                base += 10;
                size = "medium";
            }
            if (answerSize == 3){
                base += 15;
                size = "large";
            }
            int cheese;
            Scanner response2 = new Scanner(System.in);
            System.out.println("""
                    Would you like extra cheese? (no additional charge)
                    [1] Yes
                    [2] No""");
            cheese = response2.nextInt();
            Scanner response3 = new Scanner(System.in);
            System.out.println("How many non-cheese toppings would you like? (Each topping is a $.50 surcharge, 3 toppings DEAL only $1.25, max 3 toppings.)");
            int toppings = response3.nextInt();
            double topcost = 0;
            if (toppings<3){
                topcost += toppings*.50;
            }
            else if (toppings == 3){
                topcost += 1.25;
            }
            else{
                System.out.println("Please enter a number of toppings between 0 and 3.");
                return;
            }
            StringBuilder toppingsOrder = new StringBuilder();
            System.out.println("What non-cheese toppings would you like?");
            for (int i = 0; i < toppings; i++) {
                Scanner response5 = new Scanner(System.in);
                System.out.println("Topping "+ (i+1) + ":");
                toppingsOrder.append(response5.nextLine());
                if (toppings > 1){
                    if ( (toppings ==2) && (i == 0) ){
                        toppingsOrder.append(" and ");
                    }
                    else if ( (toppings == 3) && (i == 1) ){
                        toppingsOrder.append(", and ");
                    }
                    else if ( (toppings == 3) && (i == 0) ){
                        toppingsOrder.append(", ");
                    }
                }
            }
            double totalCost = base + topcost;
            if (cheese == 1){
                System.out.println("Your "+ size + " pizza with " + toppingsOrder + " with extra cheese is $" + totalCost);
            }
            else {
                System.out.println("Your "+ size + " pizza with " + toppingsOrder + " is $" + totalCost);
            }
        }
        else {
            System.out.println("Please Enter a Valid Amount");
        }
    }

}

