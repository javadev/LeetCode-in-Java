package g1801_1900.s1884_egg_drop_with_2_eggs_and_n_floors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void twoEggDrop() {
        assertThat(new Solution().twoEggDrop(2), equalTo(2));
    }

    @Test
    void twoEggDrop2() {
        assertThat(new Solution().twoEggDrop(100), equalTo(14));
    }
}
