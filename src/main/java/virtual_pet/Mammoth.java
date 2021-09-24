package virtual_pet;

public class Mammoth extends Pet {

    public Mammoth(String petName, String petColor, int age, double hunger, int happiness, int thirst, boolean isAlive) {
        super(petName, petColor, age, hunger, happiness, thirst, isAlive);
    }

    @Override
    public void care(int careChoices) {
        if (careChoices == 1) {
            happiness = happiness + 3;
            System.out.println(petName + "loved their walk! Their happiness level is now " + happiness + ".");
        } else if (careChoices == 2) {
            happiness = happiness + 2;
            System.out.println("Those tusks sure are sparkling! " + petColor + "'s happiness level is now  " + happiness + ".");
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

//    @Override
//    public String getName() {
//        return petName;
//    }


    public void hibernation(int hibernateChoices) {
        if (hibernateChoices== 1) {
            happiness = happiness - 2;
            System.out.println(new StringBuilder().append("Your pet ").append(petName).append(" is being hunted by the Neanderthals of Europa"));
            System.out.println(petName + " now has a happiness level of " + happiness + ".");
        } else if (hibernateChoices == 2) {
            happiness = happiness - 3;
            System.out.println(new StringBuilder().append("Your pet ").append(petName).append(" is freezing! They have frozen their heart out!"));
            System.out.println(petName + " now has a happiness level of " + happiness + ".");
        } else if (hibernateChoices == 3) {
            happiness = happiness + 2;
            System.out.println(new StringBuilder().append("Your pet ").append(petName).append(" has found the perfect spot to rest and wait out the winter!"));
            System.out.println(petName + " now has a happiness level of " + happiness + ".");
        } else if(hibernateChoices == 4) {
            happiness = happiness + 3;
            System.out.println(new StringBuilder().append("Your pet ").append(petName).append(" has found other mammoths to hang out with while they wait out the winter!"));
            System.out.println(petName + " now has a happiness level of " + happiness + ".");
        } else {
            System.out.println("Not Valid");
        }
    }
}
