package g1401_1500.s1447_simplified_fractions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void simplifiedFractions() {
        assertThat(
                new Solution().simplifiedFractions(2), equalTo(Collections.singletonList("1/2")));
    }

    @Test
    void simplifiedFractions2() {
        assertThat(
                new Solution().simplifiedFractions(4),
                equalTo(Arrays.asList("1/2", "1/3", "2/3", "1/4", "3/4")));
    }
}
