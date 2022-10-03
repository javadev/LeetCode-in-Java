package g2301_2400.s2375_construct_smallest_number_from_di_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestNumber() {
        assertThat(new Solution().smallestNumber("IIIDIDDD"), equalTo("123549876"));
    }

    @Test
    void smallestNumber2() {
        assertThat(new Solution().smallestNumber("DDD"), equalTo("4321"));
    }
}
