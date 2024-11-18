Floating Point Numbers Calculator
Overview

The Floating Point Numbers Calculator is a simple Java Swing application designed to perform basic calculations on three floating-point numbers. The application allows the user to input three numbers and calculates the sum, average, and largest value of the inputs. The results are displayed in a dialog box.
Features

    Sum: Calculates the sum of the three input numbers.
    Average: Calculates the average of the three input numbers.
    Largest: Identifies the largest number among the three inputs.
    User Interface: A simple GUI built using Java Swing, consisting of labels, text fields, and a button.

Requirements

    Java Version: JDK 8 or higher
    Operating System: Cross-platform (Windows, MacOS, Linux)

How to Run the Application

    Clone or Download: Download or clone this repository to your local machine.

    Compile the Code:
        Open a terminal (or command prompt).
        Navigate to the directory containing the NumberCalculator.java file.
        Compile the program using the following command:

    javac NumberCalculator.java

Run the Program:

    Once the code is compiled, run the program using:

        java NumberCalculator

    Using the Application:
        A GUI window will appear asking you to input three numbers.
        Enter the values into the text fields.
        Click the Calculate button to see the sum, average, and largest value displayed in a popup dialog.

Example

When you run the program, you will be presented with three fields to enter numbers. After clicking the Calculate button, a message dialog will display the sum, average, and largest number.
Sample Input:

    First number: 10.5
    Second number: 20.75
    Third number: 15.3

Sample Output:

Sum: 46.55
Average: 15.52
Largest: 20.75

Code Issues and Fixes

The provided code has some issues that need to be addressed for it to work correctly:

    Method Name Case Sensitivity: Java is case-sensitive, and method names such as setDefaultCloseOperation and setSize should use lowercase letters where appropriate. Also, method calls like getText() and showMessageDialog() need to follow correct Java conventions.

    Incorrect Spelling of Method and Class Names:
        SetDefaultCloseOperation should be setDefaultCloseOperation.
        Setsize should be setSize.
        FlowLayout should be FlowLayout().
        Jlabel should be JLabel.
        JTextfield should be JTextField.
        CalculateButton should be calculationButton.
        float.parselfloat() should be Float.parseFloat().

    Logical Errors:
        In Math.max(num1, Math.max()), you need to pass the second argument to Math.max() in the nested call, such as Math.max(num1, Math.max(num2, num3)).
        The variable Sum should be lowercase (sum) to follow Java naming conventions.

Here is a corrected version of the code (with the issues addressed):

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberCalculator extends JFrame {

    public static void main(String args[]) {
        JFrame frame = new JFrame("Floating Point Numbers Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Enter first number");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Enter second number");
        JTextField textField2 = new JTextField(10);
        JLabel label3 = new JLabel("Enter third number");
        JTextField textField3 = new JTextField(10);
        JButton calculationButton = new JButton("Calculate");

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(label3);
        frame.add(textField3);
        frame.add(calculationButton);

        calculationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(textField1.getText());
                    float num2 = Float.parseFloat(textField2.getText());
                    float num3 = Float.parseFloat(textField3.getText());

                    float sum = num1 + num2 + num3;
                    float average = sum / 3;
                    float largest = Math.max(num1, Math.max(num2, num3));

                    String resultMessage = String.format("Sum: %.2f\nAverage: %.2f\nLargest: %.2f", sum, average, largest);
                    JOptionPane.showMessageDialog(frame, resultMessage, "Results", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}

Improvements:

    Fixed method and variable naming conventions.
    Corrected the Math.max logic to compare all three numbers.
    Added a try-catch block to handle invalid input (non-numeric values).

License

This project is open source and free to use under the MIT License.

This README file covers the program's purpose, usage instructions, and identifies and fixes issues in the provided code.

