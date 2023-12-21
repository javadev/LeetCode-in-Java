package g0701_0800.s0779_k_th_symbol_in_grammar;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthGrammar() {
        assertThat(new Solution().kthGrammar(1, 1), equalTo(0));
    }

    @Test
    void kthGrammar2() {
        assertThat(new Solution().kthGrammar(2, 1), equalTo(0));
    }

    @Test
    void kthGrammar3() {
        assertThat(new Solution().kthGrammar(2, 2), equalTo(1));
    }
}
