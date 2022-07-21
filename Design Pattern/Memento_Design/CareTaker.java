/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento_design;

import java.util.Stack;

/**
 *
 * @author ashfak
 */
public class CareTaker {
    private Stack<EmployeeMemento> empHistory = new Stack<>();
	
	public void save(Employee emp) {
		empHistory.push(emp.save());
	}
	
	public void revert(Employee emp) {
		EmployeeMemento reveringMem = empHistory.pop();
		emp.revert(reveringMem);
	}
}
