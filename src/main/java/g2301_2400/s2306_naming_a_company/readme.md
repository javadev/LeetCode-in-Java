2306\. Naming a Company

Hard

You are given an array of strings `ideas` that represents a list of names to be used in the process of naming a company. The process of naming a company is as follows:

1.  Choose 2 **distinct** names from `ideas`, call them <code>idea<sub>A</sub></code> and <code>idea<sub>B</sub></code>.
2.  Swap the first letters of <code>idea<sub>A</sub></code> and <code>idea<sub>B</sub></code> with each other.
3.  If **both** of the new names are not found in the original `ideas`, then the name <code>idea<sub>A</sub> idea<sub>B</sub></code> (the **concatenation** of <code>idea<sub>A</sub></code> and <code>idea<sub>B</sub></code>, separated by a space) is a valid company name.
4.  Otherwise, it is not a valid name.

Return _the number of **distinct** valid names for the company_.

**Example 1:**

**Input:** ideas = ["coffee","donuts","time","toffee"]

**Output:** 6

**Explanation:** The following selections are valid:

- ("coffee", "donuts"): The company name created is "doffee conuts".

- ("donuts", "coffee"): The company name created is "conuts doffee".

- ("donuts", "time"): The company name created is "tonuts dime".

- ("donuts", "toffee"): The company name created is "tonuts doffee".

- ("time", "donuts"): The company name created is "dime tonuts".

- ("toffee", "donuts"): The company name created is "doffee tonuts".

Therefore, there are a total of 6 distinct company names.


The following are some examples of invalid selections:

- ("coffee", "time"): The name "toffee" formed after swapping already exists in the original array.

- ("time", "toffee"): Both names are still the same after swapping and exist in the original array.

- ("coffee", "toffee"): Both names formed after swapping already exist in the original array. 

**Example 2:**

**Input:** ideas = ["lack","back"]

**Output:** 0

**Explanation:** There are no valid selections. Therefore, 0 is returned. 

**Constraints:**

*   <code>2 <= ideas.length <= 5 * 10<sup>4</sup></code>
*   `1 <= ideas[i].length <= 10`
*   `ideas[i]` consists of lowercase English letters.
*   All the strings in `ideas` are **unique**.