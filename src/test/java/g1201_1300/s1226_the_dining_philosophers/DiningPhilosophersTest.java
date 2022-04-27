package g1201_1300.s1226_the_dining_philosophers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class DiningPhilosophersTest {
    @Test
    void diningPhilosophers() throws InterruptedException {
        int[] calls = {0};
        int n = 1;
        DiningPhilosophers d = new DiningPhilosophers();
        new Thread(
                        () -> {
                            for (int i = 0; i < n; i++) {
                                try {
                                    d.wantsToEat(
                                            0,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                .start();
        new Thread(
                        () -> {
                            for (int i = 0; i < n; i++) {
                                try {
                                    d.wantsToEat(
                                            1,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                .start();
        new Thread(
                        () -> {
                            for (int i = 0; i < n; i++) {
                                try {
                                    d.wantsToEat(
                                            2,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                .start();
        new Thread(
                        () -> {
                            for (int i = 0; i < n; i++) {
                                try {
                                    d.wantsToEat(
                                            3,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                .start();
        new Thread(
                        () -> {
                            for (int i = 0; i < n; i++) {
                                try {
                                    d.wantsToEat(
                                            4,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++,
                                            () -> calls[0]++);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                .start();
        TimeUnit.MILLISECONDS.sleep(200);
        assertThat(calls[0], equalTo(25));
    }
}
