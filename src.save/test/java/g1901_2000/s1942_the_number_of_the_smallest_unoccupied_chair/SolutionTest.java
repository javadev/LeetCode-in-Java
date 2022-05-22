package g1901_2000.s1942_the_number_of_the_smallest_unoccupied_chair;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestChair() {
        assertThat(
                new Solution().smallestChair(new int[][] {{1, 4}, {2, 3}, {4, 6}}, 1), equalTo(1));
    }

    @Test
    void smallestChair2() {
        assertThat(
                new Solution().smallestChair(new int[][] {{3, 10}, {1, 5}, {2, 6}}, 0), equalTo(2));
    }
}
