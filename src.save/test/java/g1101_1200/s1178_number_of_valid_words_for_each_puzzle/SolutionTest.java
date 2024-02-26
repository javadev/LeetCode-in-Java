package g1101_1200.s1178_number_of_valid_words_for_each_puzzle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findNumOfValidWords() {
        assertThat(
                new Solution()
                        .findNumOfValidWords(
                                new String[] {
                                    "aaaa", "asas", "able", "ability", "actt", "actor", "access"
                                },
                                new String[] {
                                    "aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"
                                }),
                equalTo(Arrays.asList(1, 1, 3, 2, 4, 0)));
    }

    @Test
    void findNumOfValidWords2() {
        assertThat(
                new Solution()
                        .findNumOfValidWords(
                                new String[] {"apple", "pleas", "please"},
                                new String[] {
                                    "aelwxyz", "aelpxyz", "aelpsxy", "saelpxy", "xaelpsy"
                                }),
                equalTo(Arrays.asList(0, 1, 3, 2, 0)));
    }
}
