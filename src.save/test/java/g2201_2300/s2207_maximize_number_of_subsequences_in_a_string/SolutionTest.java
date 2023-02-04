package g2201_2300.s2207_maximize_number_of_subsequences_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSubsequenceCount() {
        assertThat(new Solution().maximumSubsequenceCount("abdcdbc", "ac"), equalTo(4L));
    }

    @Test
    void maximumSubsequenceCount2() {
        assertThat(new Solution().maximumSubsequenceCount("aabb", "ab"), equalTo(6L));
    }

    @Test
    void maximumSubsequenceCount3() {
        assertThat(new Solution().maximumSubsequenceCount("abdcdbc", "aa"), equalTo(1L));
    }
}
