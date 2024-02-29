package g3001_3100.s3022_minimize_or_of_remaining_elements_using_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOrAfterOperations() {
        assertThat(new Solution().minOrAfterOperations(new int[] {3, 5, 3, 2, 7}, 2), equalTo(3));
    }

    @Test
    void minOrAfterOperations2() {
        assertThat(
                new Solution().minOrAfterOperations(new int[] {7, 3, 15, 14, 2, 8}, 4), equalTo(2));
    }

    @Test
    void minOrAfterOperations3() {
        assertThat(
                new Solution().minOrAfterOperations(new int[] {10, 7, 10, 3, 9, 14, 9, 4}, 1),
                equalTo(15));
    }
}
