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

    //constructors for the mammoth
    public Mammoth(String mammothName, String mammothFurColor, int age, int tuskLength, double hunger, int hibernation) {

        this.mammothName = mammothName;
        this.mammothFurColor = mammothFurColor;
        this.age = age;
        this.tuskLength = tuskLength;
        this.hunger = hunger;
        this.hibernation = hibernation;
        //Interact with a VirtualPet object in this method
    }

    public void petReport() {
        System.out.println("Mammoth Report: \n" + mammothName + "the " + mammothFurColor + "mammoth is currently " + age);
        System.out.print(" years old. \n Their hunger level is " + hunger + ". \n Their tusk is " + tuskLength);
        System.out.print("feet long. \n They will soon hibernate for " + hibernation + "months");
    }

    //tick method
//    public void tick() {
//        int year = 2022;
//        year++;
//        age++;
//        while (age <= 12)
//            System.out.println("");
//    }

    public String tick(){
        //age increases and displays
        int year = 2021;
        year++;
        age++;
        if(age<=10){
            System.out.println("A year has passed and in the year " + year + " " +  mammothName + " is now " + age + ".");
        }
        else if(age==11){
            System.out.println("The mighty mammoth's return to earth was never a permanent solution. " +
                    "With the death of " + mammothName + " the great lineage of beasts returns once more to cosmic slumber.");
        }
        return null;
    }

    public void hung() {
        double v = .5;
        if (age == 0 || age == 1) {
            hunger = hunger + v;
            System.out.println(new StringBuilder().append("Your pet").append(mammothName).append("'s hunger has changed to ").append(hunger).toString());
        }
        else if(age > 1 && age <=10){
            hunger = hunger + (v + v);
            System.out.println(new StringBuilder().append("Your pet").append(mammothName).append("'s hunger has changed to ").append(hunger).toString());
        }
        else {
           System.out.println("");
        }
    }

}

//        }
//        hunger++;
//        tuskLength++;
//        hibernation++;
//    }
//
//    //if mammoth is 0 or 1 in age, then hunger increase by .5, tuskLength increases by .25, hibernation increase by .50
//
//    public void mammothGrow() {
//        boolean mammothGrow = false;
//        if (age = 0 || age =1) {
//            ;
//        }
//            age += (int) (Math.random() * 5) + 1;
//            hunger += (int) (Math.random() * 2) + 1;
//            hibernation -= (int) (Math.random() * 2) + 1;
//    }
//}
