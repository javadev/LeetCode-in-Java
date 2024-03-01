package g0601_0700.s0664_strange_printer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void strangePrinter() {
        assertThat(new Solution().strangePrinter("aaabbb"), equalTo(2));
    }

    @Test
    void strangePrinter2() {
        assertThat(new Solution().strangePrinter("aba"), equalTo(2));
    }
}
