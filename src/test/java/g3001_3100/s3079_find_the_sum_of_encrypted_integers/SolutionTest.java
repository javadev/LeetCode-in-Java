package g3001_3100.s3079_find_the_sum_of_encrypted_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfEncryptedInt() {
        assertThat(new Solution().sumOfEncryptedInt(new int[] {1, 2, 3}), equalTo(6));
    }

    @Test
    void sumOfEncryptedInt2() {
        assertThat(new Solution().sumOfEncryptedInt(new int[] {10, 21, 31}), equalTo(66));
    }
}
