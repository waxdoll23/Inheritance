import rotateArray.RotateArray;

import java.util.ArrayList;

/**
 * Created by jennifermcginty on 5/1/17.
 */
public class Main {
    public static void main(String [] args){

        RotateArray rotate = new RotateArray();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.print(rotate.rotate(numbers,2));
    }
}
