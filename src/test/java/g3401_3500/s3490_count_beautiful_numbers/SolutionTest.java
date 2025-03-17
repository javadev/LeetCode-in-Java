package g3401_3500.s3490_count_beautiful_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void beautifulNumbers() {
        assertThat(new Solution().beautifulNumbers(10, 20), equalTo(2));
    }

    @Test
    void beautifulNumbers2() {
        assertThat(new Solution().beautifulNumbers(1, 15), equalTo(10));
    }

    @Test
    void beautifulNumbers3() {
        assertThat(new Solution().beautifulNumbers(6725, 270910825), equalTo(178996547));
    }
}
