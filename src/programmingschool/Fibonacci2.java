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
public class Fibonacci2 {
    public static void main(String[] args) {
        int var1=0; //variable one
        int var2=1; //variable two after var1
        int cumulative=0;   //variable to store the values as they are added up
        double forAverage=0; //variable to store the sum as they are increasing
        System.out.println("The number in the series are: ");
        for(int i=0;i<20;i++){
            if(i==0||i==1){     //if statement to print for zero and one
                  var1=1;       //var1 is now 1
                  System.out.println(""+var1);
            }
            else{
            cumulative=var1+var2; //next number
                
            System.out.println(""+cumulative);
            forAverage+=cumulative; //for their additions
            var1=var2;  //var1 now becomes the current variable
            var2=cumulative;    //var2 now becomes the next variable which is the cumulative
            }
        }
        double average=(forAverage)/20.0; //the average is found by dividing their additions by the total number of them(20)
        System.out.println("The average is: "+average);
    }
}
