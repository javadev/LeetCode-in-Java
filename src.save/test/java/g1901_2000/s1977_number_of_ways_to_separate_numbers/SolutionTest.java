package g1901_2000.s1977_number_of_ways_to_separate_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfCombinations() {
        assertThat(new Solution().numberOfCombinations("327"), equalTo(2));
    }

    @Test
    void numberOfCombinations2() {
        assertThat(new Solution().numberOfCombinations("094"), equalTo(0));
    }

    @Test
    void numberOfCombinations3() {
        assertThat(new Solution().numberOfCombinations("0"), equalTo(0));
    }
}
