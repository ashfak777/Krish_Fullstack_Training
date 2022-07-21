/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento_design;

/**
 *
 * @author ashfak
 */
public class Memento {
    public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();

		Employee emp = new Employee();
		emp.setName("ashfak");
		emp.setPhone("08752452501");
		emp.setAddress("Beruwala");

		// Put Into Memento
		System.out.println("Employee before save : " + emp);
		careTaker.save(emp);

		// Update and Put Into Memento
		emp.setPhone("88888888");
		careTaker.save(emp);
		System.out.println("Employee after phone change : " + emp);

		emp.setPhone("32325488"); // Not put into memento

		careTaker.revert(emp);
		System.out.println("Reverting to previous save : " + emp);

		careTaker.revert(emp);
		System.out.println("Reverting to orignal save : " + emp);

	}
}
