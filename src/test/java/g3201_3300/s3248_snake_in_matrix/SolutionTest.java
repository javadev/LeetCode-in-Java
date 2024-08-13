package g3201_3300.s3248_snake_in_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

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
}
