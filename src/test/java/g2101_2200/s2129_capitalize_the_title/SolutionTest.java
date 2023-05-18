package g2101_2200.s2129_capitalize_the_title;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void capitalizeTitle() {
        assertThat(
                new Solution().capitalizeTitle("capiTalIze tHe titLe"),
                equalTo("Capitalize The Title"));
    }

    @Test
    void capitalizeTitle2() {
        assertThat(
                new Solution().capitalizeTitle("First leTTeR of EACH Word"),
                equalTo("First Letter of Each Word"));
    }

    @Test
    void capitalizeTitle3() {
        assertThat(new Solution().capitalizeTitle("i lOve leetcode"), equalTo("i Love Leetcode"));
    }
}
