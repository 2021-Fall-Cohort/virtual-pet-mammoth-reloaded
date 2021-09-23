package virtual_pet;

import java.util.Scanner;

public abstract class Pet {

    //fields for the mammoth
    protected String petName;
    protected String petColor;
    protected int age;
    protected double hunger;
    protected int happiness;
    protected String[] foodOptions;
    protected boolean isAlive;

    //constructors for the mammoth
    public Pet(String petName, String petColor, int age, double hunger, int happiness, boolean isAlive) {

        this.petName = petName;
        this.petColor = petColor;
        this.age = age;
        this.hunger = hunger;
        this.happiness = happiness;
        this.isAlive = isAlive;
        this.foodOptions = new String[]{"Feed Oats", "Feed Peanuts", "Feed Peanuts", "Not Feed"};
        //Interact with a VirtualPet object in this method
    }

    public abstract void petReport();

    public void tick() {
        //age increases and displays
        happiness--;
        age++;
        if (age <= 10) {
            System.out.println("A year has passed and " + petName + " is now " + age + ".");
        } else if (age == 11) {
            isAlive = false;
            System.out.println(petName + " has grown old and weak.");

        }
        double v = .5;
        if (age == 0 || age == 1) {
            hunger = hunger + v;
            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
        } else if (age > 1 && age <= 10) {
            hunger = hunger + (v + v);
            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
        } else {
            System.out.println("");
        }

        if (happiness >= 10) {
            happiness = 10;
            System.out.println(petName + " is as happy as can be! Great work!");
        }
        if (happiness <= 0) {
            isAlive = false;
            System.out.println("Oh no! " + petName + "'s poor heart can't take it anymore...");

        }

        if (hunger <= 0) {
            hunger = 0;
            System.out.println("Woah! " + petName + " is full as can be! They'll grow big and strong in no time!");
        }
        if (hunger >= 12) {
            isAlive = false;
            System.out.println("OH NO! You've neglected to feed " + petName + "!");

        }

    }


    public void feed(int feedChoices) {

        if (feedChoices == 1) {
            hunger = hunger - 1;
            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
        } else if (feedChoices == 2) {
            hunger = hunger - 2;
            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
        } else if (feedChoices == 3) {
            hunger = hunger - 4;
            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
        } else if (feedChoices == 4) {
            hunger++;
            System.out.println(petName + " didn't get anything to eat!");
            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has increased to " + hunger));
        } else {
            System.out.println("Not Valid");
        }
    }


    public abstract void care(int careChoices);

    public boolean getIsAlive() {
        return isAlive;
    }

    public String[] getFoodOptions() {
        return foodOptions;
    }

    public String getName(){
        return petName;
    }
}
