/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingschool;

/**
 *
 * @author Nedlog
 */
public class SumAndAverage {
    public static void main(String[] args) {
    double sum=0;
    for(double i=1;i<=100;i++){
        sum+=i;
    }
   double average= sum/100;
        System.out.println("The sum is "+ sum);
        System.out.println("The average is "+ average);
}
    
}
