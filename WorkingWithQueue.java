import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Ahmad", 23));
        supermarket.add(new Person("Acai", 21));
        supermarket.add(new Person("TestName", 24));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek()); //return first element
        System.out.println(supermarket.poll()); //remove and return first element
        System.out.println(supermarket.size());


    }

    static record Person (String name, int age){

    }

}


