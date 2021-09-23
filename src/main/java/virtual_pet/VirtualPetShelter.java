package virtual_pet;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class VirtualPetShelter {

    private ArrayList<Mammoth> shelter;

    public VirtualPetShelter() {
            this.shelter = new ArrayList<Mammoth>();
        }

        public ArrayList<Mammoth> shelterList(){return shelter;
        }

    }
