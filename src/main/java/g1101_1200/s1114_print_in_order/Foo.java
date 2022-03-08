package g1101_1200.s1114_print_in_order;

// #Easy #Concurrency #2022_03_08_Time_16_ms_(77.21%)_Space_42.4_MB_(49.45%)

public class Foo {
    private volatile boolean firstFinished;
    private volatile boolean secondFinished;

    public void first(Runnable printFirst) {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstFinished = true;
    }

    public void second(Runnable printSecond) {
        // printSecond.run() outputs "second". Do not change or remove this line.
        while (true) {
            if (firstFinished) {
                printSecond.run();
                secondFinished = true;
                break;
            }
        }
    }

    public void third(Runnable printThird) {
        // printThird.run() outputs "third". Do not change or remove this line.
        while (true) {
            if (firstFinished && secondFinished) {
                printThird.run();
                break;
            }
        }
    }
}
