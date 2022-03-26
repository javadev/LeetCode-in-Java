package g1401_1500.s1415_the_k_th_lexicographical_string_of_all_happy_strings_of_length_n;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getHappyString() {
        assertThat(new Solution().getHappyString(1, 3), equalTo("c"));
    }

    @Test
    void getHappyString2() {
        assertThat(new Solution().getHappyString(1, 4), equalTo(""));
    }

    @Test
    void getHappyString3() {
        assertThat(new Solution().getHappyString(3, 9), equalTo("cab"));
    }
}
