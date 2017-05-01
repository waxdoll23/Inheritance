import Humans.Human;
import Humans.SuperHuman;
import rotateArray.RotateArray;

import java.util.ArrayList;

/**
 * Created by jennifermcginty on 5/1/17.
 */
public class Main {
    public static void main(String [] args){
        Human jennifer = new Human("Jennifer", 26 ,true,  "Student",  "Wilmington");
        RotateArray rotate = new RotateArray();
        SuperHuman heroIdenty = new SuperHuman("Jennifer", 26, true, "Student", "Wilmington", true, "Tuesday", "Shrinking");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(rotate.rotate(numbers,2));
        System.out.println(jennifer);
        System.out.println(heroIdenty);


    }
}
