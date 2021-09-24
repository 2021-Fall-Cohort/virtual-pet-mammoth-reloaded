package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {

    private ArrayList<Pet> pets;

    public VirtualPetShelter() {
        this.pets = new ArrayList<Pet>();
        pets.add(new Mammoth("Tre", "gray", 6, 2, 2, 5,true));
        pets.add( new Mammoth("Stew","Yellow",1,2,2,5,true));
        pets.add(new Mammoth("Ben","blue",0,1,4,5,true));
        pets.add(new Mammoth("Joe","Brown",0,2,7,5,true));
    }

    public ArrayList<Pet> getPets(){
        return pets;
    }

    public void admitPet(Pet userPet) {
        pets.add(userPet);
    }
    public void removePet(Pet pet){
        pets.remove(pet);
    }
    public Pet retrievePetByName(String name){
        for (Pet refPet: pets) {
            if (name.toLowerCase() == refPet.getName().toLowerCase()) {
                return refPet;
            }
        }
        return null;
    }
    public void feedPets(){
        for (Pet refPet: pets){
            refPet.feed(2);
        }
    }
    public void waterPets(){

    }

    public void careForPets(){
        for (Pet refPet: pets){
            refPet.care(2);
        }
    }


//            //age increases and displays
//            happiness--;
//            age++;
//            if(age==11) {
//                isAlive = false;
//            }
////        if (age <= 10) {
////            System.out.println("A year has passed and " + petName + " is now " + age + ".");
////        } else if (age == 11) {
////            isAlive = false;
////            System.out.println(petName + " has grown old and weak.");
//
//            double v = .5;
//            if (age == 0 || age == 1) {
//                hunger = hunger + v;
////            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
//            } else if (age > 1 && age <= 10) {
//                hunger = hunger + (v + v);
////            System.out.println(new StringBuilder().append("Your pet ").append(petName).append("'s hunger has changed to ").append(hunger).toString());
//            } else {
//                System.out.println("");
//            }
//
//            if (happiness >= 10) {
//                happiness = 10;
////            System.out.println(petName + " is as happy as can be! Great work!");
//            }
//            if (happiness <= 0) {
//                isAlive = false;
////            System.out.println("Oh no! " + petName + "'s poor heart can't take it anymore...");
//
//            }
//
////        if (hunger <= 0) {
////            hunger = 0;
////            System.out.println("Woah! " + petName + " is full as can be! They'll grow big and strong in no time!");
////        }
//            if (hunger >= 12) {
//                isAlive = false;
////            System.out.println("OH NO! You've neglected to feed " + petName + "!");
//            }
//    }
}
