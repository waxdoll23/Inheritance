package petsPolymorphism;

/**
 * Created by jennifermcginty on 5/5/17.
 */
public class Dog extends Pet{

    public Dog(String petName, String petType){
        super(petType, petName);
    }

    @Override
    public String speak(){
        String greeting = "Woof";
        return greeting;
    }
}
