package g3501_3600.s3545_minimum_deletions_for_at_most_k_distinct_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDeletion() {
        assertThat(new Solution().minDeletion("abc", 2), equalTo(1));
    }

    @Test
    void minDeletion2() {
        assertThat(new Solution().minDeletion("aabb", 2), equalTo(0));
    }

    @Test
    void minDeletion3() {
        assertThat(new Solution().minDeletion("yyyzz", 1), equalTo(2));
    }
}
