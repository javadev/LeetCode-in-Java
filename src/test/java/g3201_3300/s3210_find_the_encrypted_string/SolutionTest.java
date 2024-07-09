package g3201_3300.s3210_find_the_encrypted_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getEncryptedString() {
        assertThat(new Solution().getEncryptedString("dart", 3), equalTo("tdar"));
    }

    @Test
    void getEncryptedString2() {
        assertThat(new Solution().getEncryptedString("aaa", 1), equalTo("aaa"));
    }
}
