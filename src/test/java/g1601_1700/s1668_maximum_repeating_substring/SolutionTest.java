package g1601_1700.s1668_maximum_repeating_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxRepeating() {
        assertThat(new Solution().maxRepeating("ababc", "ab"), equalTo(2));
    }

    @Test
    void maxRepeating2() {
        assertThat(new Solution().maxRepeating("ababc", "ba"), equalTo(1));
    }

    @Test
    void maxRepeating3() {
        assertThat(new Solution().maxRepeating("ababc", "ac"), equalTo(0));
    }
}
