package g1101_1200.s1116_print_zero_even_odd;

// #Medium #Concurrency #2023_06_01_Time_7_ms_(38.76%)_Space_42_MB_(38.97%)

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

@SuppressWarnings({"java:S2142", "java:S2583"})
public class ZeroEvenOdd {
    private int n;

    private final Semaphore zeroSemaphore = new Semaphore(1);
    private final Semaphore oddSemaphore = new Semaphore(1);
    private final Semaphore evenSemaphore = new Semaphore(1);

    public ZeroEvenOdd(int n) {
        this.n = n;
        try {
            oddSemaphore.acquire();
            evenSemaphore.acquire();
        } catch (InterruptedException ignored) {
            // ignored
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            zeroSemaphore.acquire();
            printNumber.accept(0);
            if (i % 2 == 0) {
                oddSemaphore.release();
            } else {
                evenSemaphore.release();
            }
        }
        oddSemaphore.release();
        evenSemaphore.release();
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            evenSemaphore.acquire();
            if (i > n) {
                zeroSemaphore.release();
                evenSemaphore.release();
                break;
            }
            printNumber.accept(i);
            zeroSemaphore.release();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            oddSemaphore.acquire();
            if (i > n) {
                zeroSemaphore.release();
                oddSemaphore.release();
                break;
            }
            printNumber.accept(i);
            zeroSemaphore.release();
        }
    }
}
