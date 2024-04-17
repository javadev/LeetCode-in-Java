package g3001_3100.s3082_find_the_sum_of_the_power_of_all_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfPower() {
        assertThat(new Solution().sumOfPower(new int[] {2, 3, 3}, 5), equalTo(4));
    }

    @Test
    void sumOfPower2() {
        assertThat(new Solution().sumOfPower(new int[] {1, 2, 3}, 7), equalTo(0));
    }
}
