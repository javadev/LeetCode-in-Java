package g0401_0500.s0493_reverse_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reversePairs() {
        assertThat(new Solution().reversePairs(new int[] {1, 3, 2, 3, 1}), equalTo(2));
    }

    @Test
    void reversePairs2() {
        assertThat(new Solution().reversePairs(new int[] {2, 4, 3, 5, 1}), equalTo(3));
    }
}
