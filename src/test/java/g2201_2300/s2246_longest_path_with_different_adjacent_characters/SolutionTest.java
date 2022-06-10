package g2201_2300.s2246_longest_path_with_different_adjacent_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestPath() {
        assertThat(new Solution().longestPath(new int[] {-1, 0, 0, 1, 1, 2}, "abacbe"), equalTo(3));
    }

    @Test
    void longestPath2() {
        assertThat(new Solution().longestPath(new int[] {-1, 0, 0, 0}, "aabc"), equalTo(3));
    }

    @Test
    void longestPath3() {
        assertThat(
                new Solution()
                        .longestPath(
                                new int[] {
                                    -1, 159, 58, 91, 160, 65, 10, 91, 9, 58, 143, 66, 145, 18, 143,
                                    32, 152, 108, 145, 0, 154, 46, 146, 148, 144, 133, 58, 107, 87,
                                    144, 64, 28, 46, 87, 14, 14, 121, 110, 119, 152, 74, 14, 14,
                                    120, 159, 9, 19, 100, 9, 75, 156, 127, 48, 154, 140, 64, 158, 8,
                                    43, 46, 27, 31, 34, 74, 99, 32, 45, 105, 100, 32, 27, 112, 9,
                                    43, 60, 8, 97, 45, 2, 86, 49, 35, 160, 77, 111, 138, 145, 152,
                                    59, 87, 9, 125, 70, 20, 59, 47, 91, 58, 65, 43, 120, 29, 86, 69,
                                    77, 15, 101, 138, 7, 153, 138, 56, 132, 37, 122, 43, 33, 62, 95,
                                    91, 46, 103, 34, 63, 115, 2, 132, 86, 86, 9, 26, 110, 8, 87, 58,
                                    30, 103, 93, 43, 45, 46, 143, 30, 87, 97, 115, 8, 58, 125, 10,
                                    152, 10, 2, 107, 141, 108, 37, 32, 43, 69, 100
                                },
                                "ofarlvkejasusszlxapxqmpecaduhuogzltxuclafjrb"
                                        + "rvqtsidmmrjjespdupikvyopweptnjteylnixcj"
                                        + "jfsubmhcekgbdorwihftfbtrqhzinccijwbpj"
                                        + "aafkdplnjrydmkrluvdcmmoohwgkdmeuuqtsktbyl"),
                equalTo(18));
    }
}
