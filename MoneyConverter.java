//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double answer;
        Scanner response = new Scanner(System.in);
        System.out.println("Enter Amount:");
        String answerstr = response.nextLine();
        if (answerstr.startsWith("$")){
            answerstr = answerstr.substring(1);
        }
        answer = Double.parseDouble(answerstr);
        if (BigDecimal.valueOf(answer).scale() < 3) {
            int cents = (int)(answer * 100);
            int quarters = (int)cents / 25;
            cents = cents - (quarters * 25);
            int dimes = cents / 10;
            cents = cents - (dimes * 10);
            int nickels = cents / 5;
            cents = cents - (nickels * 5);
            int pennies = cents;
            System.out.println("Quarters: " + quarters + "\n" + "Dimes: " + dimes + "\n" + "Nickels: " + nickels + "\n" + "Pennies: " + pennies);
        }
        else {
            System.out.println("Please Enter a Valid Amount");
        }
        }
    }
