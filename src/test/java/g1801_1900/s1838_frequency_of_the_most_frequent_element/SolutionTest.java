package g1801_1900.s1838_frequency_of_the_most_frequent_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFrequency() {
        assertThat(new Solution().maxFrequency(new int[] {1, 2, 4}, 5), equalTo(3));
    }

    @Test
    void maxFrequency2() {
        assertThat(new Solution().maxFrequency(new int[] {1, 4, 8, 13}, 5), equalTo(2));
    }

    @Test
    void maxFrequency3() {
        assertThat(new Solution().maxFrequency(new int[] {3, 9, 6}, 2), equalTo(1));
    }
}
