package g0201_0300.s0287_find_the_duplicate_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDuplicate() {
        assertThat(new Solution().findDuplicate(new int[] {1, 3, 4, 2, 2}), equalTo(2));
    }

    @Test
    void findDuplicate2() {
        assertThat(new Solution().findDuplicate(new int[] {3, 1, 3, 4, 2}), equalTo(3));
    }

    @Test
    void findDuplicate3() {
        assertThat(new Solution().findDuplicate(new int[] {1, 1}), equalTo(1));
    }

    @Test
    void findDuplicate4() {
        assertThat(new Solution().findDuplicate(new int[] {1, 1, 2}), equalTo(1));
    }
}
