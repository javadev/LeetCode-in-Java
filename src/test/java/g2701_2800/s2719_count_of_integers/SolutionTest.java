package g2701_2800.s2719_count_of_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void count() {
        assertThat(new Solution().count("1", "12", 1, 8), equalTo(11));
    }

    @Test
    void count2() {
        assertThat(new Solution().count("1", "5", 1, 5), equalTo(5));
    }
}
