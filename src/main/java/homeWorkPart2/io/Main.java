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

        System.out.println(findLongestWord("src/main/java/homeWorkPart2/io/toBeOrNotToBe.txt"));
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

    public static String findLongestWord(String filePath) {

        String longestWord = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {

                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The length of the longest word is " + longestWord.length() + " characters.");
        return longestWord;
    }
}

