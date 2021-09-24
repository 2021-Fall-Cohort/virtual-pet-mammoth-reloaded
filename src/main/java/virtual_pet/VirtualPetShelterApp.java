package virtual_pet;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualPetShelterApp {

    Scanner inputScanner = new Scanner(System.in);
    boolean playGame = true;

    public static void main(String[] args) {
        VirtualPetShelterApp myApp = new VirtualPetShelterApp();
        myApp.gameLoop();
    }
    public void gameLoop() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        while (playGame) {
            System.out.println("Welcome to the WCCI-ship!" + " What would like to do?");
            petsStatus(myShelter.getPets());
            System.out.println("1=Feed all pets in the WCCI-ship!\t2=Adopt a pet!\t3=Admit a pet!\t4=Water all the pets in the WCCI-ship\t5=Quit Game?");

            int mainShelterChoices = inputScanner.nextInt();


            switch (mainShelterChoices) {

                case 1:
                    //print out contents of option 1 - "View list of pets"
                    System.out.println("All pets have been feed");
                    myShelter.feedPets();
                    break;
                case 2:
                    //print out contents of option 2 - "Adopt a pet"
//                    myShelter.retrievePetByName(name).removePet;
                    break;
                case 3:
                    //print out contents of option 3 - "Admit a pet"
                    admitPet(myShelter);
                    break;
                case 4:
                    playGame = false;
                    break;
            }

        }
    }

    private void admitPet(VirtualPetShelter myShelter) {
        //prompt user for characteristics = pet type (mammoth/trex), pet name, color, hunger, etc...
    }

    public void petsStatus(ArrayList<Pet> pets) {
//        System.out.format("%-2s%10d%-16s", string1, string2,string3,string4, string5);
        System.out.printf("|Name|\t|Happiness|\t|Hunger|\t|Color|\t|Age|");
        System.out.println("---------------------------------------------------");
        for (Pet refPet: pets){
            System.out.println("Name: " + refPet.petName + "\t     " + refPet.petName + "\t     " + refPet.petName + "\t     " + refPet.petName + "\t     ");
        }
    }



}

