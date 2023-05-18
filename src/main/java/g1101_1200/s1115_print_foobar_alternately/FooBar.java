package g1101_1200.s1115_print_foobar_alternately;

// #Medium #Concurrency #2022_03_08_Time_16_ms_(90.05%)_Space_42.4_MB_(58.80%)

import java.util.concurrent.Semaphore;

@SuppressWarnings("java:S2142")
public class FooBar {
    private int n;

    private final Semaphore fooSemaphore;
    private final Semaphore barSemaphore;

    public FooBar(int n) {
        this.n = n;
        fooSemaphore = new Semaphore(1);
        barSemaphore = new Semaphore(1);
        try {
            barSemaphore.acquire();
        } catch (InterruptedException ignored) {
            // ignored
        }
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            fooSemaphore.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            barSemaphore.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            barSemaphore.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fooSemaphore.release();
        }
    }
}
