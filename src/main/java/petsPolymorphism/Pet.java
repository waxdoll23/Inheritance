package petsPolymorphism;

/**
 * Created by jennifermcginty on 5/4/17.
 */
public class Pet {
    String petName;
    String petType;

    public Pet(String petName, String petType) {
        this.petName = petName;
        this.petType = petType;

    }


    public String getPetName() {
        return petName;
    }


    public void setPetName() {
        this.petName = petName;
    }


    public String getPetType() {
        return petType;
    }


    public void setPetType() {

        this.petType = petType;
    }


    public String speak() {
        String greeting = "HELLO HUMAN!";
        return greeting;
    }
}

