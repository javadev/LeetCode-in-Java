# LeetCode-in-Java

[![Maven Central](https://img.shields.io/maven-central/v/com.github.javadev/leetcode-in-java?style=flat-square)](https://central.sonatype.com/artifact/com.github.javadev/leetcode-in-java/1.28)
[![MIT License](http://img.shields.io/badge/license-MIT-green.svg) ](https://github.com/javadev/leetcode-in-java/blob/main/LICENSE)
[![Java CI](https://github.com/javadev/LeetCode-in-Java/actions/workflows/maven.yml/badge.svg)](https://github.com/javadev/LeetCode-in-Java/actions/workflows/maven.yml)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=javadev_LeetCode-in-Java&metric=sqale_rating)](https://sonarcloud.io/summary/overall?id=javadev_LeetCode-in-Java)
[![javadoc](https://javadoc.io/badge2/com.github.javadev/leetcode-in-java/javadoc.svg)](https://javadoc.io/doc/com.github.javadev/leetcode-in-java)
[![](https://img.shields.io/github/stars/javadev/LeetCode-in-Java?style=flat-square)](https://github.com/javadev/LeetCode-in-Java)
[![](https://img.shields.io/github/forks/javadev/LeetCode-in-Java?style=flat-square)](https://github.com/javadev/LeetCode-in-Java/fork)

Java-based LeetCode algorithm problem solutions, regularly updated.

## Installation

To configure your Maven project, add the following code to your pom.xml file:

```xml
<dependencies>
  <dependency>
    <groupId>com.github.javadev</groupId>
    <artifactId>leetcode-in-java</artifactId>
    <version>1.28</version>
  </dependency>
  ...
</dependencies>
```

Gradle configuration:

```groovy
implementation 'com.github.javadev:leetcode-in-java:1.28'
```

> ["For coding interview preparation, LeetCode is one of the best online resource providing a rich library of more than 300 real coding interview questions for you to practice from using one of the 7 supported languages - C, C++, Java, Python, C#, JavaScript, Ruby."](https://www.quora.com/How-effective-is-Leetcode-for-preparing-for-technical-interviews)

##
* [Dynamic Programming I](#dynamic-programming-i)
* [Programming Skills I](#programming-skills-i)
* [Programming Skills II](#programming-skills-ii)
* [Graph Theory I](#graph-theory-i)
* [SQL I](#sql-i)
* [Level 1](#level-1)
* [Level 2](#level-2)
* [Udemy](#udemy)
* [Data Structure I](#data-structure-i)
* [Data Structure II](#data-structure-ii)
* [Algorithm I](#algorithm-i)
* [Algorithm II](#algorithm-ii)
* [Binary Search I](#binary-search-i)
* [Binary Search II](#binary-search-ii)

### Dynamic Programming I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0509 |[Fibonacci Number](src/main/java/g0501_0600/s0509_fibonacci_number/Solution.java)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 0 | 100.00
| 1137 |[N-th Tribonacci Number](src/main/java/g1101_1200/s1137_n_th_tribonacci_number/Solution.java)| Easy | Dynamic_Programming, Math, Memoization | 0 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src/main/java/g0001_0100/s0070_climbing_stairs/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0746 |[Min Cost Climbing Stairs](src/main/java/g0701_0800/s0746_min_cost_climbing_stairs/Solution.java)| Easy | Array, Dynamic_Programming | 1 | 86.38

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0198 |[House Robber](src/main/java/g0101_0200/s0198_house_robber/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0213 |[House Robber II](src/main/java/g0201_0300/s0213_house_robber_ii/Solution.java)| Medium | Array, Dynamic_Programming | 0 | 100.00
| 0740 |[Delete and Earn](src/main/java/g0701_0800/s0740_delete_and_earn/Solution.java)| Medium | Array, Hash_Table, Dynamic_Programming | 4 | 77.68

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0055 |[Jump Game](src/main/java/g0001_0100/s0055_jump_game/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 2 | 79.47
| 0045 |[Jump Game II](src/main/java/g0001_0100/s0045_jump_game_ii/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 2 | 49.02

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src/main/java/g0001_0100/s0053_maximum_subarray/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 1 | 100.00
| 0918 |[Maximum Sum Circular Subarray](src/main/java/g0901_1000/s0918_maximum_sum_circular_subarray/Solution.java)| Medium | Array, Dynamic_Programming, Divide_and_Conquer, Queue, Monotonic_Queue | 3 | 92.86

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0152 |[Maximum Product Subarray](src/main/java/g0101_0200/s0152_maximum_product_subarray/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00
| 1567 |[Maximum Length of Subarray With Positive Product](src/main/java/g1501_1600/s1567_maximum_length_of_subarray_with_positive_product/Solution.java)| Medium | Array, Dynamic_Programming, Greedy | 4 | 80.86

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1014 |[Best Sightseeing Pair](src/main/java/g1001_1100/s1014_best_sightseeing_pair/Solution.java)| Medium | Array, Dynamic_Programming | 2 | 99.86
| 0121 |[Best Time to Buy and Sell Stock](src/main/java/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 1 | 100.00
| 0122 |[Best Time to Buy and Sell Stock II](src/main/java/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.java)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 1 | 96.82

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0309 |[Best Time to Buy and Sell Stock with Cooldown](src/main/java/g0301_0400/s0309_best_time_to_buy_and_sell_stock_with_cooldown/Solution.java)| Medium | Array, Dynamic_Programming | 0 | 100.00
| 0714 |[Best Time to Buy and Sell Stock with Transaction Fee](src/main/java/g0701_0800/s0714_best_time_to_buy_and_sell_stock_with_transaction_fee/Solution.java)| Medium | Array, Dynamic_Programming, Greedy | 4 | 78.57

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0139 |[Word Break](src/main/java/g0101_0200/s0139_word_break/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization, Big_O_Time_O(M+max\*N)_Space_O(M+N+max) | 2 | 97.08
| 0042 |[Trapping Rain Water](src/main/java/g0001_0100/s0042_trapping_rain_water/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack, Big_O_Time_O(n)_Space_O(1) | 0 | 100.00

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0413 |[Arithmetic Slices](src/main/java/g0401_0500/s0413_arithmetic_slices/Solution.java)| Medium | Array, Dynamic_Programming | 0 | 100.00
| 0091 |[Decode Ways](src/main/java/g0001_0100/s0091_decode_ways/Solution.java)| Medium | Top_Interview_Questions, String, Dynamic_Programming | 2 | 66.37

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0264 |[Ugly Number II](src/main/java/g0201_0300/s0264_ugly_number_ii/Solution.java)| Medium | Hash_Table, Dynamic_Programming, Math, Heap_Priority_Queue | 2 | 99.91
| 0096 |[Unique Binary Search Trees](src/main/java/g0001_0100/s0096_unique_binary_search_trees/Solution.java)| Medium | Top_100_Liked_Questions, Dynamic_Programming, Math, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(n)_Space_O(1) | 0 | 100.00

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0118 |[Pascal's Triangle](src/main/java/g0101_0200/s0118_pascals_triangle/Solution.java)| Easy | Top_Interview_Questions, Array, Dynamic_Programming | 1 | 67.08
| 0119 |[Pascal's Triangle II](src/main/java/g0101_0200/s0119_pascals_triangle_ii/Solution.java)| Easy | Array, Dynamic_Programming | 0 | 100.00

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0931 |[Minimum Falling Path Sum](src/main/java/g0901_1000/s0931_minimum_falling_path_sum/Solution.java)| Medium | Array, Dynamic_Programming, Matrix | 4 | 72.19
| 0120 |[Triangle](src/main/java/g0101_0200/s0120_triangle/Solution.java)| Medium | Array, Dynamic_Programming | 2 | 94.63

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1314 |[Matrix Block Sum](src/main/java/g1301_1400/s1314_matrix_block_sum/Solution.java)| Medium | Array, Matrix, Prefix_Sum | 5 | 67.46
| 0304 |[Range Sum Query 2D - Immutable](src/main/java/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.java)| Medium | Array, Matrix, Design, Prefix_Sum | 153 | 87.51

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0062 |[Unique Paths](src/main/java/g0001_0100/s0062_unique_paths/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics, Big_O_Time_O(m\*n)_Space_O(m\*n) | 0 | 100.00
| 0063 |[Unique Paths II](src/main/java/g0001_0100/s0063_unique_paths_ii/Solution.java)| Medium | Array, Dynamic_Programming, Matrix | 0 | 100.00

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0064 |[Minimum Path Sum](src/main/java/g0001_0100/s0064_minimum_path_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Big_O_Time_O(m\*n)_Space_O(m\*n) | 0 | 100.00
| 0221 |[Maximal Square](src/main/java/g0201_0300/s0221_maximal_square/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Big_O_Time_O(m\*n)_Space_O(m\*n) | 7 | 72.35

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src/main/java/g0001_0100/s0005_longest_palindromic_substring/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 7 | 96.96
| 0516 |[Longest Palindromic Subsequence](src/main/java/g0501_0600/s0516_longest_palindromic_subsequence/Solution.java)| Medium | String, Dynamic_Programming | 88 | 58.87

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src/main/java/g0201_0300/s0300_longest_increasing_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search, Big_O_Time_O(n\*log_n)_Space_O(n) | 3 | 98.63
| 0376 |[Wiggle Subsequence](src/main/java/g0301_0400/s0376_wiggle_subsequence/Solution.java)| Medium | Array, Dynamic_Programming, Greedy | 0 | 100.00

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0392 |[Is Subsequence](src/main/java/g0301_0400/s0392_is_subsequence/Solution.java)| Easy | String, Dynamic_Programming, Two_Pointers | 1 | 93.01
| 1143 |[Longest Common Subsequence](src/main/java/g1101_1200/s1143_longest_common_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, Big_O_Time_O(n\*m)_Space_O(n\*m) | 33 | 46.23
| 0072 |[Edit Distance](src/main/java/g0001_0100/s0072_edit_distance/Solution.java)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming, Big_O_Time_O(n^2)_Space_O(n2) | 4 | 90.13

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0322 |[Coin Change](src/main/java/g0301_0400/s0322_coin_change/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search, Big_O_Time_O(m\*n)_Space_O(amount) | 17 | 91.77
| 0518 |[Coin Change 2](src/main/java/g0501_0600/s0518_coin_change_2/Solution.java)| Medium | Array, Dynamic_Programming | 4 | 84.67

#### Day 21

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0377 |[Combination Sum IV](src/main/java/g0301_0400/s0377_combination_sum_iv/Solution.java)| Medium | Array, Dynamic_Programming | 1 | 92.54
| 0343 |[Integer Break](src/main/java/g0301_0400/s0343_integer_break/Solution.java)| Medium | Dynamic_Programming, Math | 0 | 100.00
| 0279 |[Perfect Squares](src/main/java/g0201_0300/s0279_perfect_squares/Solution.java)| Medium | Top_Interview_Questions, Dynamic_Programming, Math, Breadth_First_Search | 1 | 100.00

### Programming Skills I

#### Day 1 Basic Data Type

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1523 |[Count Odd Numbers in an Interval Range](src/main/java/g1501_1600/s1523_count_odd_numbers_in_an_interval_range/Solution.java)| Easy | Math | 0 | 100.00
| 1491 |[Average Salary Excluding the Minimum and Maximum Salary](src/main/java/g1401_1500/s1491_average_salary_excluding_the_minimum_and_maximum_salary/Solution.java)| Easy | Array, Sorting | 0 | 100.00

#### Day 2 Operator

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0191 |[Number of 1 Bits](src/main/java/g0101_0200/s0191_number_of_1_bits/Solution.java)| Easy | Top_Interview_Questions, Bit_Manipulation | 1 | 84.87
| 1281 |[Subtract the Product and Sum of Digits of an Integer](src/main/java/g1201_1300/s1281_subtract_the_product_and_sum_of_digits_of_an_integer/Solution.java)| Easy | Math | 0 | 100.00

#### Day 3 Conditional Statements

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0976 |[Largest Perimeter Triangle](src/main/java/g0901_1000/s0976_largest_perimeter_triangle/Solution.java)| Easy | Array, Math, Sorting, Greedy | 12 | 26.01
| 1779 |[Find Nearest Point That Has the Same X or Y Coordinate](src/main/java/g1701_1800/s1779_find_nearest_point_that_has_the_same_x_or_y_coordinate/Solution.java)| Easy | Array | 1 | 100.00

#### Day 4 Loop

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1822 |[Sign of the Product of an Array](src/main/java/g1801_1900/s1822_sign_of_the_product_of_an_array/Solution.java)| Easy | Array, Math | 1 | 58.05
| 1502 |[Can Make Arithmetic Progression From Sequence](src/main/java/g1501_1600/s1502_can_make_arithmetic_progression_from_sequence/Solution.java)| Easy | Array, Sorting | 2 | 90.55
| 0202 |[Happy Number](src/main/java/g0201_0300/s0202_happy_number/Solution.java)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 1 | 98.59
| 1790 |[Check if One String Swap Can Make Strings Equal](src/main/java/g1701_1800/s1790_check_if_one_string_swap_can_make_strings_equal/Solution.java)| Easy | String, Hash_Table, Counting | 0 | 100.00

#### Day 5 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0589 |[N-ary Tree Preorder Traversal](src/main/java/g0501_0600/s0589_n_ary_tree_preorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Stack | 1 | 90.98
| 0496 |[Next Greater Element I](src/main/java/g0401_0500/s0496_next_greater_element_i/Solution.java)| Easy | Array, Hash_Table, Stack, Monotonic_Stack | 4 | 81.18
| 1232 |[Check If It Is a Straight Line](src/main/java/g1201_1300/s1232_check_if_it_is_a_straight_line/Solution.java)| Easy | Array, Math, Geometry | 0 | 100.00

#### Day 6 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1588 |[Sum of All Odd Length Subarrays](src/main/java/g1501_1600/s1588_sum_of_all_odd_length_subarrays/Solution.java)| Easy | Array, Math, Prefix_Sum | 0 | 100.00
| 0283 |[Move Zeroes](src/main/java/g0201_0300/s0283_move_zeroes/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 2 | 79.54
| 1672 |[Richest Customer Wealth](src/main/java/g1601_1700/s1672_richest_customer_wealth/Solution.java)| Easy | Array, Matrix | 0 | 100.00

#### Day 7 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1572 |[Matrix Diagonal Sum](src/main/java/g1501_1600/s1572_matrix_diagonal_sum/Solution.java)| Easy | Array, Matrix | 0 | 100.00
| 0566 |[Reshape the Matrix](src/main/java/g0501_0600/s0566_reshape_the_matrix/Solution.java)| Easy | Array, Matrix, Simulation | 1 | 90.08

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1768 |[Merge Strings Alternately](src/main/java/g1701_1800/s1768_merge_strings_alternately/Solution.java)| Easy | String, Two_Pointers | 1 | 86.26
| 1678 |[Goal Parser Interpretation](src/main/java/g1601_1700/s1678_goal_parser_interpretation/Solution.java)| Easy | String | 0 | 100.00
| 0389 |[Find the Difference](src/main/java/g0301_0400/s0389_find_the_difference/Solution.java)| Easy | String, Hash_Table, Sorting, Bit_Manipulation | 1 | 100.00

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0709 |[To Lower Case](src/main/java/g0701_0800/s0709_to_lower_case/Solution.java)| Easy | String | 1 | 71.74
| 1309 |[Decrypt String from Alphabet to Integer Mapping](src/main/java/g1301_1400/s1309_decrypt_string_from_alphabet_to_integer_mapping/Solution.java)| Easy | String | 6 | 28.25
| 0953 |[Verifying an Alien Dictionary](src/main/java/g0901_1000/s0953_verifying_an_alien_dictionary/Solution.java)| Easy | Array, String, Hash_Table | 0 | 100.00

#### Day 10 Linked List and Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1290 |[Convert Binary Number in a Linked List to Integer](src/main/java/g1201_1300/s1290_convert_binary_number_in_a_linked_list_to_integer/Solution.java)| Easy | Math, Linked_List | 0 | 100.00
| 0876 |[Middle of the Linked List](src/main/java/g0801_0900/s0876_middle_of_the_linked_list/Solution.java)| Easy | Two_Pointers, Linked_List | 0 | 100.00
| 0104 |[Maximum Depth of Binary Tree](src/main/java/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(H) | 0 | 100.00
| 0404 |[Sum of Left Leaves](src/main/java/g0401_0500/s0404_sum_of_left_leaves/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 29.26

#### Day 11 Containers and Libraries

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1356 |[Sort Integers by The Number of 1 Bits](src/main/java/g1301_1400/s1356_sort_integers_by_the_number_of_1_bits/Solution.java)| Easy | Array, Sorting, Bit_Manipulation, Counting | 10 | 65.50
| 0232 |[Implement Queue using Stacks](src/main/java/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.java)| Easy | Stack, Design, Queue | 1 | 67.21
| 0242 |[Valid Anagram](src/main/java/g0201_0300/s0242_valid_anagram/Solution.java)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting | 2 | 99.01
| 0217 |[Contains Duplicate](src/main/java/g0201_0300/s0217_contains_duplicate/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 6 | 96.68

#### Day 12 Class and Object

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1603 |[Design Parking System](src/main/java/g1601_1700/s1603_design_parking_system/ParkingSystem.java)| Easy | Design, Simulation, Counting | 8 | 76.16
| 0303 |[Range Sum Query - Immutable](src/main/java/g0301_0400/s0303_range_sum_query_immutable/NumArray.java)| Easy | Array, Design, Prefix_Sum | 7 | 100.00

### Programming Skills II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0896 |[Monotonic Array](src/main/java/g0801_0900/s0896_monotonic_array/Solution.java)| Easy | Array | 2 | 86.21
| 0028 |[Implement strStr()](src/main/java/g0001_0100/s0028_find_the_index_of_the_first_occurrence_in_a_string/Solution.java)| Easy | Top_Interview_Questions, String, Two_Pointers, String_Matching | 0 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0110 |[Balanced Binary Tree](src/main/java/g0101_0200/s0110_balanced_binary_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree | 1 | 98.82
| 0459 |[Repeated Substring Pattern](src/main/java/g0401_0500/s0459_repeated_substring_pattern/Solution.java)| Easy | String, String_Matching | 8 | 96.64

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0150 |[Evaluate Reverse Polish Notation](src/main/java/g0101_0200/s0150_evaluate_reverse_polish_notation/Solution.java)| Medium | Top_Interview_Questions, Array, Math, Stack | 9 | 51.23
| 0066 |[Plus One](src/main/java/g0001_0100/s0066_plus_one/Solution.java)| Easy | Top_Interview_Questions, Array, Math | 0 | 100.00

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1367 |[Linked List in Binary Tree](src/main/java/g1301_1400/s1367_linked_list_in_binary_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 2 | 61.23
| 0043 |[Multiply Strings](src/main/java/g0001_0100/s0043_multiply_strings/Solution.java)| Medium | String, Math, Simulation | 1 | 100.00

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0067 |[Add Binary](src/main/java/g0001_0100/s0067_add_binary/Solution.java)| Easy | String, Math, Bit_Manipulation, Simulation | 1 | 100.00
| 0989 |[Add to Array-Form of Integer](src/main/java/g0901_1000/s0989_add_to_array_form_of_integer/Solution.java)| Easy | Array, Math | 7 | 65.92

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0739 |[Daily Temperatures](src/main/java/g0701_0800/s0739_daily_temperatures/Solution.java)| Medium | Top_100_Liked_Questions, Array, Stack, Monotonic_Stack, Big_O_Time_O(n)_Space_O(n) | 10 | 94.99
| 0058 |[Length of Last Word](src/main/java/g0001_0100/s0058_length_of_last_word/Solution.java)| Easy | String | 0 | 100.00

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0048 |[Rotate Image](src/main/java/g0001_0100/s0048_rotate_image/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix, Big_O_Time_O(n^2)_Space_O(1) | 0 | 100.00
| 1886 |[Determine Whether Matrix Can Be Obtained By Rotation](src/main/java/g1801_1900/s1886_determine_whether_matrix_can_be_obtained_by_rotation/Solution.java)| Easy | Array, Matrix | 1 | 78.38

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0054 |[Spiral Matrix](src/main/java/g0001_0100/s0054_spiral_matrix/Solution.java)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 0 | 100.00
| 0973 |[K Closest Points to Origin](src/main/java/g0901_1000/s0973_k_closest_points_to_origin/Solution.java)| Medium | Array, Math, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Geometry, Quickselect | 4 | 98.26

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1630 |[Arithmetic Subarrays](src/main/java/g1601_1700/s1630_arithmetic_subarrays/Solution.java)| Medium | Array, Sorting | 8 | 93.62
| 0429 |[N-ary Tree Level Order Traversal](src/main/java/g0401_0500/s0429_n_ary_tree_level_order_traversal/Solution.java)| Medium | Breadth_First_Search, Tree | 3 | 80.26

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0503 |[Next Greater Element II](src/main/java/g0501_0600/s0503_next_greater_element_ii/Solution.java)| Medium | Array, Stack, Monotonic_Stack | 7 | 97.03
| 0556 |[Next Greater Element III](src/main/java/g0501_0600/s0556_next_greater_element_iii/Solution.java)| Medium | String, Math, Two_Pointers | 0 | 100.00

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1376 |[Time Needed to Inform All Employees](src/main/java/g1301_1400/s1376_time_needed_to_inform_all_employees/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree | 8 | 99.85
| 0049 |[Group Anagrams](src/main/java/g0001_0100/s0049_group_anagrams/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting, Big_O_Time_O(n\*k_log_k)_Space_O(n) | 6 | 92.28

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src/main/java/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.java)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n+m)_Space_O(1) | 6 | 99.03
| 0713 |[Subarray Product Less Than K](src/main/java/g0701_0800/s0713_subarray_product_less_than_k/Solution.java)| Medium | Array, Sliding_Window | 8 | 39.00

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0304 |[Range Sum Query 2D - Immutable](src/main/java/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.java)| Medium | Array, Matrix, Design, Prefix_Sum | 153 | 87.51
| 0910 |[Smallest Range II](src/main/java/g0901_1000/s0910_smallest_range_ii/Solution.java)| Medium | Array, Math, Sorting, Greedy | 10 | 73.16

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0143 |[Reorder List](src/main/java/g0101_0200/s0143_reorder_list/Solution.java)| Medium | Two_Pointers, Stack, Linked_List, Recursion | 2 | 72.59
| 0138 |[Copy List with Random Pointer](src/main/java/g0101_0200/s0138_copy_list_with_random_pointer/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List, Big_O_Time_O(N)_Space_O(N) | 0 | 100.00

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0002 |[Add Two Numbers](src/main/java/g0001_0100/s0002_add_two_numbers/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion, Big_O_Time_O(max(N,M))_Space_O(max(N,M)) | 1 | 100.00
| 0445 |[Add Two Numbers II](src/main/java/g0401_0500/s0445_add_two_numbers_ii/Solution.java)| Medium | Math, Stack, Linked_List | 3 | 90.38

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0061 |[Rotate List](src/main/java/g0001_0100/s0061_rotate_list/Solution.java)| Medium | Two_Pointers, Linked_List | 0 | 100.00
| 0173 |[Binary Search Tree Iterator](src/main/java/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.java)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 18 | 84.18

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1845 |[Seat Reservation Manager](src/main/java/g1801_1900/s1845_seat_reservation_manager/SeatManager.java)| Medium | Design, Heap_Priority_Queue | 47 | 87.63
| 0860 |[Lemonade Change](src/main/java/g0801_0900/s0860_lemonade_change/Solution.java)| Easy | Array, Greedy | 2 | 90.84

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src/main/java/g0101_0200/s0155_min_stack/MinStack.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Big_O_Time_O(1)_Space_O(N) | 3 | 100.00
| 0341 |[Flatten Nested List Iterator](src/main/java/g0301_0400/s0341_flatten_nested_list_iterator/NestedIterator.java)| Medium | Top_Interview_Questions, Depth_First_Search, Tree, Stack, Design, Queue, Iterator | 2 | 99.95

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1797 |[Design Authentication Manager](src/main/java/g1701_1800/s1797_design_authentication_manager/AuthenticationManager.java)| Medium | Hash_Table, Design | 41 | 92.67
| 0707 |[Design Linked List](src/main/java/g0701_0800/s0707_design_linked_list/MyLinkedList.java)| Medium | Design, Linked_List | 10 | 70.60

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0380 |[Insert Delete GetRandom O(1)](src/main/java/g0301_0400/s0380_insert_delete_getrandom_o1/RandomizedSet.java)| Medium | Top_Interview_Questions, Array, Hash_Table, Math, Design, Randomized | 27 | 93.44
| 0622 |[Design Circular Queue](src/main/java/g0601_0700/s0622_design_circular_queue/MyCircularQueue.java)| Medium | Array, Design, Linked_List, Queue | 3 | 100.00
| 0729 |[My Calendar I](src/main/java/g0701_0800/s0729_my_calendar_i/MyCalendar.java)| Medium | Binary_Search, Design, Ordered_Set, Segment_Tree | 17 | 97.23

### Graph Theory I

#### Day 1 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src/main/java/g0701_0800/s0733_flood_fill/Solution.java)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 1 | 85.36
| 0200 |[Number of Islands](src/main/java/g0101_0200/s0200_number_of_islands/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Big_O_Time_O(M\*N)_Space_O(M\*N) | 3 | 97.76

#### Day 2 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0695 |[Max Area of Island](src/main/java/g0601_0700/s0695_max_area_of_island/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 3 | 76.79
| 1254 |[Number of Closed Islands](src/main/java/g1201_1300/s1254_number_of_closed_islands/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 3 | 55.59

#### Day 3 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1020 |[Number of Enclaves](src/main/java/g1001_1100/s1020_number_of_enclaves/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 6 | 68.24
| 1905 |[Count Sub Islands](src/main/java/g1901_2000/s1905_count_sub_islands/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 24 | 85.54

#### Day 4 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1162 |[As Far from Land as Possible](src/main/java/g1101_1200/s1162_as_far_from_land_as_possible/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 16 | 62.40
| 0417 |[Pacific Atlantic Water Flow](src/main/java/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 5 | 92.62

#### Day 5 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1091 |[Shortest Path in Binary Matrix](src/main/java/g1001_1100/s1091_shortest_path_in_binary_matrix/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 22 | 69.99
| 0542 |[01 Matrix](src/main/java/g0501_0600/s0542_01_matrix/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 7 | 95.83

#### Day 6 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0934 |[Shortest Bridge](src/main/java/g0901_1000/s0934_shortest_bridge/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 6 | 97.87
| 1926 |[Nearest Exit from Entrance in Maze](src/main/java/g1901_2000/s1926_nearest_exit_from_entrance_in_maze/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 12 | 40.55

#### Day 7 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0797 |[All Paths From Source to Target](src/main/java/g0701_0800/s0797_all_paths_from_source_to_target/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Backtracking | 2 | 90.53
| 0841 |[Keys and Rooms](src/main/java/g0801_0900/s0841_keys_and_rooms/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 3 | 51.54

#### Day 8 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0547 |[Number of Provinces](src/main/java/g0501_0600/s0547_number_of_provinces/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 2 | 69.51
| 1319 |[Number of Operations to Make Network Connected](src/main/java/g1301_1400/s1319_number_of_operations_to_make_network_connected/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 9 | 67.64

#### Day 9 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1376 |[Time Needed to Inform All Employees](src/main/java/g1301_1400/s1376_time_needed_to_inform_all_employees/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree | 8 | 99.85
| 0802 |[Find Eventual Safe States](src/main/java/g0801_0900/s0802_find_eventual_safe_states/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 7 | 74.93

#### Day 10 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1129 |[Shortest Path with Alternating Colors](src/main/java/g1101_1200/s1129_shortest_path_with_alternating_colors/Solution.java)| Medium | Breadth_First_Search, Graph | 4 | 96.63
| 1466 |[Reorder Routes to Make All Paths Lead to the City Zero](src/main/java/g1401_1500/s1466_reorder_routes_to_make_all_paths_lead_to_the_city_zero/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 39 | 97.71
| 0847 |[Shortest Path Visiting All Nodes](src/main/java/g0801_0900/s0847_shortest_path_visiting_all_nodes/Solution.java)| Hard | Dynamic_Programming, Breadth_First_Search, Bit_Manipulation, Graph, Bitmask | 14 | 78.72

#### Day 11 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1306 |[Jump Game III](src/main/java/g1301_1400/s1306_jump_game_iii/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search | 2 | 96.23
| 1654 |[Minimum Jumps to Reach Home](src/main/java/g1601_1700/s1654_minimum_jumps_to_reach_home/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search | 6 | 99.87
| 0365 |[Water and Jug Problem](src/main/java/g0301_0400/s0365_water_and_jug_problem/Solution.java)| Medium | Math, Depth_First_Search, Breadth_First_Search | 0 | 100.00

#### Day 12 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0433 |[Minimum Genetic Mutation](src/main/java/g0401_0500/s0433_minimum_genetic_mutation/Solution.java)| Medium | String, Hash_Table, Breadth_First_Search | 1 | 90.95
| 0752 |[Open the Lock](src/main/java/g0701_0800/s0752_open_the_lock/Solution.java)| Medium | Array, String, Hash_Table, Breadth_First_Search | 72 | 91.06
| 0127 |[Word Ladder](src/main/java/g0101_0200/s0127_word_ladder/Solution.java)| Hard | Top_Interview_Questions, String, Hash_Table, Breadth_First_Search | 37 | 94.58

#### Day 13 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0997 |[Find the Town Judge](src/main/java/g0901_1000/s0997_find_the_town_judge/Solution.java)| Easy | Array, Hash_Table, Graph | 3 | 80.64
| 1557 |[Minimum Number of Vertices to Reach All Nodes](src/main/java/g1501_1600/s1557_minimum_number_of_vertices_to_reach_all_nodes/Solution.java)| Medium | Graph | 8 | 99.94

#### Day 14 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1615 |[Maximal Network Rank](src/main/java/g1601_1700/s1615_maximal_network_rank/Solution.java)| Medium | Graph | 3 | 97.34
| 0886 |[Possible Bipartition](src/main/java/g0801_0900/s0886_possible_bipartition/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 20 | 80.12
| 0785 |[Is Graph Bipartite?](src/main/java/g0701_0800/s0785_is_graph_bipartite/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 0 | 100.00

### SQL I

#### Day 1 Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0595 |[Big Countries](src/main/java/g0501_0600/s0595_big_countries/script.sql)| Easy | Database | 262 | 84.64
| 1757 |[Recyclable and Low Fat Products](src/main/java/g1701_1800/s1757_recyclable_and_low_fat_products/script.sql)| Easy | Database | 475 | 71.54
| 0584 |[Find Customer Referee](src/main/java/g0501_0600/s0584_find_customer_referee/script.sql)| Easy | Database | 531 | 58.63
| 0183 |[Customers Who Never Order](src/main/java/g0101_0200/s0183_customers_who_never_order/script.sql)| Easy | Database | 376 | 98.73

#### Day 2 Select and Order

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1873 |[Calculate Special Bonus](src/main/java/g1801_1900/s1873_calculate_special_bonus/script.sql)| Easy | Database | 543 | 71.60
| 0627 |[Swap Salary](src/main/java/g0601_0700/s0627_swap_salary/script.sql)| Easy | Database | 191 | 96.89
| 0196 |[Delete Duplicate Emails](src/main/java/g0101_0200/s0196_delete_duplicate_emails/script.sql)| Easy | Database | 903 | 48.10

#### Day 3 String Processing Functions

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1667 |[Fix Names in a Table](src/main/java/g1601_1700/s1667_fix_names_in_a_table/script.sql)| Easy | Database | 559 | 80.29
| 1484 |[Group Sold Products By The Date](src/main/java/g1401_1500/s1484_group_sold_products_by_the_date/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 395 | 77.20
| 1527 |[Patients With a Condition](src/main/java/g1501_1600/s1527_patients_with_a_condition/script.sql)| Easy | Database | 308 | 66.93

#### Day 4 Union and Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1965 |[Employees With Missing Information](src/main/java/g1901_2000/s1965_employees_with_missing_information/script.sql)| Easy | Database | 617 | 30.40
| 1795 |[Rearrange Products Table](src/main/java/g1701_1800/s1795_rearrange_products_table/script.sql)| Easy | Database | 497 | 64.83
| 0608 |[Tree Node](src/main/java/g0601_0700/s0608_tree_node/script.sql)| Medium | LeetCode_Curated_SQL_70, Database | 347 | 95.17
| 0176 |[Second Highest Salary](src/main/java/g0101_0200/s0176_second_highest_salary/script.sql)| Medium | Database | 225 | 73.10

#### Day 5 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0175 |[Combine Two Tables](src/main/java/g0101_0200/s0175_combine_two_tables/script.sql)| Easy | Database | 491 | 32.30
| 1581 |[Customer Who Visited but Did Not Make Any Transactions](src/main/java/g1501_1600/s1581_customer_who_visited_but_did_not_make_any_transactions/script.sql)| Easy | Database | 1039 | 76.99
| 1148 |[Article Views I](src/main/java/g1101_1200/s1148_article_views_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 783 | 64.09

#### Day 6 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0197 |[Rising Temperature](src/main/java/g0101_0200/s0197_rising_temperature/script.sql)| Easy | Database | 342 | 93.76
| 0607 |[Sales Person](src/main/java/g0601_0700/s0607_sales_person/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 1046 | 86.04

#### Day 7 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1141 |[User Activity for the Past 30 Days I](src/main/java/g1101_1200/s1141_user_activity_for_the_past_30_days_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 849 | 72.54
| 1693 |[Daily Leads and Partners](src/main/java/g1601_1700/s1693_daily_leads_and_partners/script.sql)| Easy | Database | 463 | 78.98
| 1729 |[Find Followers Count](src/main/java/g1701_1800/s1729_find_followers_count/script.sql)| Easy | Database | 456 | 88.39

#### Day 8 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0586 |[Customer Placing the Largest Number of Orders](src/main/java/g0501_0600/s0586_customer_placing_the_largest_number_of_orders/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 484 | 66.42
| 0511 |[Game Play Analysis I](src/main/java/g0501_0600/s0511_game_play_analysis_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 586 | 56.94
| 1890 |[The Latest Login in 2020](src/main/java/g1801_1900/s1890_the_latest_login_in_2020/script.sql)| Easy | Database | 571 | 73.59
| 1741 |[Find Total Time Spent by Each Employee](src/main/java/g1701_1800/s1741_find_total_time_spent_by_each_employee/script.sql)| Easy | Database | 414 | 93.27

#### Day 9 Control of Flow

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1393 |[Capital Gain/Loss](src/main/java/g1301_1400/s1393_capital_gainloss/script.sql)| Medium | LeetCode_Curated_SQL_70, Database | 428 | 92.01
| 1407 |[Top Travellers](src/main/java/g1401_1500/s1407_top_travellers/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 682 | 70.16
| 1158 |[Market Analysis I](src/main/java/g1101_1200/s1158_market_analysis_i/script.sql)| Medium | Database | 2511 | 78.92

#### Day 10 Where

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0182 |[Duplicate Emails](src/main/java/g0101_0200/s0182_duplicate_emails/script.sql)| Easy | Database | 303 | 92.08
| 1050 |[Actors and Directors Who Cooperated At Least Three Times](src/main/java/g1001_1100/s1050_actors_and_directors_who_cooperated_at_least_three_times/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 344 | 76.48
| 1587 |[Bank Account Summary II](src/main/java/g1501_1600/s1587_bank_account_summary_ii/script.sql)| Easy | Database | 630 | 60.32
| 1084 |[Sales Analysis III](src/main/java/g1001_1100/s1084_sales_analysis_iii/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 1066 | 69.71

### Level 1

#### Day 1 Prefix Sum

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1480 |[Running Sum of 1d Array](src/main/java/g1401_1500/s1480_running_sum_of_1d_array/Solution.java)| Easy | Array, Prefix_Sum | 0 | 100.00
| 0724 |[Find Pivot Index](src/main/java/g0701_0800/s0724_find_pivot_index/Solution.java)| Easy | Array, Prefix_Sum | 2 | 69.67

#### Day 2 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0205 |[Isomorphic Strings](src/main/java/g0201_0300/s0205_isomorphic_strings/Solution.java)| Easy | String, Hash_Table | 2 | 99.97
| 0392 |[Is Subsequence](src/main/java/g0301_0400/s0392_is_subsequence/Solution.java)| Easy | String, Dynamic_Programming, Two_Pointers | 1 | 93.01

#### Day 3 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0021 |[Merge Two Sorted Lists](src/main/java/g0001_0100/s0021_merge_two_sorted_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(m+n)_Space_O(m+n) | 0 | 100.00
| 0206 |[Reverse Linked List](src/main/java/g0201_0300/s0206_reverse_linked_list/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00

#### Day 4 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0876 |[Middle of the Linked List](src/main/java/g0801_0900/s0876_middle_of_the_linked_list/Solution.java)| Easy | Two_Pointers, Linked_List | 0 | 100.00
| 0142 |[Linked List Cycle II](src/main/java/g0101_0200/s0142_linked_list_cycle_ii/Solution.java)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00

#### Day 5 Greedy

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src/main/java/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 1 | 100.00
| 0409 |[Longest Palindrome](src/main/java/g0401_0500/s0409_longest_palindrome/Solution.java)| Easy | String, Hash_Table, Greedy | 2 | 92.90

#### Day 6 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0589 |[N-ary Tree Preorder Traversal](src/main/java/g0501_0600/s0589_n_ary_tree_preorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Stack | 1 | 90.98
| 0102 |[Binary Tree Level Order Traversal](src/main/java/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(N) | 1 | 91.09

#### Day 7 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src/main/java/g0701_0800/s0704_binary_search/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00
| 0278 |[First Bad Version](src/main/java/g0201_0300/s0278_first_bad_version/Solution.java)| Easy | Binary_Search, Interactive | 15 | 87.89

#### Day 8 Binary Search Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src/main/java/g0001_0100/s0098_validate_binary_search_tree/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 0 | 100.00
| 0235 |[Lowest Common Ancestor of a Binary Search Tree](src/main/java/g0201_0300/s0235_lowest_common_ancestor_of_a_binary_search_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 4 | 100.00

#### Day 9 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src/main/java/g0701_0800/s0733_flood_fill/Solution.java)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 1 | 85.36
| 0200 |[Number of Islands](src/main/java/g0101_0200/s0200_number_of_islands/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Big_O_Time_O(M\*N)_Space_O(M\*N) | 3 | 97.76

#### Day 10 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0509 |[Fibonacci Number](src/main/java/g0501_0600/s0509_fibonacci_number/Solution.java)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 0 | 100.00
| 0070 |[Climbing Stairs](src/main/java/g0001_0100/s0070_climbing_stairs/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00

#### Day 11 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0746 |[Min Cost Climbing Stairs](src/main/java/g0701_0800/s0746_min_cost_climbing_stairs/Solution.java)| Easy | Array, Dynamic_Programming | 1 | 86.38
| 0062 |[Unique Paths](src/main/java/g0001_0100/s0062_unique_paths/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics, Big_O_Time_O(m\*n)_Space_O(m\*n) | 0 | 100.00

#### Day 12 Sliding Window/Two Pointer

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src/main/java/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.java)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n+m)_Space_O(1) | 6 | 99.03
| 0424 |[Longest Repeating Character Replacement](src/main/java/g0401_0500/s0424_longest_repeating_character_replacement/Solution.java)| Medium | String, Hash_Table, Sliding_Window | 5 | 95.15

#### Day 13 Hashmap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0001 |[Two Sum](src/main/java/g0001_0100/s0001_two_sum/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Big_O_Time_O(n)_Space_O(n) | 2 | 85.97
| 0299 |[Bulls and Cows](src/main/java/g0201_0300/s0299_bulls_and_cows/Solution.java)| Medium | String, Hash_Table, Counting | 6 | 86.69

#### Day 14 Stack

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0844 |[Backspace String Compare](src/main/java/g0801_0900/s0844_backspace_string_compare/Solution.java)| Easy | String, Two_Pointers, Stack, Simulation | 0 | 100.00
| 0394 |[Decode String](src/main/java/g0301_0400/s0394_decode_string/Solution.java)| Medium | Top_100_Liked_Questions, String, Stack, Recursion, Big_O_Time_O(n)_Space_O(n) | 1 | 87.68

#### Day 15 Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1046 |[Last Stone Weight](src/main/java/g1001_1100/s1046_last_stone_weight/Solution.java)| Easy | Array, Heap_Priority_Queue | 2 | 73.81
| 0692 |[Top K Frequent Words](src/main/java/g0601_0700/s0692_top_k_frequent_words/Solution.java)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Trie, Bucket_Sort | 11 | 38.54

### Level 2

#### Day 1 Implementation/Simulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0202 |[Happy Number](src/main/java/g0201_0300/s0202_happy_number/Solution.java)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 1 | 98.59
| 0054 |[Spiral Matrix](src/main/java/g0001_0100/s0054_spiral_matrix/Solution.java)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 0 | 100.00
| 1706 |[Where Will the Ball Fall](src/main/java/g1701_1800/s1706_where_will_the_ball_fall/Solution.java)| Medium | Array, Dynamic_Programming, Depth_First_Search, Matrix, Simulation | 2 | 64.55

#### Day 2 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0014 |[Longest Common Prefix](src/main/java/g0001_0100/s0014_longest_common_prefix/Solution.java)| Easy | Top_Interview_Questions, String | 0 | 100.00
| 0043 |[Multiply Strings](src/main/java/g0001_0100/s0043_multiply_strings/Solution.java)| Medium | String, Math, Simulation | 1 | 100.00

#### Day 3 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0019 |[Remove Nth Node From End of List](src/main/java/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List, Big_O_Time_O(L)_Space_O(L) | 0 | 100.00
| 0234 |[Palindrome Linked List](src/main/java/g0201_0300/s0234_palindrome_linked_list/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Stack, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(1) | 6 | 76.07

#### Day 4 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0328 |[Odd Even Linked List](src/main/java/g0301_0400/s0328_odd_even_linked_list/Solution.java)| Medium | Top_Interview_Questions, Linked_List | 0 | 100.00
| 0148 |[Sort List](src/main/java/g0101_0200/s0148_sort_list/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Linked_List, Divide_and_Conquer, Merge_Sort, Big_O_Time_O(log(N))_Space_O(log(N)) | 12 | 85.82

#### Day 5 Greedy

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 2131 |[Longest Palindrome by Concatenating Two Letter Words](src/main/java/g2101_2200/s2131_longest_palindrome_by_concatenating_two_letter_words/Solution.java)| Medium | Array, String, Hash_Table, Greedy, Counting | 73 | 76.60
| 0621 |[Task Scheduler](src/main/java/g0601_0700/s0621_task_scheduler/Solution.java)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting | 3 | 84.32

#### Day 6 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0226 |[Invert Binary Tree](src/main/java/g0201_0300/s0226_invert_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0110 |[Balanced Binary Tree](src/main/java/g0101_0200/s0110_balanced_binary_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree | 1 | 98.82

#### Day 7 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0543 |[Diameter of Binary Tree](src/main/java/g0501_0600/s0543_diameter_of_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 1 | 65.86
| 0437 |[Path Sum III](src/main/java/g0401_0500/s0437_path_sum_iii/Solution.java)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 18 | 45.66

#### Day 8 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0074 |[Search a 2D Matrix](src/main/java/g0001_0100/s0074_search_a_2d_matrix/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 0 | 100.00
| 0033 |[Search in Rotated Sorted Array](src/main/java/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 0 | 100.00

#### Day 9 Binary Search Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0108 |[Convert Sorted Array to Binary Search Tree](src/main/java/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.java)| Easy | Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 0 | 100.00
| 0230 |[Kth Smallest Element in a BST](src/main/java/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(n)_Space_O(n) | 1 | 78.91
| 0173 |[Binary Search Tree Iterator](src/main/java/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.java)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 18 | 84.18

#### Day 10 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0994 |[Rotting Oranges](src/main/java/g0901_1000/s0994_rotting_oranges/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 3 | 74.27
| 0417 |[Pacific Atlantic Water Flow](src/main/java/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 5 | 92.62

#### Day 11 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0210 |[Course Schedule II](src/main/java/g0201_0300/s0210_course_schedule_ii/Solution.java)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 13 | 35.17
| 0815 |[Bus Routes](src/main/java/g0801_0900/s0815_bus_routes/Solution.java)| Hard | Array, Hash_Table, Breadth_First_Search | 49 | 89.11

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0198 |[House Robber](src/main/java/g0101_0200/s0198_house_robber/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0322 |[Coin Change](src/main/java/g0301_0400/s0322_coin_change/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search, Big_O_Time_O(m\*n)_Space_O(amount) | 17 | 91.77

#### Day 13 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0416 |[Partition Equal Subset Sum](src/main/java/g0401_0500/s0416_partition_equal_subset_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Big_O_Time_O(n\*sums)_Space_O(n\*sums) | 27 | 94.53
| 0152 |[Maximum Product Subarray](src/main/java/g0101_0200/s0152_maximum_product_subarray/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00

#### Day 14 Sliding Window/Two Pointer

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0003 |[Longest Substring Without Repeating Characters](src/main/java/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n)_Space_O(1) | 2 | 99.52
| 0016 |[3Sum Closest](src/main/java/g0001_0100/s0016_3sum_closest/Solution.java)| Medium | Array, Sorting, Two_Pointers | 4 | 98.21
| 0076 |[Minimum Window Substring](src/main/java/g0001_0100/s0076_minimum_window_substring/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(s.length())_Space_O(1) | 2 | 99.94

#### Day 15 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0100 |[Same Tree](src/main/java/g0001_0100/s0100_same_tree/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0101 |[Symmetric Tree](src/main/java/g0101_0200/s0101_symmetric_tree/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 0 | 100.00
| 0199 |[Binary Tree Right Side View](src/main/java/g0101_0200/s0199_binary_tree_right_side_view/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 94.57

#### Day 16 Design

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0232 |[Implement Queue using Stacks](src/main/java/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.java)| Easy | Stack, Design, Queue | 1 | 67.21
| 0155 |[Min Stack](src/main/java/g0101_0200/s0155_min_stack/MinStack.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Big_O_Time_O(1)_Space_O(N) | 3 | 100.00
| 0208 |[Implement Trie (Prefix Tree)](src/main/java/g0201_0300/s0208_implement_trie_prefix_tree/Trie.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie, Big_O_Time_O(word.length())_or_O(prefix.length())_Space_O(N) | 34 | 99.90

#### Day 17 Interval

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0057 |[Insert Interval](src/main/java/g0001_0100/s0057_insert_interval/Solution.java)| Medium | Array | 0 | 100.00
| 0056 |[Merge Intervals](src/main/java/g0001_0100/s0056_merge_intervals/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Big_O_Time_O(n_log_n)_Space_O(n) | 8 | 96.27

#### Day 18 Stack

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0735 |[Asteroid Collision](src/main/java/g0701_0800/s0735_asteroid_collision/Solution.java)| Medium | Array, Stack | 2 | 99.59
| 0227 |[Basic Calculator II](src/main/java/g0201_0300/s0227_basic_calculator_ii/Solution.java)| Medium | Top_Interview_Questions, String, Math, Stack | 8 | 95.32

#### Day 19 Union Find

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0547 |[Number of Provinces](src/main/java/g0501_0600/s0547_number_of_provinces/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 2 | 69.51
| 0947 |[Most Stones Removed with Same Row or Column](src/main/java/g0901_1000/s0947_most_stones_removed_with_same_row_or_column/Solution.java)| Medium | Depth_First_Search, Graph, Union_Find | 7 | 98.83

#### Day 20 Brute Force/Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0039 |[Combination Sum](src/main/java/g0001_0100/s0039_combination_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Backtracking, Big_O_Time_O(2^n)_Space_O(n+2^n) | 1 | 100.00
| 0046 |[Permutations](src/main/java/g0001_0100/s0046_permutations/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking, Big_O_Time_O(n\*n!)_Space_O(n+n!) | 1 | 95.07

### Udemy

#### Udemy Integers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0412 |[Fizz Buzz](src/main/java/g0401_0500/s0412_fizz_buzz/Solution.java)| Easy | Top_Interview_Questions, String, Math, Simulation | 1 | 100.00
| 0136 |[Single Number](src/main/java/g0101_0200/s0136_single_number/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Big_O_Time_O(N)_Space_O(1) | 1 | 99.97
| 0007 |[Reverse Integer](src/main/java/g0001_0100/s0007_reverse_integer/Solution.java)| Medium | Top_Interview_Questions, Math | 1 | 96.61
| 0009 |[Palindrome Number](src/main/java/g0001_0100/s0009_palindrome_number/Solution.java)| Easy | Math | 5 | 77.91
| 0172 |[Factorial Trailing Zeroes](src/main/java/g0101_0200/s0172_factorial_trailing_zeroes/Solution.java)| Medium | Top_Interview_Questions, Math | 1 | 85.61
| 0050 |[Pow(x, n)](src/main/java/g0001_0100/s0050_powx_n/Solution.java)| Medium | Top_Interview_Questions, Math, Recursion | 0 | 100.00

#### Udemy Strings

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0344 |[Reverse String](src/main/java/g0301_0400/s0344_reverse_string/Solution.java)| Easy | Top_Interview_Questions, String, Two_Pointers, Recursion | 1 | 99.91
| 0014 |[Longest Common Prefix](src/main/java/g0001_0100/s0014_longest_common_prefix/Solution.java)| Easy | Top_Interview_Questions, String | 0 | 100.00
| 0187 |[Repeated DNA Sequences](src/main/java/g0101_0200/s0187_repeated_dna_sequences/Solution.java)| Medium | String, Hash_Table, Bit_Manipulation, Sliding_Window, Hash_Function, Rolling_Hash | 29 | 77.11
| 0003 |[Longest Substring Without Repeating Characters](src/main/java/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n)_Space_O(1) | 2 | 99.52
| 0020 |[Valid Parentheses](src/main/java/g0001_0100/s0020_valid_parentheses/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack, Big_O_Time_O(n)_Space_O(n) | 1 | 98.78
| 0005 |[Longest Palindromic Substring](src/main/java/g0001_0100/s0005_longest_palindromic_substring/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 7 | 96.96
| 0394 |[Decode String](src/main/java/g0301_0400/s0394_decode_string/Solution.java)| Medium | Top_100_Liked_Questions, String, Stack, Recursion, Big_O_Time_O(n)_Space_O(n) | 1 | 87.68
| 0242 |[Valid Anagram](src/main/java/g0201_0300/s0242_valid_anagram/Solution.java)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting | 2 | 99.01
| 0049 |[Group Anagrams](src/main/java/g0001_0100/s0049_group_anagrams/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting, Big_O_Time_O(n\*k_log_k)_Space_O(n) | 6 | 92.28
| 0151 |[Reverse Words in a String](src/main/java/g0101_0200/s0151_reverse_words_in_a_string/Solution.java)| Medium | String, Two_Pointers | 2 | 99.94
| 0273 |[Integer to English Words](src/main/java/g0201_0300/s0273_integer_to_english_words/Solution.java)| Hard | String, Math, Recursion | 3 | 95.67

#### Udemy Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src/main/java/g0701_0800/s0704_binary_search/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00
| 0033 |[Search in Rotated Sorted Array](src/main/java/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 0 | 100.00
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/java/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_N)_Space_O(log_N) | 0 | 100.00

#### Udemy Arrays

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src/main/java/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 1 | 100.00
| 0283 |[Move Zeroes](src/main/java/g0201_0300/s0283_move_zeroes/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 2 | 79.54
| 0001 |[Two Sum](src/main/java/g0001_0100/s0001_two_sum/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Big_O_Time_O(n)_Space_O(n) | 2 | 85.97
| 0217 |[Contains Duplicate](src/main/java/g0201_0300/s0217_contains_duplicate/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 6 | 96.68
| 0058 |[Length of Last Word](src/main/java/g0001_0100/s0058_length_of_last_word/Solution.java)| Easy | String | 0 | 100.00
| 0605 |[Can Place Flowers](src/main/java/g0601_0700/s0605_can_place_flowers/Solution.java)| Easy | Array, Greedy | 1 | 96.77
| 0122 |[Best Time to Buy and Sell Stock II](src/main/java/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.java)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 1 | 96.82
| 0080 |[Remove Duplicates from Sorted Array II](src/main/java/g0001_0100/s0080_remove_duplicates_from_sorted_array_ii/Solution.java)| Medium | Array, Two_Pointers | 0 | 100.00
| 0189 |[Rotate Array](src/main/java/g0101_0200/s0189_rotate_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 0 | 100.00
| 0055 |[Jump Game](src/main/java/g0001_0100/s0055_jump_game/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 2 | 79.47
| 0075 |[Sort Colors](src/main/java/g0001_0100/s0075_sort_colors/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 0 | 100.00
| 0066 |[Plus One](src/main/java/g0001_0100/s0066_plus_one/Solution.java)| Easy | Top_Interview_Questions, Array, Math | 0 | 100.00
| 0238 |[Product of Array Except Self](src/main/java/g0201_0300/s0238_product_of_array_except_self/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum, Big_O_Time_O(n^2)_Space_O(n) | 1 | 100.00
| 1291 |[Sequential Digits](src/main/java/g1201_1300/s1291_sequential_digits/Solution.java)| Medium | Enumeration | 0 | 100.00
| 0448 |[Find All Numbers Disappeared in an Array](src/main/java/g0401_0500/s0448_find_all_numbers_disappeared_in_an_array/Solution.java)| Easy | Array, Hash_Table | 3 | 100.00
| 0442 |[Find All Duplicates in an Array](src/main/java/g0401_0500/s0442_find_all_duplicates_in_an_array/Solution.java)| Medium | Array, Hash_Table | 5 | 98.83
| 0041 |[First Missing Positive](src/main/java/g0001_0100/s0041_first_missing_positive/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Big_O_Time_O(n)_Space_O(n) | 2 | 57.59
| 0697 |[Degree of an Array](src/main/java/g0601_0700/s0697_degree_of_an_array/Solution.java)| Easy | Array, Hash_Table | 14 | 93.19
| 0532 |[K-diff Pairs in an Array](src/main/java/g0501_0600/s0532_k_diff_pairs_in_an_array/Solution.java)| Medium | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 13 | 58.23
| 0713 |[Subarray Product Less Than K](src/main/java/g0701_0800/s0713_subarray_product_less_than_k/Solution.java)| Medium | Array, Sliding_Window | 8 | 39.00
| 1007 |[Minimum Domino Rotations For Equal Row](src/main/java/g1001_1100/s1007_minimum_domino_rotations_for_equal_row/Solution.java)| Medium | Array, Greedy | 5 | 79.64
| 1306 |[Jump Game III](src/main/java/g1301_1400/s1306_jump_game_iii/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search | 2 | 96.23
| 0456 |[132 Pattern](src/main/java/g0401_0500/s0456_132_pattern/Solution.java)| Medium | Array, Binary_Search, Stack, Ordered_Set, Monotonic_Stack | 16 | 82.41
| 0239 |[Sliding Window Maximum](src/main/java/g0201_0300/s0239_sliding_window_maximum/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue, Big_O_Time_O(n\*k)_Space_O(n+k) | 58 | 52.28

#### Udemy Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0392 |[Is Subsequence](src/main/java/g0301_0400/s0392_is_subsequence/Solution.java)| Easy | String, Dynamic_Programming, Two_Pointers | 1 | 93.01
| 0125 |[Valid Palindrome](src/main/java/g0101_0200/s0125_valid_palindrome/Solution.java)| Easy | Top_Interview_Questions, String, Two_Pointers | 3 | 98.64
| 0977 |[Squares of a Sorted Array](src/main/java/g0901_1000/s0977_squares_of_a_sorted_array/Solution.java)| Easy | Array, Sorting, Two_Pointers | 1 | 100.00
| 0026 |[Remove Duplicates from Sorted Array](src/main/java/g0001_0100/s0026_remove_duplicates_from_sorted_array/Solution.java)| Easy | Top_Interview_Questions, Array, Two_Pointers | 1 | 98.56
| 0042 |[Trapping Rain Water](src/main/java/g0001_0100/s0042_trapping_rain_water/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack, Big_O_Time_O(n)_Space_O(1) | 0 | 100.00
| 0015 |[3Sum](src/main/java/g0001_0100/s0015_3sum/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n\*log(n))_Space_O(n^2) | 29 | 82.24

#### Udemy Famous Algorithm

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src/main/java/g0001_0100/s0053_maximum_subarray/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 1 | 100.00
| 0169 |[Majority Element](src/main/java/g0101_0200/s0169_majority_element/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 1 | 100.00

#### Udemy Sorting Algorithms

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0912 |[Sort an Array](src/main/java/g0901_1000/s0912_sort_an_array/Solution.java)| Medium | Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Merge_Sort, Bucket_Sort, Counting_Sort, Radix_Sort | 25 | 38.15

#### Udemy 2D Arrays/Matrix

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0304 |[Range Sum Query 2D - Immutable](src/main/java/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.java)| Medium | Array, Matrix, Design, Prefix_Sum | 153 | 87.51
| 0074 |[Search a 2D Matrix](src/main/java/g0001_0100/s0074_search_a_2d_matrix/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 0 | 100.00
| 0054 |[Spiral Matrix](src/main/java/g0001_0100/s0054_spiral_matrix/Solution.java)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 0 | 100.00
| 0048 |[Rotate Image](src/main/java/g0001_0100/s0048_rotate_image/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix, Big_O_Time_O(n^2)_Space_O(1) | 0 | 100.00
| 1572 |[Matrix Diagonal Sum](src/main/java/g1501_1600/s1572_matrix_diagonal_sum/Solution.java)| Easy | Array, Matrix | 0 | 100.00
| 0073 |[Set Matrix Zeroes](src/main/java/g0001_0100/s0073_set_matrix_zeroes/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Matrix, Big_O_Time_O(m\*n)_Space_O(1) | 1 | 79.07
| 0056 |[Merge Intervals](src/main/java/g0001_0100/s0056_merge_intervals/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Big_O_Time_O(n_log_n)_Space_O(n) | 8 | 96.27

#### Udemy Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0114 |[Flatten Binary Tree to Linked List](src/main/java/g0101_0200/s0114_flatten_binary_tree_to_linked_list/Solution.java)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Linked_List, Big_O_Time_O(N)_Space_O(N) | 1 | 75.27
| 0445 |[Add Two Numbers II](src/main/java/g0401_0500/s0445_add_two_numbers_ii/Solution.java)| Medium | Math, Stack, Linked_List | 3 | 90.38
| 0328 |[Odd Even Linked List](src/main/java/g0301_0400/s0328_odd_even_linked_list/Solution.java)| Medium | Top_Interview_Questions, Linked_List | 0 | 100.00
| 0061 |[Rotate List](src/main/java/g0001_0100/s0061_rotate_list/Solution.java)| Medium | Two_Pointers, Linked_List | 0 | 100.00
| 0024 |[Swap Nodes in Pairs](src/main/java/g0001_0100/s0024_swap_nodes_in_pairs/Solution.java)| Medium | Top_100_Liked_Questions, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(1) | 0 | 100.00
| 0876 |[Middle of the Linked List](src/main/java/g0801_0900/s0876_middle_of_the_linked_list/Solution.java)| Easy | Two_Pointers, Linked_List | 0 | 100.00
| 0142 |[Linked List Cycle II](src/main/java/g0101_0200/s0142_linked_list_cycle_ii/Solution.java)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00
| 0141 |[Linked List Cycle](src/main/java/g0101_0200/s0141_linked_list_cycle/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00
| 0206 |[Reverse Linked List](src/main/java/g0201_0300/s0206_reverse_linked_list/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00
| 0021 |[Merge Two Sorted Lists](src/main/java/g0001_0100/s0021_merge_two_sorted_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(m+n)_Space_O(m+n) | 0 | 100.00
| 0160 |[Intersection of Two Linked Lists](src/main/java/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(M+N)_Space_O(1) | 1 | 99.68
| 0234 |[Palindrome Linked List](src/main/java/g0201_0300/s0234_palindrome_linked_list/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Stack, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(1) | 6 | 76.07
| 0138 |[Copy List with Random Pointer](src/main/java/g0101_0200/s0138_copy_list_with_random_pointer/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List, Big_O_Time_O(N)_Space_O(N) | 0 | 100.00
| 0025 |[Reverse Nodes in k-Group](src/main/java/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.java)| Hard | Top_100_Liked_Questions, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(k) | 0 | 100.00
| 0146 |[LRU Cache](src/main/java/g0101_0200/s0146_lru_cache/LRUCache.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Design, Linked_List, Doubly_Linked_List, Big_O_Time_O(1)_Space_O(capacity) | 87 | 50.80
| 0707 |[Design Linked List](src/main/java/g0701_0800/s0707_design_linked_list/MyLinkedList.java)| Medium | Design, Linked_List | 10 | 70.60

#### Udemy Tree Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0144 |[Binary Tree Preorder Traversal](src/main/java/g0101_0200/s0144_binary_tree_preorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 1 | 48.38
| 0094 |[Binary Tree Inorder Traversal](src/main/java/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0145 |[Binary Tree Postorder Traversal](src/main/java/g0101_0200/s0145_binary_tree_postorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 1 | 49.11
| 0102 |[Binary Tree Level Order Traversal](src/main/java/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(N) | 1 | 91.09
| 0103 |[Binary Tree Zigzag Level Order Traversal](src/main/java/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.java)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 1 | 95.00
| 0108 |[Convert Sorted Array to Binary Search Tree](src/main/java/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.java)| Easy | Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 0 | 100.00
| 1008 |[Construct Binary Search Tree from Preorder Traversal](src/main/java/g1001_1100/s1008_construct_binary_search_tree_from_preorder_traversal/Solution.java)| Medium | Array, Tree, Binary_Tree, Stack, Monotonic_Stack, Binary_Search_Tree | 0 | 100.00
| 0543 |[Diameter of Binary Tree](src/main/java/g0501_0600/s0543_diameter_of_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 1 | 65.86
| 0938 |[Range Sum of BST](src/main/java/g0901_1000/s0938_range_sum_of_bst/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 0100 |[Same Tree](src/main/java/g0001_0100/s0100_same_tree/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0226 |[Invert Binary Tree](src/main/java/g0201_0300/s0226_invert_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0111 |[Minimum Depth of Binary Tree](src/main/java/g0101_0200/s0111_minimum_depth_of_binary_tree/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 97.49
| 0104 |[Maximum Depth of Binary Tree](src/main/java/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(H) | 0 | 100.00
| 0110 |[Balanced Binary Tree](src/main/java/g0101_0200/s0110_balanced_binary_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree | 1 | 98.82
| 0701 |[Insert into a Binary Search Tree](src/main/java/g0701_0800/s0701_insert_into_a_binary_search_tree/Solution.java)| Medium | Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 0297 |[Serialize and Deserialize Binary Tree](src/main/java/g0201_0300/s0297_serialize_and_deserialize_binary_tree/Codec.java)| Hard | Top_Interview_Questions, String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design | 7 | 98.13
| 0124 |[Binary Tree Maximum Path Sum](src/main/java/g0101_0200/s0124_binary_tree_maximum_path_sum/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(N) | 1 | 99.46
| 0098 |[Validate Binary Search Tree](src/main/java/g0001_0100/s0098_validate_binary_search_tree/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 0 | 100.00
| 0337 |[House Robber III](src/main/java/g0301_0400/s0337_house_robber_iii/Solution.java)| Medium | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 1 | 91.77
| 0236 |[Lowest Common Ancestor of a Binary Tree](src/main/java/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 10 | 56.51
| 0968 |[Binary Tree Cameras](src/main/java/g0901_1000/s0968_binary_tree_cameras/Solution.java)| Hard | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 0 | 100.00

#### Udemy Trie and Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0208 |[Implement Trie (Prefix Tree)](src/main/java/g0201_0300/s0208_implement_trie_prefix_tree/Trie.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie, Big_O_Time_O(word.length())_or_O(prefix.length())_Space_O(N) | 34 | 99.90
| 0745 |[Prefix and Suffix Search](src/main/java/g0701_0800/s0745_prefix_and_suffix_search/WordFilter.java)| Hard | String, Design, Trie | 366 | 76.15

#### Udemy Graph

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src/main/java/g0101_0200/s0200_number_of_islands/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Big_O_Time_O(M\*N)_Space_O(M\*N) | 3 | 97.76
| 0133 |[Clone Graph](src/main/java/g0101_0200/s0133_clone_graph/Solution.java)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Graph | 45 | 29.80
| 0417 |[Pacific Atlantic Water Flow](src/main/java/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 5 | 92.62

#### Udemy Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0120 |[Triangle](src/main/java/g0101_0200/s0120_triangle/Solution.java)| Medium | Array, Dynamic_Programming | 2 | 94.63
| 0118 |[Pascal's Triangle](src/main/java/g0101_0200/s0118_pascals_triangle/Solution.java)| Easy | Top_Interview_Questions, Array, Dynamic_Programming | 1 | 67.08
| 0119 |[Pascal's Triangle II](src/main/java/g0101_0200/s0119_pascals_triangle_ii/Solution.java)| Easy | Array, Dynamic_Programming | 0 | 100.00
| 0139 |[Word Break](src/main/java/g0101_0200/s0139_word_break/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization, Big_O_Time_O(M+max\*N)_Space_O(M+N+max) | 2 | 97.08
| 0152 |[Maximum Product Subarray](src/main/java/g0101_0200/s0152_maximum_product_subarray/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00
| 0198 |[House Robber](src/main/java/g0101_0200/s0198_house_robber/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0213 |[House Robber II](src/main/java/g0201_0300/s0213_house_robber_ii/Solution.java)| Medium | Array, Dynamic_Programming | 0 | 100.00
| 0509 |[Fibonacci Number](src/main/java/g0501_0600/s0509_fibonacci_number/Solution.java)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 0 | 100.00
| 0070 |[Climbing Stairs](src/main/java/g0001_0100/s0070_climbing_stairs/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0064 |[Minimum Path Sum](src/main/java/g0001_0100/s0064_minimum_path_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Big_O_Time_O(m\*n)_Space_O(m\*n) | 0 | 100.00
| 0300 |[Longest Increasing Subsequence](src/main/java/g0201_0300/s0300_longest_increasing_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search, Big_O_Time_O(n\*log_n)_Space_O(n) | 3 | 98.63
| 1143 |[Longest Common Subsequence](src/main/java/g1101_1200/s1143_longest_common_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, Big_O_Time_O(n\*m)_Space_O(n\*m) | 33 | 46.23
| 0072 |[Edit Distance](src/main/java/g0001_0100/s0072_edit_distance/Solution.java)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming, Big_O_Time_O(n^2)_Space_O(n2) | 4 | 90.13
| 0044 |[Wildcard Matching](src/main/java/g0001_0100/s0044_wildcard_matching/Solution.java)| Hard | Top_Interview_Questions, String, Dynamic_Programming, Greedy, Recursion | 2 | 99.87
| 0010 |[Regular Expression Matching](src/main/java/g0001_0100/s0010_regular_expression_matching/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Recursion, Big_O_Time_O(m\*n)_Space_O(m\*n) | 1 | 100.00

#### Udemy Backtracking/Recursion

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0022 |[Generate Parentheses](src/main/java/g0001_0100/s0022_generate_parentheses/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking, Big_O_Time_O(2^n)_Space_O(n) | 0 | 100.00
| 0039 |[Combination Sum](src/main/java/g0001_0100/s0039_combination_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Backtracking, Big_O_Time_O(2^n)_Space_O(n+2^n) | 1 | 100.00
| 0216 |[Combination Sum III](src/main/java/g0201_0300/s0216_combination_sum_iii/Solution.java)| Medium | Array, Backtracking | 1 | 81.35
| 0078 |[Subsets](src/main/java/g0001_0100/s0078_subsets/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking, Big_O_Time_O(2^n)_Space_O(n\*2^n) | 1 | 70.60
| 0017 |[Letter Combinations of a Phone Number](src/main/java/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking, Big_O_Time_O(4^n)_Space_O(n) | 0 | 100.00
| 0046 |[Permutations](src/main/java/g0001_0100/s0046_permutations/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking, Big_O_Time_O(n\*n!)_Space_O(n+n!) | 1 | 95.07

#### Udemy Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0191 |[Number of 1 Bits](src/main/java/g0101_0200/s0191_number_of_1_bits/Solution.java)| Easy | Top_Interview_Questions, Bit_Manipulation | 1 | 84.87
| 0389 |[Find the Difference](src/main/java/g0301_0400/s0389_find_the_difference/Solution.java)| Easy | String, Hash_Table, Sorting, Bit_Manipulation | 1 | 100.00
| 0190 |[Reverse Bits](src/main/java/g0101_0200/s0190_reverse_bits/Solution.java)| Easy | Top_Interview_Questions, Bit_Manipulation, Divide_and_Conquer | 1 | 98.66
| 0461 |[Hamming Distance](src/main/java/g0401_0500/s0461_hamming_distance/Solution.java)| Easy | Bit_Manipulation | 0 | 100.00
| 1009 |[Complement of Base 10 Integer](src/main/java/g1001_1100/s1009_complement_of_base_10_integer/Solution.java)| Easy | Bit_Manipulation | 1 | 41.56
| 0338 |[Counting Bits](src/main/java/g0301_0400/s0338_counting_bits/Solution.java)| Easy | Top_100_Liked_Questions, Dynamic_Programming, Bit_Manipulation, Big_O_Time_O(num)_Space_O(num) | 2 | 86.73
| 0371 |[Sum of Two Integers](src/main/java/g0301_0400/s0371_sum_of_two_integers/Solution.java)| Medium | Top_Interview_Questions, Math, Bit_Manipulation | 0 | 100.00
| 0029 |[Divide Two Integers](src/main/java/g0001_0100/s0029_divide_two_integers/Solution.java)| Medium | Top_Interview_Questions, Math, Bit_Manipulation | 1 | 97.44

#### Udemy Design

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src/main/java/g0101_0200/s0155_min_stack/MinStack.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Big_O_Time_O(1)_Space_O(N) | 3 | 100.00

### Data Structure I

#### Day 1 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0217 |[Contains Duplicate](src/main/java/g0201_0300/s0217_contains_duplicate/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 6 | 96.68
| 0053 |[Maximum Subarray](src/main/java/g0001_0100/s0053_maximum_subarray/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 1 | 100.00

#### Day 2 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0001 |[Two Sum](src/main/java/g0001_0100/s0001_two_sum/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Big_O_Time_O(n)_Space_O(n) | 2 | 85.97
| 0088 |[Merge Sorted Array](src/main/java/g0001_0100/s0088_merge_sorted_array/Solution.java)| Easy | Top_Interview_Questions, Array, Sorting, Two_Pointers | 0 | 100.00

#### Day 3 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0350 |[Intersection of Two Arrays II](src/main/java/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 4 | 69.62
| 0121 |[Best Time to Buy and Sell Stock](src/main/java/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 1 | 100.00

#### Day 4 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0566 |[Reshape the Matrix](src/main/java/g0501_0600/s0566_reshape_the_matrix/Solution.java)| Easy | Array, Matrix, Simulation | 1 | 90.08
| 0118 |[Pascal's Triangle](src/main/java/g0101_0200/s0118_pascals_triangle/Solution.java)| Easy | Top_Interview_Questions, Array, Dynamic_Programming | 1 | 67.08

#### Day 5 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0036 |[Valid Sudoku](src/main/java/g0001_0100/s0036_valid_sudoku/Solution.java)| Medium | Top_Interview_Questions, Array, Hash_Table, Matrix | 1 | 100.00
| 0074 |[Search a 2D Matrix](src/main/java/g0001_0100/s0074_search_a_2d_matrix/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 0 | 100.00

#### Day 6 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0387 |[First Unique Character in a String](src/main/java/g0301_0400/s0387_first_unique_character_in_a_string/Solution.java)| Easy | Top_Interview_Questions, String, Hash_Table, Counting, Queue | 1 | 100.00
| 0383 |[Ransom Note](src/main/java/g0301_0400/s0383_ransom_note/Solution.java)| Easy | String, Hash_Table, Counting | 1 | 99.97
| 0242 |[Valid Anagram](src/main/java/g0201_0300/s0242_valid_anagram/Solution.java)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting | 2 | 99.01

#### Day 7 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0141 |[Linked List Cycle](src/main/java/g0101_0200/s0141_linked_list_cycle/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00
| 0021 |[Merge Two Sorted Lists](src/main/java/g0001_0100/s0021_merge_two_sorted_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(m+n)_Space_O(m+n) | 0 | 100.00
| 0203 |[Remove Linked List Elements](src/main/java/g0201_0300/s0203_remove_linked_list_elements/Solution.java)| Easy | Linked_List, Recursion | 1 | 98.82

#### Day 8 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0206 |[Reverse Linked List](src/main/java/g0201_0300/s0206_reverse_linked_list/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00
| 0083 |[Remove Duplicates from Sorted List](src/main/java/g0001_0100/s0083_remove_duplicates_from_sorted_list/Solution.java)| Easy | Linked_List | 0 | 100.00

#### Day 9 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0020 |[Valid Parentheses](src/main/java/g0001_0100/s0020_valid_parentheses/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack, Big_O_Time_O(n)_Space_O(n) | 1 | 98.78
| 0232 |[Implement Queue using Stacks](src/main/java/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.java)| Easy | Stack, Design, Queue | 1 | 67.21

#### Day 10 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0144 |[Binary Tree Preorder Traversal](src/main/java/g0101_0200/s0144_binary_tree_preorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 1 | 48.38
| 0094 |[Binary Tree Inorder Traversal](src/main/java/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0145 |[Binary Tree Postorder Traversal](src/main/java/g0101_0200/s0145_binary_tree_postorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 1 | 49.11

#### Day 11 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0102 |[Binary Tree Level Order Traversal](src/main/java/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(N) | 1 | 91.09
| 0104 |[Maximum Depth of Binary Tree](src/main/java/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(H) | 0 | 100.00
| 0101 |[Symmetric Tree](src/main/java/g0101_0200/s0101_symmetric_tree/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 0 | 100.00

#### Day 12 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0226 |[Invert Binary Tree](src/main/java/g0201_0300/s0226_invert_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0112 |[Path Sum](src/main/java/g0101_0200/s0112_path_sum/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00

#### Day 13 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0700 |[Search in a Binary Search Tree](src/main/java/g0601_0700/s0700_search_in_a_binary_search_tree/Solution.java)| Easy | Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 0701 |[Insert into a Binary Search Tree](src/main/java/g0701_0800/s0701_insert_into_a_binary_search_tree/Solution.java)| Medium | Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00

#### Day 14 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src/main/java/g0001_0100/s0098_validate_binary_search_tree/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 0 | 100.00
| 0653 |[Two Sum IV - Input is a BST](src/main/java/g0601_0700/s0653_two_sum_iv_input_is_a_bst/Solution.java)| Easy | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Two_Pointers, Binary_Search_Tree | 5 | 74.23
| 0235 |[Lowest Common Ancestor of a Binary Search Tree](src/main/java/g0201_0300/s0235_lowest_common_ancestor_of_a_binary_search_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 4 | 100.00

### Data Structure II

#### Day 1 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0136 |[Single Number](src/main/java/g0101_0200/s0136_single_number/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Big_O_Time_O(N)_Space_O(1) | 1 | 99.97
| 0169 |[Majority Element](src/main/java/g0101_0200/s0169_majority_element/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 1 | 100.00
| 0015 |[3Sum](src/main/java/g0001_0100/s0015_3sum/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n\*log(n))_Space_O(n^2) | 29 | 82.24

#### Day 2 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0075 |[Sort Colors](src/main/java/g0001_0100/s0075_sort_colors/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 0 | 100.00
| 0056 |[Merge Intervals](src/main/java/g0001_0100/s0056_merge_intervals/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Big_O_Time_O(n_log_n)_Space_O(n) | 8 | 96.27
| 0706 |[Design HashMap](src/main/java/g0701_0800/s0706_design_hashmap/MyHashMap.java)| Easy | Array, Hash_Table, Design, Linked_List, Hash_Function | 13 | 95.71

#### Day 3 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0119 |[Pascal's Triangle II](src/main/java/g0101_0200/s0119_pascals_triangle_ii/Solution.java)| Easy | Array, Dynamic_Programming | 0 | 100.00
| 0048 |[Rotate Image](src/main/java/g0001_0100/s0048_rotate_image/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix, Big_O_Time_O(n^2)_Space_O(1) | 0 | 100.00
| 0059 |[Spiral Matrix II](src/main/java/g0001_0100/s0059_spiral_matrix_ii/Solution.java)| Medium | Array, Matrix, Simulation | 0 | 100.00

#### Day 4 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0240 |[Search a 2D Matrix II](src/main/java/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer, Big_O_Time_O(n+m)_Space_O(1) | 7 | 86.73
| 0435 |[Non-overlapping Intervals](src/main/java/g0401_0500/s0435_non_overlapping_intervals/Solution.java)| Medium | Array, Dynamic_Programming, Sorting, Greedy | 96 | 47.37

#### Day 5 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0334 |[Increasing Triplet Subsequence](src/main/java/g0301_0400/s0334_increasing_triplet_subsequence/Solution.java)| Medium | Top_Interview_Questions, Array, Greedy | 2 | 99.33
| 0238 |[Product of Array Except Self](src/main/java/g0201_0300/s0238_product_of_array_except_self/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum, Big_O_Time_O(n^2)_Space_O(n) | 1 | 100.00
| 0560 |[Subarray Sum Equals K](src/main/java/g0501_0600/s0560_subarray_sum_equals_k/Solution.java)| Medium | Top_100_Liked_Questions, Array, Hash_Table, Prefix_Sum, Big_O_Time_O(n)_Space_O(n) | 21 | 98.97

#### Day 6 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0415 |[Add Strings](src/main/java/g0401_0500/s0415_add_strings/Solution.java)| Easy | String, Math, Simulation | 3 | 82.41
| 0409 |[Longest Palindrome](src/main/java/g0401_0500/s0409_longest_palindrome/Solution.java)| Easy | String, Hash_Table, Greedy | 2 | 92.90

#### Day 7 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0290 |[Word Pattern](src/main/java/g0201_0300/s0290_word_pattern/Solution.java)| Easy | String, Hash_Table | 1 | 97.26
| 0763 |[Partition Labels](src/main/java/g0701_0800/s0763_partition_labels/Solution.java)| Medium | Top_100_Liked_Questions, String, Hash_Table, Greedy, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 1 | 100.00

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0049 |[Group Anagrams](src/main/java/g0001_0100/s0049_group_anagrams/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting, Big_O_Time_O(n\*k_log_k)_Space_O(n) | 6 | 92.28
| 0043 |[Multiply Strings](src/main/java/g0001_0100/s0043_multiply_strings/Solution.java)| Medium | String, Math, Simulation | 1 | 100.00

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0187 |[Repeated DNA Sequences](src/main/java/g0101_0200/s0187_repeated_dna_sequences/Solution.java)| Medium | String, Hash_Table, Bit_Manipulation, Sliding_Window, Hash_Function, Rolling_Hash | 29 | 77.11
| 0005 |[Longest Palindromic Substring](src/main/java/g0001_0100/s0005_longest_palindromic_substring/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 7 | 96.96

#### Day 10 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0002 |[Add Two Numbers](src/main/java/g0001_0100/s0002_add_two_numbers/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion, Big_O_Time_O(max(N,M))_Space_O(max(N,M)) | 1 | 100.00
| 0142 |[Linked List Cycle II](src/main/java/g0101_0200/s0142_linked_list_cycle_ii/Solution.java)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00

#### Day 11 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0160 |[Intersection of Two Linked Lists](src/main/java/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(M+N)_Space_O(1) | 1 | 99.68
| 0082 |[Remove Duplicates from Sorted List II](src/main/java/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.java)| Medium | Two_Pointers, Linked_List | 0 | 100.00

#### Day 12 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0024 |[Swap Nodes in Pairs](src/main/java/g0001_0100/s0024_swap_nodes_in_pairs/Solution.java)| Medium | Top_100_Liked_Questions, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(1) | 0 | 100.00
| 0707 |[Design Linked List](src/main/java/g0701_0800/s0707_design_linked_list/MyLinkedList.java)| Medium | Design, Linked_List | 10 | 70.60

#### Day 13 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0025 |[Reverse Nodes in k-Group](src/main/java/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.java)| Hard | Top_100_Liked_Questions, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(k) | 0 | 100.00
| 0143 |[Reorder List](src/main/java/g0101_0200/s0143_reorder_list/Solution.java)| Medium | Two_Pointers, Stack, Linked_List, Recursion | 2 | 72.59

#### Day 14 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src/main/java/g0101_0200/s0155_min_stack/MinStack.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Big_O_Time_O(1)_Space_O(N) | 3 | 100.00
| 1249 |[Minimum Remove to Make Valid Parentheses](src/main/java/g1201_1300/s1249_minimum_remove_to_make_valid_parentheses/Solution.java)| Medium | String, Stack | 13 | 94.62
| 1823 |[Find the Winner of the Circular Game](src/main/java/g1801_1900/s1823_find_the_winner_of_the_circular_game/Solution.java)| Medium | Array, Math, Simulation, Recursion, Queue | 3 | 64.85

#### Day 15 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0108 |[Convert Sorted Array to Binary Search Tree](src/main/java/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.java)| Easy | Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 0 | 100.00
| 0105 |[Construct Binary Tree from Preorder and Inorder Traversal](src/main/java/g0101_0200/s0105_construct_binary_tree_from_preorder_and_inorder_traversal/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer, Big_O_Time_O(N)_Space_O(N) | 3 | 86.35
| 0103 |[Binary Tree Zigzag Level Order Traversal](src/main/java/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.java)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 1 | 95.00

#### Day 16 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0199 |[Binary Tree Right Side View](src/main/java/g0101_0200/s0199_binary_tree_right_side_view/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 94.57
| 0113 |[Path Sum II](src/main/java/g0101_0200/s0113_path_sum_ii/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree, Backtracking | 1 | 100.00
| 0450 |[Delete Node in a BST](src/main/java/g0401_0500/s0450_delete_node_in_a_bst/Solution.java)| Medium | Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00

#### Day 17 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0230 |[Kth Smallest Element in a BST](src/main/java/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(n)_Space_O(n) | 1 | 78.91
| 0173 |[Binary Search Tree Iterator](src/main/java/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.java)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 18 | 84.18

#### Day 18 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0236 |[Lowest Common Ancestor of a Binary Tree](src/main/java/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 10 | 56.51
| 0297 |[Serialize and Deserialize Binary Tree](src/main/java/g0201_0300/s0297_serialize_and_deserialize_binary_tree/Codec.java)| Hard | Top_Interview_Questions, String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design | 7 | 98.13

#### Day 19 Graph

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0997 |[Find the Town Judge](src/main/java/g0901_1000/s0997_find_the_town_judge/Solution.java)| Easy | Array, Hash_Table, Graph | 3 | 80.64
| 1557 |[Minimum Number of Vertices to Reach All Nodes](src/main/java/g1501_1600/s1557_minimum_number_of_vertices_to_reach_all_nodes/Solution.java)| Medium | Graph | 8 | 99.94
| 0841 |[Keys and Rooms](src/main/java/g0801_0900/s0841_keys_and_rooms/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 3 | 51.54

#### Day 20 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0215 |[Kth Largest Element in an Array](src/main/java/g0201_0300/s0215_kth_largest_element_in_an_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect, Big_O_Time_O(n\*log(n))_Space_O(log(n)) | 5 | 70.82
| 0347 |[Top K Frequent Elements](src/main/java/g0301_0400/s0347_top_k_frequent_elements/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Divide_and_Conquer, Quickselect, Bucket_Sort, Big_O_Time_O(n\*log(n))_Space_O(k) | 9 | 97.93

#### Day 21 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0451 |[Sort Characters By Frequency](src/main/java/g0401_0500/s0451_sort_characters_by_frequency/Solution.java)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Bucket_Sort | 13 | 89.63
| 0973 |[K Closest Points to Origin](src/main/java/g0901_1000/s0973_k_closest_points_to_origin/Solution.java)| Medium | Array, Math, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Geometry, Quickselect | 4 | 98.26

### Algorithm I

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src/main/java/g0701_0800/s0704_binary_search/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00
| 0278 |[First Bad Version](src/main/java/g0201_0300/s0278_first_bad_version/Solution.java)| Easy | Binary_Search, Interactive | 15 | 87.89
| 0035 |[Search Insert Position](src/main/java/g0001_0100/s0035_search_insert_position/Solution.java)| Easy | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 0 | 100.00

#### Day 2 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0977 |[Squares of a Sorted Array](src/main/java/g0901_1000/s0977_squares_of_a_sorted_array/Solution.java)| Easy | Array, Sorting, Two_Pointers | 1 | 100.00
| 0189 |[Rotate Array](src/main/java/g0101_0200/s0189_rotate_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 0 | 100.00

#### Day 3 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0283 |[Move Zeroes](src/main/java/g0201_0300/s0283_move_zeroes/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 2 | 79.54
| 0167 |[Two Sum II - Input Array Is Sorted](src/main/java/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.java)| Medium | Array, Binary_Search, Two_Pointers | 1 | 99.21

#### Day 4 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0344 |[Reverse String](src/main/java/g0301_0400/s0344_reverse_string/Solution.java)| Easy | Top_Interview_Questions, String, Two_Pointers, Recursion | 1 | 99.91
| 0557 |[Reverse Words in a String III](src/main/java/g0501_0600/s0557_reverse_words_in_a_string_iii/Solution.java)| Easy | String, Two_Pointers | 4 | 97.75

#### Day 5 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0876 |[Middle of the Linked List](src/main/java/g0801_0900/s0876_middle_of_the_linked_list/Solution.java)| Easy | Two_Pointers, Linked_List | 0 | 100.00
| 0019 |[Remove Nth Node From End of List](src/main/java/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List, Big_O_Time_O(L)_Space_O(L) | 0 | 100.00

#### Day 6 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0003 |[Longest Substring Without Repeating Characters](src/main/java/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n)_Space_O(1) | 2 | 99.52
| 0567 |[Permutation in String](src/main/java/g0501_0600/s0567_permutation_in_string/Solution.java)| Medium | String, Hash_Table, Two_Pointers, Sliding_Window | 5 | 93.93

#### Day 7 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src/main/java/g0701_0800/s0733_flood_fill/Solution.java)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 1 | 85.36
| 0695 |[Max Area of Island](src/main/java/g0601_0700/s0695_max_area_of_island/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 3 | 76.79

#### Day 8 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0617 |[Merge Two Binary Trees](src/main/java/g0601_0700/s0617_merge_two_binary_trees/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 72.47
| 0116 |[Populating Next Right Pointers in Each Node](src/main/java/g0101_0200/s0116_populating_next_right_pointers_in_each_node/Solution.java)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 0 | 100.00

#### Day 9 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0542 |[01 Matrix](src/main/java/g0501_0600/s0542_01_matrix/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 7 | 95.83
| 0994 |[Rotting Oranges](src/main/java/g0901_1000/s0994_rotting_oranges/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 3 | 74.27

#### Day 10 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0021 |[Merge Two Sorted Lists](src/main/java/g0001_0100/s0021_merge_two_sorted_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(m+n)_Space_O(m+n) | 0 | 100.00
| 0206 |[Reverse Linked List](src/main/java/g0201_0300/s0206_reverse_linked_list/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(N)_Space_O(1) | 0 | 100.00

#### Day 11 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0077 |[Combinations](src/main/java/g0001_0100/s0077_combinations/Solution.java)| Medium | Backtracking | 11 | 77.40
| 0046 |[Permutations](src/main/java/g0001_0100/s0046_permutations/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking, Big_O_Time_O(n\*n!)_Space_O(n+n!) | 1 | 95.07
| 0784 |[Letter Case Permutation](src/main/java/g0701_0800/s0784_letter_case_permutation/Solution.java)| Medium | String, Bit_Manipulation, Backtracking | 10 | 40.38

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src/main/java/g0001_0100/s0070_climbing_stairs/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0198 |[House Robber](src/main/java/g0101_0200/s0198_house_robber/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 0 | 100.00
| 0120 |[Triangle](src/main/java/g0101_0200/s0120_triangle/Solution.java)| Medium | Array, Dynamic_Programming | 2 | 94.63

#### Day 13 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0231 |[Power of Two](src/main/java/g0201_0300/s0231_power_of_two/Solution.java)| Easy | Math, Bit_Manipulation, Recursion | 1 | 100.00
| 0191 |[Number of 1 Bits](src/main/java/g0101_0200/s0191_number_of_1_bits/Solution.java)| Easy | Top_Interview_Questions, Bit_Manipulation | 1 | 84.87

#### Day 14 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0190 |[Reverse Bits](src/main/java/g0101_0200/s0190_reverse_bits/Solution.java)| Easy | Top_Interview_Questions, Bit_Manipulation, Divide_and_Conquer | 1 | 98.66
| 0136 |[Single Number](src/main/java/g0101_0200/s0136_single_number/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Big_O_Time_O(N)_Space_O(1) | 1 | 99.97

### Algorithm II

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0034 |[Find First and Last Position of Element in Sorted Array](src/main/java/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 0 | 100.00
| 0033 |[Search in Rotated Sorted Array](src/main/java/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 0 | 100.00
| 0074 |[Search a 2D Matrix](src/main/java/g0001_0100/s0074_search_a_2d_matrix/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 0 | 100.00

#### Day 2 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/java/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_N)_Space_O(log_N) | 0 | 100.00
| 0162 |[Find Peak Element](src/main/java/g0101_0200/s0162_find_peak_element/Solution.java)| Medium | Top_Interview_Questions, Array, Binary_Search | 0 | 100.00

#### Day 3 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0082 |[Remove Duplicates from Sorted List II](src/main/java/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.java)| Medium | Two_Pointers, Linked_List | 0 | 100.00
| 0015 |[3Sum](src/main/java/g0001_0100/s0015_3sum/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n\*log(n))_Space_O(n^2) | 29 | 82.24

#### Day 4 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0844 |[Backspace String Compare](src/main/java/g0801_0900/s0844_backspace_string_compare/Solution.java)| Easy | String, Two_Pointers, Stack, Simulation | 0 | 100.00
| 0986 |[Interval List Intersections](src/main/java/g0901_1000/s0986_interval_list_intersections/Solution.java)| Medium | Array, Two_Pointers | 2 | 99.95
| 0011 |[Container With Most Water](src/main/java/g0001_0100/s0011_container_with_most_water/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Greedy, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 3 | 95.71

#### Day 5 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src/main/java/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.java)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n+m)_Space_O(1) | 6 | 99.03
| 0713 |[Subarray Product Less Than K](src/main/java/g0701_0800/s0713_subarray_product_less_than_k/Solution.java)| Medium | Array, Sliding_Window | 8 | 39.00
| 0209 |[Minimum Size Subarray Sum](src/main/java/g0201_0300/s0209_minimum_size_subarray_sum/Solution.java)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 1 | 100.00

#### Day 6 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src/main/java/g0101_0200/s0200_number_of_islands/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Big_O_Time_O(M\*N)_Space_O(M\*N) | 3 | 97.76
| 0547 |[Number of Provinces](src/main/java/g0501_0600/s0547_number_of_provinces/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 2 | 69.51

#### Day 7 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0117 |[Populating Next Right Pointers in Each Node II](src/main/java/g0101_0200/s0117_populating_next_right_pointers_in_each_node_ii/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 0 | 100.00
| 0572 |[Subtree of Another Tree](src/main/java/g0501_0600/s0572_subtree_of_another_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Hash_Function, String_Matching | 1 | 100.00

#### Day 8 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1091 |[Shortest Path in Binary Matrix](src/main/java/g1001_1100/s1091_shortest_path_in_binary_matrix/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 22 | 69.99
| 0130 |[Surrounded Regions](src/main/java/g0101_0200/s0130_surrounded_regions/Solution.java)| Medium | Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 2 | 84.66
| 0797 |[All Paths From Source to Target](src/main/java/g0701_0800/s0797_all_paths_from_source_to_target/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Backtracking | 2 | 90.53

#### Day 9 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0078 |[Subsets](src/main/java/g0001_0100/s0078_subsets/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking, Big_O_Time_O(2^n)_Space_O(n\*2^n) | 1 | 70.60
| 0090 |[Subsets II](src/main/java/g0001_0100/s0090_subsets_ii/Solution.java)| Medium | Array, Bit_Manipulation, Backtracking | 2 | 82.94

#### Day 10 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0047 |[Permutations II](src/main/java/g0001_0100/s0047_permutations_ii/Solution.java)| Medium | Array, Backtracking | 1 | 99.86
| 0039 |[Combination Sum](src/main/java/g0001_0100/s0039_combination_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Backtracking, Big_O_Time_O(2^n)_Space_O(n+2^n) | 1 | 100.00
| 0040 |[Combination Sum II](src/main/java/g0001_0100/s0040_combination_sum_ii/Solution.java)| Medium | Array, Backtracking | 2 | 99.75

#### Day 11 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0017 |[Letter Combinations of a Phone Number](src/main/java/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking, Big_O_Time_O(4^n)_Space_O(n) | 0 | 100.00
| 0022 |[Generate Parentheses](src/main/java/g0001_0100/s0022_generate_parentheses/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking, Big_O_Time_O(2^n)_Space_O(n) | 0 | 100.00
| 0079 |[Word Search](src/main/java/g0001_0100/s0079_word_search/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Backtracking, Big_O_Time_O(4^(m\*n))_Space_O(m\*n) | 157 | 78.97

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0213 |[House Robber II](src/main/java/g0201_0300/s0213_house_robber_ii/Solution.java)| Medium | Array, Dynamic_Programming | 0 | 100.00
| 0055 |[Jump Game](src/main/java/g0001_0100/s0055_jump_game/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 2 | 79.47

#### Day 13 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0045 |[Jump Game II](src/main/java/g0001_0100/s0045_jump_game_ii/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 2 | 49.02
| 0062 |[Unique Paths](src/main/java/g0001_0100/s0062_unique_paths/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics, Big_O_Time_O(m\*n)_Space_O(m\*n) | 0 | 100.00

#### Day 14 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src/main/java/g0001_0100/s0005_longest_palindromic_substring/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 7 | 96.96
| 0413 |[Arithmetic Slices](src/main/java/g0401_0500/s0413_arithmetic_slices/Solution.java)| Medium | Array, Dynamic_Programming | 0 | 100.00

#### Day 15 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0091 |[Decode Ways](src/main/java/g0001_0100/s0091_decode_ways/Solution.java)| Medium | Top_Interview_Questions, String, Dynamic_Programming | 2 | 66.37
| 0139 |[Word Break](src/main/java/g0101_0200/s0139_word_break/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization, Big_O_Time_O(M+max\*N)_Space_O(M+N+max) | 2 | 97.08

#### Day 16 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src/main/java/g0201_0300/s0300_longest_increasing_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search, Big_O_Time_O(n\*log_n)_Space_O(n) | 3 | 98.63
| 0673 |[Number of Longest Increasing Subsequence](src/main/java/g0601_0700/s0673_number_of_longest_increasing_subsequence/Solution.java)| Medium | Array, Dynamic_Programming, Segment_Tree, Binary_Indexed_Tree | 25 | 68.75

#### Day 17 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1143 |[Longest Common Subsequence](src/main/java/g1101_1200/s1143_longest_common_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, Big_O_Time_O(n\*m)_Space_O(n\*m) | 33 | 46.23
| 0583 |[Delete Operation for Two Strings](src/main/java/g0501_0600/s0583_delete_operation_for_two_strings/Solution.java)| Medium | String, Dynamic_Programming | 12 | 79.10

#### Day 18 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0072 |[Edit Distance](src/main/java/g0001_0100/s0072_edit_distance/Solution.java)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming, Big_O_Time_O(n^2)_Space_O(n2) | 4 | 90.13
| 0322 |[Coin Change](src/main/java/g0301_0400/s0322_coin_change/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search, Big_O_Time_O(m\*n)_Space_O(amount) | 17 | 91.77
| 0343 |[Integer Break](src/main/java/g0301_0400/s0343_integer_break/Solution.java)| Medium | Dynamic_Programming, Math | 0 | 100.00

#### Day 19 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0201 |[Bitwise AND of Numbers Range](src/main/java/g0201_0300/s0201_bitwise_and_of_numbers_range/Solution.java)| Medium | Bit_Manipulation | 8 | 74.15

#### Day 20 Others

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0384 |[Shuffle an Array](src/main/java/g0301_0400/s0384_shuffle_an_array/Solution.java)| Medium | Top_Interview_Questions, Array, Math, Randomized | 52 | 91.77

#### Day 21 Others

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0202 |[Happy Number](src/main/java/g0201_0300/s0202_happy_number/Solution.java)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 1 | 98.59
| 0149 |[Max Points on a Line](src/main/java/g0101_0200/s0149_max_points_on_a_line/Solution.java)| Hard | Top_Interview_Questions, Array, Hash_Table, Math, Geometry | 11 | 99.21

### Binary Search I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src/main/java/g0701_0800/s0704_binary_search/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00
| 0374 |[Guess Number Higher or Lower](src/main/java/g0301_0400/s0374_guess_number_higher_or_lower/Solution.java)| Easy | Binary_Search, Interactive | 0 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0035 |[Search Insert Position](src/main/java/g0001_0100/s0035_search_insert_position/Solution.java)| Easy | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 0 | 100.00
| 0852 |[Peak Index in a Mountain Array](src/main/java/g0801_0900/s0852_peak_index_in_a_mountain_array/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0367 |[Valid Perfect Square](src/main/java/g0301_0400/s0367_valid_perfect_square/Solution.java)| Easy | Math, Binary_Search | 0 | 100.00
| 1385 |[Find the Distance Value Between Two Arrays](src/main/java/g1301_1400/s1385_find_the_distance_value_between_two_arrays/Solution.java)| Easy | Array, Sorting, Binary_Search, Two_Pointers | 5 | 65.78

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0069 |[Sqrt(x)](src/main/java/g0001_0100/s0069_sqrtx/Solution.java)| Easy | Top_Interview_Questions, Math, Binary_Search | 1 | 99.51
| 0744 |[Find Smallest Letter Greater Than Target](src/main/java/g0701_0800/s0744_find_smallest_letter_greater_than_target/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0278 |[First Bad Version](src/main/java/g0201_0300/s0278_first_bad_version/Solution.java)| Easy | Binary_Search, Interactive | 15 | 87.89
| 0034 |[Find First and Last Position of Element in Sorted Array](src/main/java/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 0 | 100.00

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0441 |[Arranging Coins](src/main/java/g0401_0500/s0441_arranging_coins/Solution.java)| Easy | Math, Binary_Search | 2 | 95.97
| 1539 |[Kth Missing Positive Number](src/main/java/g1501_1600/s1539_kth_missing_positive_number/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0167 |[Two Sum II - Input Array Is Sorted](src/main/java/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.java)| Medium | Array, Binary_Search, Two_Pointers | 1 | 99.21
| 1608 |[Special Array With X Elements Greater Than or Equal X](src/main/java/g1601_1700/s1608_special_array_with_x_elements_greater_than_or_equal_x/Solution.java)| Easy | Array, Sorting, Binary_Search | 2 | 61.14

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1351 |[Count Negative Numbers in a Sorted Matrix](src/main/java/g1301_1400/s1351_count_negative_numbers_in_a_sorted_matrix/Solution.java)| Easy | Array, Binary_Search, Matrix | 1 | 49.66
| 0074 |[Search a 2D Matrix](src/main/java/g0001_0100/s0074_search_a_2d_matrix/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 0 | 100.00

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1337 |[The K Weakest Rows in a Matrix](src/main/java/g1301_1400/s1337_the_k_weakest_rows_in_a_matrix/Solution.java)| Easy | Array, Sorting, Binary_Search, Matrix, Heap_Priority_Queue | 1 | 99.77
| 1346 |[Check If N and Its Double Exist](src/main/java/g1301_1400/s1346_check_if_n_and_its_double_exist/Solution.java)| Easy | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 1 | 99.64

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0350 |[Intersection of Two Arrays II](src/main/java/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 4 | 69.62
| 0633 |[Sum of Square Numbers](src/main/java/g0601_0700/s0633_sum_of_square_numbers/Solution.java)| Medium | Math, Binary_Search, Two_Pointers | 4 | 82.92

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1855 |[Maximum Distance Between a Pair of Values](src/main/java/g1801_1900/s1855_maximum_distance_between_a_pair_of_values/Solution.java)| Medium | Array, Greedy, Binary_Search, Two_Pointers | 4 | 62.20
| 0033 |[Search in Rotated Sorted Array](src/main/java/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 0 | 100.00

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/java/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_N)_Space_O(log_N) | 0 | 100.00

### Binary Search II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0209 |[Minimum Size Subarray Sum](src/main/java/g0201_0300/s0209_minimum_size_subarray_sum/Solution.java)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 1 | 100.00
| 0611 |[Valid Triangle Number](src/main/java/g0601_0700/s0611_valid_triangle_number/Solution.java)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers | 10 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0658 |[Find K Closest Elements](src/main/java/g0601_0700/s0658_find_k_closest_elements/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Heap_Priority_Queue | 3 | 99.20
| 1894 |[Find the Student that Will Replace the Chalk](src/main/java/g1801_1900/s1894_find_the_student_that_will_replace_the_chalk/Solution.java)| Medium | Array, Binary_Search, Simulation, Prefix_Sum | 2 | 76.67

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src/main/java/g0201_0300/s0300_longest_increasing_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search, Big_O_Time_O(n\*log_n)_Space_O(n) | 3 | 98.63
| 1760 |[Minimum Limit of Balls in a Bag](src/main/java/g1701_1800/s1760_minimum_limit_of_balls_in_a_bag/Solution.java)| Medium | Array, Binary_Search | 44 | 78.49

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0875 |[Koko Eating Bananas](src/main/java/g0801_0900/s0875_koko_eating_bananas/Solution.java)| Medium | Array, Binary_Search | 15 | 91.32
| 1552 |[Magnetic Force Between Two Balls](src/main/java/g1501_1600/s1552_magnetic_force_between_two_balls/Solution.java)| Medium | Array, Sorting, Binary_Search | 39 | 99.65

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0287 |[Find the Duplicate Number](src/main/java/g0201_0300/s0287_find_the_duplicate_number/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Two_Pointers, Bit_Manipulation, Big_O_Time_O(n)_Space_O(n) | 2 | 99.82
| 1283 |[Find the Smallest Divisor Given a Threshold](src/main/java/g1201_1300/s1283_find_the_smallest_divisor_given_a_threshold/Solution.java)| Medium | Array, Binary_Search | 9 | 95.49

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1898 |[Maximum Number of Removable Characters](src/main/java/g1801_1900/s1898_maximum_number_of_removable_characters/Solution.java)| Medium | Array, String, Binary_Search | 121 | 72.51
| 1870 |[Minimum Speed to Arrive on Time](src/main/java/g1801_1900/s1870_minimum_speed_to_arrive_on_time/Solution.java)| Medium | Array, Binary_Search | 86 | 88.58

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1482 |[Minimum Number of Days to Make m Bouquets](src/main/java/g1401_1500/s1482_minimum_number_of_days_to_make_m_bouquets/Solution.java)| Medium | Array, Binary_Search | 25 | 69.18
| 1818 |[Minimum Absolute Sum Difference](src/main/java/g1801_1900/s1818_minimum_absolute_sum_difference/Solution.java)| Medium | Array, Sorting, Binary_Search, Ordered_Set | 13 | 99.44

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0240 |[Search a 2D Matrix II](src/main/java/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer, Big_O_Time_O(n+m)_Space_O(1) | 7 | 86.73
| 0275 |[H-Index II](src/main/java/g0201_0300/s0275_h_index_ii/Solution.java)| Medium | Array, Binary_Search | 0 | 100.00

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1838 |[Frequency of the Most Frequent Element](src/main/java/g1801_1900/s1838_frequency_of_the_most_frequent_element/Solution.java)| Medium | Array, Sorting, Greedy, Binary_Search, Prefix_Sum, Sliding_Window | 11 | 100.00
| 0540 |[Single Element in a Sorted Array](src/main/java/g0501_0600/s0540_single_element_in_a_sorted_array/Solution.java)| Medium | Array, Binary_Search | 0 | 100.00

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0222 |[Count Complete Tree Nodes](src/main/java/g0201_0300/s0222_count_complete_tree_nodes/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Search, Binary_Tree | 0 | 100.00
| 1712 |[Ways to Split Array Into Three Subarrays](src/main/java/g1701_1800/s1712_ways_to_split_array_into_three_subarrays/Solution.java)| Medium | Array, Binary_Search, Two_Pointers, Prefix_Sum | 16 | 84.24

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0826 |[Most Profit Assigning Work](src/main/java/g0801_0900/s0826_most_profit_assigning_work/Solution.java)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers | 21 | 83.83
| 0436 |[Find Right Interval](src/main/java/g0401_0500/s0436_find_right_interval/Solution.java)| Medium | Array, Sorting, Binary_Search | 20 | 81.51

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0081 |[Search in Rotated Sorted Array II](src/main/java/g0001_0100/s0081_search_in_rotated_sorted_array_ii/Solution.java)| Medium | Array, Binary_Search | 1 | 82.83
| 0162 |[Find Peak Element](src/main/java/g0101_0200/s0162_find_peak_element/Solution.java)| Medium | Top_Interview_Questions, Array, Binary_Search | 0 | 100.00

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0154 |[Find Minimum in Rotated Sorted Array II](src/main/java/g0101_0200/s0154_find_minimum_in_rotated_sorted_array_ii/Solution.java)| Hard | Array, Binary_Search | 1 | 77.09
| 0528 |[Random Pick with Weight](src/main/java/g0501_0600/s0528_random_pick_with_weight/Solution.java)| Medium | Math, Binary_Search, Prefix_Sum, Randomized | 42 | 50.90

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1508 |[Range Sum of Sorted Subarray Sums](src/main/java/g1501_1600/s1508_range_sum_of_sorted_subarray_sums/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 60 | 93.84
| 1574 |[Shortest Subarray to be Removed to Make Array Sorted](src/main/java/g1501_1600/s1574_shortest_subarray_to_be_removed_to_make_array_sorted/Solution.java)| Medium | Array, Binary_Search, Two_Pointers, Stack, Monotonic_Stack | 2 | 84.97

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1292 |[Maximum Side Length of a Square with Sum Less than or Equal to Threshold](src/main/java/g1201_1300/s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold/Solution.java)| Medium | Array, Binary_Search, Matrix, Prefix_Sum | 23 | 32.97
| 1498 |[Number of Subsequences That Satisfy the Given Sum Condition](src/main/java/g1401_1500/s1498_number_of_subsequences_that_satisfy_the_given_sum_condition/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 27 | 99.13

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0981 |[Time Based Key-Value Store](src/main/java/g0901_1000/s0981_time_based_key_value_store/TimeMap.java)| Medium | String, Hash_Table, Binary_Search, Design | 239 | 72.78
| 1300 |[Sum of Mutated Array Closest to Target](src/main/java/g1201_1300/s1300_sum_of_mutated_array_closest_to_target/Solution.java)| Medium | Array, Sorting, Binary_Search | 7 | 33.33

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1802 |[Maximum Value at a Given Index in a Bounded Array](src/main/java/g1801_1900/s1802_maximum_value_at_a_given_index_in_a_bounded_array/Solution.java)| Medium | Greedy, Binary_Search | 2 | 58.44
| 1901 |[Find a Peak Element II](src/main/java/g1901_2000/s1901_find_a_peak_element_ii/Solution.java)| Medium | Array, Binary_Search, Matrix, Divide_and_Conquer | 0 | 100.00

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1146 |[Snapshot Array](src/main/java/g1101_1200/s1146_snapshot_array/SnapshotArray.java)| Medium | Array, Hash_Table, Binary_Search, Design | 68 | 45.86
| 1488 |[Avoid Flood in The City](src/main/java/g1401_1500/s1488_avoid_flood_in_the_city/Solution.java)| Medium | Array, Hash_Table, Greedy, Binary_Search, Heap_Priority_Queue | 82 | 75.08

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1562 |[Find Latest Group of Size M](src/main/java/g1501_1600/s1562_find_latest_group_of_size_m/Solution.java)| Medium | Array, Binary_Search, Simulation | 8 | 90.00
| 1648 |[Sell Diminishing-Valued Colored Balls](src/main/java/g1601_1700/s1648_sell_diminishing_valued_colored_balls/Solution.java)| Medium | Array, Math, Sorting, Greedy, Binary_Search, Heap_Priority_Queue | 27 | 80.64

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1201 |[Ugly Number III](src/main/java/g1201_1300/s1201_ugly_number_iii/Solution.java)| Medium | Math, Binary_Search, Number_Theory | 0 | 100.00
| 0911 |[Online Election](src/main/java/g0901_1000/s0911_online_election/TopVotedCandidate.java)| Medium | Array, Hash_Table, Binary_Search, Design | 63 | 98.81

## Contributing
Your ideas/fixes/algorithms are more than welcome!

1. Fork this repo
2. Clone your forked repo (`git clone https://github.com/YOUR_GITHUB_USERNAME/LeetCode-in-Java.git`) onto your local machine
3. `cd` into your cloned directory, create your feature branch (`git checkout -b my-awesome-fix`)
4. `git add` your desired changes to this repo
5. Commit your changes (`git commit -m 'Added some awesome features/fixes'`)
6. Push to the branch (`git push origin my-awesome-feature`)
7. Open your forked repo on Github website, create a new Pull Request to this repo!
