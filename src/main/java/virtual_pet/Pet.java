package virtual_pet;

import java.util.Scanner;

public abstract class Pet {

    //fields for the mammoth
    protected String petName;
    protected String petColor;
    protected int age;
    protected double hunger;
    protected int happiness;
    protected int thirst;
    protected String[] foodOptions;
    protected boolean isAlive;

    //constructors for the mammoth
    public Pet(String petName, String petColor, int age, double hunger, int happiness, int thirst, boolean isAlive) {

        this.petName = petName;
        this.petColor = petColor;
        this.age = age;
        this.hunger = hunger;
        this.happiness = happiness;
        this.thirst = thirst;
        this.isAlive = isAlive;
        this.foodOptions = new String[]{"Feed Oats", "Feed 🥜 ", "Feed Peanuts", "Not Feed"};
        //Interact with a VirtualPet object in this method
    }

    public abstract void petReport();

//    public void tick() {
//        //age increases and displays
//        happiness--;
//        age++;
//        if(age==11) {
//            isAlive = false;
//        }
////        if (age <= 10) {
////            System.out.println("A year has passed and " + petName + " is now " + age + ".");
////        } else if (age == 11) {
////            isAlive = false;
////            System.out.println(petName + " has grown old and weak.");
//
//
//        double v = .5;
//        if (age == 0 || age == 1) {
//            hunger = hunger + v;
////            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
//        } else if (age > 1 && age <= 10) {
//            hunger = hunger + (v + v);
////            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
//        } else {
//            System.out.println("");
//        }
//
//        if (happiness >= 10) {
//            happiness = 10;
////            System.out.println(petName + " is as happy as can be! Great work!");
//        }
//        if (happiness <= 0) {
//            isAlive = false;
////            System.out.println("Oh no! " + petName + "'s poor heart can't take it anymore...");
//
//        }
//
////        if (hunger <= 0) {
////            hunger = 0;
////            System.out.println("Woah! " + petName + " is full as can be! They'll grow big and strong in no time!");
////        }
//        if (hunger >= 12) {
//            isAlive = false;
////            System.out.println("OH NO! You've neglected to feed " + petName + "!");
//
//        }
//
//    }


    public void feed(int feedChoices) {
        int foodAmount = 0;
        switch (feedChoices) {
            case 1:
                foodAmount = 1;
                break;
            case 2:
                foodAmount = 2;
                break;
            case 3:
                foodAmount = 4;
                break;
        }
        hunger = Math.max(0, hunger - foodAmount);
    }

    public void water() {
        thirst= thirst -2;
        thirst = Math.max(0, thirst);
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

    public double getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getAge() {
        return age;
    }

    public abstract void tick();
}
