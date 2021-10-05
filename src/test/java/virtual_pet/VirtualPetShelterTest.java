package virtual_pet;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


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
       Pet tre = underTest.getPets().get(0);
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
        Pet ben = underTest.getPets().get(2);
        underTest .removePet(ben);
        int sizeOfArrayList = underTest.getPets().size();
        assertEquals(3, sizeOfArrayList);
        }

    @Test
    void shouldAddPetToArrayList(){
        OrganicRex mac = new OrganicRex("Mac","grey",6,2,2,5,true);
        underTest.admitPet(mac);
        int sizeOfArrayList = underTest.getPets().size();
        assertEquals(5, sizeOfArrayList);
    }

    @Test
    void feedMethodShouldReduceHunger(){
        Pet tre = underTest.getPets().get(0);
        underTest.feedPets();
        assertEquals(0, ((Organic)tre).getHunger());
    }

    @Test
    void waterMethodShouldReduceThirst(){
        Pet tre = underTest.getPets().get(0);
        underTest.waterPets();
        assertEquals(0, ((Organic)tre).getThirst());
    }

    @Test
    void careMethodShouldIncreaseHappiness(){
        Pet stew = underTest.getPets().get(1);
        underTest.careForPets();
        assertEquals(8, ((Organic)stew).getHappiness());
    }

    @Test
    void adoptChoiceShouldRemovePetFromArray(){
        Pet tre = underTest.getPets().get(0);
        underTest.removePet(tre);
        assertNull(underTest.retrievePetByName("Tre"));
    }

    @Test
    void admitChoiceShouldAddPetToArray() {
        OrganicRex mac = new OrganicRex("Mac","grey",6,2,2,5, true);
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
        assertEquals(3, ((Organic)tre).getHunger());
    }

    @Test
    void tickMethodShouldDecreaseHappiness() {
        Pet tre = underTest.getPets().get(0);
        tre.tick();
        assertEquals(4, ((Organic)tre).getHappiness());
    }

    @Test
    void tickMethodShouldIncreaseThirst() {
        Pet stew = underTest.getPets().get(1);
        stew.tick();
        assertEquals(3, ((Organic)stew).getThirst());
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
        assertEquals("Tre", underTest.retrievePetByName("tre").getName().toString());
    }

    @Test
    void preventativeMaintenanceShouldIncreaseBatteryLevel(){
        Pet ben = underTest.getPets().get(2);
        underTest.maintainRobos();
        assertEquals(7, ((Robotic)ben).getBatteryLevel());
    }

    @Test
    void preventativeMaintenanceShouldIncreaseOilLevel(){
        Pet ben = underTest.getPets().get(2);
        underTest.maintainRobos();
        assertEquals(8, ((Robotic)ben).getOilLevel());
    }

    @Test
    void huntingInterfaceShouldIncreaseThirstHappiness(){
        Pet stew = underTest.getPets().get(1);
        ((OrganicRex)stew).hunting();
        assertEquals(7, ((OrganicRex)stew).getHappiness());
        assertEquals(4, ((OrganicRex)stew).getThirst());
    }

    @Test
    void huntingInterfaceShouldDecreaseHunger(){
        Pet stew = underTest.getPets().get(1);
        ((OrganicRex)stew).hunting();
        assertEquals(0, ((OrganicRex)stew).getHunger());
    }

    @Test
    void huntingInterfaceShouldDecreaseOilBatteryLevel(){
        Pet joe = underTest.getPets().get(3);
        ((RoboRex)joe).hunting();
        assertEquals(5, ((RoboRex)joe).getBatteryLevel());
        assertEquals(3, ((RoboRex)joe).getOilLevel());
    }

    @Test
    void walkingInterfaceShouldIncreaseIncreaseHungerHappinessThirst(){
        Pet tre = underTest.getPets().get(0);
        ((OrganicMammoth)tre).walking();
        assertEquals(7, ((Organic)tre).getHappiness());
        assertEquals(4, ((Organic)tre).getThirst());
        assertEquals(4, ((Organic)tre).getHunger());
    }

    @Test
    void walkingInterfaceShouldDecreaseOilBatteryLevel(){
        Pet ben = underTest.getPets().get(2);
        ((RoboMammoth)ben).walking();
        assertEquals(3, ((Robotic)ben).getOilLevel());
        assertEquals(2, ((Robotic)ben).getBatteryLevel());
    }

    @Test
    void checkForDeathShouldRemoveDeadPetsFromArray(){
        Pet tre =  underTest.getPets().get(0);
        tre.tick();
        tre.tick();
        tre.tick();
        tre.tick();
        tre.tick();
        underTest.checkForDeath();
        int sizeOfArrayList = underTest.getPets().size();
        assertEquals(3, sizeOfArrayList);
    }
}
