package g3201_3300.s3211_generate_binary_strings_without_adjacent_zeros;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validStrings() {
        assertThat(
                new Solution().validStrings(3),
                equalTo(List.of("111", "110", "101", "011", "010")));
    }

    @Test
    void validStrings2() {
        assertThat(new Solution().validStrings(1), equalTo(List.of("1", "0")));
    }
}
