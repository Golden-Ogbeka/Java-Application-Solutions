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
public class CozaLozaWoza {
    public static void main(String[] args) {
        int m=0;
        for(int i=1; i<=11;i++){
            for(int j=1;j<=11;j++){
                m+=1;
                if(m%3==0&&m %5==0){
                    System.out.print("CozaLoza");
                }
                else if(m%3==0&&m%7==0){
                    System.out.print("CozaWoza");
                }
                else if(m%5==0&&m%7==0){
                    System.out.print("CozaWoza");
                }
                else if(m%3==0){
                    System.out.print("Coza");
                }
                else if(m %5==0){
                    System.out.print("Loza");
                }
                else if(m %7==0){
                    System.out.print("Woza");
                }
                
                else{
                System.out.print(""+m);
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
