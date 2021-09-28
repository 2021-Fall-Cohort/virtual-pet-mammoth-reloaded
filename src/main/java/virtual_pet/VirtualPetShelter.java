package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {

    private final ArrayList<Pet> pets;

    public VirtualPetShelter() {
        this.pets = new ArrayList<Pet>();
        pets.add(new Mammoth("Tre", "gray", 6, 2, 2, 5, true));
        pets.add(new Mammoth("Stew", "Yellow", 1, 2, 2, 5, true));
        pets.add(new Mammoth("Ben", "blue", 0, 1, 4, 5, true));
        pets.add(new Mammoth("Joe", "Brown", 0, 2, 7, 5, true));
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void admitPet(Pet userPet) {
        pets.add(userPet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    public void checkForDeath() {
        for (int i = 0; i < pets.size(); i++) {
            if(pets.get(i).isAlive==false){
                removePet(pets.get(i));
            }
        }
    }

    public Pet retrievePetByName(String name) {
        for (int i = 0; i < pets.size(); i++) {
            if (name.toUpperCase().equals( pets.get(i).getName().toUpperCase())) {
                return pets.get(i);
            }
        }
        return null;
    }

    public void feedPets() {
        for (Pet refPet : pets) {
            refPet.feed(2);
        }
    }

    public void waterPets() {
        for (Pet refPet : pets) {
            refPet.water();
        }
    }

    public void careForPets() {
        for (Pet refPet : pets) {
            refPet.care(2);
        }
    }

    public void tick() {
        //age increases and displays

        for (Pet refPet : pets) {

            refPet.tick();

        }
    }
}