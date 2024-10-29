package g3301_3400.s3336_find_the_number_of_subsequences_with_equal_gcd;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subsequencePairCount() {
        assertThat(new Solution().subsequencePairCount(new int[] {1, 2, 3, 4}), equalTo(10));
    }

    @Test
    void subsequencePairCount2() {
        assertThat(new Solution().subsequencePairCount(new int[] {10, 20, 30}), equalTo(2));
    }
}
