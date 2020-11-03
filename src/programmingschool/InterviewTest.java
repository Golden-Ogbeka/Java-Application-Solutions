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
public class InterviewTest {
    public static void main(String[] args) {
        String now= "";
        String man;
        Scanner obj=new Scanner(System.in);
        man=obj.nextLine();
        for(int i=(man.length()-1);i>=0;i--){
           now+=man.substring(i,i+1);
        }
        System.out.println(now);
    }
    
}
