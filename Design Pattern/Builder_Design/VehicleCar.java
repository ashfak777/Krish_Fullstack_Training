/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_design;

import java.util.Objects;

/**
 *
 * @author ashfak
 */
public class VehicleCar {
    private final String brand;
    private final int maxSpeed;

    private VehicleCar(Builder builder) {
        this.brand = Objects.requireNonNull(builder.brand, "brand");
        this.maxSpeed = Objects.requireNonNull(builder.maxSpeed, "maxSpeed");
    }

    public static Builder builder() {
        return new Builder();
    }

    public void display() {
        System.out.println("brand = " + getBrand());
        System.out.println("maxSpeed = " + getMaxSpeed());
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static class Builder {
        private String brand;
        private Integer maxSpeed;

        Builder() {
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder of(VehicleCar vehicle) {
            this.brand = vehicle.brand;
            this.maxSpeed = vehicle.maxSpeed;
            return this;
        }

        public VehicleCar build() {
            return new VehicleCar(this);
        }
    }
}
