import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args ) {

    // Problem 1.1

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); // We get a reference ID for the array object
//        System.out.println(Arrays.toString(numbers)); //

    // Problem 1.2

        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Victor");
        people[2] = new Person("Mel");

//        for(Person person : people) {
//            System.out.println("person.getName() = " + person.getName());
//        }

    // Problem 1.3
        Person[] morePeople = addPerson(people, new Person("Larry"));
        for(Person person : morePeople) {
            System.out.println("person.getName() = " + person.getName());
        }

    }

    private static Person[] addPerson(Person[] arrayOfPeople, Person somePerson) {
        Person[] output = Arrays.copyOf(arrayOfPeople, arrayOfPeople.length + 1);
        output[output.length - 1] = somePerson;
        return output;
    }

}
