package g3101_3200.s3179_find_the_n_th_value_after_k_seconds;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void valueAfterKSeconds() {
        assertThat(new Solution().valueAfterKSeconds(4, 5), equalTo(56));
    }

    @Test
    void valueAfterKSeconds2() {
        assertThat(new Solution().valueAfterKSeconds(5, 3), equalTo(35));
    }
}
