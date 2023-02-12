package g2401_2500.s2500_delete_greatest_value_in_each_row;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deleteGreatestValue() {
        assertThat(
                new Solution().deleteGreatestValue(new int[][] {{1, 2, 4}, {3, 3, 1}}), equalTo(8));
    }

    @Test
    void deleteGreatestValue2() {
        assertThat(new Solution().deleteGreatestValue(new int[][] {{10}}), equalTo(10));
    }
}
