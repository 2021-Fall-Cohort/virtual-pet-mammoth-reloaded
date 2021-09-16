package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args){

        //Mammoth Name from User
        System.out.println("What is your pets name? ");
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

        Mammoth userMammoth = new Mammoth(mammothName, mammothFurColor, -1, 0, 10,  1);

        for(int y = 0; y<=10; y++){
            userMammoth.tick();
            userMammoth.hung();
        }

        //Do you want to feed your pet? (Feed Function)
//        System.out.println("");
//        input = new Scanner(System.in);
//        String mammothTuskLength = input.nextLine();
//        System.out.println ("Do you want to feed your pet?");



    }
}

