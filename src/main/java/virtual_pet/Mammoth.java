package virtual_pet;

import java.time.*;
import java.time.Clock;
import java.time.Duration;
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

    //constructors for the mammoth
    public Mammoth(String mammothName, String mammothFurColor, int age, int tuskLength, double hunger, int hibernation, int happiness) {

        this.mammothName = mammothName;
        this.mammothFurColor = mammothFurColor;
        this.age = age;
        this.tuskLength = tuskLength;
        this.hunger = hunger;
        this.hibernation = hibernation;
        this.happiness = happiness;
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
            System.out.println(mammothName + " didn't get anything to eat!");
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append("'s hunger has not changed."));
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
        } else if (hibernateChoices == 2) {
            happiness = happiness - 3;
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append(" is freezing! They have frozen their heart out!"));
        } else if (hibernateChoices == 3) {
            happiness = happiness + 2;
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append(" has found the perfect spot to rest and wait out the winter!"));
        } else if(hibernateChoices == 4) {
            happiness = happiness + 3;
            System.out.println(new StringBuilder().append("Your pet ").append(mammothName).append(" has found other mammoths to hang out with while they wait out the winter!"));
        } else {
            System.out.println("Not Valid");
        }
    }
}

