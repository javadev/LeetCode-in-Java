package g3701_3800.s3766_minimum_operations_to_make_binary_palindrome;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        int[] result = new Solution().minOperations(new int[] {5, 6, 7});
        assertThat(result[0], equalTo(0));
        assertThat(result[1], equalTo(1));
        assertThat(result[2], equalTo(0));
    }

    @Test
    void minOperations2() {
        int[] result = new Solution().minOperations(new int[] {10});
        assertThat(result[0], equalTo(1));
    }

    @Test
    void minOperations3() {
        int[] result = new Solution().minOperations(new int[] {1, 2, 3, 4});
        assertThat(result[0], equalTo(0));
        assertThat(result[1], equalTo(1));
        assertThat(result[2], equalTo(0));
        assertThat(result[3], equalTo(1));
    }
}
