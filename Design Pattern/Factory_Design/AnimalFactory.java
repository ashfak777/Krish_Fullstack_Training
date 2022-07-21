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
public class AnimalFactory {
    public static Animal createAnimal(AnimalType type) {
        switch (type) {
            case DUCK:
                return new Duck();
            case DOG:
                return new Dog();
        }
        return null;
    }
}
