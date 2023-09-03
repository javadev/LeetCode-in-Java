package g0001_0100.s0049_group_anagrams;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void groupAnagrams() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("eat", "tea", "ate"));
        expected.add(Arrays.asList("bat"));
        expected.add(Arrays.asList("tan", "nat"));
        List<List<String>> actual =
                new Solution()
                        .groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
        assertThat(actual, equalTo(expected));
    }

    @Test
    void groupAnagrams2() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList(""));
        List<List<String>> actual = new Solution().groupAnagrams(new String[] {""});
        assertThat(actual, equalTo(expected));
    }

    @Test
    void groupAnagrams3() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("a"));
        List<List<String>> actual = new Solution().groupAnagrams(new String[] {"a"});
        assertThat(actual, equalTo(expected));
    }
}
