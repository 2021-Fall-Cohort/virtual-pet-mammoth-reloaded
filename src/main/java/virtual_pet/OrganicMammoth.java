package virtual_pet;

public class OrganicMammoth extends Organic {

    public OrganicMammoth(String petName, String petColor, int age, double hunger, int thirst, int happiness, boolean isAlive) {
        super(petName, petColor, age, hunger, thirst, happiness, isAlive);
    }

    @Override
    public void petReport() {
        System.out.println("Organic Pet Report: \n" + petName + "the " + petColor + " mammoth is currently " + age);
        System.out.print(" years old. \n thirst: " + thirst + "\n hunger: "+ hunger + "\n happiness: " + happiness);
    }

    @Override
    public void feed() {
        hunger += 3;
        hunger = Math.min(10, hunger);
    }
}
