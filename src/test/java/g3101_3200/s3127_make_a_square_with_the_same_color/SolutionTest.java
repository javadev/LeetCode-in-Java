package g3101_3200.s3127_make_a_square_with_the_same_color;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canMakeSquare() {
        assertThat(
                new Solution()
                        .canMakeSquare(
                                new char[][] {{'B', 'W', 'B'}, {'B', 'W', 'W'}, {'B', 'W', 'B'}}),
                equalTo(true));
    }

    @Test
    void canMakeSquare2() {
        assertThat(
                new Solution()
                        .canMakeSquare(
                                new char[][] {{'B', 'W', 'B'}, {'W', 'B', 'W'}, {'B', 'W', 'B'}}),
                equalTo(false));
    }

    @Test
    void canMakeSquare3() {
        assertThat(
                new Solution()
                        .canMakeSquare(
                                new char[][] {{'B', 'W', 'B'}, {'B', 'W', 'W'}, {'B', 'W', 'W'}}),
                equalTo(true));
    }
}
