package g2101_2200.s2165_smallest_value_of_the_rearranged_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestNumber() {
        assertThat(new Solution().smallestNumber(310L), equalTo(103L));
    }

    @Test
    void smallestNumber2() {
        assertThat(new Solution().smallestNumber(-7605L), equalTo(-7650L));
    }
}
