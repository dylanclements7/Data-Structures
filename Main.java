import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Big Y Pizza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new FlowLayout());
        JLabel sizeLabel = new JLabel("Please select a size:");
        JCheckBox smallSize = new JCheckBox("Small");
        JCheckBox mediumSize = new JCheckBox("Medium");
        JCheckBox largeSize = new JCheckBox("Large");
        JLabel cheese = new JLabel("Would you like extra cheese? (It is no additional cost)");
        JCheckBox cheeseBox = new JCheckBox("Extra Cheese");
        JLabel toppingsCountLabel = new JLabel("How many toppings would you like?(Each topping is $.50, maximum 3, 3 toppings is a DEAL for $1.25");
        JTextField toppingsCountField = new JTextField(5);
        JLabel toppingsLabel = new JLabel("Enter what dope toppings you want:");
        JTextField toppingsField = new JTextField(20);
        JButton enterButton = new JButton("Order");
        frame.add(sizeLabel);
        frame.add(smallSize);
        frame.add(mediumSize);
        frame.add(largeSize);
        frame.add(cheese);
        frame.add(cheeseBox);
        frame.add(toppingsCountLabel);
        frame.add(toppingsCountField);
        frame.add(toppingsLabel);
        frame.add(toppingsField);
        frame.add(enterButton);
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double basePrice = 0;
                if (smallSize.isSelected()) {
                    basePrice = 5.0;
                } else if (mediumSize.isSelected()) {
                    basePrice = 10.0;
                } else if (largeSize.isSelected()) {
                    basePrice = 15.0;
                }
                int toppingsCount = 0;
                toppingsCount = Integer.parseInt(toppingsCountField.getText());
                double cost;
                if (toppingsCount <= 3) {
                    cost = toppingsCount * 0.5;
                    if (toppingsCount == 3) {
                        cost = 1.25;
                    }
                } else {
                    cost = 1.25 * 0.5;
                }
                double totalPrice = basePrice + cost;
                String size = "";
                if (smallSize.isSelected()){
                    size = "Small";
                }
                else if (mediumSize.isSelected()){
                    size = "Medium";
                }
                else if (largeSize.isSelected()){
                    size = "Large";
                }
                JOptionPane.showMessageDialog(frame, "Your pizza is: " + "\n"+"Size: " + size + "\n"+"Extra cheese: " + (cheeseBox.isSelected() ? "Yes" : "No") + "\n"+"Toppings: " + toppingsField.getText() + "\n"+"Total Price: $" + String.format("%.2f", totalPrice));
            }
        });
        frame.setVisible(true);
    }}