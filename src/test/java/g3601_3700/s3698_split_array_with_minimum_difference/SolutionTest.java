package g3601_3700.s3698_split_array_with_minimum_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitArray() {
        assertThat(new Solution().splitArray(new int[] {1, 3, 2}), equalTo(2L));
    }

    @Test
    void splitArray2() {
        assertThat(new Solution().splitArray(new int[] {1, 2, 4, 3}), equalTo(4L));
    }

    @Test
    void splitArray3() {
        assertThat(new Solution().splitArray(new int[] {3, 1, 2}), equalTo(-1L));
    }

    @Test
    void splitArray4() {
        int[] nums = {1, 2, 3, 4, 5};
        assertThat(new Solution().splitArray(nums), equalTo(5L));
    }

    @Test
    void splitArray5() {
        int[] nums = {10};
        assertThat(new Solution().splitArray(nums), equalTo(10L));
    }

    @Test
    void splitArray6() {
        int[] nums = {3, 7};
        assertThat(new Solution().splitArray(nums), equalTo(4L));
    }

    @Test
    void splitArray7() {
        int[] nums = {1, 2, 2, 1};
        assertThat(new Solution().splitArray(nums), equalTo(0L));
    }

    @Test
    void splitArray8() {
        int[] nums = {1, 3, 2, 0};
        assertThat(new Solution().splitArray(nums), equalTo(2L));
    }

    @Test
    void splitArray9() {
        int[] nums = {1, 2, 1, 3};
        assertThat(new Solution().splitArray(nums), equalTo(-1L));
    }

    @Test
    void splitArray10() {
        int[] nums = {2, 4, 3, 1, 2};
        assertThat(new Solution().splitArray(nums), equalTo(-1L));
    }

    @Test
    void splitArray11() {
        int[] nums = {1, 2, 5, 4, 3};
        assertThat(new Solution().splitArray(nums), equalTo(1L));
    }

    @Test
    void splitArray12() {
        int[] nums = {5, 10, 2, 1};
        assertThat(new Solution().splitArray(nums), equalTo(8L));
    }

    @Test
    void splitArray13() {
        int[] nums = {2, 3, 1};
        assertThat(new Solution().splitArray(nums), equalTo(2L));
    }

    @Test
    void splitArray14() {
        int[] nums = {10, 20, 15, 5};
        assertThat(new Solution().splitArray(nums), equalTo(10L));
    }

    @Test
    void splitArray15() {
        int[] nums = {5, 4, 3, 2, 1};
        assertThat(new Solution().splitArray(nums), equalTo(5L));
    }

    @Test
    void splitArray16() {
        int[] nums = {3, 3, 3, 2, 1};
        assertThat(new Solution().splitArray(nums), equalTo(-1L));
    }

    @Test
    void splitArray17() {
        int[] nums = {1, 0};
        assertThat(new Solution().splitArray(nums), equalTo(1L));
    }

    @Test
    void splitArray18() {
        int[] nums = {2, 4, 4, 2};
        assertThat(new Solution().splitArray(nums), equalTo(0L));
    }

    @Test
    void splitArray19() {
        int[] nums = {1, 10, 9, 8, 7};
        assertThat(new Solution().splitArray(nums), equalTo(13L));
    }

    @Test
    void splitArray20() {
        int[] nums = {1, 3, 2, 4, 1};
        assertThat(new Solution().splitArray(nums), equalTo(-1L));
    }

    @Test
    void splitArray21() {
        int[] nums = {5, 5, 4, 3};
        assertThat(new Solution().splitArray(nums), equalTo(7L));
    }

    @Test
    void splitArray22() {
        int[] nums = {100, 200, 10, 5};
        assertThat(new Solution().splitArray(nums), equalTo(115L));
    }

    @Test
    void splitArray23() {
        int[] nums = {3, 5, 2};
        assertThat(new Solution().splitArray(nums), equalTo(4L));
    }
}
