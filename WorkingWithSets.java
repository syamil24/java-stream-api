import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        // Order is not guarantee in Set, so you cannot get specific elements in Sets
        // Stack doesnt allow duplicate
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.add(new Ball("black"));
        balls.add(new Ball("red")); // the size of stack will still same since red is a duplicate value
        balls.remove(new Ball("red"));

        balls.forEach(System.out::println);

        Set<Ball2> balls2 = new HashSet<>();
        balls2.add(new Ball2("pink"));
        balls2.add(new Ball2("white"));
        balls2.add(new Ball2("orange"));
        balls2.add(new Ball2("white")); // in this case white will still there since it is comparing from different memory address

        System.out.println();

        balls2.forEach(System.out::println);
    }

    static record Ball(String color){}

    static class Ball2{
        String color;

        public Ball2(String color){
            this.color = color;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
