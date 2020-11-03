/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschool;
import java.util.Scanner;

/**
 *
 * @author Nedlog
 */
public class TimeTable {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the number you want to get to in the time table: ");
        int length=number.nextInt();
        for(int i=1;i<=length;i++){
            System.out.println("For "+i+":");
            for(int j=1;j<=length;j++)
            {
                System.out.print(""+j*i);
                System.out.print(" ");
            }
            System.out.println("");
    }
}
}