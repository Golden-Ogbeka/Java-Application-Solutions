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
public class PrintDayInWord {
    public static void main(String[] args) {
        int Day=9;
        switch(Day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                 System.out.println("Monday");
                break;
            case 2:
                 System.out.println("Tuesday");
                break;
            case 3:
                 System.out.println("Wednesday");
                break;
            case 4:
                 System.out.println("Thursday");
                break;
            case 5:
                 System.out.println("Friday");
                break;
            case 6:
                 System.out.println("Saturday");
                break;
            default:
                 System.out.println("Not a valid day");
                break;
        }
    }
}
