package g2101_2200.s2190_most_frequent_number_following_key_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostFrequent() {
        assertThat(new Solution().mostFrequent(new int[] {1, 100, 200, 1, 100}, 1), equalTo(100));
    }

    @Test
    void mostFrequent2() {
        assertThat(new Solution().mostFrequent(new int[] {2, 2, 2, 2, 3}, 2), equalTo(2));
    }
}
