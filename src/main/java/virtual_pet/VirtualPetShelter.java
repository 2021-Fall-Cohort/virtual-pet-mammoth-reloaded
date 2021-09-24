package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {

    private ArrayList<Pet> pets;

    public VirtualPetShelter() {
        this.pets = new ArrayList<Pet>();
        pets.add(new Mammoth("Tre", "gray", 6, 2, 2, 5,true));
        pets.add( new Mammoth("Stew","Yellow",1,2,2,5, true));
        pets.add(new Mammoth("Ben","blue",0,1,4,5, true));
        pets.add(new Mammoth("Joe","Brown",0,2,7,5, true));
    }

    public ArrayList<Pet> getPets(){
        return pets;
    }

    public void admitPet(Pet pet){
        pets.add(pet);
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
        for (Pet refPet: pets){
            refPet.water();
        }
    }

    public void careForPets(){
        for (Pet refPet: pets){
            refPet.care(2);
        }
    }
}
