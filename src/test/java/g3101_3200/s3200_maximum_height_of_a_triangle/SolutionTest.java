package g3101_3200.s3200_maximum_height_of_a_triangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxHeightOfTriangle() {
        assertThat(new Solution().maxHeightOfTriangle(2, 4), equalTo(3));
    }

    @Test
    void maxHeightOfTriangle2() {
        assertThat(new Solution().maxHeightOfTriangle(2, 1), equalTo(2));
    }
}
