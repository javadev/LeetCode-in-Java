package g1001_1100.s1037_valid_boomerang;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isBoomerang() {
        assertThat(new Solution().isBoomerang(new int[][] {{1, 1}, {2, 3}, {3, 2}}), equalTo(true));
    }

    @Test
    void isBoomerang2() {
        assertThat(
                new Solution().isBoomerang(new int[][] {{1, 1}, {2, 2}, {3, 3}}), equalTo(false));
    }
}
