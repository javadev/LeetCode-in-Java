package g1401_1500.s1470_shuffle_the_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shuffle() {
        assertThat(
                new Solution().shuffle(new int[] {2, 5, 1, 3, 4, 7}, 3),
                equalTo(new int[] {2, 3, 5, 4, 1, 7}));
    }

    @Test
    void shuffle2() {
        assertThat(
                new Solution().shuffle(new int[] {1, 2, 3, 4, 4, 3, 2, 1}, 4),
                equalTo(new int[] {1, 4, 2, 3, 3, 2, 4, 1}));
    }

    @Test
    void shuffle3() {
        assertThat(
                new Solution().shuffle(new int[] {1, 1, 2, 2}, 2), equalTo(new int[] {1, 2, 1, 2}));
    }
}
