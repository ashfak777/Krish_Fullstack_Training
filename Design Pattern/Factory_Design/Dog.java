/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_design;

/**
 *
 * @author ashfak
 */
public class Dog extends AbstractAnimal implements Animal{

    @Override
    public void speak() {
         System.out.println("Woof woof");
    }
    
}
