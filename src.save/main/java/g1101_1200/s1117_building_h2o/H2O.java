package g1101_1200.s1117_building_h2o;

// #Medium #Concurrency #2022_03_09_Time_12_ms_(93.81%)_Space_42.9_MB_(89.01%)

import java.util.concurrent.Semaphore;

@SuppressWarnings({"java:S106", "java:S2142"})
public class H2O {
    private Semaphore hSemaphore;
    private Semaphore oSemaphore;

    public H2O() {
        hSemaphore = new Semaphore(2);
        oSemaphore = new Semaphore(2);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hSemaphore.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        oSemaphore.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oSemaphore.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        hSemaphore.release(2);
    }

    public static class HydrogenRunnable implements Runnable {
        private H2O h2O;

        public HydrogenRunnable(H2O h2O) {
            this.h2O = h2O;
        }

        @Override
        public void run() {
            try {
                h2O.hydrogen(() -> System.out.print('H'));
            } catch (InterruptedException ignored) {
                // ignored
            }
        }
    }

    public static class OxygenRunnable implements Runnable {
        private H2O h2O;

        public OxygenRunnable(H2O h2O) {
            this.h2O = h2O;
        }

        @Override
        public void run() {
            try {
                h2O.oxygen(() -> System.out.print('O'));
            } catch (InterruptedException ignored) {
                // ignored
            }
        }
    }
}
