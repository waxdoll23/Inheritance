import Humans.Human;
import Humans.SuperHuman;
import classManager.InventoryManager;
import classManager.Product;
import petsPolymorphism.Pet;
import petsPolymorphism.PetFactory;
import rotateArray.RotateArray;

import java.util.ArrayList;

/**
 * Created by jennifermcginty on 5/1/17.
 */
public class Main {
    public static void main(String [] args){

        PetFactory petFactory = new PetFactory();

        petFactory.addPetsToList(petFactory.createPets());

        for(Pet pet : petFactory.getPetList()) {
            System.out.println(pet.speak());
        }
    }
}
