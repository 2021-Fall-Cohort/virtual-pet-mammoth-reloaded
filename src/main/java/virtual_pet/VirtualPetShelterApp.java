package virtual_pet;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the WCCI-ship!" + " What would like to do?");
        System.out.println("1=View list of pets in the WCCI!\t2=Adopt a pet!\t3=Admit a pet!");
        Scanner inputScanner = new Scanner(System.in);
        int mainShelterChoices = inputScanner.nextInt();

        }
            if(mainShelterChoices == 1){
                System.out.println(Arrays.toString(petChoice));
            }
            if(mainShelterChoices == 2) {
//                System.out.println(Arrays.toString());
            }
            if(mainShelterChoices == 3) {
//                System.out.println(Arrays.toString());
            }

//        int mainShelterChoices= {input.nextLine();}
//        System.out.println(mainShelterChoices + "has been admitted to WCCI-ship");
    }
}
