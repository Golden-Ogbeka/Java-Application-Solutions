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
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String anotherPalindrome ="Niagara O roar*again";
        int roar=anotherPalindrome.indexOf("r");
        System.out.println(roar);
         roar=anotherPalindrome.lastIndexOf("r");
        System.out.println(roar);
        roar=anotherPalindrome.indexOf("roar");
        System.out.println(roar);
         roar=anotherPalindrome.lastIndexOf("roar");
        System.out.println(roar);
        
    }
    
}
