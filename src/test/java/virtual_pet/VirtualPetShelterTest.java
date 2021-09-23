package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest  {
  VirtualPetShelter underTest;


    @BeforeEach

    void setUp(){

        underTest = new VirtualPetShelter;
    }

    @Test
     void shouldCreateClassAndAddToArrayList(){
        Mammoth tre = new Mammoth("tre", "gray", 6, 2, true) {
            @Override
            public String petName() {
                return null;
            }
        };
        underTest.shelterList().add("tre");
        assertEquals("Tre" ,underTest.shelterList().get(0).petName());
    }

}
