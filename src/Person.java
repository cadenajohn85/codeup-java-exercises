public class Person {

    private String name;

    // returns the person's name
    public String getName() {
        return name;
    }
    // changes the name property to the passed value
    public void setName(String newName) {
        name = newName;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello, I'm " + name + "!");
    }

    //Constructor
    public Person(String someName) {
        this.name = someName;
    }

    public static void main(String[] args) {
        Person john = new Person("John");
        System.out.println(john.getName());
        john.sayHello();
        john.setName("John Michael Cadena");
        john.sayHello();
    }

}
