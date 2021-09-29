package virtual_pet;

import java.util.Scanner;

public abstract class Pet {

    //fields for the mammoth
    protected String petName;
    protected String petColor;
    protected int age;
    protected boolean isAlive;

    //constructors for the mammoth
    public Pet(String petName, String petColor, int age, boolean isAlive) {

        this.petName = petName;
        this.petColor = petColor;
        this.age = age;
        this.isAlive = isAlive;
        //Interact with a VirtualPet object in this method
    }

    public abstract void petReport();

    public boolean getIsAlive() {
        return isAlive;
    }

    public String getName(){
        return petName;
    }

    public int getAge() {
        return age;
    }

    public abstract void tick();

}
