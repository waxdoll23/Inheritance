import Humans.Human;
import Humans.SuperHuman;
import rotateArray.RotateArray;

import java.util.ArrayList;

/**
 * Created by jennifermcginty on 5/1/17.
 */
public class Main {
    public static void main(String [] args){
        RotateArray rotateArray = new RotateArray();

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
    }
}
