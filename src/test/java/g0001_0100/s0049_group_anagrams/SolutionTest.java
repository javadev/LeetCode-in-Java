package g0001_0100.s0049_group_anagrams;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void groupAnagrams() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("eat", "tea", "ate"));
        expected.add(Arrays.asList("bat"));
        expected.add(Arrays.asList("tan", "nat"));
        List<List<String>> actual =
                new Solution()
                        .groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
        assertThat(actual, equalTo(expected));
    }
}
