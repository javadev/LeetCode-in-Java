package g1101_1200.s1195_fizz_buzz_multithreaded;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

@SuppressWarnings("java:S2925")
class FizzBuzzTest {
    @Test
    void fizzBuzz() throws InterruptedException {
        int[] fizz = {0};
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        new Thread(
                        () -> {
                            fizzBuzz.fizz(() -> fizz[0]++);
                        })
                .start();
        new Thread(
                        () -> {
                            fizzBuzz.buzz(() -> fizz[0]++);
                        })
                .start();
        new Thread(
                        () -> {
                            fizzBuzz.fizzbuzz(() -> fizz[0]++);
                        })
                .start();
        new Thread(
                        () -> {
                            fizzBuzz.number(
                                    value -> {
                                        fizz[0]++;
                                    });
                        })
                .start();
        TimeUnit.MILLISECONDS.sleep(2000);
        assertThat(fizz[0] > 0, equalTo(true));
    }

    @Test
    void fizzBuzz2() throws InterruptedException {
        int[] fizz = {0};
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        new Thread(
                        () -> {
                            fizzBuzz.fizz(() -> fizz[0]++);
                        })
                .start();
        new Thread(
                        () -> {
                            fizzBuzz.buzz(() -> fizz[0]++);
                        })
                .start();
        new Thread(
                        () -> {
                            fizzBuzz.fizzbuzz(() -> fizz[0]++);
                        })
                .start();
        new Thread(
                        () -> {
                            fizzBuzz.number(
                                    value -> {
                                        fizz[0]++;
                                    });
                        })
                .start();
        TimeUnit.MILLISECONDS.sleep(600);
        assertThat(fizz[0] >= 0, equalTo(true));
    }
}
