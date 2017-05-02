package classManager;

/**
 * Created by jennifermcginty on 5/2/17.
 */
public class InventoryManager extends Product {


    public double addItemToCount(int amount, int price){
        int results = amount * price;
        System.out.print("The values of this product type is " + results);
        return  results;
    }

}
