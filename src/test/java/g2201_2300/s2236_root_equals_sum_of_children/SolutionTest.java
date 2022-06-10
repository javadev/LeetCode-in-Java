package g2201_2300.s2236_root_equals_sum_of_children;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkTree() {
        assertThat(new Solution().checkTree(new int[] {10, 4, 6}), equalTo(true));
    }

    @Test
    void checkTree2() {
        assertThat(new Solution().checkTree(new int[] {5, 3, 1}), equalTo(false));
    }
}
