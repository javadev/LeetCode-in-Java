package g1501_1600.s1539_kth_missing_positive_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findKthPositive() {
        assertThat(new Solution().findKthPositive(new int[] {2, 3, 4, 7, 11}, 5), equalTo(9));
    }

    @Test
    void findKthPositive2() {
        assertThat(new Solution().findKthPositive(new int[] {1, 2, 3, 4}, 2), equalTo(6));
    }
}
