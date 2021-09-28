package virtual_pet;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class VirtualPetShelterTest  {
  VirtualPetShelter underTest;


    @BeforeEach
    void setUp(){
        underTest = new VirtualPetShelter();
    }
    //Testing the code by creating an instance of Mammoth, adding it to the arraylist, checking that its there, and getting the name via assertEq.
    @Test
     void shouldCreateClassAndAddToArrayList() {
        Mammoth tre = new Mammoth("Tre", "gray", 6, 2, 2, 5,true);
        underTest.getPets().add(tre);
        assertEquals("Tre", underTest.getPets().get(0).getName());
    }

    //Making mammoths 1-3, checking for the size of the ArrayList = # of mammoths in the test
    @Test
    void shouldCreateManyMammothAndToArrayList() {
        int sizeOfArrayList = underTest.getPets().size();
        assertEquals(4,sizeOfArrayList);
    }

    //Creating version of mammoth, adding to the array, and then removing one of the mammoths based on if the user chooses prompt 2
    @Test
    void shouldRemovePetFromArrayList() {
        Mammoth mac = new Mammoth("Mac","grey",6,2,2,5, true);
        underTest.getPets();
        underTest .removePet(mac);
        int sizeOfArrayList = underTest.getPets().size();
        assertEquals(4, sizeOfArrayList);
        }

    @Test
    void shouldAddPetFromArrayList(){
        Mammoth mac = new Mammoth("Mac","grey",6,2,2,5,true);
        underTest.admitPet(mac);
        int sizeOfArrayList = underTest.getPets().size();
        assertEquals(5, sizeOfArrayList);
    }

    @Test
    void feedMethodShouldReduceHunger(){
        Mammoth mac = new Mammoth("Mac","grey",6,2,2,5, true);
        underTest.admitPet(mac);
        underTest.feedPets();
        int sizeOfArrayList = underTest.getPets().size();
        assertEquals(0, mac.hunger);
    }

    @Test
    void waterMethodShouldRecueThirst(){
        Mammoth mac = new Mammoth("Mac","grey",6,2,2,5, true);
        underTest.admitPet(mac);
        underTest.waterPets();
    }

    @Test
    void careMethodShouldIncreaseHappiness(){
        underTest.getPets();
        underTest.careForPets();
        assertEquals(4, underTest.getPets().get(0).getHappiness());
    }

    @Test
    void adoptChoiceShouldRemovePetFromArray(){
        Pet tre = underTest.getPets().get(0);
        underTest.removePet(tre);
        assertNull(underTest.retrievePetByName("Tre"));
    }

    @Test
    void admitChoiceShouldAddPetToArray() {
        Mammoth mac = new Mammoth("Mac","grey",6,2,2,5, true);
        underTest.admitPet(mac);
        int sizeOfArrayList = underTest.getPets().size();
        assertEquals(5, sizeOfArrayList);
    }

    @Test
    void tickMethodShouldIncreaseAge() {
        Pet tre = underTest.getPets().get(0);
        tre.tick();
        assertEquals(7, underTest.getPets().get(0).getAge());
    }

    @Test
    void tickMethodShouldIncreaseHunger() {
        Pet tre = underTest.getPets().get(0);
        tre.tick();
        assertEquals(3, underTest.getPets().get(0).getHunger());
    }

    @Test
    void tickMethodShouldDecreaseHappiness() {
        Pet tre = underTest.getPets().get(0);
        tre.tick();
        assertEquals(1, underTest.getPets().get(0).getHappiness());
    }

    @Test
    void tickMethodShouldIncreaseThirst() {
        Pet stew = underTest.getPets().get(1);
        stew.tick();
        assertEquals(6, underTest.getPets().get(1).getThirst());
    }

    @Test
    void ageOfTenShouldAlterIsAlive() {
        Pet tre = underTest.getPets().get(0);
        tre.tick();
        tre.tick();
        tre.tick();
        tre.tick();
        tre.tick();
        assertEquals(false, underTest.getPets().get(0).getIsAlive());
    }

    @Test
    void retrievePetByNameShouldReturnName() {
        Pet tre = underTest.getPets().get(0);
        assertEquals("Tre", underTest.retrievePetByName("tre"));
    }


}
