package g3801_3900.s3824_minimum_k_to_reduce_array_within_limit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minimumK() {
        assertThat(new Solution().minimumK(new int[] {3, 7, 5}), equalTo(3));
    }

    @Test
    void minimumK2() {
        assertThat(new Solution().minimumK(new int[] {1}), equalTo(1));
    }

    @Test
    void minimumK3() {
        // Single element of value 10: ceil(10/k) <= k => k >= 4 (since 10/4=3 ceil 3, +1 length=4
        // <= 16)
        // Actually: nonPositive = 1 + ceil((10-1)/k+? ); test with simple expected
        assertThat(new Solution().minimumK(new int[] {10}), equalTo(4));
    }

    @Test
    void minimumK4() {
        // Array of all ones: sum = n, each (1-1)/k = 0, so nonPositive = n. Need n <= k*k
        // n=4 -> k>=2
        assertThat(new Solution().minimumK(new int[] {1, 1, 1, 1}), equalTo(2));
    }

    @Test
    void minimumK5() {
        // n=9, need k*k >= 9, k>=3
        assertThat(new Solution().minimumK(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1}), equalTo(3));
    }

    @Test
    void minimumK6() {
        assertThat(new Solution().minimumK(new int[] {1, 1}), equalTo(2));
    }

    @Test
    void minimumK7() {
        // Two elements of 1000000
        // n=2, need: 2 + 2*ceil(999999/k) <= k*k
        // k=126: 2 + 2*ceil(999999/126)=2+2*7937=15876, k*k=15876 -> exactly equal
        assertThat(new Solution().minimumK(new int[] {1000000, 1000000}), equalTo(126));
    }

    @Test
    void minimumK8() {
        assertThat(new Solution().minimumK(new int[] {2, 3, 4, 5}), equalTo(3));
    }

    @Test
    void minimumK9() {
        assertThat(new Solution().minimumK(new int[] {5, 5, 5}), equalTo(3));
    }

    @Test
    void minimumK10() {
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = 1;
        }
        // n=100, need k*k >= 100, k>=10
        assertThat(new Solution().minimumK(nums), equalTo(10));
    }

    @Test
    void minimumK11() {
        int[] nums = new int[50];
        for (int i = 0; i < 50; i++) {
            nums[i] = i + 1;
        }
        assertThat(new Solution().minimumK(nums), equalTo(10));
    }

    @Test
    void minimumK12() {
        // n=1, val=2: nonPositive=1+ceil(1/k). Need <= k*k. k=2: 1+1=2 <=4 yes. k=1: 1+1=2 <=1? No
        assertThat(new Solution().minimumK(new int[] {2}), equalTo(2));
    }

    @Test
    void minimumK13() {
        assertThat(new Solution().minimumK(new int[] {100, 200, 300, 400, 500}), equalTo(15));
    }

    @Test
    void minimumK14() {
        // single element with max int-like value
        int[] nums = {1000000};
        // need 1 + ceil(999999/k) <= k*k
        // k=100: 1 + 10000 = 10001, k*k=10000 -> no
        // k=101: 1 + ceil(999999/101)=1+9901=9902, k*k=10201 -> yes
        assertThat(new Solution().minimumK(nums), equalTo(101));
    }

    @Test
    void minimumK15() {
        // n=3, need k*k >= 3, k>=2
        assertThat(new Solution().minimumK(new int[] {1, 1, 1}), equalTo(2));
    }

    @Test
    void minimumK16() {
        assertThat(new Solution().minimumK(new int[] {1, 2}), equalTo(2));
    }
}
