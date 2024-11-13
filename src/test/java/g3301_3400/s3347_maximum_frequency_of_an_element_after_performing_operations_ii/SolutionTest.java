package g3301_3400.s3347_maximum_frequency_of_an_element_after_performing_operations_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFrequency() {
        assertThat(new Solution().maxFrequency(new int[] {1, 4, 5}, 1, 2), equalTo(2));
    }

    @Test
    void maxFrequency2() {
        assertThat(new Solution().maxFrequency(new int[] {5, 11, 20, 20}, 5, 1), equalTo(2));
    }
}
