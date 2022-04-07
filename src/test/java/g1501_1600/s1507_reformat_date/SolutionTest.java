package g1501_1600.s1507_reformat_date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reformatDate() {
        assertThat(new Solution().reformatDate("20th Oct 2052"), equalTo("2052-10-20"));
    }

    @Test
    void reformatDate2() {
        assertThat(new Solution().reformatDate("6th Jun 1933"), equalTo("1933-06-06"));
    }

    @Test
    void reformatDate3() {
        assertThat(new Solution().reformatDate("26th May 1960"), equalTo("1960-05-26"));
    }
}
