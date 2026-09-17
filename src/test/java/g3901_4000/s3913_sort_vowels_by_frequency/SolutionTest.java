package g3901_4000.s3913_sort_vowels_by_frequency;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortVowels() {
        assertThat(new Solution().sortVowels("leetcode"), equalTo("leetcedo"));
    }

    @Test
    void sortVowels2() {
        assertThat(new Solution().sortVowels("aeiaaioooa"), equalTo("aaaaoooiie"));
    }

    @Test
    void sortVowels3() {
        assertThat(new Solution().sortVowels("baeiou"), equalTo("baeiou"));
    }

    @Test
    void sortVowels4() {
        assertThat(new Solution().sortVowels("rhythm"), equalTo("rhythm"));
    }

    @Test
    void sortVowels5() {
        assertThat(new Solution().sortVowels("u"), equalTo("u"));
    }

    @Test
    void sortVowels6() {
        assertThat(new Solution().sortVowels("uoeaiuoeai"), equalTo("uuooeeaaii"));
    }

    @Test
    void sortVowels7() {
        assertThat(new Solution().sortVowels("obabao"), equalTo("obobaa"));
    }
}
