package g1201_1300.s1276_number_of_burgers_with_no_waste_of_ingredients;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfBurgers() {
        assertThat(new Solution().numOfBurgers(16, 7), equalTo(Arrays.asList(1, 6)));
    }

    @Test
    void numOfBurgers2() {
        assertThat(new Solution().numOfBurgers(17, 4), equalTo(Collections.emptyList()));
    }

    @Test
    void numOfBurgers3() {
        assertThat(new Solution().numOfBurgers(4, 17), equalTo(Collections.emptyList()));
    }
}
