package org.example;

public class Bicycle extends Vehicle {

     public Bicycle(String id, String name) {
         super(id, name);
     }
    @Override
    public int accelerate(int kmh) {
        if ((getVelocity()+kmh) > 35) {
            throw new RuntimeException("Bicycle accelerate would be over 35 km/h");
        }
        else {
            setVelocity(getVelocity()+kmh);
            System.out.println(getVelocity());
            return getVelocity();
        }
    }
}
