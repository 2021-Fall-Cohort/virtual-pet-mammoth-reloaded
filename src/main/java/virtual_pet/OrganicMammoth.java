package virtual_pet;

public class OrganicMammoth extends Organic implements Walking {

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
        hunger -= 3;
        hunger = Math.max(0, hunger);
    }

    @Override
    public void walking() {
        hunger += 2;
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
            thirst = Math.min(10, thirst);
            if (thirst >= 12) {
                isAlive = false;
                System.out.println("OH NO! You've neglected to water " + petName + "!");
                System.out.println(petName + " has died!");
            }
        }

    }
}
