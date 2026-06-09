package g3801_3900.s3816_lexicographically_smallest_string_after_deleting_duplicate_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lexSmallestAfterDeletion() {
        assertThat(new Solution().lexSmallestAfterDeletion("aaccb"), equalTo("aacb"));
    }

    @Test
    void lexSmallestAfterDeletion2() {
        assertThat(new Solution().lexSmallestAfterDeletion("z"), equalTo("z"));
    }
}
