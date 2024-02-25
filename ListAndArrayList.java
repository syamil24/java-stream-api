import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {

    public static void main(String[] args) {
        //Below is immutable list where you cannot edit and add inside the list
        List<String > immutableList = List.of("pink", "yellow");

        List<String> colors = new ArrayList<>();
        colors.add("purple");
        colors.add("green");
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.size());

        for (String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
