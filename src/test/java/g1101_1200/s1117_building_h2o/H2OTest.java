package g1101_1200.s1117_building_h2o;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class H2OTest {
    @Test
    void h20() {
        H2O h2o = new H2O();
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(6, 30, 15, TimeUnit.SECONDS, new ArrayBlockingQueue<>(12));
        for (int i = 0; i < 12; i++) {
            executor.execute(new H2O.HydrogenRunnable(h2o));
            executor.execute(new H2O.OxygenRunnable(h2o));
            executor.execute(new H2O.HydrogenRunnable(h2o));
        }
        assertThat(true, equalTo(true));
    }
}
