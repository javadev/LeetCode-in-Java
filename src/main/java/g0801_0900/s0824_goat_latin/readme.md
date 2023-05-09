824\. Goat Latin

Easy

You are given a string `sentence` that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

*   If a word begins with a vowel (`'a'`, `'e'`, `'i'`, `'o'`, or `'u'`), append `"ma"` to the end of the word.
    *   For example, the word `"apple"` becomes `"applema"`.
*   If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add `"ma"`.
    *   For example, the word `"goat"` becomes `"oatgma"`.
*   Add one letter `'a'` to the end of each word per its word index in the sentence, starting with `1`.
    *   For example, the first word gets `"a"` added to the end, the second word gets `"aa"` added to the end, and so on.

Return _the final sentence representing the conversion from sentence to Goat Latin_.

**Example 1:**

**Input:** sentence = "I speak Goat Latin"

**Output:** "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

**Example 2:**

**Input:** sentence = "The quick brown fox jumped over the lazy dog"

**Output:** "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

**Constraints:**

*   `1 <= sentence.length <= 150`
*   `sentence` consists of English letters and spaces.
*   `sentence` has no leading or trailing spaces.
*   All the words in `sentence` are separated by a single space.