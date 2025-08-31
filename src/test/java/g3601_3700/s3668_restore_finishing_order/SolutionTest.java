package g3601_3700.s3668_restore_finishing_order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void recoverOrder() {
        assertThat(
                new Solution().recoverOrder(new int[] {3, 1, 2, 5, 4}, new int[] {1, 3, 4}),
                equalTo(new int[] {3, 1, 4}));
    }

    @Test
    void recoverOrder2() {
        assertThat(
                new Solution().recoverOrder(new int[] {1, 4, 5, 3, 2}, new int[] {2, 5}),
                equalTo(new int[] {5, 2}));
    }
}
