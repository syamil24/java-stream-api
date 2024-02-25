import java.util.Arrays;
import java .util.List;
import java.util.function.Predicate;

public class StreamDemo {

    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(4,3,6,7,8,9);
        List <String> nums2 = Arrays.asList("ABC", "ABB", "ABA", "CDV");

        Predicate<Integer> test = n -> n%2==0;

        int result = nums.stream()
                .filter(test)
                .sorted()
                .map(n -> n*2)
                .reduce(0,(c,e) -> c+e);
//                .forEach(n -> System.out.println(n));

        System.out.println(result);

//        Stream<Integer> data = nums.stream();
//        Stream<String> data2 = nums2.stream();
//
//        data.map(values -> values*2);
//        long count = data.count();
//        System.out.println(count);
//        Stream<Integer> sortedData = data.sorted();
//        Stream<String> sortedData2 = data2.sorted();
//
//        sortedData.forEach(number -> System.out.println(number));
//        sortedData2.forEach(word -> System.out.println(word));
    }
}
