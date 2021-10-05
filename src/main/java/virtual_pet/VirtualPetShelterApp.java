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

        while (playGame) {
            System.out.println("Welcome to the WCCI-ship!" + " What would like to do?");
            petsStatus(myShelter.getPets());
            System.out.println("1=Feed all pets in WCCI!\t2=Adopt a pet!\t3=Admit a pet!\t" +
                    "4=Water all pets in WCCI\t5=Care for all of the pets\t6=Preventive Maintenance\t7=Walk Mammoth\t8=Hunt with TRex\t9:Quit Game");

            int mainShelterChoices = inputScanner.nextInt();
            inputScanner.nextLine();

            myShelter.tick();

            switch (mainShelterChoices) {

                case 1:
                    //print out contents of option 1 - "View list of pets"
                    System.out.println("All pets have been feed");
                    myShelter.feedPets();
                    break;
                case 2:
                    //print out contents of option 2 - "Adopt a pet"
                    System.out.println("What pet do you want to adopt?");
                    String name = inputScanner.nextLine();
                    myShelter.removePet(myShelter.retrievePetByName(name));
                    break;
                case 3:
                    //print out contents of option 3 - "Admit a pet"
                    System.out.println("What type of pet do you want to admit? \n[1=Organic Mammoth]\t[2=Robotic Mammoth]" +
                            "\t[3=Organic T-Rex]\t[4=Robotic T-Rex]");
                    int admitChoice = inputScanner.nextInt();

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
                case 4:
                    myShelter.waterPets();
                    break;
                case 5:
                    myShelter.careForPets();
                    break;
                case 6:
                    myShelter.maintainRobos();
                    break;

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

                case 9:
                    System.out.println("Quit Game?");

                    playGame = false;
                    break;
            }
            myShelter.checkForDeath();
        }
    }

    private void admitPet(VirtualPetShelter myShelter) {
        //prompt user for characteristics = pet type (mammoth/trex), pet name, color, hunger, etc...
    }

    public void petsStatus(ArrayList<Pet> pets) {
        System.out.println("______________________________________________________");
        System.out.println("|Name          |Happiness|\tHunger  |\tAge |  Thirst|");
        System.out.println("______________________________________________________");
        for(int i=0; i<pets.size(); i++){
            if(pets.get(i) instanceof Organic) {

                System.out.println(padString(pets.get(i).getName()) + "|     " + ((Organic)pets.get(i)).getHappiness() + "\t |     " +
                            ((Organic)pets.get(i)).getHunger() + "\t|     " + pets.get(i).getAge() + "\t|     " + ((Organic)pets.get(i)).getThirst());

            }

        }
        System.out.println("______________________________________________________");
        System.out.println("|Name          |Oil Level|\tBattery Level  |\tAge |");
        System.out.println("______________________________________________________");
        for(int i=0; i<pets.size(); i++) {
            if (pets.get(i) instanceof Robotic) {


                    System.out.println(padString(pets.get(i).getName()) + "|     " + ((Robotic) pets.get(i)).getOilLevel() + "\t |     " +
                            ((Robotic) pets.get(i)).getBatteryLevel() + "\t\t   |     " + pets.get(i).getAge());

            }
        }
    }
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

