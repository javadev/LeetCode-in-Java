package g0801_0900.s0900_rle_iterator;

// #Medium #Array #Design #Counting #Iterator

public class RLEIterator {
    private int index;
    private int[] array;

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
