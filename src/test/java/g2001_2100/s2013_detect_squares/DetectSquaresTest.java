package g2001_2100.s2013_detect_squares;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class DetectSquaresTest {
    @Test
    void detectSquaresTest() {
        DetectSquares detectSquares = new DetectSquares();
        detectSquares.add(new int[] {3, 10});
        detectSquares.add(new int[] {11, 2});
        detectSquares.add(new int[] {3, 2});
        assertThat(detectSquares.count(new int[] {11, 10}), equalTo(1));
        assertThat(detectSquares.count(new int[] {14, 8}), equalTo(0));
        detectSquares.add(new int[] {11, 2});
        assertThat(detectSquares.count(new int[] {11, 10}), equalTo(2));
    }
}
