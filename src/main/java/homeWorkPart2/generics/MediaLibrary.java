package homeWorkPart2.generics;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary<T> {

    private List<T> mediaList;


    public MediaLibrary() {
        this.mediaList = new ArrayList<>();
    }

    public void addMedia(T media) {
        mediaList.add(media);
    }

    public void display() {
        for (T media : mediaList) {
            System.out.println(media);
        }
    }
}
