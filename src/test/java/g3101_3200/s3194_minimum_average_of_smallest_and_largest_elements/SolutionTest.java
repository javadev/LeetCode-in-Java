package g3101_3200.s3194_minimum_average_of_smallest_and_largest_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumAverage() {
        assertThat(
                new Solution().minimumAverage(new int[] {7, 8, 3, 4, 15, 13, 4, 1}), equalTo(5.5));
    }

    @Test
    void minimumAverage2() {
        assertThat(new Solution().minimumAverage(new int[] {1, 9, 8, 3, 10, 5}), equalTo(5.5));
    }

    @Test
    void minimumAverage3() {
        assertThat(new Solution().minimumAverage(new int[] {1, 2, 3, 7, 8, 9}), equalTo(5.0));
    }
}
