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
public class EmployeeMemento {
    private String name;
	private String phone;

	public EmployeeMemento(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
}
