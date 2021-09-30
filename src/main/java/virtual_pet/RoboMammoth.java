package virtual_pet;

public class RoboMammoth extends Robotic {

    public RoboMammoth(String petName, String petColor, int age, int oilLevel, int batteryLevel, boolean isAlive) {
        super(petName, petColor, age, oilLevel, batteryLevel, isAlive);
    }
    @Override
    public void petReport() {
        System.out.println("T-Rex Report: \n" + petName + "the " + petColor + "mammoth is currently " + age);
        System.out.print(" years old. " + "\n Oil Level: " + oilLevel + "\n Battery Level: " + batteryLevel);
    }
}
