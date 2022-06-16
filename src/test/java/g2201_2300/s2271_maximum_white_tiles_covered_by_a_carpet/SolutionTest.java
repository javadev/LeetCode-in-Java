package g2201_2300.s2271_maximum_white_tiles_covered_by_a_carpet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumWhiteTiles() {
        assertThat(
                new Solution()
                        .maximumWhiteTiles(
                                new int[][] {{1, 5}, {10, 11}, {12, 18}, {20, 25}, {30, 32}}, 10),
                equalTo(9));
    }

    @Test
    void maximumWhiteTiles2() {
        assertThat(new Solution().maximumWhiteTiles(new int[][] {{10, 11}, {1, 1}}, 2), equalTo(2));
    }
}
