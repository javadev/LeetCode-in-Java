package g1301_1400.s1396_design_underground_system;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class UndergroundSystemTest {
    @Test
    void undergroundSystem() {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        // Customer 45 "Leyton" -> "Waterloo" in 15-3 = 12
        undergroundSystem.checkOut(45, "Waterloo", 15);
        // Customer 27 "Leyton" -> "Waterloo" in 20-10 = 10
        undergroundSystem.checkOut(27, "Waterloo", 20);
        // Customer 32 "Paradise" -> "Cambridge" in 22-8 = 14
        undergroundSystem.checkOut(32, "Cambridge", 22);
        // return 14.00000. One trip "Paradise" -> "Cambridge", (14) / 1 = 14
        assertThat(undergroundSystem.getAverageTime("Paradise", "Cambridge"), equalTo(14.0));
        // return 11.00000. Two trips "Leyton" -> "Waterloo", (10 + 12) / 2 = 11
        assertThat(undergroundSystem.getAverageTime("Leyton", "Waterloo"), equalTo(11.0));
        undergroundSystem.checkIn(10, "Leyton", 24);
        // return 11.00000
        assertThat(undergroundSystem.getAverageTime("Leyton", "Waterloo"), equalTo(11.0));
        // Customer 10 "Leyton" -> "Waterloo" in 38-24 = 14
        undergroundSystem.checkOut(10, "Waterloo", 38);
        // return 12.00000. Three trips "Leyton" -> "Waterloo", (10 + 12 + 14) / 3 = 12
        assertThat(undergroundSystem.getAverageTime("Leyton", "Waterloo"), equalTo(12.0));
    }

    @Test
    void undergroundSystem2() {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(10, "Leyton", 3);
        // Customer 10 "Leyton" -> "Paradise" in 8-3 = 5
        undergroundSystem.checkOut(10, "Paradise", 8);
        // return 5.00000, (5) / 1 = 5
        assertThat(undergroundSystem.getAverageTime("Leyton", "Paradise"), equalTo(5.0));
        undergroundSystem.checkIn(5, "Leyton", 10);
        // Customer 5 "Leyton" -> "Paradise" in 16-10 = 6
        undergroundSystem.checkOut(5, "Paradise", 16);
        // return 5.50000, (5 + 6) / 2 = 5.5
        assertThat(undergroundSystem.getAverageTime("Leyton", "Paradise"), equalTo(5.5));
        undergroundSystem.checkIn(2, "Leyton", 21);
        // Customer 2 "Leyton" -> "Paradise" in 30-21 = 9
        undergroundSystem.checkOut(2, "Paradise", 30);
        // return 6.66667, (5 + 6 + 9) / 3 = 6.66667
        assertThat(
                undergroundSystem.getAverageTime("Leyton", "Paradise"), equalTo(6.666666666666667));
    }
}
