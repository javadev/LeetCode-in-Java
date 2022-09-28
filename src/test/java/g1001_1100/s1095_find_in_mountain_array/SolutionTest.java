package g1001_1100.s1095_find_in_mountain_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findInMountainArray() {
        assertThat(
                new Solution()
                        .findInMountainArray(
                                3, new MountainArrayImpl(new int[] {1, 2, 3, 4, 5, 3, 1})),
                equalTo(2));
    }

    @Test
    void findInMountainArray2() {
        assertThat(
                new Solution()
                        .findInMountainArray(
                                3, new MountainArrayImpl(new int[] {0, 1, 2, 4, 2, 1})),
                equalTo(-1));
    }
}
