package inheritancePractice;

public class Animal {

    private String species;
    private int age;
    private boolean isAlive;

    public Animal(String someSpecies, int someAge, boolean isAlive) {
        this.species = someSpecies;
        this.age = someAge;
        this.isAlive = isAlive;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }



}
