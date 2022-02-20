package g0901_1000.s0917_reverse_only_letters;

// #Easy #String #Two_Pointers

public class Solution {
    public String reverseOnlyLetters(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (Character.isLetter(array[i]) && Character.isLetter(array[j])) {
                char temp = array[i];
                array[i++] = array[j];
                array[j--] = temp;
            } else if (Character.isLetter(array[i])) {
                j--;
            } else if (Character.isLetter(array[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return new String(array);
    }
}
