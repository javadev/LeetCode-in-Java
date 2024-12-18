package g3301_3400.s3389_minimum_operations_to_make_character_frequencies_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeStringGood() {
        assertThat(new Solution().makeStringGood("acab"), equalTo(1));
    }

    @Test
    void makeStringGood2() {
        assertThat(new Solution().makeStringGood("wddw"), equalTo(0));
    }

    @Test
    void makeStringGood3() {
        assertThat(new Solution().makeStringGood("aaabc"), equalTo(2));
    }
}
