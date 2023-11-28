package homeWorkPart2.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.nio.file.Path;


public class Main {

    public static void main(String[] args) {

        listOfFilesAndDirectories("src/main/java/homeWorkPart2");
        readLineByLine("src/main/java/homeWorkPart2/io/toBeOrNotToBe.txt");

        String text = "\nWilliam Shakespeare (1564-1616) was an English playwright, poet, and actor, widely regarded as the greatest writer in the English language and the world's greatest dramatist.";
        appendToFile("src/main/java/homeWorkPart2/io/toBeOrNotToBe.txt", text);

        System.out.println(findLongestWord("src/main/java/homeWorkPart2/io/toBeOrNotToBe.txt"));
        List<User> users = csvParser("src/main/java/homeWorkPart2/io/users.txt");

        for (User user : users) {
            System.out.println(user);
        }
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

                    String cleanWord = word.replaceAll("[^a-zA-Z]", "");

                    if (cleanWord.length() > longestWord.length()) {
                        longestWord = cleanWord;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The length of the longest word is " + longestWord.length() + " characters.");
        return longestWord;
    }

    public static List<User> csvParser(String filePath) {

        List<User> users = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(",");
                if (words.length == 3) {
                    String name = words[0];
                    String surname = words[1];
                    int age = Integer.parseInt(words[2]);

                    User user = new User(name, surname, age);
                    users.add(user);
                } else {
                    System.out.println("Invalid format: " + line);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return users;
    }
}

