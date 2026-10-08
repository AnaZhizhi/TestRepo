package Enums;

public class Car {
    int numberOfDoors;
    String name;
    OriginType origin;
    Fueltype fuelType;


    public Car (int numberOfDoors, String name, OriginType origin, Fueltype fuelType) {
        this.numberOfDoors = numberOfDoors;
        this.name = name;
        this.origin = origin;
        this.fuelType = fuelType;

    }
    public boolean isEuropean() {
        if (origin == OriginType.Europa){
            return true;
        }  else {
            return false;
        }
    }


    public boolean isElectric() {
        if (fuelType == Fueltype.Electro) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isCoupe() {
        if (numberOfDoors == 2) {
            return true;
        } else {
            return false;
        }

    }
}

enum OriginType {
    Europa,
    Usa,
    Asia
}
enum Fueltype {
    Diesel,
    Petrol,
    Electro
}