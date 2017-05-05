package classManagerTest;

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
    public void valueOfProducts(){
        InventoryManager inventory = new InventoryManager();
        double expectedResult=20;

        //: When
        double actualResult= inventory.calculateValueOfProduct(4,5);

        //: Then

        Assert.assertEquals("should multiply price and quantity", expectedResult, actualResult, 0);


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
