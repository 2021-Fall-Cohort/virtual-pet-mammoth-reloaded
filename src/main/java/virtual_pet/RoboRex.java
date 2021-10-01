package virtual_pet;

public class RoboRex extends Robotic implements Hunting {


    public RoboRex(String petName, String petColor, int age, int oilLevel, int batteryLevel, boolean isAlive) {
        super(petName, petColor, age, oilLevel, batteryLevel, isAlive);
    }
    @Override
    public void petReport() {
        System.out.println("T-Rex Report: \n" + petName + "the " + petColor + "mammoth is currently " + age);
        System.out.print(" years old. " + "\n Oil Level: " + oilLevel + "\n Battery Level: " + batteryLevel);
    }

    @Override
    public void hunting() {
        oilLevel -= 2;
        batteryLevel -= 2;
        oilLevel = Math.min(10, oilLevel);
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
