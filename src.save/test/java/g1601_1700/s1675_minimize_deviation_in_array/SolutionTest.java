package g1601_1700.s1675_minimize_deviation_in_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDeviation() {
        assertThat(new Solution().minimumDeviation(new int[] {1, 2, 3, 4}), equalTo(1));
    }

    @Test
    void minimumDeviation2() {
        assertThat(new Solution().minimumDeviation(new int[] {4, 1, 5, 20, 3}), equalTo(3));
    }

    @Test
    void minimumDeviation3() {
        assertThat(new Solution().minimumDeviation(new int[] {2, 10, 8}), equalTo(3));
    }
}
