package g3001_3100.s3024_type_of_triangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void triangleType() {
        assertThat(new Solution().triangleType(new int[] {3, 3, 3}), equalTo("equilateral"));
    }

    @Test
    void triangleType2() {
        assertThat(new Solution().triangleType(new int[] {3, 4, 5}), equalTo("scalene"));
    }

    @Test
    void triangleType3() {
        assertThat(new Solution().triangleType(new int[] {5, 5, 3}), equalTo("isosceles"));
    }

    @Test
    void triangleType4() {
        assertThat(new Solution().triangleType(new int[] {1, 2, 3}), equalTo("none"));
    }

    @Test
    void triangleType5() {
        assertThat(new Solution().triangleType(new int[] {100, 100, 100}), equalTo("equilateral"));
    }

    @Test
    void triangleType6() {
        assertThat(new Solution().triangleType(new int[] {7, 10, 7}), equalTo("isosceles"));
    }

    @Test
    void triangleType7() {
        assertThat(new Solution().triangleType(new int[] {0, 4, 4}), equalTo("none"));
    }

    @Test
    void triangleType8() {
        assertThat(new Solution().triangleType(new int[] {-3, 4, 5}), equalTo("none"));
    }

    @Test
    void triangleType9() {
        // 2 + 3 = 5 → equals, not greater → invalid
        assertThat(new Solution().triangleType(new int[] {2, 3, 5}), equalTo("none"));
    }

    @Test
    void triangleType10() {
        assertThat(new Solution().triangleType(new int[] {5, 3, 4}), equalTo("scalene"));
    }

    @Test
    void triangleType11() {
        assertThat(new Solution().triangleType(new int[] {4, 6, 6}), equalTo("isosceles"));
    }

    @Test
    void triangleType12() {
        assertThat(new Solution().triangleType(new int[] {0, 0, 0}), equalTo("none"));
    }

    @Test
    void triangleType13() {
        assertThat(new Solution().triangleType(new int[] {5, 5, 6}), equalTo("isosceles"));
    }

    @Test
    void triangleType14() {
        assertThat(new Solution().triangleType(new int[] {10, 11, 12}), equalTo("scalene"));
    }

    @Test
    void triangleType15() {
        assertThat(new Solution().triangleType(new int[] {1, 10, 12}), equalTo("none"));
    }
}
