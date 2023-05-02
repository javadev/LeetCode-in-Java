package g0101_0200.s0171_excel_sheet_column_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void titleToNumber() {
        assertThat(new Solution().titleToNumber("A"), equalTo(1));
    }

    @Test
    void titleToNumber2() {
        assertThat(new Solution().titleToNumber("AB"), equalTo(28));
    }

    @Test
    void titleToNumber3() {
        assertThat(new Solution().titleToNumber("ZY"), equalTo(701));
    }
}
