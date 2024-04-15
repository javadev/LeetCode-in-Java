package g2701_2800.s2780_minimum_index_of_a_valid_split;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumIndex() {
        List<Integer> list1 = Arrays.asList(1, 2, 2, 2);
        assertThat(new Solution().minimumIndex(list1), equalTo(2));
    }

    @Test
    void minimumIndex2() {
        List<Integer> list2 = Arrays.asList(2, 1, 3, 1, 1, 1, 7, 1, 2, 1);
        assertThat(new Solution().minimumIndex(list2), equalTo(4));
    }

    @Test
    void minimumIndex3() {
        List<Integer> list3 = Arrays.asList(3, 3, 3, 3, 7, 2, 2);
        assertThat(new Solution().minimumIndex(list3), equalTo(-1));
    }
}
