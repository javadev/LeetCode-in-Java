package g3201_3300.s3271_hash_divided_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stringHash() {
        assertThat(new Solution().stringHash("abcd", 2), equalTo("bf"));
    }

    @Test
    void stringHash2() {
        assertThat(new Solution().stringHash("mxz", 3), equalTo("i"));
    }
}
