package g3901_4000.s3955_valid_binary_strings_with_cost_limit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void generateValidStrings() {
        assertThat(
                new Solution().generateValidStrings(3, 1),
                equalTo(Arrays.asList("000", "010", "100")));
    }

    @Test
    void generateValidStrings2() {
        assertThat(new Solution().generateValidStrings(1, 0), equalTo(Arrays.asList("0", "1")));
    }

    @Test
    void generateValidStrings3() {
        assertThat(new Solution().generateValidStrings(2, 0), equalTo(Arrays.asList("00", "10")));
    }
}
