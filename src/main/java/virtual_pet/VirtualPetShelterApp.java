package virtual_pet;

import java.util.ArrayList;
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

        //Main game loop
        while (playGame) {
            System.out.println("Welcome to the WCCI-ship!" + " What would like to do?");

            //Prints out the status of all the pets and their fields
            petsStatus(myShelter.getPets());
            System.out.println("1=Feed all pets in WCCI!\t2=Adopt a pet!\t3=Admit a pet!\t" +
                    "4=Water all pets in WCCI\t5=Care for all of the pets\t6=Preventive Maintenance\t7=Walk Mammoth\t8=Hunt with TRex\t9:Quit Game");

            int mainShelterChoices = inputScanner.nextInt();
            inputScanner.nextLine();

            myShelter.tick();

            //Selects all game options
            switch (mainShelterChoices) {

                //Reduces hunger for all organic pets
                case 1:
                    System.out.println("All pets have been feed");
                    myShelter.feedPets();
                    break;

                //Removes selected pet from arraylist
                case 2:
                    System.out.println("What pet do you want to adopt?");
                    String name = inputScanner.nextLine();
                    myShelter.removePet(myShelter.retrievePetByName(name));
                    break;

                //Instantiates new pet and adds to the ArrayList
                case 3:
                    //print out contents of option 3 - "Admit a pet"
                    System.out.println("What type of pet do you want to admit? \n[1=Organic Mammoth]\t[2=Robotic Mammoth]" +
                            "\t[3=Organic T-Rex]\t[4=Robotic T-Rex]");
                    int admitChoice = inputScanner.nextInt();

                    //New switch case to add pet to ArrayList of chosen type
                    switch(admitChoice){

                        case 1:
                            System.out.println("What is your pet's name?");
                            inputScanner = new Scanner(System.in);
                            String userName = inputScanner.nextLine();
                            System.out.println("What is your pet's color in ROYGBIV?");
                            inputScanner = new Scanner(System.in);
                            String userColor = inputScanner.nextLine();
                            Organic userOrganicMammoth = new OrganicMammoth(userName, userColor, 0, 5,5,5, true);
                            myShelter.admitPet(userOrganicMammoth);
                            break;

                        case 2:
                            System.out.println("What is your pet's name?");
                            inputScanner = new Scanner(System.in);
                            String userName2 = inputScanner.nextLine();
                            System.out.println("What is your pet's color in ROYGBIV?");
                            inputScanner = new Scanner(System.in);
                            String userColor2 = inputScanner.nextLine();
                            Robotic userRoboticMammoth = new RoboMammoth(userName2, userColor2, 0, 5,5, true);
                            myShelter.admitPet(userRoboticMammoth);
                            break;

                        case 3:
                            System.out.println("What is your pet's name?");
                             inputScanner = new Scanner(System.in);
                            String userName3 = inputScanner.nextLine();
                            System.out.println("What is your pet's color in ROYGBIV?");
                            inputScanner = new Scanner(System.in);
                            String userColor3 = inputScanner.nextLine();
                            Organic userOrganicRex = new OrganicRex(userName3, userColor3, 0, 5,5,5, true);
                            myShelter.admitPet(userOrganicRex);
                            break;

                        case 4:
                            System.out.println("What is your pet's name?");
                            inputScanner = new Scanner(System.in);
                            String userName4 = inputScanner.nextLine();
                            System.out.println("What is your pet's color in ROYGBIV?");
                            inputScanner = new Scanner(System.in);
                            String userColor4 = inputScanner.nextLine();
                            Robotic userRoboticRex = new RoboRex(userName4, userColor4, 0, 5,5, true);
                            myShelter.admitPet(userRoboticRex);
                            break;
                    }
                    break;

                //Reduces thirst for all organic pets
                case 4:
                    myShelter.waterPets();
                    break;

                //Increases happiness for all organic pets
                case 5:
                    myShelter.careForPets();
                    break;

                //Increases oilLevel and batteryLevel of all robotic pets
                case 6:
                    myShelter.maintainRobos();
                    break;

                //Calls walking interface for all mammoth pets
                case 7:
                   for (Pet refPet: myShelter.getPets()) {
                       if (refPet instanceof OrganicMammoth) {
                           ((OrganicMammoth) refPet).walking();
                       }
                       if (refPet instanceof RoboMammoth) {
                           ((RoboMammoth) refPet).walking();
                       }
                   }
                        break;

                //Calls hunting interface for all T-rex pets
                case 8:
                    for (Pet refPet: myShelter.getPets()) {
                        if (refPet instanceof OrganicRex) {
                            ((OrganicRex) refPet).hunting();
                        }
                        if (refPet instanceof RoboRex) {
                            ((RoboRex) refPet).hunting();
                        }
                    }
                    break;

                //Exits main game loop
                case 9:
                    System.out.println("Quit Game?");
                    playGame = false;
                    break;
            }

            //Checks to see if any of the methods in the loop "killed" the pets
            myShelter.checkForDeath();
        }
    }

    public void petsStatus(ArrayList<Pet> pets) {
        System.out.println("_____________________________Organic____________________________");
        System.out.println("|Name          |Happiness|\tHunger  |\tAge |  Thirst|\tPet Type");
        System.out.println("________________________________________________________________");
        for(int i=0; i<pets.size(); i++){
            if(pets.get(i) instanceof Organic) {

                System.out.println(padString(pets.get(i).getName()) + "|     " + ((Organic)pets.get(i)).getHappiness() + "\t |     " +
                            ((Organic)pets.get(i)).getHunger() + "\t|     " + pets.get(i).getAge() + "\t|     "
                        + ((Organic)pets.get(i)).getThirst() + "\t |   " + pets.get(i).getPetType());

            }

        }
        System.out.println("_____________________________Robotic____________________________");
        System.out.println("|Name          |Oil Level|\tBattery Level  |\tAge |\tPet Type");
        System.out.println("________________________________________________________________");
        for(int i=0; i<pets.size(); i++) {
            if (pets.get(i) instanceof Robotic) {


                    System.out.println(padString(pets.get(i).getName()) + "|     " + ((Robotic) pets.get(i)).getOilLevel() + "\t |     " +
                            ((Robotic) pets.get(i)).getBatteryLevel() + "\t\t   |     " + pets.get(i).getAge() +"\t|   " + pets.get(i).getPetType());

            }
        }
    }

    //Makes name strings same length to keep petsStatus table uniform for all pet names
    public String padString(String str){
        String output = str;
        int inputLength = str.length();
        int loopLength = 15 - inputLength;
        for(int i = 0; i<loopLength;i++ ){
            output += " ";
        }
        return output;
    }
}

