package g3201_3300.s3248_snake_in_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void finalPositionOfSnake() {
        assertThat(new Solution().finalPositionOfSnake(2, List.of("RIGHT", "DOWN")), equalTo(3));
    }

    @Test
    void finalPositionOfSnake2() {
        assertThat(
                new Solution().finalPositionOfSnake(3, List.of("DOWN", "RIGHT", "UP")), equalTo(1));
    }

    @Test
    void testFinalPositionOfSnake_AllCommands() {
        List<String> commands = List.of("UP", "DOWN", "LEFT", "RIGHT");
        int result = new Solution().finalPositionOfSnake(3, commands);
        assertEquals(4, result);
    }

    @Test
    void testFinalPositionOfSnake_OnlyUp() {
        List<String> commands = List.of("UP", "UP");
        int result = new Solution().finalPositionOfSnake(3, commands);
        assertEquals(0, result);
    }

    @Test
    void testFinalPositionOfSnake_OnlyDown() {
        List<String> commands = List.of("DOWN", "DOWN");
        int result = new Solution().finalPositionOfSnake(3, commands);
        assertEquals(6, result);
    }

    @Test
    void testFinalPositionOfSnake_OnlyLeft() {
        List<String> commands = List.of("LEFT", "LEFT");
        int result = new Solution().finalPositionOfSnake(3, commands);
        assertEquals(0, result);
    }

    @Test
    void testFinalPositionOfSnake_OnlyRight() {
        List<String> commands = List.of("RIGHT", "RIGHT");
        int result = new Solution().finalPositionOfSnake(3, commands);
        assertEquals(2, result);
    }

    @Test
    void testFinalPositionOfSnake_EmptyCommands() {
        List<String> commands = List.of();
        int result = new Solution().finalPositionOfSnake(3, commands);
        assertEquals(0, result);
    }

    @Test
    void testFinalPositionOfSnake_MixedCommands() {
        List<String> commands = List.of("DOWN", "RIGHT", "UP", "LEFT", "UP", "DOWN", "RIGHT");
        int result = new Solution().finalPositionOfSnake(3, commands);
        assertEquals(4, result);
    }

    @Test
    void testFinalPositionOfSnake_InvalidCommands() {
        List<String> commands = List.of("DOWN", "RIGHT", "JUMP", "LEFT", "UP", "DOWN", "RIGHT");
        int result = new Solution().finalPositionOfSnake(3, commands);
        assertEquals(4, result);
    }
}
