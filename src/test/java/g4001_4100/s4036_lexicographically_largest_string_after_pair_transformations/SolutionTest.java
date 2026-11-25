package g4001_4100.s4036_lexicographically_largest_string_after_pair_transformations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestString() {
        assertArrayEquals(new String[] {"a", "ba", ""}, new Solution().largestString(new int[] {1, 3, 0}));
    }

    @Test
    void largestString2() {
        assertArrayEquals(new String[] {"za"}, new Solution().largestString(new int[] {(1 << 25) | 1}));
    }
}

