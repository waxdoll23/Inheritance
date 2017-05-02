import Humans.Human;
import Humans.SuperHuman;
import classManager.InventoryManager;
import classManager.Product;
import rotateArray.RotateArray;

import java.util.ArrayList;

/**
 * Created by jennifermcginty on 5/1/17.
 */
public class Main {
    public static void main(String [] args){
        RotateArray rotateArray = new RotateArray();
        InventoryManager inventoryManager = new InventoryManager();

        ArrayList rotateThis = new ArrayList();

        {
            for(int i =1; i < 7; i++){
                rotateThis.add(i);
            }
            System.out.println("This is the original array " + rotateThis);
        }

        rotateArray.rotateAmount(rotateThis,3);

        Human jennifer = new Human("Jennifer", 26 ,true,  "Student",  "Wilmington");

        SuperHuman heroIdenty = new SuperHuman("Jennifer", 26, true, "Student", "Wilmington", true, "Tuesday", "Shrinking");


        System.out.println(jennifer);

        System.out.println(heroIdenty);

        Product item = new Product("Phone",300, 6);
        Product book = new Product("Book", 10, 8);

        inventoryManager.addItemToCount(book.getAmount(), book.getPrice());
    }
}
