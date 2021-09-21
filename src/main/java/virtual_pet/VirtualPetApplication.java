package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args){


        System.out.println("                                           _   _    \t\t                      _                 _          _ ");
        System.out.println("                                          | | | |\t\t                         | |               | |        | |");
        System.out.println(" _ __ ___   __ _ _ __ ___  _ __ ___   ___ | |_| |__  \t  .----.-.\t     _ __ __ | | ___   __ _  __| | ___  __| |");
        System.out.println("| '_ ` _ \\ / _` | '_ ` _ \\| '_ ` _ \\ / _ \\| __| '_ \\ \t /    ( o \\     | '__/ _ \\ |/ _ \\ / _` |/ _` |/ _ \\/ _` |");
        System.out.println("| | | | | | (_| | | | | | | | | | | | (_) | |_| | | |   '|  __ ` ||     | | |  __/ | (_) | (_| | (_| |  __/ (_| |");
        System.out.println("|_| |_| |_|\\__,_|_| |_| |_|_| |_| |_|\\___/ \\__|_| |_|\t |||  ||| -'\t|_|  \\___|_|\\___/ \\__,_|\\__,_|\\___|\\__,_|");


        //Mammoth Name from User
        System.out.println("\nWhat is your pets name? ");
        Scanner input = new Scanner(System.in);
        String mammothName = input.nextLine();
        System.out.println("Welcome to the wintry world " + mammothName + "!");

        //Mammoth Pet's fur Color
        System.out.println("What color is your pet Mammoth? Red, Green, Orange, Brown, Blue, Yellow, or Indigo?");
        input = new Scanner(System.in);
        String mammothFurColor = input.nextLine();
        System.out.println("Your pet " + mammothName  + ", is " + mammothFurColor + "!");

//        //Mammoth Age
//        System.out.println("How old is your pet?");
//        input = new Scanner(System.in);
//        int mammothAge = input.nextLine();
//        System.out.println ("Your pet " + mammothName + ", is " + mammothFurColor + ", and " + mammothAge + " years old! ");

        Mammoth userMammoth = new Mammoth(mammothName, mammothFurColor, -1, 0, 10,  1,  5, true);

        while(userMammoth.getIsAlive()){
            userMammoth.tick();
            System.out.println("What would you like to do with your mammoth?");
            System.out.println("[1=feed]\t [2=hibernate]\t [3=care]");
            Scanner inputScanner = new Scanner(System.in);
            int mainLoop = inputScanner.nextInt();
                if(mainLoop == 1){
                    System.out.println("Do you want to feed your pet? Chose between \n [1=Feed Oats]   [2=Feed Peanuts]    [3=Feed bananas]    [4=Not Feed]?");
                    inputScanner = new Scanner(System.in);
                    int feedChoices = inputScanner.nextInt();
                    userMammoth.feed(feedChoices);
                }
                if(mainLoop == 2){
                    System.out.println("Winter is arriving for " + mammothName + "." + "Where do you want them to hibernate?");
                    System.out.println("[1=Europa]  [2=Siberia] [3=Himalayan Mountains] [4=Mount Kilimanjaro]");
                    inputScanner = new Scanner(System.in);
                    int hibernateChoices = inputScanner.nextInt();
                    userMammoth.hibernate(hibernateChoices);
                }
                if(mainLoop == 3){
                    System.out.println(mammothName + " looks a little bored. What do you say we do something nice for them?\n");
                    System.out.println("[1=Take for a walk] [2=Polish their tusks] [3=Comb their "+mammothFurColor +" fur]"
                            + " [4=Ignore]");
                    inputScanner = new Scanner(System.in);
                    int careChoices = inputScanner.nextInt();
                    userMammoth.care(careChoices);
                }
                else{
                    System.out.println("Invalid Selection");
                }
            userMammoth.takeVitals();
        }

        //Do you want to feed your pet? (Feed Function)
//        System.out.println("");
//        input = new Scanner(System.in);
//        String mammothTuskLength = input.nextLine();
//        System.out.println ("Do you want to feed your pet?");



    }
}

