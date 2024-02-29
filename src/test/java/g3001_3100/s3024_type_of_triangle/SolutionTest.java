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
}
