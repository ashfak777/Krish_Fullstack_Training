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
public class ChainOfResp {
    	public static void main(String[] args) {
		Director director = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();
		
		// Setting up chain
		director.setSuccesor(vp);
		vp.setSuccesor(ceo);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 2000);
		director.handleRequest(request);
	}
}
