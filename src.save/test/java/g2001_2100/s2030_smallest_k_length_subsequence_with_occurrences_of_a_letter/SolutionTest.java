package g2001_2100.s2030_smallest_k_length_subsequence_with_occurrences_of_a_letter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestSubsequence() {
        assertThat(new Solution().smallestSubsequence("leet", 3, 'e', 1), equalTo("eet"));
    }

    @Test
    void smallestSubsequence2() {
        assertThat(new Solution().smallestSubsequence("leetcode", 4, 'e', 2), equalTo("ecde"));
    }

    @Test
    void smallestSubsequence3() {
        assertThat(new Solution().smallestSubsequence("bb", 2, 'b', 2), equalTo("bb"));
    }
}
