import classManager.InventoryManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jennifermcginty on 5/2/17.
 */
public class ClassMangrerTest {

    @Test
    public void addItemToCountTest(){
        InventoryManager inventoryMangerTest = new InventoryManager();

        double expected = 4;
        double actual = inventoryMangerTest.addItemToCount(1,3);

        assertEquals("Testing if it adds one to the count", expected , actual, .05);
    }

}
