package g2201_2300.s2266_count_number_of_texts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countTexts() {
        assertThat(new Solution().countTexts("22233"), equalTo(8));
    }

    @Test
    void countTexts2() {
        assertThat(
                new Solution().countTexts("222222222222222222222222222222222222"),
                equalTo(82876089));
    }
}
