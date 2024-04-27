package g3101_3200.s3122_minimum_number_of_operations_to_satisfy_conditions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(
                new Solution().minimumOperations(new int[][] {{1, 0, 2}, {1, 0, 2}}), equalTo(0));
    }

    @Test
    void minimumOperations2() {
        assertThat(
                new Solution().minimumOperations(new int[][] {{1, 1, 1}, {0, 0, 0}}), equalTo(3));
    }
}
