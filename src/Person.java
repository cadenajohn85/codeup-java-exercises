public class Person {

    private String name;

    // returns the person's name
    public String getName() {
//        return name;
        return this.name; // Best practice
    }

    // changes the name property to the passed value
    public void setName(String newName) {
//        name = newName;
        this.name = newName; // Best practice
    }

    // prints a message to the console using the person's name
    public void sayHello() {
//        System.out.println("Hello, I'm " + name + "!");
        System.out.println("Hello, I'm " + this.getName() + "!"); // Preserve any formatting I did in my getter, rather than displaying my unformatted variable
    }

    //Constructor
    public Person(String someName) {
//        this.name = someName;
        setName(someName); // Use the setter to preserve any special processes, e.g., password hashing
    }

    public static void main(String[] args) {
//        Person john = new Person("John");
//        System.out.println(john.getName());
//        john.sayHello();
//        john.setName("John Michael Cadena");
//        john.sayHello();

        // Problem 2.1

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // expect true
//        System.out.println(person1 == person2); // expect false because the instance IDs are different

        // Problem 2.2

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // expect true because person2 is just an alias of person1

        // Problem 2.3

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());  // Expect "John"
        System.out.println(person2.getName()); // Expect "John"
        person2.setName("Jane");
        System.out.println(person1.getName()); // Expect "John" --> wrong because this is an alias, not a different object
        System.out.println(person2.getName()); // Expect "Jane"






    }

}
