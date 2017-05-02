package rotateArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jennifermcginty on 5/1/17.
 */
public class RotateArray extends ArrayList{

    public void rotateAmount(ArrayList moveIndex, int k ){

        for(int i = 0; i < k ; i++){

            moveIndex.add(moveIndex.get(0));

            moveIndex.remove(moveIndex.get(0));

        }
        System.out.println("Rotated Array :" + moveIndex);
    }
//    public static <T> ArrayList <T> rotate(List<T> arrayList, int move){
//        ArrayList newList = new ArrayList<>(arrayList);
//        Collections.rotate(newList, move);
//        return newList;
//    }


}
