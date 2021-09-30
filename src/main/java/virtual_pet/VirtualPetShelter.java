package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {

    private final ArrayList<Pet> pets;

    public VirtualPetShelter() {
        this.pets = new ArrayList<Pet>();
        pets.add(new OrganicMammoth("Tre", "gray", 6, 2, 2, 5, true));
        pets.add(new OrganicRex("Stew", "Yellow", 1, 2, 2, 5, true));
        pets.add(new RoboMammoth("Ben", "blue", 0, 5, 4, true));
        pets.add(new RoboRex("Joe", "Brown", 0, 5, 7,  true));
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
            if(refPet instanceof Organic) {
                ((Organic)refPet).feed();
            }
        }
    }

    public void waterPets() {
        for (Pet refPet : pets) {
            if(refPet instanceof Organic) {
                ((Organic)refPet).water();
            }
        }
    }

    public void careForPets() {
        for (Pet refPet : pets) {
            if(refPet instanceof Organic) {
                ((Organic)refPet).care();
            }
        }
    }

    public void tick() {
        //age increases and displays

        for (Pet refPet : pets) {
            refPet.tick();
        }
    }

    public void maintainRobos(){
        for (Pet refPet : pets) {
            if(refPet instanceof Robotic) {
                ((Robotic) refPet).preventiveMaintenance();
            }
        }
    }
}
