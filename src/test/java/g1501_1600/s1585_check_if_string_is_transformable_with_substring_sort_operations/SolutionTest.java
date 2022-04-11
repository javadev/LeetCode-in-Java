package g1501_1600.s1585_check_if_string_is_transformable_with_substring_sort_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isTransformable() {
        assertThat(new Solution().isTransformable("84532", "34852"), equalTo(true));
    }

    @Test
    void isTransformable2() {
        assertThat(new Solution().isTransformable("34521", "23415"), equalTo(true));
    }

    @Test
    void isTransformable3() {
        assertThat(new Solution().isTransformable("12345", "12435"), equalTo(false));
    }
}
