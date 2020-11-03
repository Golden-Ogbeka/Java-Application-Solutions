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
public class Vehicle {
    Vehicle(String name){
        System.out.println("This is in the Vehicle constructor");
        this.name=name;
        
        //non-default constructor declared with name field
    }
    private String name;
    //name field is declared
     String colour;
    //colour field is declared
    Engine myEngine=new Engine();
    //an oject called myEngine is created to access the functions in Engine
    //a has-a relationship is created that is, Vehicle has-a Engine
    void setColour(String c){
        colour=c;
        System.out.println("This a method in the Vehicle");
        //method serColour is created
        
    }
    void printName(){
        System.out.println("Vehicle name is "+ name);
    }
    public static void main(String[] args) {
        Vehicle v=new Vehicle("Ordinary Vehicle");
        v.printName();
        v.myEngine.startEngine();
        //object v used to call myEngine and then startEngine
        v.myEngine.stopEngine();
    }
}
