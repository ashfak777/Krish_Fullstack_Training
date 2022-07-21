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
public class Duck extends AbstractAnimal implements Animal{

    @Override
    public void speak() {
        System.out.println("quack quack quack");
    }
    
}
