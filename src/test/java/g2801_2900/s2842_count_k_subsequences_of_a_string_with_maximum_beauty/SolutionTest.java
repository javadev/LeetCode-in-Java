package g2801_2900.s2842_count_k_subsequences_of_a_string_with_maximum_beauty;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countKSubsequencesWithMaxBeauty() {
        assertThat(new Solution().countKSubsequencesWithMaxBeauty("bcca", 2), equalTo(4));
    }

    @Test
    void countKSubsequencesWithMaxBeauty2() {
        assertThat(new Solution().countKSubsequencesWithMaxBeauty("abbcd", 4), equalTo(2));
    }
}
