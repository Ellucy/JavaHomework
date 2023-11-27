package homeWorkPart2.io;

import static org.junit.jupiter.api.Assertions.*;

import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOTest {

    private static final String TEST_FILE_PATH = "src/test/java/resources/testFile.txt";
    private static final String CONTENT_TO_APPEND = "Content to append.";
    private static final String ORIGINAL_FILE_PATH = "src/main/java/homeWorkPart2/io/toBeOrNotToBe.txt";
    private static final String ANOTHER_TEST_FILE_PATH = "src/test/java/resources/anotherTestFile.txt";
    private static final String TEST_FILE_PATH_3 = "src/test/java/resources/testFile3.txt";

    private ByteArrayOutputStream outputStream;

    String expectedOutput = """
                To be or not to be, that is the question: Whether 'tis nobler in the
                mind to suffer The slings and arrows of outrageous fortune, Or to take
                arms against a sea of troubles And, by opposing, end them.
                To die: to sleep;
                Author: William Shakespeare (Hamlet, Act 3, Scene 1)""";


    @Test
    public void testListOfFilesAndDirectories() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.listOfFilesAndDirectories("src/main/java/homeWorkPart2/generics");

        // Reset System.out
        System.setOut(System.out);

        // Verify the output
        String expectedOutput =
                "src/main/java/homeWorkPart2/generics/Pair.java\n" +
                        "src/main/java/homeWorkPart2/generics/MediaLibrary.java\n" +
                        "src/main/java/homeWorkPart2/generics/Book.java\n" +
                        "src/main/java/homeWorkPart2/generics/Main.java\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @BeforeEach
    public void setUpReadBYLine() throws IOException {

        Files.write(Path.of(ANOTHER_TEST_FILE_PATH), expectedOutput.getBytes());
        // Redirect System.out to capture the printed output
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDownReadBYLine() throws IOException {
        // Reset System.out
        System.setOut(System.out);

        // Clean up the temporary file
        Files.deleteIfExists(Path.of(ANOTHER_TEST_FILE_PATH));
    }

    @BeforeEach
    public void setUp() throws IOException {
        // Create a test file with initial content
        Path filePath = Paths.get(TEST_FILE_PATH);
        Files.write(filePath, "Initial content.".getBytes());
        System.out.println("Test file created at: " + filePath.toAbsolutePath());
    }

    @AfterEach
    public void tearDown() throws IOException {
        // Delete the test file after each test
        Files.deleteIfExists(Paths.get(TEST_FILE_PATH));
    }

    @BeforeEach
    public void setUpGetLongestWord() throws IOException {
        Files.write(Path.of(TEST_FILE_PATH_3), "To be or not to be, that is the question".getBytes());
    }

    @AfterEach
    public void tearDownLongestWord() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE_PATH_3));
    }

    @Test
    public void testReadLineByLine() {

        Main.readLineByLine(ANOTHER_TEST_FILE_PATH);

        assertEquals(expectedOutput, outputStream.toString().replaceAll("\\r\\n", "\n").trim());
    }

    @Test
    public void testAppendToFile() throws IOException {
        // Append content to the test file
        Main.appendToFile(TEST_FILE_PATH, CONTENT_TO_APPEND);

        // Read the content of the file after appending
        String appendedContent = readFromFile(TEST_FILE_PATH);

        // Verify that the content has been appended
        assertTrue(appendedContent.contains("Initial content.")); // Already existing content
        assertTrue(appendedContent.contains(CONTENT_TO_APPEND));  // Appended content
    }

    @Test
    public void testFindLongestWord() {
        String longestWord = Main.findLongestWord(TEST_FILE_PATH_3);
        assertEquals("question", longestWord);
    }

    private String readFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        }
    }
}