package g1201_1300.s1278_palindrome_partitioning_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void palindromePartition() {
        assertThat(new Solution().palindromePartition("abc", 2), equalTo(1));
    }

    @Test
    void palindromePartition2() {
        assertThat(new Solution().palindromePartition("aabbc", 3), equalTo(0));
    }

    @Test
    void palindromePartition3() {
        assertThat(new Solution().palindromePartition("leetcode", 8), equalTo(0));
    }
}
