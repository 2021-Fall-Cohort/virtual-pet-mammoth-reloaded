package virtual_pet;

public class OrganicRex extends Organic implements Hunting {

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
        hunger -= 3;
        hunger = Math.min(10, hunger);
    }

    @Override
    public void hunting() {
        hunger -= 2;
        hunger = Math.min(10, hunger);
        happiness += 2;
        thirst += 2;
        if (happiness >= 10) {
            happiness = 10;
            System.out.println(petName + " is as happy as can be! Great work!");
            if (hunger >= 12) {
                isAlive = false;
                System.out.println("OH NO! You've neglected to feed " + petName + "!");
                System.out.println(petName + " has died!");
            }

            if (thirst >= 12) {
                isAlive = false;
                System.out.println("OH NO! You've neglected to water " + petName + "!");
                System.out.println(petName + " has died!");
            }
        }


    }
}
