package homeWorkPart2.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.nio.file.Path;


public class Main {

    public static void main(String[] args) {

        listOfFilesAndDirectories("src/main/java/homeWorkPart2");
    }

    public static void listOfFilesAndDirectories(String directoryPath) {
        try {
            Files.list(Paths.get(directoryPath))
                    .map(Path::toString)
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
