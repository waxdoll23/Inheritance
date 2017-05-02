package Humans;

/**
 * Created by jennifermcginty on 5/1/17.
 */
public class Human {
    String name;
    int age;
    boolean isFeamle;
    String occupation;
    String address;

    public Human(String name, int age, boolean isFemale, String occupation, String address){
        this.name = name;
        this.age = age;
        this.isFeamle = isFemale;
        this.occupation = occupation;
        this.address = address;
    }

    public String getName(){

        return this.name;
    }

    public void setName(){

        this.name = name;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(){

        this.age = age;
    }

    public boolean getisFemale(){

        return this.isFeamle;
    }

    public void setisFeamle(){

        this.isFeamle = isFeamle;
    }

    public String getOccupation(){

        return this.occupation;
    }

    public void setOccupation(){

        this.occupation = occupation;
    }

    public String getAddress(){

        return this.address;
    }

    public void setAddress(){

        this.address = address;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.age + ", " + this.isFeamle + ", " + this.occupation + ", " + this.address;
    }
}
