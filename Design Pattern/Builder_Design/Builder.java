/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_design;

/**
 *
 * @author ashfak
 */
public class Builder {
    public static void main(String[] args) {
        VehicleCar vehicle = new VehicleCar.Builder()
                .setBrand("BMW")
                .setMaxSpeed(250)
                .build();

        vehicle.display();
    }
}
