package classManager;

import java.util.ArrayList;

/**
 * Created by jennifermcginty on 5/2/17.
 */
public class Product extends ArrayList {
    String id;
    int price;
    int amount;

    public  Product(){

    }

    public Product(String id, int price, int amount){
        this.id = id;
        this.price = price;
        this. amount = amount;
    }


    public String getId(){
        return this.id;
    }

    public void setId(){
        this.id = id;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(){
        this.price = price;
    }

    public void setAmount(){
      this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

}
