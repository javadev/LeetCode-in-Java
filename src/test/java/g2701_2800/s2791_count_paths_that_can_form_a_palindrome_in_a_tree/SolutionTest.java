package g2701_2800.s2791_count_paths_that_can_form_a_palindrome_in_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPalindromePaths() {
        List<Integer> parent1 = Arrays.asList(-1, 0, 0, 1, 1, 2);
        assertThat(new Solution().countPalindromePaths(parent1, "acaabc"), equalTo(8L));
    }

    @Test
    void countPalindromePaths2() {
        List<Integer> parent2 = Arrays.asList(-1, 0, 0, 0, 0);
        assertThat(new Solution().countPalindromePaths(parent2, "aaaaa"), equalTo(10L));
    }
}
