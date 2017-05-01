package rotateArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jennifermcginty on 5/1/17.
 */
public class RotateArray {

    public static <T> ArrayList <T> rotate(List<T> arrayList, int move){
        ArrayList newList = new ArrayList<>(arrayList);
        Collections.rotate(newList, move);
        return newList;
    }
}
