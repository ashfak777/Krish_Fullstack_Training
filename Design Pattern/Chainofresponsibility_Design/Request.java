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
public class Request {

    private RequestType requestType;
    private int amount;

    public Request(RequestType requestType, int amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    RequestType getRequestType() {
        return requestType;
    }
}
