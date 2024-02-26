package g2601_2700.s2611_mice_and_cheese;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void miceAndCheese() {
        assertThat(
                new Solution().miceAndCheese(new int[] {1, 1, 3, 4}, new int[] {4, 4, 1, 1}, 2),
                equalTo(15));
    }

    @Test
    void miceAndCheese2() {
        assertThat(new Solution().miceAndCheese(new int[] {1, 1}, new int[] {1, 1}, 2), equalTo(2));
    }
}
