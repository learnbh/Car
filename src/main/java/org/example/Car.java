package org.example;

import java.util.Objects;

public class Car extends Vehicle {
    private int numberOfTires;
    private int numberOfDoors;
    private boolean seatBelt;
    private boolean airBag;

    public Car(String id, String name) {
        super(id, name);
    }

    public Car(String id, String name, int numberOfTires, int numberOfDoors, boolean seatBelt, boolean airBag) {
        super(id, name);
        this.numberOfTires = numberOfTires;
        this.numberOfDoors = numberOfDoors;
        this.seatBelt = seatBelt;
        this.airBag = airBag;
    }

    @Override
    public int accelerate(int kmh) {
        setVelocity(getVelocity()+kmh);
        System.out.println(getVelocity());
        return getVelocity();
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", numberOfDoors=" + numberOfDoors +
                ", seatBelt=" + seatBelt +
                ", airBag=" + airBag +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getNumberOfTires() == car.getNumberOfTires() && getNumberOfDoors() == car.getNumberOfDoors() && isSeatBelt() == car.isSeatBelt() && isAirBag() == car.isAirBag();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfTires(), getNumberOfDoors(), isSeatBelt(), isAirBag());
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }
}
