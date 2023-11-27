package homeWorkPart1.task12;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[100];
        System.out.println("Unique Elements: " + returnUniqueElements(array));
        System.out.println("Repeated elements: " + findRepeatedElements(array));
    }

    public static List<Integer> returnUniqueElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 51);
        }

        Set<Integer> uniqueElements = new HashSet<>();
        for (int element : array) {
            uniqueElements.add(element);
        }

        //From Set to List
        return List.copyOf(uniqueElements);
    }

    public static List<Integer> findRepeatedElements(int[] array) {
        Map<Integer, Integer> countNumbers = new HashMap<>();

        for (int number : array) {
            countNumbers.put(number, countNumbers.getOrDefault(number, 0) + 1);
        }

        List<Integer> repeatedElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countNumbers.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedElements.add(entry.getKey());
            }
        }

        return repeatedElements;
    }
}
