package g3401_3500.s3495_minimum_operations_to_make_array_elements_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(new int[][] {{1, 2}, {2, 4}}), equalTo(3L));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(new int[][] {{2, 6}}), equalTo(4L));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(new int[][] {{5, 8}}), equalTo(4L));
    }

    @Test
    void minOperations4() {
        assertThat(new Solution().minOperations(new int[][] {{1, 21}}), equalTo(23L));
    }
}
