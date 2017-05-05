package petsPolymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by jennifermcginty on 5/4/17.
 */
public class PetFactoryTest {
        @Test
        public void addPetsToListTest() {
            // Given
            PetFactory petFactory = new PetFactory();
            Pet expectedPet = new Pet("Fred", "Pet");

            // When
            petFactory.addPetToList(expectedPet);
            ArrayList<Pet> pets = petFactory.getPetList();
            Pet rescuedPet = pets.get(0);

            // Then
            Assert.assertEquals(expectedPet, rescuedPet);
        }
    }



