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
public class HarmonicSum {
    public static void main(String[] args) {
        double n=50000;
        double harmonic=0;
        for(int i=1; i<=n; i++){
            harmonic+=(1.0/i);
           //from front to back
            //make sure it is double so as not to lose any value
        }
        System.out.println("The sum is: "+harmonic);
       double m=50000;
       double harmonic2=0;
       for(int j=1; j<=n;j++){
           harmonic2+=1.0/m;
           m=m-1;
           //from back to front
       }
        System.out.println("The sum is: "+harmonic2);
    }
    
}
