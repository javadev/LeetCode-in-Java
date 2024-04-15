package g0601_0700.s0648_replace_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void replaceWords() {
        assertThat(
                new Solution()
                        .replaceWords(
                                Arrays.asList("cat", "bat", "rat"),
                                "the cattle was rattled by the battery"),
                equalTo("the cat was rat by the bat"));
    }

    @Test
    void replaceWords2() {
        assertThat(
                new Solution()
                        .replaceWords(Arrays.asList("a", "b", "c"), "aadsfasf absbs bbab cadsfafs"),
                equalTo("a a b c"));
    }
}
