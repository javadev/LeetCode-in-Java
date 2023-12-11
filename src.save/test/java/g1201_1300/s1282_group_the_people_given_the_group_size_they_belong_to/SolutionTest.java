package g1201_1300.s1282_group_the_people_given_the_group_size_they_belong_to;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void groupThePeople() {
        assertThat(
                new Solution().groupThePeople(new int[] {3, 3, 3, 3, 3, 1, 3}),
                equalTo(ArrayUtils.getLists(new int[][] {{5}, {0, 1, 2}, {3, 4, 6}})));
    }

    @Test
    void groupThePeople2() {
        assertThat(
                new Solution().groupThePeople(new int[] {2, 1, 3, 3, 3, 2}),
                equalTo(ArrayUtils.getLists(new int[][] {{1}, {0, 5}, {2, 3, 4}})));
    }
}
