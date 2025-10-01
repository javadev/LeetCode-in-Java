package g3601_3700.s3694_distinct_points_reachable_after_substring_removal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinctPoints() {
        assertThat(new Solution().distinctPoints("LUL", 1), equalTo(2));
    }

    @Test
    void distinctPoints2() {
        assertThat(new Solution().distinctPoints("UDLR", 4), equalTo(1));
    }

    @Test
    void distinctPoints3() {
        assertThat(new Solution().distinctPoints("UU", 1), equalTo(1));
    }

    @Test
    void distinctPoints4() {
        assertThat(new Solution().distinctPoints("", 0), equalTo(1));
        assertThat(new Solution().distinctPoints("", 1), equalTo(1));
    }

    @Test
    void distinctPoints5() {
        assertThat(new Solution().distinctPoints("UDLR", 5), equalTo(1));
        assertThat(new Solution().distinctPoints("UD", 3), equalTo(1));
    }

    @Test
    void distinctPoints6() {
        assertThat(new Solution().distinctPoints("UDLR", 4), equalTo(1));
    }

    @Test
    void distinctPoints7() {
        assertThat(new Solution().distinctPoints("U", 0), equalTo(1));
        assertThat(new Solution().distinctPoints("D", 0), equalTo(1));
        assertThat(new Solution().distinctPoints("L", 0), equalTo(1));
        assertThat(new Solution().distinctPoints("R", 0), equalTo(1));
    }

    @Test
    void distinctPoints8() {
        assertThat(new Solution().distinctPoints("UU", 1), equalTo(1));
        assertThat(new Solution().distinctPoints("UUU", 1), equalTo(1));
    }

    @Test
    void distinctPoints9() {
        assertThat(new Solution().distinctPoints("DD", 1), equalTo(1));
        assertThat(new Solution().distinctPoints("DDD", 1), equalTo(1));
    }

    @Test
    void distinctPoints10() {
        assertThat(new Solution().distinctPoints("LL", 1), equalTo(1));
        assertThat(new Solution().distinctPoints("LLL", 1), equalTo(1));
    }

    @Test
    void distinctPoints11() {
        assertThat(new Solution().distinctPoints("RR", 1), equalTo(1));
        assertThat(new Solution().distinctPoints("RRR", 1), equalTo(1));
    }

    @Test
    void distinctPoints12() {
        assertThat(new Solution().distinctPoints("XX", 1), equalTo(1));
        assertThat(new Solution().distinctPoints("123", 1), equalTo(1));
        assertThat(new Solution().distinctPoints("ABC", 2), equalTo(1));
    }

    @Test
    void distinctPoints13() {
        assertThat(new Solution().distinctPoints("UDLR", 1), equalTo(4));
        assertThat(new Solution().distinctPoints("UDLR", 2), equalTo(2));
        assertThat(new Solution().distinctPoints("URDL", 1), equalTo(4));
    }

    @Test
    void distinctPoints14() {
        assertThat(new Solution().distinctPoints("UDUD", 2), equalTo(1));
        assertThat(new Solution().distinctPoints("LRLR", 2), equalTo(1));
        assertThat(new Solution().distinctPoints("UDLR", 3), equalTo(2));
    }

    @Test
    void distinctPoints15() {
        assertThat(new Solution().distinctPoints("UUDDLLRR", 2), equalTo(6));
        assertThat(new Solution().distinctPoints("UDUDLRLR", 4), equalTo(2));
    }

    @Test
    void distinctPoints16() {
        assertThat(new Solution().distinctPoints("UUUU", 1), equalTo(1));
        assertThat(new Solution().distinctPoints("UUDD", 2), equalTo(3));
    }

    @Test
    void distinctPoints17() {
        String longPath = "UUUUDDDLLLLRRRR";
        assertThat(new Solution().distinctPoints(longPath, 3), equalTo(10));
        assertThat(new Solution().distinctPoints(longPath, 5), equalTo(11));
    }

    @Test
    void distinctPoints18() {
        assertThat(new Solution().distinctPoints("U@D#L$R%", 2), equalTo(4));
        assertThat(new Solution().distinctPoints("!@#$", 1), equalTo(1));
    }
}
