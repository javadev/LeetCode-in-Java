package g3801_3900.s3871_count_commas_in_range_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCommas() {
        assertThat(new Solution().countCommas(0L), equalTo(0L));
    }

    @Test
    void countCommas2() {
        assertThat(new Solution().countCommas(998L), equalTo(0L));
    }

    @Test
    void countCommas3() {
        assertThat(new Solution().countCommas(999L), equalTo(0L));
    }

    @Test
    void countCommas4() {
        assertThat(new Solution().countCommas(1000L), equalTo(1L));
    }

    @Test
    void countCommas5() {
        assertThat(new Solution().countCommas(1002L), equalTo(3L));
    }

    @Test
    void countCommas6() {
        assertThat(new Solution().countCommas(999_999L), equalTo(999_000L));
    }

    @Test
    void countCommas7() {
        assertThat(new Solution().countCommas(1_000_000L), equalTo(999_002L));
    }

    @Test
    void countCommas8() {
        assertThat(new Solution().countCommas(1_000_005L), equalTo(999_012L));
    }

    @Test
    void countCommas9() {
        assertThat(new Solution().countCommas(1_000_000_000L), equalTo(1_998_999_003L));
    }

    @Test
    void countCommas10() {
        assertThat(new Solution().countCommas(1_000_000_000_000L), equalTo(2_998_998_999_004L));
    }

    @Test
    void countCommas11() {
        assertThat(
                new Solution().countCommas(1_000_000_000_000_000L),
                equalTo(3_998_998_998_999_005L));
    }

    @Test
    void countCommas12() {
        assertThat(new Solution().countCommas(999_999_999L), equalTo(1_998_999_000L));
    }

    @Test
    void countCommas13() {
        assertThat(new Solution().countCommas(999_999_999_999L), equalTo(2_998_998_999_000L));
    }
}
