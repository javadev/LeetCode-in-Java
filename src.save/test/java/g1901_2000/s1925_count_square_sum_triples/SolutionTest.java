package g1901_2000.s1925_count_square_sum_triples;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countTriples() {
        assertThat(new Solution().countTriples(5), equalTo(2));
    }

    @Test
    void countTriples2() {
        assertThat(new Solution().countTriples(10), equalTo(4));
    }
}
