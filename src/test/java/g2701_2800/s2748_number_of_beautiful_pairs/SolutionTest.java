package g2701_2800.s2748_number_of_beautiful_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBeautifulPairs() {
        assertThat(new Solution().countBeautifulPairs(new int[] {2, 5, 1, 4}), equalTo(5));
    }

    @Test
    void countBeautifulPairs2() {
        assertThat(new Solution().countBeautifulPairs(new int[] {11, 21, 12}), equalTo(2));
    }
}
