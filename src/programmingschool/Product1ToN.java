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
public class Product1ToN {
    public static void main(String[] args) {
    int product=1;
    for(int i=1; i<=10;i++){
        product*=i;
    }
        System.out.println("The product of 1 t0 10 is: " +product);
}
}
