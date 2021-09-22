package virtual_pet;

import virtual_pet.Pet;

public class Trex extends Pet{
    public Trex(String petName, String petColor, int age, double hunger, int happiness, boolean isAlive) {
        super(petName, petColor, age, hunger, happiness, isAlive);
    }

    @Override
    public void petReport() {
            System.out.println("T-Rex Report: \n" + petName + "the " + petColor + "T-Rex is currently " + age);
            System.out.print(" years old. \n Their hunger level is " + hunger  );
    }

    @Override
    public void care(int careChoices) {
        if (careChoices == 1) {
            happiness = happiness + 3;
            System.out.println(petName + "loved their walk! Their happiness level is now " + happiness + ".");
        } else if (careChoices == 2) {
            happiness = happiness + 2;
            System.out.println("Those claws sure are sparkling! " + petColor + "'s happiness level is now  " + happiness + ".");
        } else if (careChoices == 3) {
            happiness = happiness + 1;
            System.out.println("Look at those pretty " + petColor + " scales! " + petName + "'s happiness level is now  " + happiness + ".");
        } else if (careChoices == 4) {
            happiness--;
            System.out.println("You have chosen to ignore " + petName + ". They're going to remember that!");
            System.out.println("Their happiness level is now " + happiness);
        } else {
            System.out.println("Invalid Choice");
        }
    }

}
