package classManager;

import java.util.ArrayList;

/**
 * Created by jennifermcginty on 5/2/17.
 */
public class InventoryManager extends Product {
    ArrayList<Double> totalValue = new ArrayList();


    public double addItemToCount(double amount, double price) {
        double valueOfSingleType = amount * price;
        return valueOfSingleType;
    }

    public boolean addValueToList(double singleTypeValue) {
        return totalValue.add(singleTypeValue);

    }

    public double calculateTotalValueOfProductsInInventory(ArrayList<Double> totalValue) {
        double totalValueOfAllProducts=0;
        for (int i = 0; i < totalValue.size(); i++) {
            totalValueOfAllProducts +=totalValue.get(i);

        }
        return totalValueOfAllProducts;


    }

}
