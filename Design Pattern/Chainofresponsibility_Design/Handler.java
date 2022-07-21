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
public abstract class Handler {
    protected Handler succesor;

	public void setSuccesor(Handler succesor) {
		this.succesor = succesor;
	}
	
	public abstract void handleRequest(Request request);
}
