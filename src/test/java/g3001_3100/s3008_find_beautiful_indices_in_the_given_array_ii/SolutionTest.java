package g3001_3100.s3008_find_beautiful_indices_in_the_given_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void beautifulIndices() {
        assertThat(
                new Solution()
                        .beautifulIndices(
                                "isawsquirrelnearmysquirrelhouseohmy", "my", "squirrel", 15),
                equalTo(Arrays.asList(16, 33)));
    }

    @Test
    void beautifulIndices2() {
        assertThat(new Solution().beautifulIndices("abcd", "a", "a", 4), equalTo(List.of(0)));
    }
}
