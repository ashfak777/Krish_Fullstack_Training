/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_design;

/**
 *
 * @author ashfak
 */
public class Main {

    public static void main(String args[]) {
        Singleton singletonOne = Singleton.Singleton();
        Singleton singletonTwo = Singleton.Singleton();
        Singleton singletonThree = Singleton.Singleton();

        System.out.println("One: " + singletonOne.string + " " + singletonOne);
        System.out.println("Two: " + singletonTwo.string + " " + singletonTwo);
        System.out.println("Three: " + singletonThree.string + " " + singletonThree);
    }
}
