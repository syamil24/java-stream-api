import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithHasHFunction {
    public static void main(String[] args) {
        Map<Person, Diamond>  newMap = new HashMap<>();
        newMap.put(new Person("Name1"), new Diamond("Diamond1"));
        newMap.put(new Person("Name2"), new Diamond("Diamond2"));
        newMap.put(new Person("Name3"), new Diamond("Diamond3"));

        System.out.println(newMap.get(new Person("Name3"))); // if we didnt overwrite the HashCode it will just return null since different hashCode created
        System.out.println(newMap.get(new Person("Name3")).hashCode());
        System.out.println(newMap.get(new Person("Name3")).hashCode());
    }

    static class Person{
        String name;

        public Person(String name){
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    static class Diamond{
        String diamondName;

        public Diamond(String name){
            this.diamondName = name;
        }
    }
}
