package g2401_2500.s2469_convert_the_temperature;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void convertTemperature() {
        assertThat(
                new Solution().convertTemperature(36.50),
                equalTo(new double[] {309.65000, 97.70000}));
    }

    @Test
    void convertTemperature2() {
        assertThat(
                new Solution().convertTemperature(122.11),
                equalTo(new double[] {395.26000, 251.79800}));
    }
}
