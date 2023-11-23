package homeWorkPart1.task10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SDAArrayList<String> myList = new SDAArrayList<>();
        myList.add("Hello");
        myList.addAll(Arrays.asList("Java", "I", "like", "you"));
        myList.display();
        String oneElem = myList.get(1);
        System.out.println("Best element in my array is \"" + oneElem + "\"");
        myList.remove(0);
        myList.display();
    }
}
