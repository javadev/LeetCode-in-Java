package g3301_3400.s3363_find_the_maximum_number_of_fruits_collected;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxCollectedFruits() {
        assertThat(
                new Solution()
                        .maxCollectedFruits(
                                new int[][] {
                                    {1, 2, 3, 4}, {5, 6, 8, 7}, {9, 10, 11, 12}, {13, 14, 15, 16}
                                }),
                equalTo(100));
    }

    @Test
    void maxCollectedFruits2() {
        assertThat(new Solution().maxCollectedFruits(new int[][] {{1, 1}, {1, 1}}), equalTo(4));
    }
}
