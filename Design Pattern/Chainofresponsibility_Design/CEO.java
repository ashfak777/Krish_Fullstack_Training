/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility_design;

/**
 *
 * @author ashfak
 */
public class CEO extends Handler{
    public void handleRequest(Request request) {
		System.out.println("CEO can approave anything");
	}
}
