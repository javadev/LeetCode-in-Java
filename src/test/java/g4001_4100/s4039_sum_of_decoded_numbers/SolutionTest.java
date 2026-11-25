package g4001_4100.s4039_sum_of_decoded_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumDecoded() {
        assertThat(new Solution().sumDecoded(new long[] {111}), equalTo(1));
    }

    @Test
    void sumDecoded2() {
        assertThat(new Solution().sumDecoded(new long[] {111, 112}), equalTo(2));
    }

    @Test
    void sumDecoded3() {
        assertThat(new Solution().sumDecoded(new long[] {}), equalTo(0));
    }
}

