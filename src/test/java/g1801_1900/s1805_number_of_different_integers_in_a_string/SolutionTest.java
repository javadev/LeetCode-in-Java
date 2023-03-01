package g1801_1900.s1805_number_of_different_integers_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numDifferentIntegers() {
        assertThat(new Solution().numDifferentIntegers("a123bc34d8ef34"), equalTo(3));
    }

    @Test
    void numDifferentIntegers2() {
        assertThat(new Solution().numDifferentIntegers("leet1234code234"), equalTo(2));
    }

    @Test
    void numDifferentIntegers3() {
        assertThat(new Solution().numDifferentIntegers("a1b01c001"), equalTo(1));
    }
}
