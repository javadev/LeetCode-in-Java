package g2201_2300.s2209_minimum_white_tiles_after_covering_with_carpets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumWhiteTiles() {
        assertThat(new Solution().minimumWhiteTiles("10110101", 2, 2), equalTo(2));
    }

    @Test
    void minimumWhiteTiles2() {
        assertThat(new Solution().minimumWhiteTiles("11111", 2, 3), equalTo(0));
    }
}
