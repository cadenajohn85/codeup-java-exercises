package inheritancePractice;

public class InheritanceTest {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Dog", 13, true, "Rex", "chihuahua");
        System.out.println(dog1.getName());
        dog1.setAge(13);

        Dog dog2 = new Dog("Dog", 9, true);

    }

}
