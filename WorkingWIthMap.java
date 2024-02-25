import java.util.HashMap;
import java.util.Map;

public class WorkingWIthMap {
    public static void main(String[] args) {
        // Map is very fast in lookup since the key will be hash using HashCode
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person(12, "Alex"));
        personMap.put(2, new Person(13, "Alex2"));
        personMap.put(3, new Person(13, "Alex3"));
        personMap.put(3, new Person(14, "Alex4")); // previous key value will be override if the key is duplicate

        System.out.println(personMap);
        System.out.println(personMap.get(1));
        System.out.println(personMap.containsKey(5));
        System.out.println(personMap.entrySet());
        System.out.println(personMap.keySet());

        personMap.entrySet().forEach(System.out::println);
        personMap.entrySet().forEach(x -> {
            System.out.println(x.getKey() +"= Value is" + x.getValue());
        });
        personMap.forEach((id, person) -> {
            System.out.println("Id is - " + id);
        });

        personMap.remove(1);
        System.out.println(personMap.getOrDefault(5, new Person(1, "Alex5")));
        System.out.println(personMap);
        System.out.println(personMap.values());
    }
    static record Person(int age, String name){}
}
