package g0801_0900.s0900_rle_iterator;

// #Medium #Array #Design #Counting #Iterator #2022_03_28_Time_3_ms_(100.00%)_Space_41.8_MB_(96.19%)

@SuppressWarnings("java:S135")
public class RLEIterator {
    private int index;
    private final int[] array;

    public RLEIterator(int[] encoding) {
        index = 0;
        array = encoding;
    }

    public int next(int n) {
        int lastElement = -1;
        while (n > 0 && index < array.length) {
            if (array[index] > n) {
                array[index] -= n;
                lastElement = array[index + 1];
                break;
            } else if (array[index] == n) {
                array[index] = 0;
                lastElement = array[index + 1];
                index += 2;
                break;
            } else {
                n -= array[index];
                index += 2;
            }
        }
        return lastElement;
    }
}
