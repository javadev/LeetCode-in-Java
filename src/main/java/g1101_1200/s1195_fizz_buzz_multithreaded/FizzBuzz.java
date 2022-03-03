package g1101_1200.s1195_fizz_buzz_multithreaded;

// #Medium #Concurrency #2022_03_03_Time_8_ms_(80.09%)_Space_43.2_MB_(6.17%)

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

@SuppressWarnings("java:S1130")
public class FizzBuzz {
    private final AtomicInteger count = new AtomicInteger(1);

    private final int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        int i;
        while ((i = count.get()) <= n) {
            if (i % 3 == 0 && i % 5 != 0) {
                printFizz.run();
                count.compareAndSet(i, i + 1);
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        int i;
        while ((i = count.get()) <= n) {
            count.get();
            if (i % 5 == 0 && i % 3 != 0) {
                printBuzz.run();
                count.compareAndSet(i, i + 1);
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        int i;
        while ((i = count.get()) <= n) {
            if (i % 15 == 0) {
                printFizzBuzz.run();
                count.compareAndSet(i, i + 1);
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        int i;
        while ((i = count.get()) <= n) {
            if (i % 5 != 0 && i % 3 != 0) {
                printNumber.accept(i);
                count.compareAndSet(i, i + 1);
            }
        }
    }
}
