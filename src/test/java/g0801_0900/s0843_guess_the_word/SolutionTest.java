package g0801_0900.s0843_guess_the_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSecretWord() {
        int[] numCalls = new int[] {0};
        new Solution()
                .findSecretWord(
                        new String[] {"acckzz", "ccbazz", "eiowzz", "abcczz"},
                        word -> {
                            numCalls[0]++;
                            int result = -1;
                            switch (word) {
                                case "acckzz":
                                    result = 6;
                                    break;
                                case "ccbazz":
                                    result = 3;
                                    break;
                                case "eiowzz":
                                    result = 2;
                                    break;
                                case "abcczz":
                                    result = 4;
                                    break;
                            }
                            return result;
                        });
        assertThat(numCalls[0], equalTo(2));
    }
}
