import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberCalculator extends JFrame
{
public static void main(String args[])
{
JFrame frame = new JFrame("floating point numbers calculator");
frame.SetDefaultCloseOperation(JFrame.EXIT.ON.CLOSE);
frame.Setsize(400,300);
frame.SetLayout(new flowLayout());
Jlabel label1 = new Jlabel("Enter first number");
JTextfield textfield1 = new JTextfield(10);
Jlabel label2 = new Jlabel("Enter second number");
JTextfield textfield2 = new JTextfield(10);
Jlabel label3 = new Jlabel("Enter third number");
JTextfield textfield3 = new JTextfield(10);
JButton calculationButton = new JButton("Calculate");
frame.add(label1);
frame.add(textfield1);
frame.add(label2);
frame.add(textfield2);
frame.add(label3);
frame.add(textfield3);
frame.add(CalculateBiutton);
CalculateButton.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent e)
 {
 try
 {
  float num1 = float.parselfloat(textfield1.getText()); 
  float num2 = float.parselfloat(textfield2.getText()); 
  float num3 = float.parselfloat(textfield3.getText()); 
  float sum = num1 + num2 + num3;
  float average = sum/3;
  float largest = Math.max(num1, Math.max());
  String resultMessage = String.format("Sum: %.2f\nAverage:%.2f\nlargest=%.2f",Sum,average,largest);
  JOptionPane.ShowMessageDialog(frame,resultMessage,"Results", JOptionPane.INFORMATION_MESSAGE);
  }
  catch 
