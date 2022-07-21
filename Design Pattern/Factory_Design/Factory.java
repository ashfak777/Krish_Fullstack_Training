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
public class Factory {
    public static void main(String[] args) {
        Animal duck = AnimalFactory.createAnimal(AnimalType.DUCK);
        duck.speak();
        duck.eat();

        Animal dog = AnimalFactory.createAnimal(AnimalType.DOG);
        dog.speak();
        dog.eat();

    }
}
