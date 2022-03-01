package g0401_0500.s0412_fizz_buzz;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fizzBuzz() {
        assertThat(new Solution().fizzBuzz(3), equalTo(Arrays.asList("1", "2", "Fizz")));
    }

    @Test
    void fizzBuzz2() {
        assertThat(
                new Solution().fizzBuzz(5), equalTo(Arrays.asList("1", "2", "Fizz", "4", "Buzz")));
    }

    @Test
    void fizzBuzz3() {
        assertThat(
                new Solution().fizzBuzz(15),
                equalTo(
                        Arrays.asList(
                                "1",
                                "2",
                                "Fizz",
                                "4",
                                "Buzz",
                                "Fizz",
                                "7",
                                "8",
                                "Fizz",
                                "Buzz",
                                "11",
                                "Fizz",
                                "13",
                                "14",
                                "FizzBuzz")));
    }
}
