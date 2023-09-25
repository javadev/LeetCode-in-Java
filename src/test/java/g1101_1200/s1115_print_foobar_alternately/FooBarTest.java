package g1101_1200.s1115_print_foobar_alternately;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

@SuppressWarnings("java:S2925")
class FooBarTest {
    @Test
    void fooBar() throws InterruptedException {
        int[] fooBarData = {0};
        int n = 1;
        Runnable fooPrinter = () -> fooBarData[0]++;
        Runnable barPrinter = () -> fooBarData[0]++;

        FooBar foobar = new FooBar(n);
        Thread fooThread =
                new Thread(
                        () -> {
                            try {
                                foobar.foo(fooPrinter);
                            } catch (InterruptedException ignored) {
                            }
                        });
        Thread barThread =
                new Thread(
                        () -> {
                            try {
                                foobar.bar(barPrinter);
                            } catch (InterruptedException ignored) {
                            }
                        });

        fooThread.start();
        barThread.start();

        fooThread.join();
        barThread.join();
        TimeUnit.MILLISECONDS.sleep(100);
        assertThat(fooBarData[0], equalTo(2));
    }
}
