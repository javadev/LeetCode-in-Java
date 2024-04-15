17\. Letter Combinations of a Phone Number

Medium

Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent. Return the answer in **any order**.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

![](https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png)

**Example 1:**

**Input:** digits = "23"

**Output:** ["ad","ae","af","bd","be","bf","cd","ce","cf"] 

**Example 2:**

**Input:** digits = ""

**Output:** [] 

**Example 3:**

**Input:** digits = "2"

**Output:** ["a","b","c"] 

**Constraints:**

*   `0 <= digits.length <= 4`
*   `digits[i]` is a digit in the range `['2', '9']`.

To solve the Letter Combinations of a Phone Number problem in Java using a `Solution` class, we'll follow these steps:

1. Define a `Solution` class with a method named `letterCombinations` that takes a string `digits` as input and returns a list of all possible letter combinations.
2. Create a mapping of digits to letters using a hashmap or an array.
3. Initialize an empty list `result` to store the combinations.
4. If the input string `digits` is empty, return an empty list `result`.
5. Call a recursive function `generateCombinations` to generate combinations for each digit.
6. Within the recursive function:
   - Base case: If the current combination length equals the length of the input `digits`, add the combination to the `result` list.
   - Recursive step: For the current digit, iterate over its corresponding letters and append each letter to the current combination, then recursively call the function with the next digit.
7. Return the `result` list containing all possible combinations.

Here's the implementation:

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static final Map<Character, String> digitToLetters = new HashMap<>();
    static {
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        generateCombinations(result, digits, "", 0);
        return result;
    }

    private void generateCombinations(List<String> result, String digits, String combination, int index) {
        if (index == digits.length()) {
            result.add(combination);
            return;
        }

        char digit = digits.charAt(index);
        String letters = digitToLetters.get(digit);
        for (char letter : letters.toCharArray()) {
            generateCombinations(result, digits, combination + letter, index + 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String digits1 = "23";
        System.out.println("Example 1 Output: " + solution.letterCombinations(digits1));

        String digits2 = "";
        System.out.println("Example 2 Output: " + solution.letterCombinations(digits2));

        String digits3 = "2";
        System.out.println("Example 3 Output: " + solution.letterCombinations(digits3));
    }
}
```

This implementation provides a solution to the Letter Combinations of a Phone Number problem in Java.