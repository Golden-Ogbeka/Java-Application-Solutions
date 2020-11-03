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
public class AdditionMethod {
    static int add(int one,int two){
        System.out.println("This method accepts two ints");
        int sum;
        sum=one +two;
        return sum;
    }
    static int add(int one,int two,int three){
        System.out.println("This method accepts two ints");
        int sum;
        sum=one +two+three;
        return sum;
    }
    static int add(int one,int two,int three,int four){
        System.out.println("This method accepts two ints");
        int sum;
        sum=one +two+three+four;
        return sum;
    }
    static void add(){
        System.out.println("This method accepts no parameter");
        System.out.println("This method return no value");
    }
    static String add(int one, String two)
    {
        System.out.println("This method accepts one int and one String");
        String concate=one +two;
        return concate;
    }
    public static void main(String[] args) {
        int answer;
        String strAnswer;
        strAnswer=add(4,"get");
        System.out.println("Your answer is "+ strAnswer);
        System.out.println("");
        answer=add(4,5);
        System.out.println("Your answer is "+ answer);
        System.out.println("");
        answer=add(4,5,6);
        System.out.println("Your answer is "+ answer);
        System.out.println("");
        add();
    }
    
}
