package g0101_0200.s0168_excel_sheet_column_title;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void convertToTitle() {
        assertThat(new Solution().convertToTitle(1), equalTo("A"));
    }

    @Test
    void convertToTitle2() {
        assertThat(new Solution().convertToTitle(28), equalTo("AB"));
    }

    @Test
    void convertToTitle3() {
        assertThat(new Solution().convertToTitle(701), equalTo("ZY"));
    }
}
