package g1001_1100.s1047_remove_all_adjacent_duplicates_in_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeDuplicates() {
        assertThat(new Solution().removeDuplicates("abbaca"), equalTo("ca"));
    }

    @Test
    void removeDuplicates2() {
        assertThat(new Solution().removeDuplicates("azxxzy"), equalTo("ay"));
    }
}
