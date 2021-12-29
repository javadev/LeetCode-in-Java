package g0401_0500.s0476_number_complement;

// #Easy #Bit_Manipulation

public class Solution {
    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}