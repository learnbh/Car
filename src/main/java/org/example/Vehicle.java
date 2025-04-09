package org.example;

import java.util.Objects;

public abstract class Vehicle implements Accelerateble {
    private final String id;
    private String name;
    private int velocity;

    public Vehicle(String id, String name) {
        this.id = id;
        this.name = name;
        this.velocity = 0;
    }
    public void brake() {
        setVelocity(0);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", velocity=" + velocity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return velocity == vehicle.velocity && Objects.equals(id, vehicle.id) && Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, velocity);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
