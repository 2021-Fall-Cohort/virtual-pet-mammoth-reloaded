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
            System.out.println("1=View list of pets in the WCCI!\t2=Adopt a pet!\t3=Admit a pet!\t4=Quit Game?");

            int mainShelterChoices = inputScanner.nextInt();


            switch (mainShelterChoices) {

                case 1:
                    //print out contents of option 1 - "View list of pets"
//                .toString();
//                    System.out.println(shelter);
                    break;
                case 2:
                    //print out contents of option 2 - "Adopt a pet"
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
        for (Pet refPet: pets){
            System.out.println("Name: " + refPet.petName);
        }
    }

}

