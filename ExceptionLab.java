//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class ExceptionLab {
    public static void main(String[] args) {
        try {
            ArrayList<Double> arrayNumbers = new ArrayList<>();
            for (int i = 1; i <= 20; ++i) {
                System.out.println("Enter number here: ");
                Scanner response = new Scanner(System.in);
                double inputNumber = response.nextDouble();
                if (inputNumber == 9999) {
                    for (int x = 0; x < arrayNumbers.toArray().length; x++) {
                        System.out.println(arrayNumbers.get(x));
                    }
                    return;
                }
                arrayNumbers.add(inputNumber);
            }
            for (int x = 0; x < arrayNumbers.toArray().length; x++) {
                System.out.println(arrayNumbers.get(x));
            }
        }
        catch(InputMismatchException e){
            System.out.println("Non-Double data type entered.");
        }
        catch(Exception e){
            System.out.println("Catch All");
        }
    }
}