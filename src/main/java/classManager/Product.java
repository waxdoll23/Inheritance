package classManager;

import java.util.ArrayList;

/**
 * Created by jennifermcginty on 5/2/17.
 */
public class Product {
    String id;
    int price;
    int quanity;

    public  Product(int price, int quanity){

    }

    public Product(String id, int price, int quanity){
        this.id = id;
        this.price = price;
        this.quanity = quanity;
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
      this.quanity = quanity;
    }

    public int getQuanity(){
        return quanity;
    }

}
