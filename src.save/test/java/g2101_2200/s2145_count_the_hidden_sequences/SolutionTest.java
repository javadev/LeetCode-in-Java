package g2101_2200.s2145_count_the_hidden_sequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfArrays() {
        assertThat(new Solution().numberOfArrays(new int[] {1, -3, 4}, 1, 6), equalTo(2));
    }

    @Test
    void numberOfArrays2() {
        assertThat(new Solution().numberOfArrays(new int[] {3, -4, 5, 1, -2}, -4, 5), equalTo(4));
    }

    @Test
    void numberOfArrays3() {
        assertThat(new Solution().numberOfArrays(new int[] {4, -7, 2}, 3, 6), equalTo(0));
    }

    @Test
    void numberOfArrays4() {
        assertThat(new Solution().numberOfArrays(new int[] {4, -7, 2}, 3, 3), equalTo(0));
    }
}
