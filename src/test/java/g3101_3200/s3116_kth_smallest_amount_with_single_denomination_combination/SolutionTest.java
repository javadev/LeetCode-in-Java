package g3101_3200.s3116_kth_smallest_amount_with_single_denomination_combination;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findKthSmallest() {
        assertThat(new Solution().findKthSmallest(new int[] {3, 6, 9}, 3), equalTo(9L));
    }

    @Test
    void findKthSmallest2() {
        assertThat(new Solution().findKthSmallest(new int[] {5, 2}, 7), equalTo(12L));
    }
}
