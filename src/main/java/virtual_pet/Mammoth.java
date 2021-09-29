package virtual_pet;


public class Mammoth extends Pet {

    public Mammoth(String petName, String petColor, int age, double hunger, int happiness, int thirst, boolean isAlive) {
        super(petName, petColor, age, hunger, happiness,thirst, isAlive);
    }

    @Override
    public void care(int careChoices) {
        if (careChoices == 1) {
            happiness = happiness + 3;
            System.out.println(petName + "loved their walk! Their happiness level is now " + happiness + ".");
        } else if (careChoices == 2) {
            happiness = happiness + 2;
//            System.out.println("Those tusks sure are sparkling! " + petColor + "'s happiness level is now  " + happiness + ".");
        } else if (careChoices == 3) {
            happiness = happiness + 1;
            System.out.println("Look at that pretty " + petColor + " fur! " + petName + "'s happiness level is now  " + happiness + ".");
        } else if (careChoices == 4) {
            happiness--;
            System.out.println("You have chosen to ignore " + petName + ". They're going to remember that!");
            System.out.println("Their happiness level is now " + happiness);
        } else {
            System.out.println("Invalid Choice");
        }
    }

    @Override
    public void petReport() {
        System.out.println("virtual_pet.Mammoth Report: \n" + petName + "the " + petColor + "mammoth is currently " + age);
        System.out.print(" years old. \n Their hunger level is " + hunger + ". \n Their tusk is " );
    }

    @Override
    public boolean getIsAlive() {
        return super.getIsAlive();
    }

    @Override
    public String[] getFoodOptions() {
        return super.getFoodOptions();
    }


    @Override
    public void tick(){
        happiness--;
        age++;
        thirst++;

        if (age <= 10) {
//            System.out.println("A year has passed and " + petName + " is now " + age + ".");
        }
        if (age == 11) {
            isAlive = false;
            System.out.println(petName + " has grown old and weak.");
            System.out.println(petName + " has died!");
        }

        double v = .5;
        if (age == 0 || age == 1) {
            hunger = hunger + v;
//            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
        } else if (age > 1 && age <= 10) {
            hunger = hunger + (v + v);
//            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
        } else {
            System.out.println();
        }

        if (happiness >= 10) {
            happiness = 10;
            System.out.println(petName + " is as happy as can be! Great work!");
        }
        if (happiness <= 0) {
            isAlive = false;
            System.out.println("Oh no! " + petName + "'s poor heart can't take it anymore...");
            System.out.println(petName + " has died!");
        }

        if (hunger <= 0) {
            hunger = 0;
            System.out.println("Woah! " + petName + " is full as can be! They'll grow big and strong in no time!");
        }
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
//    public void hibernation(int hibernateChoices) {
//        if (hibernateChoices== 1) {
//            happiness = happiness - 2;
//            System.out.println(new StringBuilder().append("Your pet ").append(petName).append(" is being hunted by the Neanderthals of Europa"));
//            System.out.println(petName + " now has a happiness level of " + happiness + ".");
//        } else if (hibernateChoices == 2) {
//            happiness = happiness - 3;
//            System.out.println(new StringBuilder().append("Your pet ").append(petName).append(" is freezing! They have frozen their heart out!"));
//            System.out.println(petName + " now has a happiness level of " + happiness + ".");
//        } else if (hibernateChoices == 3) {
//            happiness = happiness + 2;
//            System.out.println(new StringBuilder().append("Your pet ").append(petName).append(" has found the perfect spot to rest and wait out the winter!"));
//            System.out.println(petName + " now has a happiness level of " + happiness + ".");
//        } else if(hibernateChoices == 4) {
//            happiness = happiness + 3;
//            System.out.println(new StringBuilder().append("Your pet ").append(petName).append(" has found other mammoths to hang out with while they wait out the winter!"));
//            System.out.println(petName + " now has a happiness level of " + happiness + ".");
//        } else {
//            System.out.println("Not Valid");
//        }
//    }
}
