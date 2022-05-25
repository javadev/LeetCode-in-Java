package g1101_1200.s1116_print_zero_even_odd;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;
import org.junit.jupiter.api.Test;

@SuppressWarnings("java:S2925")
class ZeroEvenOddTest {
    @Test
    void zeroEvenOdd() throws InterruptedException {
        int[] zeroEvenOddData = {0};
        IntConsumer consumer = (data) -> zeroEvenOddData[0]++;
        int n = 5;
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(n);
        Thread firstThread =
                new Thread(
                        () -> {
                            try {
                                zeroEvenOdd.zero(consumer);
                            } catch (Exception ignored) {
                            }
                        });
        Thread secondThread =
                new Thread(
                        () -> {
                            try {
                                zeroEvenOdd.odd(consumer);
                            } catch (Exception ignored) {
                            }
                        });
        Thread thirdThread =
                new Thread(
                        new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    zeroEvenOdd.even(consumer);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        });

        firstThread.start();
        secondThread.start();
        thirdThread.start();
        firstThread.join();
        secondThread.join();
        thirdThread.join();
        TimeUnit.MILLISECONDS.sleep(100);
        assertThat(zeroEvenOddData[0], equalTo(10));
    }
}
