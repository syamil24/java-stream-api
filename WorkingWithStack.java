import java.util.List;
import java.util.Stack;

public class WorkingWithStack {

    public static void main(String[] args) {
        // stack is a lil bit slower since the method use syunchronized to cater for multi threaded environment
        // Stack extends from Vector
        // Vector is used for multi threaded environment, if multi threaded is not a concern then just use List
        Stack<Integer> numbers = new Stack<>();
        numbers.push(3);
        numbers.push(4);
        numbers.push(4);
        numbers.push(2);
        System.out.println(numbers.peek()); //first element of the stack
        System.out.println(numbers.size());
        System.out.println(numbers.pop());
        System.out.println(numbers.size());
        System.out.println(numbers.empty());

        List<Integer> numbers2 = new Stack<>();
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(4);
        numbers2.add(2);

    }
}
