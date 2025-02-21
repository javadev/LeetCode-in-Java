package g1801_1900.s1815_maximum_number_of_groups_getting_fresh_donuts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxHappyGroups() {
        assertThat(new Solution().maxHappyGroups(3, new int[] {1, 2, 3, 4, 5, 6}), equalTo(4));
    }

    @Test
    void maxHappyGroups2() {
        assertThat(
                new Solution().maxHappyGroups(4, new int[] {1, 3, 2, 5, 2, 2, 1, 6}), equalTo(4));
    }

    @Test
    void maxHappyGroups3() {
        assertThat(
                new Solution()
                        .maxHappyGroups(
                                7,
                                new int[] {
                                    287773481, 815094798, 356732984, 644469322, 543193620,
                                    903158817, 274116865, 395252956, 363839119, 365378492,
                                    122313059, 312690039, 252532812
                                }),
                equalTo(9));
    }

    @Test
    void maxHappyGroups4() {
        assertThat(
                new Solution()
                        .maxHappyGroups(
                                9,
                                new int[] {
                                    3, 1, 3, 3, 5, 6, 1, 1, 9, 10, 3, 3, 3, 1, 1, 3, 3, 3, 19, 20,
                                    1, 3, 3, 3, 3, 1, 1, 3, 3, 30
                                }),
                equalTo(9));
    }
}
