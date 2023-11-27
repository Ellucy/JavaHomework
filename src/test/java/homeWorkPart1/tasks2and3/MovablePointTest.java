package homeWorkPart1.tasks2and3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MovablePointTest {

    @Test
    public void testMoveUp() {

        //given
        Movable point = new MovablePoint(2, 3, 1, 1);

        assertEquals("MovablePoint at (2, 3)", point.toString(), "Original MovablePoint");

        //when
        point.moveUp();

        //then
        assertEquals("MovablePoint at (2, 2)", point.toString(), "After moving up");
    }

    @Test
    public void testMoveDown() {

        //given
        Movable point = new MovablePoint(2, 3, 1, 1);

        assertEquals("MovablePoint at (2, 3)", point.toString(), "Original MovablePoint");

        //when
        point.moveDown();

        //then
        assertEquals("MovablePoint at (2, 4)", point.toString(), "After moving down");

    }

    @Test
    public void testMoveLeft() {

        //given
        Movable point = new MovablePoint(2, 3, 1, 1);

        assertEquals("MovablePoint at (2, 3)", point.toString(), "Original MovablePoint");

        //when
        point.moveLeft();

        //then
        assertEquals("MovablePoint at (1, 3)", point.toString(), "After moving left");
    }

    @Test
    public void testMoveRight() {

        //given
        Movable point = new MovablePoint(2, 3, 1, 1);

        assertEquals("MovablePoint at (2, 3)", point.toString(), "Original MovablePoint");

        //when
        point.moveRight();

        //then
        assertEquals("MovablePoint at (3, 3)", point.toString(), "After moving right");
    }
}