package homeWorkPart2.generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        //#1
        Pair<String, List<Integer>> stringIntegerListPair = new Pair<>("I'm a string", List.of(1, 2, 3, 4, 5));
        System.out.println(stringIntegerListPair);

        List<String> stringList = Arrays.asList("one", "two", "three");
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        Pair<List<String>, List<Double>> stringListDoubleListPair = new Pair<>(stringList, doubleList);
        System.out.println(stringListDoubleListPair);

        //#2
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int count = countIf(numbers, (Integer n) -> n >= 2 && n < 6);
        System.out.println(count);

        //#3
        String[] words = {"you", "me", "you and me", "we"};
        String[] swapperWords = swap(words, 0, 3);
        System.out.println(Arrays.toString(swapperWords));

        //#4
        MediaLibrary<Book> bookLibrary = new MediaLibrary<>();
        bookLibrary.addMedia(new Book("Head First Java", List.of("Kathy Sierra", "Bert Bates")));
        bookLibrary.addMedia(new Book("Learning React", List.of("Alex Banks", "Eve Porcello")));

        bookLibrary.display();
    }

    public static <T> int countIf(T[] array, Predicate<T> condition) {
        int count = 0;
        for (T element : array) {
            if (condition.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static <T> T[] swap(T[] array, int index1, int index2) {

        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indices");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

}
