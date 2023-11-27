package homeWorkPart1.tasks2and3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MovableCircleTest {

    @Test
    public void testMoveUp() {

        //given
        Movable circle = new MovableCircle(2, 3, 1, 2, 3.5);
        assertEquals("MovableCircle with center MovablePoint at (2, 3). Radius= 3.5", circle.toString(), "Original MovableCircle");

        //when
        circle.moveUp();

        //then
        assertEquals("MovableCircle with center MovablePoint at (2, 1). Radius= 3.5", circle.toString(), "After moving up");

    }

    @Test
    public void testMoveDown() {

        //given
        Movable circle = new MovableCircle(2, 3, 1, 2, 3.5);
        assertEquals("MovableCircle with center MovablePoint at (2, 3). Radius= 3.5", circle.toString(), "Original MovableCircle");

        //when
        circle.moveDown();

        //then
        assertEquals("MovableCircle with center MovablePoint at (2, 5). Radius= 3.5", circle.toString(), "After moving down");
    }

    @Test
    public void testMoveLeft() {

        //given
        Movable circle = new MovableCircle(2, 3, 1, 2, 3.5);
        assertEquals("MovableCircle with center MovablePoint at (2, 3). Radius= 3.5", circle.toString(), "Original MovableCircle");

        //when
        circle.moveLeft();

        //then
        assertEquals("MovableCircle with center MovablePoint at (1, 3). Radius= 3.5", circle.toString(), "After moving left");
    }

    @Test
    public void testMoveRight() {

        //given
        Movable circle = new MovableCircle(2, 3, 1, 2, 3.5);
        assertEquals("MovableCircle with center MovablePoint at (2, 3). Radius= 3.5", circle.toString(), "Original MovableCircle");

        //when
        circle.moveRight();

        //then
        assertEquals("MovableCircle with center MovablePoint at (3, 3). Radius= 3.5", circle.toString(), "After moving right");

    }
}