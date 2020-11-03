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
public class ComputePI {
    public static void main(String[] args) {
        double pi=4.0;
        double sum=1.0;
       for(double i=3.0;i<97.0;i=i+2.0)
       {
           if(i%4==1){
               sum=sum+(1/(double)i);
           }
           else
            sum=sum-(1/(double)i);
       }
       pi=sum*pi;
        System.out.println("The derived Pi is: "+pi);
        System.out.println("The original Pi is "+Math.PI);
        //I guess this derived method is not original
        double compare= Math.abs(((pi-Math.PI)/Math.PI))*100;
        System.out.println("The Derived PI is: "+ compare +"% close to the Original PI");
        
    }
}
