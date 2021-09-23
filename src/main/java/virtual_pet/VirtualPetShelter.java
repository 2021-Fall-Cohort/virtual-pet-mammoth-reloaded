package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {

    public void shelterList() {
    }

    public static class ArrayListApp {
        private ArrayList<Mammoth> shelter;

        public ArrayListApp(){
            this.shelter = new ArrayList<Mammoth>();
        }

        public ArrayList<Mammoth> shelterList(){
            return shelter;
        }


    }


}
