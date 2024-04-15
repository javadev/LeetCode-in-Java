package g3001_3100.s3075_maximize_happiness_of_selected_children;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumHappinessSum() {
        assertThat(new Solution().maximumHappinessSum(new int[] {1, 2, 3}, 2), equalTo(4L));
    }

    @Test
    void maximumHappinessSum2() {
        assertThat(new Solution().maximumHappinessSum(new int[] {1, 1, 1, 1}, 2), equalTo(1L));
    }

    @Test
    void maximumHappinessSum3() {
        assertThat(new Solution().maximumHappinessSum(new int[] {2, 3, 4, 5}, 1), equalTo(5L));
    }
}
