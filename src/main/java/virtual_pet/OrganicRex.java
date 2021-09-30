package virtual_pet;

public class OrganicRex extends Organic {

    public OrganicRex(String petName, String petColor, int age, double hunger, int thirst, int happiness, boolean isAlive) {
        super(petName, petColor, age, hunger, thirst, happiness, isAlive);

    }
    @Override
    public void petReport() {
        System.out.println("Organic Pet Report: \n" + petName + "the " + petColor + " Trex is currently " + age);
        System.out.print(" years old. \n thirst: " + thirst + "\n hunger: "+ hunger + "\n happiness: " + happiness);
    }

    @Override
    public void feed() {
        super.feed();
    }
}
