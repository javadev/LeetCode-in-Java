package g1901_2000.s1954_minimum_garden_perimeter_to_collect_enough_apples;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumPerimeter() {
        assertThat(new Solution().minimumPerimeter(1), equalTo(8L));
    }

    @Test
    void minimumPerimeter2() {
        assertThat(new Solution().minimumPerimeter(13), equalTo(16L));
    }

    @Test
    void minimumPerimeter3() {
        assertThat(new Solution().minimumPerimeter(1000000000), equalTo(5040L));
    }
}
