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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Printing limited sets of Fibonacci sequence");
	double fib1=0;
	double fib2=1;
	double temp=0;
	System.out.println(fib1);
	System.out.println(fib2);
	do{
	  temp= fib1+fib2;
	  System.out.println(temp);
	  fib1=fib2; //replace 2nd with 1st number
	  fib2=temp; // replace temp number with 2nd number
	 } 
        while (fib2 < 5000);

    }
    
}
