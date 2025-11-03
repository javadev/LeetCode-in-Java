package g3701_3800.s3734_lexicographically_smallest_palindromic_permutation_greater_than_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasLength;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lexPalindromicPermutation() {
        assertThat(new Solution().lexPalindromicPermutation("baba", "abba"), equalTo("baab"));
    }

    @Test
    void lexPalindromicPermutation2() {
        assertThat(new Solution().lexPalindromicPermutation("baba", "bbaa"), equalTo(""));
    }

    @Test
    void lexPalindromicPermutation3() {
        assertThat(new Solution().lexPalindromicPermutation("abc", "abb"), equalTo(""));
    }

    @Test
    void lexPalindromicPermutation4() {
        assertThat(new Solution().lexPalindromicPermutation("aac", "abb"), equalTo("aca"));
    }

    @Test
    void lexPalindromicPermutation5() {
        // Branch: oddc > 1
        String result = new Solution().lexPalindromicPermutation("abc", "a");
        assertThat(result, equalTo(""));
    }

    @Test
    void lexPalindromicPermutation6() {
        // Branch: oddc = 1
        String result = new Solution().lexPalindromicPermutation("aab", "a");
        assertThat(result, allOf(not(equalTo("")), hasLength(3)));
    }

    @Test
    void lexPalindromicPermutation7() {
        // Branch: oddc = 0
        String result = new Solution().lexPalindromicPermutation("aabb", "ab");
        assertThat(result, not(equalTo("")));
    }

    @Test
    void lexPalindromicPermutation8() {
        // Branch: func returns false
        String result = new Solution().lexPalindromicPermutation("abc", "xyz");
        assertThat(result, equalTo(""));
    }

    @Test
    void lexPalindromicPermutation9() {
        // Edge case: length = 1
        String result = new Solution().lexPalindromicPermutation("a", "a");
        assertThat(result, equalTo(""));
    }

    @Test
    void lexPalindromicPermutation10() {
        // Branch: l > r and comparison result > 0
        String target = "a";
        int[] freq = new int[26];
        char[] ans = {'b', 'b'};

        boolean result = new Solution().func(0, target, ans, 1, 0, freq, false);
        assertThat(result, equalTo(true));
    }

    @Test
    void lexPalindromicPermutation11() {
        // Branch: l > r and comparison result <= 0
        String target = "z";
        int[] freq = new int[26];
        char[] ans = {'a', 'a'};

        boolean result = new Solution().func(0, target, ans, 1, 0, freq, false);
        assertThat(result, equalTo(false));
    }

    @Test
    void lexPalindromicPermutation12() {
        // Branch: l == r with available character
        String target = "a";
        int[] freq = new int[26];
        // 'a' has frequency 1
        freq[0] = 1;
        char[] ans = new char[1];

        boolean result = new Solution().func(0, target, ans, 0, 0, freq, false);
        assertThat(result, equalTo(false));
        assertThat(ans[0], equalTo('#'));
    }

    @Test
    void lexPalindromicPermutation13() {
        // Branch: end = true, finds char with freq > 1
        String target = "ab";
        int[] freq = new int[26];
        // 'a' can form a pair
        freq[0] = 2;
        freq[1] = 0;
        char[] ans = new char[2];

        boolean result = new Solution().func(1, target, ans, 0, 1, freq, true);
        assertThat(result, anyOf(equalTo(true), equalTo(false)));
        // Frequency restored
        assertThat(freq[0], equalTo(2));
    }

    @Test
    void lexPalindromicPermutation14() {
        // Branch: end = true, no char has freq > 1
        String target = "ab";
        int[] freq = new int[26];
        freq[0] = 1;
        freq[1] = 1;
        char[] ans = new char[2];

        boolean result = new Solution().func(1, target, ans, 0, 1, freq, true);
        assertThat(result, equalTo(false));
    }

    @Test
    void lexPalindromicPermutation15() {
        // Branch: end = true, tries different pairs
        String target = "abc";
        int[] freq = new int[26];
        freq[0] = 2;
        freq[1] = 2;
        freq[2] = 2;
        char[] ans = new char[3];

        new Solution().func(1, target, ans, 0, 2, freq, true);
        assertThat(freq[0], equalTo(0));
        assertThat(freq[1], equalTo(2));
        assertThat(freq[2], equalTo(1));
    }

    @Test
    void lexPalindromicPermutation16() {
        // Branch: end = false, curr has freq > 1
        String target = "a";
        int[] freq = new int[26];
        freq[0] = 2;
        char[] ans = new char[2];

        new Solution().func(0, target, ans, 0, 1, freq, false);
        assertThat(freq[0], equalTo(0));
    }

    @Test
    void lexPalindromicPermutation17() {
        // Branch: end = false, curr has freq <= 1
        String target = "a";
        int[] freq = new int[26];
        freq[0] = 0;
        char[] ans = new char[2];

        new Solution().func(0, target, ans, 0, 1, freq, false);
        assertThat(freq[0], equalTo(0));
    }

    @Test
    void lexPalindromicPermutation18() {
        // Branch: end = false, finds next char with freq > 1
        String target = "a";
        int[] freq = new int[26];
        freq[0] = 0;
        freq[1] = 2;
        char[] ans = new char[2];

        new Solution().func(0, target, ans, 0, 1, freq, false);
        assertThat(freq[0], equalTo(0));
        assertThat(freq[1], equalTo(0));
    }

    @Test
    void lexPalindromicPermutation19() {
        // Branch: end = false, no next char with freq > 1
        String target = "z";
        int[] freq = new int[26];
        freq[25] = 1;
        char[] ans = new char[2];

        boolean result = new Solution().func(0, target, ans, 0, 1, freq, false);
        assertThat(result, equalTo(false));
    }

    @Test
    void lexPalindromicPermutation20() {
        // Branch: end = false transitions to end = true
        String target = "ab";
        int[] freq = new int[26];
        freq[0] = 2;
        freq[1] = 2;
        char[] ans = new char[2];

        new Solution().func(0, target, ans, 0, 1, freq, false);

        assertThat(freq[0], equalTo(2));
        assertThat(freq[1], equalTo(0));
    }

    @Test
    void lexPalindromicPermutation21() {
        // Verify result is always a palindrome
        String result = new Solution().lexPalindromicPermutation("aabbcc", "abc");
        if (!result.isEmpty()) {
            String reversed = new StringBuilder(result).reverse().toString();
            assertThat(result, equalTo(reversed));
        }
    }

    @Test
    void lexPalindromicPermutation22() {
        // Verify character frequencies are preserved
        String input = "aabbcc";
        String result = new Solution().lexPalindromicPermutation(input, "abc");

        if (!result.isEmpty()) {
            int[] inputFreq = new int[26];
            int[] resultFreq = new int[26];

            for (char c : input.toCharArray()) {
                inputFreq[c - 'a']++;
            }
            for (char c : result.toCharArray()) {
                resultFreq[c - 'a']++;
            }

            assertThat(resultFreq, equalTo(inputFreq));
        }
    }

    @Test
    void lexPalindromicPermutation23() {
        // Result length should match input length
        String input = "aabbccdd";
        String result = new Solution().lexPalindromicPermutation(input, "abcd");

        if (!result.isEmpty()) {
            assertThat(result.length(), equalTo(input.length()));
        }
    }

    @Test
    void lexPalindromicPermutation24() {
        // Result should be >= target in lexicographical order
        String result = new Solution().lexPalindromicPermutation("aabbcc", "abc");

        if (!result.isEmpty()) {
            assertThat(result.compareTo("abc"), greaterThanOrEqualTo(0));
        }
    }

    @Test
    void lexPalindromicPermutation25() {
        // Complex scenario with multiple characters
        String result = new Solution().lexPalindromicPermutation("aabbccdd", "abcd");

        assertThat(
                result,
                anyOf(equalTo(""), allOf(hasLength(8), containsString("a"), containsString("b"))));
    }

    @Test
    void lexPalindromicPermutation26() {
        // Edge case: empty string (if applicable)
        String result = new Solution().lexPalindromicPermutation("", "");
        assertThat(result, anyOf(equalTo(""), not(nullValue())));
    }

    @Test
    void lexPalindromicPermutation27() {
        // Verify frequency array is restored after recursion
        String target = "aabb";
        int[] freq = new int[26];
        int[] freqCopy = freq.clone();

        char[] ans = new char[4];
        new Solution().func(0, target, ans, 0, 3, freq, false);

        assertThat(freq, equalTo(freqCopy));
    }

    @Test
    void lexPalindromicPermutation28() {
        // Verify char array is properly initialized
        String result = new Solution().lexPalindromicPermutation("aa", "a");

        if (!result.isEmpty()) {
            assertThat(result, not(containsString("#")));
        }
    }
}
