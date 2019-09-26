package inheritancePractice;

public class Dog extends Animal {

    private String name;
    private String breed;

    public Dog(int someAge, boolean isAlive, String name, String breed) {
        super("Dog", someAge, isAlive);
        this.name = name;
        this.breed = breed;
    }

    public Dog(String someSpecies, int someAge, boolean isAlive) {
        super(someSpecies, someAge, isAlive);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

}
