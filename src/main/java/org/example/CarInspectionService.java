package org.example;

public class CarInspectionService {

    public boolean hasFourTires(Car carCorrect) {
        return carCorrect.getNumberOfTires()==4;
    }

    public boolean hasSeatBelt(Car carCorrect) {
        return carCorrect.isSeatBelt();
    }

    public boolean hasAirBag(Car carCorrect) {
        return carCorrect.isAirBag();
    }

    public boolean hasThreeOrFiveDoors(Car carCorrect) {
        return switch (carCorrect.getNumberOfDoors()) {
            case 3, 5 -> true;
            default -> false;
        };
    }

    public boolean checkCar(Car carCorrect) {

        return (this.hasFourTires(carCorrect)&&this.hasSeatBelt(carCorrect)&&this.hasAirBag(carCorrect)&&this.hasThreeOrFiveDoors(carCorrect));
    }
}
