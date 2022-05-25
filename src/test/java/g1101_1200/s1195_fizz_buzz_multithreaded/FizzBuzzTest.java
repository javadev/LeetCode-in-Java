package g1101_1200.s1195_fizz_buzz_multithreaded;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void fizzBuzz() throws InterruptedException {
        int[] fizz = {0};
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        new Thread(
                        () -> {
                            try {
                                fizzBuzz.fizz(() -> fizz[0]++);
                            } catch (InterruptedException e) {
                            }
                        })
                .start();
        new Thread(
                        () -> {
                            try {
                                fizzBuzz.buzz(() -> fizz[0]++);
                            } catch (InterruptedException e) {
                            }
                        })
                .start();
        new Thread(
                        () -> {
                            try {
                                fizzBuzz.fizzbuzz(() -> fizz[0]++);
                            } catch (InterruptedException e) {
                            }
                        })
                .start();
        new Thread(
                        () -> {
                            try {
                                fizzBuzz.number(
                                        value -> {
                                            fizz[0]++;
                                        });
                            } catch (InterruptedException e) {
                            }
                        })
                .start();
        TimeUnit.MILLISECONDS.sleep(450);
        assertThat(fizz[0], equalTo(15));
    }

    @Test
    void fizzBuzz2() throws InterruptedException {
        int[] fizz = {0};
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        new Thread(
                        () -> {
                            try {
                                fizzBuzz.fizz(() -> fizz[0]++);
                            } catch (InterruptedException e) {
                            }
                        })
                .start();
        new Thread(
                        () -> {
                            try {
                                fizzBuzz.buzz(() -> fizz[0]++);
                            } catch (InterruptedException e) {
                            }
                        })
                .start();
        new Thread(
                        () -> {
                            try {
                                fizzBuzz.fizzbuzz(() -> fizz[0]++);
                            } catch (InterruptedException e) {
                            }
                        })
                .start();
        new Thread(
                        () -> {
                            try {
                                fizzBuzz.number(
                                        value -> {
                                            fizz[0]++;
                                        });
                            } catch (InterruptedException e) {
                            }
                        })
                .start();
        TimeUnit.MILLISECONDS.sleep(450);
        assertThat(fizz[0], equalTo(5));
    }
}
