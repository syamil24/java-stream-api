import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList<Person> personList = new LinkedList<>();
        personList.add(new Person(34, "Abc"));
        personList.add(new Person(33, "syamil"));
        personList.add(new Person(13, "Ahmad"));
        personList.addLast(new Person(11, "Name1"));
        personList.add(3, new Person(12, "Name2")); // add to specific index


        ListIterator<Person> personListIterator = personList.listIterator();

        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    static record Person(int age, String name){

    }
}
