package g3201_3300.s3287_find_the_maximum_sequence_value_of_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxValue() {
        assertThat(new Solution().maxValue(new int[] {2, 6, 7}, 1), equalTo(5));
    }

    @Test
    void maxValue2() {
        assertThat(new Solution().maxValue(new int[] {4, 2, 5, 6, 7}, 2), equalTo(2));
    }
}
