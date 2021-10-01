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

    @Override
    public void tick(){

        oilLevel--;
        age++;
        batteryLevel--;

        if (oilLevel >= 10) {

            oilLevel = Math.min(10, oilLevel);
            System.out.println(petName + "'s " + oilLevel + " is as high as it can be! Great work!");
        }
        if (oilLevel <= 0) {
            isAlive = false;
            System.out.println("Oh no! " + petName + "'s engine's crankshaft has gone through the engine block...");
            System.out.println(petName + " has gone to the robo junkyard!");
        }

        if (batteryLevel >= 10) {
            batteryLevel = Math.min(10, batteryLevel) ;
            System.out.println("Woah! " + petName + "'s battery is fully charged!");
        }
        if(batteryLevel <=0){
            isAlive = false;
            System.out.println(petName + "'s battery's life cycle limit has been reached. Off to the scrapyard!");
        }
    }

}
