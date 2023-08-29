package g1101_1200.s1114_print_in_order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

@SuppressWarnings("java:S2925")
class FooTest {
    @Test
    void foo() throws InterruptedException {
        int[] fooData = {0};
        Foo foo = new Foo();
        new Thread(() -> foo.first(() -> fooData[0]++)).start();
        new Thread(() -> foo.second(() -> fooData[0]++)).start();
        new Thread(() -> foo.third(() -> fooData[0]++)).start();
        TimeUnit.MILLISECONDS.sleep(1200);
        assertThat(fooData[0], equalTo(3));
    }
}
