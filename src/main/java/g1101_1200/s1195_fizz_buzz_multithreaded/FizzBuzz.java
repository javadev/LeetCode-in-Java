package g1101_1200.s1195_fizz_buzz_multithreaded;

// #Medium #Concurrency #2024_11_24_Time_6_ms_(94.88%)_Space_43.1_MB_(8.61%)

import java.util.function.IntConsumer;

@SuppressWarnings("java:S1130")
public class FizzBuzz {
    private final int n;
    private int current;

    public FizzBuzz(int n) {
        this.n = n;
        this.current = 1;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        synchronized (this) {
            while (current <= n) {
                if (current % 3 == 0 && current % 5 != 0) {
                    printFizz.run();
                    current += 1;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        synchronized (this) {
            while (current <= n) {
                if (current % 3 != 0 && current % 5 == 0) {
                    printBuzz.run();
                    current += 1;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        synchronized (this) {
            while (current <= n) {
                if (current % 15 == 0) {
                    printFizzBuzz.run();
                    current += 1;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            while (current <= n) {
                if (current % 3 != 0 && current % 5 != 0) {
                    printNumber.accept(current);
                    current += 1;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }
}
