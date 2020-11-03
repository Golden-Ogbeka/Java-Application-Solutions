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
public class CheckPassFail {
    public static void main(String[] args) {
        int mark=0;
        System.out.println("Enter your score: ");
        Scanner inp=new Scanner(System.in);
        mark=inp.nextInt();
        if(mark>=50){
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");
        System.out.println("DONE");
    }
    
}
