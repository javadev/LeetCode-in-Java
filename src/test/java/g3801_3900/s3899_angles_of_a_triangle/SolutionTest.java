package g3801_3900.s3899_angles_of_a_triangle;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void internalAngles() {
        assertArrayEquals(
                new double[] {36.869897646, 53.130102354, 90.0},
                new Solution().internalAngles(new int[] {3, 4, 5}),
                0.00001);
    }

    @Test
    void internalAngles2() {
        assertArrayEquals(
                new double[] {36.869897646, 53.130102354, 90.0},
                new Solution().internalAngles(new int[] {5, 3, 4}),
                0.00001);
    }

    @Test
    void internalAngles3() {
        assertArrayEquals(
                new double[] {60.0, 60.0, 60.0},
                new Solution().internalAngles(new int[] {1000, 1000, 1000}),
                0.00001);
    }

    @Test
    void internalAngles4() {
        assertArrayEquals(
                new double[0], new Solution().internalAngles(new int[] {2, 4, 2}), 0.00001);
    }

    @Test
    void internalAngles5() {
        assertArrayEquals(
                new double[0], new Solution().internalAngles(new int[] {5, 1, 2}), 0.00001);
    }

    @Test
    void internalAngles6() {
        assertArrayEquals(
                new double[0], new Solution().internalAngles(new int[] {1, 2, 5}), 0.00001);
    }
}
