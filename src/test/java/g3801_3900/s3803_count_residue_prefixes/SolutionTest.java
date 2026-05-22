package g3801_3900.s3803_count_residue_prefixes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void residuePrefixes() {
        assertThat(new Solution().residuePrefixes("abc"), equalTo(2));
    }

    @Test
    void residuePrefixes2() {
        assertThat(new Solution().residuePrefixes("dd"), equalTo(1));
    }

    @Test
    void residuePrefixes3() {
        assertThat(new Solution().residuePrefixes("bob"), equalTo(2));
    }
}
