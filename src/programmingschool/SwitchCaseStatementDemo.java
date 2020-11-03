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
public class SwitchCaseStatementDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10, b=20, c=30;
	int status =-1;
	if (a>b && a>c){
	  status = 1;
	}
        else if (b>c){
	  status = 2;
	}
        else{
	  status =3;
	}
        switch (status){
	case 1:
	  System.out.println("a is the greatest");
	  break;
	case 2:
	  System.out.println("b is the greatest");
	  break;
	case 3:
	  System.out.println("c is the greatest");
	  break;
	default:
	  System.out.println("cannot be determined");
	  break;

    }
    
}
}