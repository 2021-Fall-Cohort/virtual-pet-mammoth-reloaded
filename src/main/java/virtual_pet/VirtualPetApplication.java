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

        Mammoth userMammoth = new Mammoth(mammothName, mammothFurColor, -1, 0, 10,  1,  5);

        for(int y = 0; y<=11; y++){
            userMammoth.tick();
            userMammoth.hung();
            userMammoth.feed();
            userMammoth.hibernate();
            userMammoth.care();
        }

        //Do you want to feed your pet? (Feed Function)
//        System.out.println("");
//        input = new Scanner(System.in);
//        String mammothTuskLength = input.nextLine();
//        System.out.println ("Do you want to feed your pet?");



    }
}

