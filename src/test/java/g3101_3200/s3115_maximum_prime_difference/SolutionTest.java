package g3101_3200.s3115_maximum_prime_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumPrimeDifference() {
        assertThat(new Solution().maximumPrimeDifference(new int[] {4, 2, 9, 5, 3}), equalTo(3));
    }

    @Test
    void maximumPrimeDifference2() {
        assertThat(new Solution().maximumPrimeDifference(new int[] {4, 8, 2, 8}), equalTo(0));
    }
}
