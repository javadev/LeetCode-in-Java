package g3001_3100.s3005_count_elements_with_maximum_frequency;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFrequencyElements() {
        assertThat(new Solution().maxFrequencyElements(new int[] {1, 2, 2, 3, 1, 4}), equalTo(4));
    }

    @Test
    void maxFrequencyElements2() {
        assertThat(new Solution().maxFrequencyElements(new int[] {1, 2, 3, 4, 5}), equalTo(5));
    }
}
