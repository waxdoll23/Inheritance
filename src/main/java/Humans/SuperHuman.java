package Humans;

/**
 * Created by jennifermcginty on 5/1/17.
 */
public class SuperHuman extends Human {
    boolean isGood;
    String heroName;
    String superAbility;


    public SuperHuman(String name, int age, boolean isFemale, String occupation, String address, boolean isGood, String heroName, String superAbility) {
        super(name, age, isFemale, occupation, address);
        this.isGood = isGood;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

    public boolean getisGood(){

        return this.isGood;
    }

    public void setisGood(){

        this.isGood = isGood;
    }

    public String getHeroName() {
        return this.heroName;
    }

    public void setHeroName(){

        this.heroName = heroName;
    }

    public String getSuperAbility(){

        return this.superAbility;
    }

    public void setSuperAbility(){

        this.superAbility = superAbility;
    }

    @Override

    public String toString (){
        return this.heroName + ", " + "Your good? " + this.isGood + ", " + this.superAbility;
    }
}
