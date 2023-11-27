package homeWorkPart2.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.nio.file.Path;


public class Main {

    public static void main(String[] args) {

        listOfFilesAndDirectories("src/main/java/homeWorkPart2");
        readLineByLine("src/main/java/homeWorkPart2/io/toBeOrNotToBe.txt");

        String text = "\nWilliam Shakespeare (1564-1616) was an English playwright, poet, and actor, widely regarded as the greatest writer in the English language and the world's greatest dramatist.";
        appendToFile("src/main/java/homeWorkPart2/io/toBeOrNotToBe.txt", text);
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

    public static void readLineByLine(String directoryPath) {

        try (BufferedReader reader = new BufferedReader(new FileReader(directoryPath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendToFile(String filePath, String content) {

        //append has to be true, so it doesn't overwrite the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

