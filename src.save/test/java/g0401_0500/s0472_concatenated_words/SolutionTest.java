package g0401_0500.s0472_concatenated_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findAllConcatenatedWordsInADict() {
        assertThat(
                new Solution()
                        .findAllConcatenatedWordsInADict(
                                new String[] {
                                    "cat",
                                    "cats",
                                    "catsdogcats",
                                    "dog",
                                    "dogcatsdog",
                                    "hippopotamuses",
                                    "rat",
                                    "ratcatdogcat"
                                }),
                equalTo(
                        new ArrayList<>(
                                Arrays.asList("dogcatsdog", "catsdogcats", "ratcatdogcat"))));
    }

    @Test
    void findAllConcatenatedWordsInADict2() {
        assertThat(
                new Solution()
                        .findAllConcatenatedWordsInADict(new String[] {"cat", "dog", "catdog"}),
                equalTo(new ArrayList<>(Arrays.asList("catdog"))));
    }
}
