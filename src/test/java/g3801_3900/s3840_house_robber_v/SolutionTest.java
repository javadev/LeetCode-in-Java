package g3801_3900.s3840_house_robber_v;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rob() {
        assertThat(new Solution().rob(new int[] {1, 4, 3, 5}, new int[] {1, 1, 2, 2}), equalTo(9L));
    }

    @Test
    void rob2() {
        assertThat(new Solution().rob(new int[] {3, 1, 2, 4}, new int[] {2, 3, 2, 2}), equalTo(8L));
    }

    @Test
    void rob3() {
        assertThat(
                new Solution().rob(new int[] {10, 1, 3, 9}, new int[] {1, 1, 1, 2}), equalTo(22L));
    }
}
