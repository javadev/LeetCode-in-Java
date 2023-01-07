package g2201_2300.s2262_total_appeal_of_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void appealSum() {
        assertThat(new Solution().appealSum("abbca"), equalTo(28L));
    }

    @Test
    void appealSum2() {
        assertThat(new Solution().appealSum("code"), equalTo(20L));
    }
}
