/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschool;

import javax.swing.JOptionPane;

/**
 *
 * @author Nedlog
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        String option;
        double firstNumber=Double.parseDouble(JOptionPane.showInputDialog("Enter the first number: "));
        double secondNumber=Double.parseDouble(JOptionPane.showInputDialog("Enter the second number: "));
        option=JOptionPane.showInputDialog("What calculation do you want to do with the numbers amongst: Addition, Subtraction, Division and Remainder?");
        double result=0.0;
        if(option.equalsIgnoreCase("Addition")){
            result=Calculator.addition(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null,"The addition of the two numbers is: "+result);
        }
        else if(option.equalsIgnoreCase("Subtraction")){
            result=Calculator.subtraction(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null,"The subtraction of second number from the first number is: "+result);
        }
        else if(option.equalsIgnoreCase("Division")){
            result=Calculator.division(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null,"The division of the two numbers is: "+result);
        }
        else if (option.equalsIgnoreCase("Remainder")){
            result=Calculator.remainder(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null,"The remainder of the division of the two numbers is: "+result);
        }
        else
             JOptionPane.showMessageDialog(null,"You have typed an invalid response!");
    
    }
    }
    

