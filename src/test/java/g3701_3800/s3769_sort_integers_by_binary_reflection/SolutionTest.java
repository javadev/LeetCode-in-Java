package g3701_3800.s3769_sort_integers_by_binary_reflection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortByReflection() {
        int[] result = new Solution().sortByReflection(new int[] {1, 2, 3});
        assertThat(result[0], equalTo(1));
        assertThat(result[1], equalTo(2));
        assertThat(result[2], equalTo(3));
    }

    @Test
    void sortByReflection2() {
        int[] result = new Solution().sortByReflection(new int[] {0, 1, 2});
        assertThat(result[0], equalTo(0));
        assertThat(result[1], equalTo(1));
        assertThat(result[2], equalTo(2));
    }

    @Test
    void sortByReflection3() {
        int[] result = new Solution().sortByReflection(new int[] {6, 9});
        assertThat(result[0], equalTo(6));
        assertThat(result[1], equalTo(9));
    }
}
