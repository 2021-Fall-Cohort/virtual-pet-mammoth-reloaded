package virtual_pet;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest  {
  VirtualPetShelter underTest;


    @BeforeEach
    void setUp(){
        underTest = new VirtualPetShelter();
    }
    //Testing the code by creating an instance of Mammoth, adding it to the arraylist, checking that its there, and getting the name via assertEq.
    @Test
     void shouldCreateClassAndAddToArrayList() {
        Mammoth tre = new Mammoth("Tre", "gray", 6, 2, 2, true);
        underTest.shelterList().add(tre);
        assertEquals("Tre", underTest.shelterList().get(0).getName());
    }

    //Making mammoths 1-3, checking for the size of the ArrayList = # of mammoths in the test
    @Test
    void shouldCreateManyMammothAndToArrayList() {
        Mammoth tre = new Mammoth("Tre", "gray", 6, 2, 2, true);
        Mammoth stew = new Mammoth("Stew","Yellow",1,2,2,true);
        Mammoth ben = new Mammoth("Ben","blue",0,1,4,true);
        underTest.shelterList().add(tre);
        underTest.shelterList().add(stew);
        underTest.shelterList().add(ben);
        int sizeOfArrayList = underTest.shelterList().size();
        assertEquals(3,sizeOfArrayList);
    }

    //Creating version of mammoth, adding to the array, and then removing one of the mammoths based on if the user chooses prompt 2
    @Test
    void shouldRemovePetFromArrayList(){
        Mammoth tre = new Mammoth("Tre", "gray", 6, 2, 2, true);
        Mammoth stew = new Mammoth("Stew","Yellow",1,2,2,true);
        Mammoth ben = new Mammoth("Ben","blue",0,1,4,true);
        Mammoth joe = new Mammoth("Joe","Brown",0,2,7,true);
        underTest.shelterList().add(tre);
        underTest.shelterList().add(stew);
        underTest.shelterList().add(ben);
        underTest.shelterList().add(joe);
//        underTest.shelterList().remove();
        int sizeOfArrayList = underTest.shelterList().size();
    }
    }
