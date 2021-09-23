package virtual_pet;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {
            VirtualPetShelter underTest;

            @BeforeEach
            void setUp() {
                underTest = new VirtualPetShelter();
            }

            @Test
            void shouldCreateClassAndAddToArrayList(){
                Mammoth tre = new Mammoth("Tre", "Gray", 1,2,5,true);
                underTest.shelterList().add(tre);
                assertEquals("Tre", underTest.shelterList().get(0).getPetName());
            }
            @Test
            void should
        }
