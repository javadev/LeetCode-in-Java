package g0201_0300.s0287_find_the_duplicate_number_medium_top_100_liked_questions_top_interview_questions_array_binary_search_two_pointers_bit_manipulation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void findDuplicate() {
        assertThat(new Solution().findDuplicate(new int[] {1, 3, 4, 2, 2}), equalTo(2));
    }

    @Test
    public void findDuplicate2() {
        assertThat(new Solution().findDuplicate(new int[] {3, 1, 3, 4, 2}), equalTo(3));
    }

    @Test
    public void findDuplicate3() {
        assertThat(new Solution().findDuplicate(new int[] {1, 1}), equalTo(1));
    }

    @Test
    public void findDuplicate4() {
        assertThat(new Solution().findDuplicate(new int[] {1, 1, 2}), equalTo(1));
    }
}
