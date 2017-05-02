import classManager.InventoryManager;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by jennifermcginty on 5/2/17.
 */
public class ClassMangrerTest {

    @Test
    public void addItemToCountTest(){
        InventoryManager inventoryMangerTest = new InventoryManager();

        double expected = 3;
        double actual = inventoryMangerTest.calculateValueOfProduct(1,3);

        assertEquals("Testing if it adds one to the count", expected , actual, .05);
    }

    @Test
    public void addValueToListTest(){
        InventoryManager inventoryManagerTest = new InventoryManager();
        double singleTypeValue = 8.0;
        boolean actual= inventoryManagerTest.addValueToList(singleTypeValue);

        Assert.assertTrue("Testing if it adds value to the array list", actual);
    }

    @Test
    public void checkAddedValueToListTest(){
        InventoryManager inventoryManagerTest = new InventoryManager();
        ArrayList<Double> totalValue = new ArrayList();
        totalValue.add(6.0);
        totalValue.add(4.0);
        double singleTypeValue=7.0;
        totalValue.add(singleTypeValue);
        double expected = 7.0;
        double actual= totalValue.get(2);

        assertEquals("checking that value was added", expected, actual, 0);

    }

    @Test
    public void calculateTotalValueOfProductsInInventoryTest (){
        InventoryManager inventoryManagerTest = new InventoryManager();
        ArrayList<Double> totalValue = new ArrayList();
        totalValue.add(6.0);
        totalValue.add(4.0);
        totalValue.add(1.0);
        double expected=11.0;
        double actual = inventoryManagerTest.calculateTotalValueOfProductsInInventory(totalValue);

        assertEquals("checking that the values in the array total together", expected, actual, 0);
    }

}
