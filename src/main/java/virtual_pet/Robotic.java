package virtual_pet;

import virtual_pet.Pet;

public abstract class Robotic extends Pet{
    int oilLevel;
    int batteryLevel;

    public Robotic(String petName, String petColor, int age, int oilLevel, int batteryLevel, boolean isAlive) {
        super(petName, petColor, age, isAlive);
        this.oilLevel = oilLevel;
        this.batteryLevel = batteryLevel;
    }

    public void preventiveMaintenance() {
        oilLevel += 3;
        batteryLevel +=3;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
