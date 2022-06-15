package g2201_2300.s2274_maximum_consecutive_floors_without_special_floors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxConsecutive() {
        assertThat(new Solution().maxConsecutive(2, 9, new int[] {4, 6}), equalTo(3));
    }

    @Test
    void maxConsecutive2() {
        assertThat(new Solution().maxConsecutive(6, 8, new int[] {7, 6, 8}), equalTo(0));
    }
}
