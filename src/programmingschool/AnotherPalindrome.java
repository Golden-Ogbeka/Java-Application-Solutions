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
public class AnotherPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String anotherPalindrome ="Niagara O roar*again";
        String roar=anotherPalindrome.substring(11, 15);
        System.out.println(roar);
        roar=anotherPalindrome.substring(11);
        System.out.println(roar);
    }
    
}
