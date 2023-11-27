package homeWorkPart2.io;

import static org.junit.jupiter.api.Assertions.*;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IOTest {

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

    @Test
    public void testReadLineByLine() {

        // Redirect System.out to capture the printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.readLineByLine("src/main/java/homeWorkPart2/io/toBeOrNotToBe.txt");

        // Reset System.out
        System.setOut(System.out);

        // Verify the output
        String expectedOutput = """
                To be or not to be, that is the question: Whether 'tis nobler in the
                mind to suffer The slings and arrows of outrageous fortune, Or to take
                arms against a sea of troubles And, by opposing, end them.
                To die: to sleep;
                No more; and by a sleep to say we end The heart-ache and the thousand
                natural shocks That flesh is heir to, 'tis a consummation Devoutly to be wish'd.
                To die, to sleep;
                Author: William Shakespeare (Hamlet, Act 3, Scene 1)""";

        assertEquals(expectedOutput, outputStream.toString().replaceAll("\\r\\n", "\n").trim());
    }
}