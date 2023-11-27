package homeWorkPart1.task10;

import java.util.ArrayList;
import java.util.Collection;

public class SDAArrayList<T> extends ArrayList<T> {

    public void display() {
        for (T elem : this) {
            System.out.println(elem + " ");
        }
        System.out.println();
    }

    @Override
    //Appends the specified element to the end of this list
    public boolean add(T elem) {
        System.out.println("Element " + elem + " added successfully!");
        return super.add(elem);
    }

    //Remove element at specific index
    public void removeAtSpecifiedIndex(int index) {
        if (index >= 0 && index < size()) {
            T removed = remove(index);
            System.out.println(removed + " is removed");
        } else {
            System.out.println("Try again, wrong input");
        }
    }

    public boolean addAll(Collection<? extends T> collection) {
        for (T element : collection) {
            add(element);
        }
        return true; // Assuming add is always successful
    }
}
