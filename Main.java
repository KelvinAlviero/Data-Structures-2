import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Black");
        for (String i : colors) {
            System.out.println(i);
        }
        colors.add(2, "Green");
        colors.remove(1);
        System.out.println("Array:" + colors);


    }
}