package g0401_0500.s0451_sort_characters_by_frequency;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void frequencySort() {
        assertThat(
                new Solution().frequencySort("tree"), equalTo("eert"));
    }

    @Test
    void frequencySort2() {
        assertThat(
                new Solution().frequencySort("cccaaa"), equalTo("aaaccc"));
    }

    @Test
    void frequencySort3() {
        assertThat(
                new Solution().frequencySort("Aabb"), equalTo("bbAa"));
    }
}
