//import java.util.PriorityQueue;
//import java.uti.Iterator
import java.util.*;

public class Tester {

    public static void main (String[] args){

        PriorityQueue<Person> people = new PriorityQueue<>();

        people.add(new Person("Sam", "Smith"));
        people.add(new Person("Charlie", "Black"));
        people.add(new Person("Betty", "Brown"));
        people.add(new Person("Jessica", "Stewart"));
        people.add(new Person("John", "Friday"));
        people.add(new Person("Frank", "Foley"));

        Iterator<Person> iterator = people.iterator();

        System.out.println("Regular loop: ");
        for (Person person : people){

            System.out.println(person);
        }

        System.out.println();
        System.out.println("Polling: ");
        while (iterator.hasNext()){

            System.out.println(people.poll());
        }

    }
}
