package g2501_2600.s2516_take_k_of_each_character_from_left_and_right;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void takeCharacters() {
        assertThat(new Solution().takeCharacters("aabaaaacaabc", 2), equalTo(8));
    }

    @Test
    void takeCharacters2() {
        assertThat(new Solution().takeCharacters("a", 1), equalTo(-1));
    }
}
