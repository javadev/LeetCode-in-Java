package g2201_2300.s2269_find_the_k_beauty_of_a_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void divisorSubstrings() {
        assertThat(new Solution().divisorSubstrings(240, 2), equalTo(2));
    }

    @Test
    void divisorSubstrings2() {
        assertThat(new Solution().divisorSubstrings(430043, 2), equalTo(2));
    }
}
