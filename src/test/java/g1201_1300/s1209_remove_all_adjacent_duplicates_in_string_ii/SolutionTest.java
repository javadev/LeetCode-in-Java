package g1201_1300.s1209_remove_all_adjacent_duplicates_in_string_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeDuplicates() {
        assertThat(new Solution().removeDuplicates("abcd", 2), equalTo("abcd"));
    }

    @Test
    void removeDuplicates2() {
        assertThat(new Solution().removeDuplicates("deeedbbcccbdaa", 3), equalTo("aa"));
    }

    @Test
    void removeDuplicates3() {
        assertThat(new Solution().removeDuplicates("pbbcggttciiippooaais", 2), equalTo("ps"));
    }
}
