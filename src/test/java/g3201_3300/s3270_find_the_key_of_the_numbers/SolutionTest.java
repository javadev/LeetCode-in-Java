package g3201_3300.s3270_find_the_key_of_the_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void generateKey() {
        assertThat(new Solution().generateKey(1, 10, 1000), equalTo(0));
    }

    @Test
    void generateKey2() {
        assertThat(new Solution().generateKey(987, 879, 798), equalTo(777));
    }

    @Test
    void generateKey3() {
        assertThat(new Solution().generateKey(1, 2, 3), equalTo(1));
    }
}
