package g0801_0900.s0843_guess_the_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

@SuppressWarnings("java:S5976")
class SolutionTest {
    @Test
    void findSecretWord() {
        int[] numCalls = new int[] {0};
        doFindSecretWord(numCalls);
        assertThat(numCalls[0] > 0, equalTo(true));
    }

    @Test
    void findSecretWord2() {
        int[] numCalls = new int[] {0};
        doFindSecretWord(numCalls);
        assertThat(numCalls[0] > 0, equalTo(true));
    }

    @Test
    void findSecretWord3() {
        int[] numCalls = new int[] {0};
        doFindSecretWord(numCalls);
        assertThat(numCalls[0] > 0, equalTo(true));
    }

    private void doFindSecretWord(int[] numCalls) {
        new Solution()
                .findSecretWord(
                        new String[] {"acckzz", "ccbazz", "eiowzz", "abcczz"},
                        word -> {
                            numCalls[0]++;
                            int result;
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
                                default:
                                    result = -1;
                                    break;
                            }
                            return result;
                        });
    }
}
