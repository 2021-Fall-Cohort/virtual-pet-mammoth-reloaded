package virtual_pet;

import java.util.Scanner;

public class Mammoth {

    //fields for the mammoth
    private String mammothName;
    private String mammothFurColor;
    private int age;
    private int tuskLength;
    private double hunger;
    private int hibernation;
    private int happiness;
    private boolean isAlive;

    //constructors for the mammoth
    public Mammoth(String mammothName, String mammothFurColor, int age, int tuskLength, double hunger, int hibernation, int happiness, boolean b) {

        this.mammothName = mammothName;
        this.mammothFurColor = mammothFurColor;
        this.age = age;
        this.tuskLength = tuskLength;
        this.hunger = hunger;
        this.hibernation = hibernation;
        this.happiness = happiness;
        this.isAlive = isAlive;
        //Interact with a VirtualPet object in this method
    }

    public void petReport() {
        System.out.println("Mammoth Report: \n" + mammothName + "the " + mammothFurColor + "mammoth is currently " + age);
        System.out.print(" years old. \n Their hunger level is " + hunger + ". \n Their tusk is " + tuskLength);
        System.out.print("feet long. \n They will soon hibernate for " + hibernation + "months");
    }

    public void tick() {
        //age increases and displays
        age++;
        if (age <= 10) {
            System.out.println("A year has passed and " + mammothName + " is now " + age + ".");
        } else if (age == 11) {
            isAlive = false;
            System.out.println("The mighty mammoth's return to earth was never a permanent solution. " +
                    "With the death of " + mammothName + " the great lineage of beasts returns once more to cosmic slumber.");
        }
        tuskLength = age;
//        if (age =0)
//            Syste
        if (tuskLength <= 10) {
            System.out.println("Wow! " + mammothName + " is really growing! Their tusks are now " + tuskLength + " feet long!");
        }
    }
        public void hung() {
            double v = .5;
            if (age == 0 || age == 1) {
                hunger = hunger + v;
                System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append("'s hunger has changed to ").append(hunger).toString());
            } else if (age > 1 && age <= 10) {
                hunger = hunger + (v + v);
                System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append("'s hunger has changed to ").append(hunger).toString());
            } else {
                System.out.println("");
            }
        }

    public void feed() {
        System.out.println("Do you want to feed your pet? Chose between \n [1=Feed Oats]   [2=Feed Peanuts]    [3=Feed bananas]    [4=Not Feed]?");
        Scanner inputScanner = new Scanner(System.in);
        int feedChoices = inputScanner.nextInt();

        if (feedChoices == 1) {
            hunger = hunger - 1;
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append("'s hunger has changed to ").append(hunger).toString());
        } else if (feedChoices == 2) {
            hunger = hunger - 2;
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append("'s hunger has changed to ").append(hunger).toString());
        } else if (feedChoices == 3) {
            hunger = hunger - 4;
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append("'s hunger has changed to ").append(hunger).toString());
        } else if (feedChoices == 4) {
            hunger++;
            System.out.println(mammothName + " didn't get anything to eat!");
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append("'s hunger has increased to "+ hunger));
        } else {
            System.out.println("Not Valid");
        }
    }

    public void hibernate() {
        System.out.println("Winter is arriving for " + mammothName + "." + "Where do you want them to hibernate?");
        System.out.println("[1=Europa]  [2=Siberia] [3=Himalayan Mountains] [4=Mount Kilimanjaro]");
        Scanner inputScanner = new Scanner(System.in);
        int hibernateChoices = inputScanner.nextInt();

        if (hibernateChoices == 1) {
            happiness = happiness - 2;
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append(" is being hunted by the Neanderthals of Europa"));
            System.out.println(mammothName + " now has a happiness level of " + happiness + ".");
        } else if (hibernateChoices == 2) {
            happiness = happiness - 3;
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append(" is freezing! They have frozen their heart out!"));
            System.out.println(mammothName + " now has a happiness level of " + happiness + ".");
        } else if (hibernateChoices == 3) {
            happiness = happiness + 2;
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append(" has found the perfect spot to rest and wait out the winter!"));
            System.out.println(mammothName + " now has a happiness level of " + happiness + ".");
        } else if(hibernateChoices == 4) {
            happiness = happiness + 3;
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append(" has found other mammoths to hang out with while they wait out the winter!"));
            System.out.println(mammothName + " now has a happiness level of " + happiness + ".");
        } else {
            System.out.println("Not Valid");
        }

    }

    public void care(){
        System.out.println(mammothName + " looks a little bored. What do you say we do something nice for them?\n");
        System.out.println("[1=Take for a walk] [2=Polish their tusks] [3=Comb their "+mammothFurColor +" fur]"
        + " [4=Ignore]");
        Scanner inputScanner = new Scanner(System.in);
        int careChoices = inputScanner.nextInt();

        if(careChoices==1){
            happiness = happiness + 3;
            System.out.println(mammothName + "loved their walk! Their happiness level is now " + happiness + ".");
        }
        else if(careChoices==2){
            happiness = happiness + 2;
            System.out.println("Those tusks sure are sparkling! " + mammothName + "'s happiness level is now  " + happiness + ".");
        }
        else if(careChoices==3){
            happiness = happiness + 1;
            System.out.println("Look at that pretty " + mammothFurColor + " fur! " + mammothName + "'s happiness level is now  " + happiness + ".");
        }
        else if(careChoices==4){
            happiness--;
            System.out.println("You have chosen to ignore " +mammothName+ ". They're going to remember that!");
            System.out.println("Their happiness level is now " +happiness);
        }
        else{
            System.out.println("Invalid Choice");
        }
    }

    public void takeVitals(){
        if (happiness >= 10){
            happiness = 10;
            System.out.println(mammothName + " is as happy as can be! Great work!");
        }
        if(happiness <=0){
            isAlive = false;
            System.out.println("Oh no! " + mammothName + "'s poor heart can't take it anymore...");
            System.out.println("The mighty mammoth's return to earth was never a permanent solution. " +
                    "With the death of " + mammothName + " the great lineage of beasts returns once more to cosmic slumber.");
        }

        if (hunger<=0){
            hunger = 0;
            System.out.println("Woah! " + mammothName + " is full as can be! They'll grow big and strong in no time!");
        }
        if(hunger<=12){
            isAlive = false;
            System.out.println("OH NO! You've neglected to feed " + mammothName + "!");
            System.out.println("The mighty mammoth's return to earth was never a permanent solution. " +
                    "With the death of " + mammothName + " the great lineage of beasts returns once more to cosmic slumber.");
        }

    }

    public boolean getIsAlive(){
        return isAlive;
    }
}

