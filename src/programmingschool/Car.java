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
public class Car extends Vehicle{
    
    Car(String s){
//notice that the Constructor of the super class can be called
        super(s);
        System.out.println("Addition from Car Constructor");
    }
//this method was overriden
    void setColour(String c){
     super.setColour(c);
     //This calls the setColour method in Vehicle before overridding it
        colour = c;
        System.out.println("Car colour is:"+colour);
        //This method overrides the method in Vehicle
    }    
     public static void main(String[] args) {     
	Car c = new Car("A Car");
	c.printName();      
//even class engine was inherited since it is not private
        c.myEngine.startEngine();
        c.myEngine.stopEngine();
        c.setColour("Green");
    }

}
