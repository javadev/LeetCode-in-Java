package g1201_1300.s1226_the_dining_philosophers;

// #Medium #Concurrency #2022_03_12_Time_9_ms_(99.62%)_Space_43_MB_(78.59%)

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {

    private final Lock[] forks =
            new Lock[] {
                new ReentrantLock(),
                new ReentrantLock(),
                new ReentrantLock(),
                new ReentrantLock(),
                new ReentrantLock()
            };

    public void wantsToEat(
            int philosopher,
            Runnable pickLeftFork,
            Runnable pickRightFork,
            Runnable eat,
            Runnable putLeftFork,
            Runnable putRightFork) {

        int leftForkIndex = (philosopher + 1) % 5;

        Lock firstFork;
        Lock secondFork;
        Runnable pickFirstFork;
        Runnable pickSecondFork;
        Runnable putFirstFork;
        Runnable putSecondFork;
        if (philosopher % 2 == 0) {
            firstFork = forks[philosopher];
            secondFork = forks[leftForkIndex];
            pickFirstFork = pickRightFork;
            pickSecondFork = pickLeftFork;
            putFirstFork = putRightFork;
            putSecondFork = putLeftFork;
        } else {
            firstFork = forks[leftForkIndex];
            secondFork = forks[philosopher];
            pickFirstFork = pickLeftFork;
            pickSecondFork = pickRightFork;
            putFirstFork = putLeftFork;
            putSecondFork = putRightFork;
        }
        firstFork.lock();
        pickFirstFork.run();
        secondFork.lock();
        pickSecondFork.run();
        eat.run();
        putFirstFork.run();
        firstFork.unlock();
        putSecondFork.run();
        secondFork.unlock();
    }
}
