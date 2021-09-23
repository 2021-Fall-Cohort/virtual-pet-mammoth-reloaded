package virtual_pet;

import java.util.Scanner;

public  class VirtualPetApplication {

    public static void main(String[] args){


        System.out.println("                                           _   _    \t\t                      _                 _          _ ");
        System.out.println("                                          | | | |\t\t                         | |               | |        | |");
        System.out.println(" _ __ ___   __ _ _ __ ___  _ __ ___   ___ | |_| |__  \t  .----.-.\t     _ __ __ | | ___   __ _  __| | ___  __| |");
        System.out.println("| '_ ` _ \\ / _` | '_ ` _ \\| '_ ` _ \\ / _ \\| __| '_ \\ \t /    ( o \\     | '__/ _ \\ |/ _ \\ / _` |/ _` |/ _ \\/ _` |");
        System.out.println("| | | | | | (_| | | | | | | | | | | | (_) | |_| | | |   '|  __ ` ||     | | |  __/ | (_) | (_| | (_| |  __/ (_| |");
        System.out.println("|_| |_| |_|\\__,_|_| |_| |_|_| |_| |_|\\___/ \\__|_| |_|\t |||  ||| -'\t|_|  \\___|_|\\___/ \\__,_|\\__,_|\\___|\\__,_|");


        //virtual_pet.Mammoth Name from User
        System.out.println("\nWhat is your pets name? ");
        Scanner input = new Scanner(System.in);
        String petName= input.nextLine();
        System.out.println("Welcome to the wintry world " + petName + "!");

        //virtual_pet.Mammoth Pet's fur Color
        System.out.println("What color is your pet virtual_pet.Mammoth? Red, Green, Orange, Brown, Blue, Yellow, or Indigo?");
        input = new Scanner(System.in);
        String mammothFurColor = input.nextLine();
        System.out.println("Your pet " + petName  + ", is " + mammothFurColor + "!");

//        //virtual_pet.Mammoth Age
//        System.out.println("How old is your pet?");
//        input = new Scanner(System.in);
//        int mammothAge = input.nextLine();
//        System.out.println ("Your pet " + mammothName + ", is " + mammothFurColor + ", and " + mammothAge + " years old! ");

        Pet userPet = new Pet(petName, petColor, 0, 9,  1,  5, true);

        while(userPet.getIsAlive()){

            System.out.println("What would you like to do with your mammoth?");
            System.out.println("[1=feed]\t [2=hibernate]\t [3=care]");
            Scanner inputScanner = new Scanner(System.in);
            int mainLoop = inputScanner.nextInt();
                if(mainLoop == 1){
                    //System.out.println("Do you want to feed your pet? Chose between \n "[1=Feed Oats]   [2=Feed Peanuts]    [3=Feed bananas]    [4=Not Feed]?");
                    System.out.print("Do you want to feed your pet? Chose between \n" );
                    int i =1;
                    for (String foodOption: userPet.getFoodOptions()){
                        System.out.print("["+ i +"="+foodOption+"]    ");
                        i++;
                    }
                    System.out.print("\n");
                    inputScanner = new Scanner(System.in);
                    int feedChoices = inputScanner.nextInt();
                    userPet.feed(feedChoices);
                }
                if(mainLoop == 2){
                    System.out.println("Winter is arriving for " + mammothName + "." + "Where do you want them to hibernate?");
                    System.out.println("[1=Europa]  [2=Siberia] [3=Himalayan Mountains] [4=Mount Kilimanjaro]");
                    inputScanner = new Scanner(System.in);
                    int hibernateChoices = inputScanner.nextInt();
                    userPet.hibernate(hibernateChoices);
                }
                if(mainLoop == 3){
                    System.out.println(mammothName + " looks a little bored. What do you say we do something nice for them?\n");
                    System.out.println("[1=Take for a walk] [2=Polish their tusks] [3=Comb their "+mammothFurColor +" fur]"
                            + " [4=Ignore]");
                    inputScanner = new Scanner(System.in);
                    int careChoices = inputScanner.nextInt();
                    userPet.care(careChoices);
                }
            userPet.tick();

                }
//            userMammoth.takeVitals();
        }

        //Do you want to feed your pet? (Feed Function)
//        System.out.println("");
//        input = new Scanner(System.in);
//        String mammothTuskLength = input.nextLine();
//        System.out.println ("Do you want to feed your pet?");


    public static interface Hibernation {
        void hibernation(int hibernateChoices);
    }
}

