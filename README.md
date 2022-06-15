# LeetCode-in-Java

[![Maven Central](https://img.shields.io/maven-central/v/com.github.javadev/leetcode-in-java.svg)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.github.javadev%22%20AND%20a%3A%22leetcode-in-java%22)
[![MIT License](http://img.shields.io/badge/license-MIT-green.svg) ](https://github.com/javadev/leetcode-in-java/blob/main/LICENSE)
[![Java CI](https://github.com/javadev/LeetCode-in-Java/actions/workflows/maven.yml/badge.svg)](https://github.com/javadev/LeetCode-in-Java/actions/workflows/maven.yml)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=javadev_LeetCode-in-Java&metric=sqale_rating)](https://sonarcloud.io/summary/overall?id=javadev_LeetCode-in-Java)
[![javadoc](https://javadoc.io/badge2/com.github.javadev/leetcode-in-java/javadoc.svg)](https://javadoc.io/doc/com.github.javadev/leetcode-in-java)
[![](https://img.shields.io/github/stars/javadev/LeetCode-in-Java?style=flat-square)](https://github.com/javadev/LeetCode-in-Java)
[![](https://img.shields.io/github/forks/javadev/LeetCode-in-Java?style=flat-square)](https://github.com/javadev/LeetCode-in-Java/fork)

Java Solution for LeetCode algorithm problems, continually updating.

## Installation

Include the following in your `pom.xml` for Maven:

```xml
<dependencies>
  <dependency>
    <groupId>com.github.javadev</groupId>
    <artifactId>leetcode-in-java</artifactId>
    <version>1.10</version>
  </dependency>
  ...
</dependencies>
```

Gradle:

```groovy
implementation 'com.github.javadev:leetcode-in-java:1.10'
```

> ["For coding interview preparation, LeetCode is one of the best online resource providing a rich library of more than 300 real coding interview questions for you to practice from using one of the 7 supported languages - C, C++, Java, Python, C#, JavaScript, Ruby."](https://www.quora.com/How-effective-is-Leetcode-for-preparing-for-technical-interviews)

### Data Structure I

#### Day 1 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0217 |[Contains Duplicate](src.save/main/java/g0201_0300/s0217_contains_duplicate/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 10 | 67.20
| 0053 |[Maximum Subarray](src.save/main/java/g0001_0100/s0053_maximum_subarray/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer | 1 | 100.00

#### Day 2 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0001 |[Two Sum](src.save/main/java/g0001_0100/s0001_two_sum/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 4 | 69.91
| 0088 |[Merge Sorted Array](src.save/main/java/g0001_0100/s0088_merge_sorted_array/Solution.java)| Easy | Top_Interview_Questions, Array, Sorting, Two_Pointers | 0 | 100.00

#### Day 3 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0350 |[Intersection of Two Arrays II](src.save/main/java/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 3 | 81.79
| 0121 |[Best Time to Buy and Sell Stock](src.save/main/java/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 2 | 85.25

#### Day 4 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0566 |[Reshape the Matrix](src.save/main/java/g0501_0600/s0566_reshape_the_matrix/Solution.java)| Easy | Array, Matrix, Simulation | 1 | 84.34
| 0118 |[Pascal's Triangle](src.save/main/java/g0101_0200/s0118_pascals_triangle/Solution.java)| Easy | Top_Interview_Questions, Array, Dynamic_Programming | 1 | 62.34

#### Day 5 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0036 |[Valid Sudoku](src.save/main/java/g0001_0100/s0036_valid_sudoku/Solution.java)| Medium | Top_Interview_Questions, Array, Hash_Table, Matrix | 2 | 95.85
| 0074 |[Search a 2D Matrix](src.save/main/java/g0001_0100/s0074_search_a_2d_matrix/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 0 | 100.00

#### Day 6 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0387 |[First Unique Character in a String](src.save/main/java/g0301_0400/s0387_first_unique_character_in_a_string/Solution.java)| Easy | Top_Interview_Questions, String, Hash_Table, Counting, Queue | 2 | 99.53
| 0383 |[Ransom Note](src.save/main/java/g0301_0400/s0383_ransom_note/Solution.java)| Easy | String, Hash_Table, Counting | 1 | 99.79
| 0242 |[Valid Anagram](src.save/main/java/g0201_0300/s0242_valid_anagram/Solution.java)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting | 2 | 98.88

#### Day 7 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0141 |[Linked List Cycle](src.save/main/java/g0101_0200/s0141_linked_list_cycle/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 0 | 100.00
| 0021 |[Merge Two Sorted Lists](src.save/main/java/g0001_0100/s0021_merge_two_sorted_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 1 | 69.17
| 0203 |[Remove Linked List Elements](src.save/main/java/g0201_0300/s0203_remove_linked_list_elements/Solution.java)| Easy | Linked_List, Recursion | 1 | 90.35

#### Day 8 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0206 |[Reverse Linked List](src.save/main/java/g0201_0300/s0206_reverse_linked_list/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 0 | 100.00
| 0083 |[Remove Duplicates from Sorted List](src.save/main/java/g0001_0100/s0083_remove_duplicates_from_sorted_list/Solution.java)| Easy | Linked_List | 0 | 100.00

#### Day 9 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0020 |[Valid Parentheses](src.save/main/java/g0001_0100/s0020_valid_parentheses/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack | 3 | 51.72
| 0232 |[Implement Queue using Stacks](src.save/main/java/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.java)| Easy | Stack, Design, Queue | 1 | 56.63

#### Day 10 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0144 |[Binary Tree Preorder Traversal](src.save/main/java/g0101_0200/s0144_binary_tree_preorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 1 | 42.23
| 0094 |[Binary Tree Inorder Traversal](src.save/main/java/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack | 0 | 100.00
| 0145 |[Binary Tree Postorder Traversal](src.save/main/java/g0101_0200/s0145_binary_tree_postorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 1 | 42.74

#### Day 11 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0102 |[Binary Tree Level Order Traversal](src.save/main/java/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0104 |[Maximum Depth of Binary Tree](src.save/main/java/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0101 |[Symmetric Tree](src.save/main/java/g0101_0200/s0101_symmetric_tree/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00

#### Day 12 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0226 |[Invert Binary Tree](src.save/main/java/g0201_0300/s0226_invert_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0112 |[Path Sum](src.save/main/java/g0101_0200/s0112_path_sum/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00

#### Day 13 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0700 |[Search in a Binary Search Tree](src.save/main/java/g0601_0700/s0700_search_in_a_binary_search_tree/Solution.java)| Easy | Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 0701 |[Insert into a Binary Search Tree](src.save/main/java/g0701_0800/s0701_insert_into_a_binary_search_tree/Solution.java)| Medium | Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00

#### Day 14 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src.save/main/java/g0001_0100/s0098_validate_binary_search_tree/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 0653 |[Two Sum IV - Input is a BST](src.save/main/java/g0601_0700/s0653_two_sum_iv_input_is_a_bst/Solution.java)| Easy | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Two_Pointers, Binary_Search_Tree | 5 | 74.23
| 0235 |[Lowest Common Ancestor of a Binary Search Tree](src.save/main/java/g0201_0300/s0235_lowest_common_ancestor_of_a_binary_search_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 7 | 52.79

### Data Structure II

#### Day 1 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0136 |[Single Number](src.save/main/java/g0101_0200/s0136_single_number/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation | 2 | 58.97
| 0169 |[Majority Element](src.save/main/java/g0101_0200/s0169_majority_element/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer | 2 | 83.81
| 0015 |[3Sum](src.save/main/java/g0001_0100/s0015_3sum/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 28 | 71.04

#### Day 2 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0075 |[Sort Colors](src.save/main/java/g0001_0100/s0075_sort_colors/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 1 | 33.23
| 0056 |[Merge Intervals](src.save/main/java/g0001_0100/s0056_merge_intervals/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting | 7 | 97.44
| 0706 |[Design HashMap](src.save/main/java/g0701_0800/s0706_design_hashmap/MyHashMap.java)| Easy | Array, Hash_Table, Design, Linked_List, Hash_Function | 13 | 95.71

#### Day 3 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0119 |[Pascal's Triangle II](src.save/main/java/g0101_0200/s0119_pascals_triangle_ii/Solution.java)| Easy | Array, Dynamic_Programming | 0 | 100.00
| 0048 |[Rotate Image](src.save/main/java/g0001_0100/s0048_rotate_image/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix | 0 | 100.00
| 0059 |[Spiral Matrix II](src.save/main/java/g0001_0100/s0059_spiral_matrix_ii/Solution.java)| Medium | Array, Matrix, Simulation | 0 | 100.00

#### Day 4 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0240 |[Search a 2D Matrix II](src.save/main/java/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer | 9 | 71.40
| 0435 |[Non-overlapping Intervals](src.save/main/java/g0401_0500/s0435_non_overlapping_intervals/Solution.java)| Medium | Array, Dynamic_Programming, Sorting, Greedy | 109 | 26.80

#### Day 5 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0334 |[Increasing Triplet Subsequence](src.save/main/java/g0301_0400/s0334_increasing_triplet_subsequence/Solution.java)| Medium | Top_Interview_Questions, Array, Greedy | 3 | 61.85
| 0238 |[Product of Array Except Self](src.save/main/java/g0201_0300/s0238_product_of_array_except_self/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum | 1 | 100.00
| 0560 |[Subarray Sum Equals K](src.save/main/java/g0501_0600/s0560_subarray_sum_equals_k/Solution.java)| Medium | Top_100_Liked_Questions, Array, Hash_Table, Prefix_Sum | 18 | 89.51

#### Day 6 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0415 |[Add Strings](src.save/main/java/g0401_0500/s0415_add_strings/Solution.java)| Easy | String, Math, Simulation | 3 | 75.64
| 0409 |[Longest Palindrome](src.save/main/java/g0401_0500/s0409_longest_palindrome/Solution.java)| Easy | String, Hash_Table, Greedy | 1 | 100.00

#### Day 7 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0290 |[Word Pattern](src.save/main/java/g0201_0300/s0290_word_pattern/Solution.java)| Easy | String, Hash_Table | 1 | 91.62
| 0763 |[Partition Labels](src.save/main/java/g0701_0800/s0763_partition_labels/Solution.java)| Medium | Top_100_Liked_Questions, String, Hash_Table, Greedy, Two_Pointers | 1 | 100.00

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0049 |[Group Anagrams](src.save/main/java/g0001_0100/s0049_group_anagrams/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sorting | 10 | 74.79
| 0043 |[Multiply Strings](src.save/main/java/g0001_0100/s0043_multiply_strings/Solution.java)| Medium | String, Math, Simulation | 3 | 96.85

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0187 |[Repeated DNA Sequences](src.save/main/java/g0101_0200/s0187_repeated_dna_sequences/Solution.java)| Medium | String, Hash_Table, Bit_Manipulation, Sliding_Window, Hash_Function, Rolling_Hash | 32 | 67.58
| 0005 |[Longest Palindromic Substring](src.save/main/java/g0001_0100/s0005_longest_palindromic_substring/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 10 | 98.57

#### Day 10 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0002 |[Add Two Numbers](src.save/main/java/g0001_0100/s0002_add_two_numbers/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion | 2 | 98.23
| 0142 |[Linked List Cycle II](src.save/main/java/g0101_0200/s0142_linked_list_cycle_ii/Solution.java)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List | 0 | 100.00

#### Day 11 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0160 |[Intersection of Two Linked Lists](src.save/main/java/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 2 | 61.05
| 0082 |[Remove Duplicates from Sorted List II](src.save/main/java/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.java)| Medium | Two_Pointers, Linked_List | 1 | 70.85

#### Day 12 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0024 |[Swap Nodes in Pairs](src.save/main/java/g0001_0100/s0024_swap_nodes_in_pairs/Solution.java)| Medium | Top_100_Liked_Questions, Linked_List, Recursion | 0 | 100.00
| 0707 |[Design Linked List](src.save/main/java/g0701_0800/s0707_design_linked_list/MyLinkedList.java)| Medium | Design, Linked_List | 10 | 70.60

#### Day 13 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0025 |[Reverse Nodes in k-Group](src.save/main/java/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.java)| Hard | Top_100_Liked_Questions, Linked_List, Recursion | 0 | 100.00
| 0143 |[Reorder List](src.save/main/java/g0101_0200/s0143_reorder_list/Solution.java)| Medium | Two_Pointers, Stack, Linked_List, Recursion | 2 | 72.16

#### Day 14 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src.save/main/java/g0101_0200/s0155_min_stack/MinStack.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 5 | 81.77
| 1249 |[Minimum Remove to Make Valid Parentheses](src.save/main/java/g1201_1300/s1249_minimum_remove_to_make_valid_parentheses/Solution.java)| Medium | String, Stack | 13 | 94.62
| 1823 |[Find the Winner of the Circular Game](src.save/main/java/g1801_1900/s1823_find_the_winner_of_the_circular_game/Solution.java)| Medium | Array, Math, Simulation, Recursion, Queue | 3 | 64.85

#### Day 15 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0108 |[Convert Sorted Array to Binary Search Tree](src.save/main/java/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.java)| Easy | Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 0 | 100.00
| 0105 |[Construct Binary Tree from Preorder and Inorder Traversal](src.save/main/java/g0101_0200/s0105_construct_binary_tree_from_preorder_and_inorder_traversal/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer | 1 | 99.69
| 0103 |[Binary Tree Zigzag Level Order Traversal](src.save/main/java/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.java)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 1 | 86.98

#### Day 16 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0199 |[Binary Tree Right Side View](src.save/main/java/g0101_0200/s0199_binary_tree_right_side_view/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 92.96
| 0113 |[Path Sum II](src.save/main/java/g0101_0200/s0113_path_sum_ii/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree, Backtracking | 1 | 100.00
| 0450 |[Delete Node in a BST](src.save/main/java/g0401_0500/s0450_delete_node_in_a_bst/Solution.java)| Medium | Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00

#### Day 17 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0230 |[Kth Smallest Element in a BST](src.save/main/java/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.java)| Medium | Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 0173 |[Binary Search Tree Iterator](src.save/main/java/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.java)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 18 | 78.45

#### Day 18 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0236 |[Lowest Common Ancestor of a Binary Tree](src.save/main/java/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree | 11 | 46.61
| 0297 |[Serialize and Deserialize Binary Tree](src.save/main/java/g0201_0300/s0297_serialize_and_deserialize_binary_tree/Codec.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design | 9 | 91.82

#### Day 19 Graph

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0997 |[Find the Town Judge](src.save/main/java/g0901_1000/s0997_find_the_town_judge/Solution.java)| Easy | Array, Hash_Table, Graph | 3 | 80.64
| 1557 |[Minimum Number of Vertices to Reach All Nodes](src.save/main/java/g1501_1600/s1557_minimum_number_of_vertices_to_reach_all_nodes/Solution.java)| Medium | Graph | 8 | 99.94
| 0841 |[Keys and Rooms](src.save/main/java/g0801_0900/s0841_keys_and_rooms/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 3 | 51.54

#### Day 20 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0215 |[Kth Largest Element in an Array](src.save/main/java/g0201_0300/s0215_kth_largest_element_in_an_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect | 2 | 93.01
| 0347 |[Top K Frequent Elements](src.save/main/java/g0301_0400/s0347_top_k_frequent_elements/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Divide_and_Conquer, Quickselect, Bucket_Sort | 7 | 99.54

#### Day 21 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0451 |[Sort Characters By Frequency](src.save/main/java/g0401_0500/s0451_sort_characters_by_frequency/Solution.java)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Bucket_Sort | 18 | 70.93
| 0973 |[K Closest Points to Origin](src.save/main/java/g0901_1000/s0973_k_closest_points_to_origin/Solution.java)| Medium | Array, Math, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Geometry, Quickselect | 4 | 98.26

### Algorithm I

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src.save/main/java/g0701_0800/s0704_binary_search/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00
| 0278 |[First Bad Version](src.save/main/java/g0201_0300/s0278_first_bad_version/Solution.java)| Easy | Binary_Search, Interactive | 12 | 99.50
| 0035 |[Search Insert Position](src.save/main/java/g0001_0100/s0035_search_insert_position/Solution.java)| Easy | Top_100_Liked_Questions, Array, Binary_Search | 0 | 100.00

#### Day 2 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0977 |[Squares of a Sorted Array](src.save/main/java/g0901_1000/s0977_squares_of_a_sorted_array/Solution.java)| Easy | Array, Sorting, Two_Pointers | 1 | 100.00
| 0189 |[Rotate Array](src.save/main/java/g0101_0200/s0189_rotate_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers | 1 | 83.21

#### Day 3 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0283 |[Move Zeroes](src.save/main/java/g0201_0300/s0283_move_zeroes/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers | 2 | 74.00
| 0167 |[Two Sum II - Input Array Is Sorted](src.save/main/java/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.java)| Medium | Array, Binary_Search, Two_Pointers | 2 | 49.88

#### Day 4 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0344 |[Reverse String](src.save/main/java/g0301_0400/s0344_reverse_string/Solution.java)| Easy | Top_Interview_Questions, String, Two_Pointers, Recursion | 1 | 87.94
| 0557 |[Reverse Words in a String III](src.save/main/java/g0501_0600/s0557_reverse_words_in_a_string_iii/Solution.java)| Easy | String, Two_Pointers | 5 | 88.09

#### Day 5 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0876 |[Middle of the Linked List](src.save/main/java/g0801_0900/s0876_middle_of_the_linked_list/Solution.java)| Easy | Two_Pointers, Linked_List | 0 | 100.00
| 0019 |[Remove Nth Node From End of List](src.save/main/java/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List | 1 | 59.72

#### Day 6 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0003 |[Longest Substring Without Repeating Characters](src.save/main/java/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 5 | 91.03
| 0567 |[Permutation in String](src.save/main/java/g0501_0600/s0567_permutation_in_string/Solution.java)| Medium | String, Hash_Table, Two_Pointers, Sliding_Window | 4 | 95.23

#### Day 7 Breadth-First Search Depth-First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src.save/main/java/g0701_0800/s0733_flood_fill/Solution.java)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 1 | 85.36
| 0695 |[Max Area of Island](src.save/main/java/g0601_0700/s0695_max_area_of_island/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 3 | 76.79

#### Day 8 Breadth-First Search Depth-First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0617 |[Merge Two Binary Trees](src.save/main/java/g0601_0700/s0617_merge_two_binary_trees/Solution.java)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 72.47
| 0116 |[Populating Next Right Pointers in Each Node](src.save/main/java/g0101_0200/s0116_populating_next_right_pointers_in_each_node/Solution.java)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 0 | 100.00

#### Day 9 Breadth-First Search Depth-First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0542 |[01 Matrix](src.save/main/java/g0501_0600/s0542_01_matrix/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 6 | 96.78
| 0994 |[Rotting Oranges](src.save/main/java/g0901_1000/s0994_rotting_oranges/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 3 | 74.27

#### Day 10 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0021 |[Merge Two Sorted Lists](src.save/main/java/g0001_0100/s0021_merge_two_sorted_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 1 | 69.17
| 0206 |[Reverse Linked List](src.save/main/java/g0201_0300/s0206_reverse_linked_list/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 0 | 100.00

#### Day 11 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0077 |[Combinations](src.save/main/java/g0001_0100/s0077_combinations/Solution.java)| Medium | Backtracking | 5 | 89.72
| 0046 |[Permutations](src.save/main/java/g0001_0100/s0046_permutations/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking | 2 | 71.89
| 0784 |[Letter Case Permutation](src.save/main/java/g0701_0800/s0784_letter_case_permutation/Solution.java)| Medium | String, Bit_Manipulation, Backtracking | 10 | 40.38

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src.save/main/java/g0001_0100/s0070_climbing_stairs/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 0 | 100.00
| 0198 |[House Robber](src.save/main/java/g0101_0200/s0198_house_robber/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 0 | 100.00
| 0120 |[Triangle](src.save/main/java/g0101_0200/s0120_triangle/Solution.java)| Medium | Array, Dynamic_Programming | 1 | 99.76

#### Day 13 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0231 |[Power of Two](src.save/main/java/g0201_0300/s0231_power_of_two/Solution.java)| Easy | Math, Bit_Manipulation, Recursion | 1 | 95.76
| 0191 |[Number of 1 Bits](src.save/main/java/g0101_0200/s0191_number_of_1_bits/Solution.java)| Easy | Top_Interview_Questions, Bit_Manipulation | 0 | 100.00

#### Day 14 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0190 |[Reverse Bits](src.save/main/java/g0101_0200/s0190_reverse_bits/Solution.java)| Easy | Top_Interview_Questions, Bit_Manipulation, Divide_and_Conquer | 1 | 89.07
| 0136 |[Single Number](src.save/main/java/g0101_0200/s0136_single_number/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation | 2 | 58.97

### Algorithm II

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0034 |[Find First and Last Position of Element in Sorted Array](src.save/main/java/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 0 | 100.00
| 0033 |[Search in Rotated Sorted Array](src.save/main/java/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 0 | 100.00
| 0074 |[Search a 2D Matrix](src.save/main/java/g0001_0100/s0074_search_a_2d_matrix/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 0 | 100.00

#### Day 2 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0153 |[Find Minimum in Rotated Sorted Array](src.save/main/java/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search | 0 | 100.00
| 0162 |[Find Peak Element](src.save/main/java/g0101_0200/s0162_find_peak_element/Solution.java)| Medium | Top_Interview_Questions, Array, Binary_Search | 0 | 100.00

#### Day 3 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0082 |[Remove Duplicates from Sorted List II](src.save/main/java/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.java)| Medium | Two_Pointers, Linked_List | 1 | 70.85
| 0015 |[3Sum](src.save/main/java/g0001_0100/s0015_3sum/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 28 | 71.04

#### Day 4 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0844 |[Backspace String Compare](src.save/main/java/g0801_0900/s0844_backspace_string_compare/Solution.java)| Easy | String, Two_Pointers, Stack, Simulation | 0 | 100.00
| 0986 |[Interval List Intersections](src.save/main/java/g0901_1000/s0986_interval_list_intersections/Solution.java)| Medium | Array, Two_Pointers | 2 | 99.95
| 0011 |[Container With Most Water](src.save/main/java/g0001_0100/s0011_container_with_most_water/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Greedy, Two_Pointers | 2 | 99.81

#### Day 5 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src.save/main/java/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.java)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window | 8 | 87.18
| 0713 |[Subarray Product Less Than K](src.save/main/java/g0701_0800/s0713_subarray_product_less_than_k/Solution.java)| Medium | Array, Sliding_Window | 8 | 39.00
| 0209 |[Minimum Size Subarray Sum](src.save/main/java/g0201_0300/s0209_minimum_size_subarray_sum/Solution.java)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 1 | 99.98

#### Day 6 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src.save/main/java/g0101_0200/s0200_number_of_islands/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 4 | 73.02
| 0547 |[Number of Provinces](src.save/main/java/g0501_0600/s0547_number_of_provinces/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 1 | 94.56

#### Day 7 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0117 |[Populating Next Right Pointers in Each Node II](src.save/main/java/g0101_0200/s0117_populating_next_right_pointers_in_each_node_ii/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 0 | 100.00
| 0572 |[Subtree of Another Tree](src.save/main/java/g0501_0600/s0572_subtree_of_another_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Hash_Function, String_Matching | 0 | 100.00

#### Day 8 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1091 |[Shortest Path in Binary Matrix](src.save/main/java/g1001_1100/s1091_shortest_path_in_binary_matrix/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 22 | 69.99
| 0130 |[Surrounded Regions](src.save/main/java/g0101_0200/s0130_surrounded_regions/Solution.java)| Medium | Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 2 | 80.58
| 0797 |[All Paths From Source to Target](src.save/main/java/g0701_0800/s0797_all_paths_from_source_to_target/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Backtracking | 2 | 90.53

#### Day 9 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0078 |[Subsets](src.save/main/java/g0001_0100/s0078_subsets/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking | 1 | 79.43
| 0090 |[Subsets II](src.save/main/java/g0001_0100/s0090_subsets_ii/Solution.java)| Medium | Array, Bit_Manipulation, Backtracking | 2 | 75.68

#### Day 10 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0047 |[Permutations II](src.save/main/java/g0001_0100/s0047_permutations_ii/Solution.java)| Medium | Array, Backtracking | 2 | 86.24
| 0039 |[Combination Sum](src.save/main/java/g0001_0100/s0039_combination_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Backtracking | 3 | 92.97
| 0040 |[Combination Sum II](src.save/main/java/g0001_0100/s0040_combination_sum_ii/Solution.java)| Medium | Array, Backtracking | 4 | 86.03

#### Day 11 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0017 |[Letter Combinations of a Phone Number](src.save/main/java/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking | 0 | 100.00
| 0022 |[Generate Parentheses](src.save/main/java/g0001_0100/s0022_generate_parentheses/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking | 2 | 63.16
| 0079 |[Word Search](src.save/main/java/g0001_0100/s0079_word_search/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Backtracking | 178 | 45.01

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0213 |[House Robber II](src.save/main/java/g0201_0300/s0213_house_robber_ii/Solution.java)| Medium | Array, Dynamic_Programming | 1 | 31.05
| 0055 |[Jump Game](src.save/main/java/g0001_0100/s0055_jump_game/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 2 | 87.28

#### Day 13 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0045 |[Jump Game II](src.save/main/java/g0001_0100/s0045_jump_game_ii/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy | 1 | 99.67
| 0062 |[Unique Paths](src.save/main/java/g0001_0100/s0062_unique_paths/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics | 1 | 45.44

#### Day 14 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src.save/main/java/g0001_0100/s0005_longest_palindromic_substring/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 10 | 98.57
| 0413 |[Arithmetic Slices](src.save/main/java/g0401_0500/s0413_arithmetic_slices/Solution.java)| Medium | Array, Dynamic_Programming | 0 | 100.00

#### Day 15 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0091 |[Decode Ways](src.save/main/java/g0001_0100/s0091_decode_ways/Solution.java)| Medium | Top_Interview_Questions, String, Dynamic_Programming | 2 | 64.33
| 0139 |[Word Break](src.save/main/java/g0101_0200/s0139_word_break/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization | 2 | 96.55

#### Day 16 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src.save/main/java/g0201_0300/s0300_longest_increasing_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 3 | 96.86
| 0673 |[Number of Longest Increasing Subsequence](src.save/main/java/g0601_0700/s0673_number_of_longest_increasing_subsequence/Solution.java)| Medium | Array, Dynamic_Programming, Segment_Tree, Binary_Indexed_Tree | 25 | 68.75

#### Day 17 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1143 |[Longest Common Subsequence](src.save/main/java/g1101_1200/s1143_longest_common_subsequence/Solution.java)| Medium | String, Dynamic_Programming | 9 | 93.92
| 0583 |[Delete Operation for Two Strings](src.save/main/java/g0501_0600/s0583_delete_operation_for_two_strings/Solution.java)| Medium | String, Dynamic_Programming | 12 | 73.04

#### Day 18 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0072 |[Edit Distance](src.save/main/java/g0001_0100/s0072_edit_distance/Solution.java)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming | 7 | 66.86
| 0322 |[Coin Change](src.save/main/java/g0301_0400/s0322_coin_change/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search | 22 | 72.14
| 0343 |[Integer Break](src.save/main/java/g0301_0400/s0343_integer_break/Solution.java)| Medium | Dynamic_Programming, Math | 0 | 100.00

#### Day 19 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0201 |[Bitwise AND of Numbers Range](src.save/main/java/g0201_0300/s0201_bitwise_and_of_numbers_range/Solution.java)| Medium | Bit_Manipulation | 10 | 40.99

#### Day 20 Others

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0384 |[Shuffle an Array](src.save/main/java/g0301_0400/s0384_shuffle_an_array/Solution.java)| Medium | Top_Interview_Questions, Array, Math, Randomized | 65 | 94.59

#### Day 21 Others

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0202 |[Happy Number](src.save/main/java/g0201_0300/s0202_happy_number/Solution.java)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 1 | 93.34
| 0149 |[Max Points on a Line](src.save/main/java/g0101_0200/s0149_max_points_on_a_line/Solution.java)| Hard | Top_Interview_Questions, Array, Hash_Table, Math, Geometry | 4 | 98.44

### Binary Search I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src.save/main/java/g0701_0800/s0704_binary_search/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00
| 0374 |[Guess Number Higher or Lower](src.save/main/java/g0301_0400/s0374_guess_number_higher_or_lower/Solution.java)| Easy | Binary_Search, Interactive | 0 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0035 |[Search Insert Position](src.save/main/java/g0001_0100/s0035_search_insert_position/Solution.java)| Easy | Top_100_Liked_Questions, Array, Binary_Search | 0 | 100.00
| 0852 |[Peak Index in a Mountain Array](src.save/main/java/g0801_0900/s0852_peak_index_in_a_mountain_array/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0367 |[Valid Perfect Square](src.save/main/java/g0301_0400/s0367_valid_perfect_square/Solution.java)| Easy | Math, Binary_Search | 0 | 100.00
| 1385 |[Find the Distance Value Between Two Arrays](src.save/main/java/g1301_1400/s1385_find_the_distance_value_between_two_arrays/Solution.java)| Easy | Array, Sorting, Binary_Search, Two_Pointers | 5 | 65.78

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0069 |[Sqrt(x)](src.save/main/java/g0001_0100/s0069_sqrtx/Solution.java)| Easy | Top_Interview_Questions, Math, Binary_Search | 1 | 99.48
| 0744 |[Find Smallest Letter Greater Than Target](src.save/main/java/g0701_0800/s0744_find_smallest_letter_greater_than_target/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0278 |[First Bad Version](src.save/main/java/g0201_0300/s0278_first_bad_version/Solution.java)| Easy | Binary_Search, Interactive | 12 | 99.50
| 0034 |[Find First and Last Position of Element in Sorted Array](src.save/main/java/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 0 | 100.00

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0441 |[Arranging Coins](src.save/main/java/g0401_0500/s0441_arranging_coins/Solution.java)| Easy | Math, Binary_Search | 2 | 87.99
| 1539 |[Kth Missing Positive Number](src.save/main/java/g1501_1600/s1539_kth_missing_positive_number/Solution.java)| Easy | Array, Binary_Search | 0 | 100.00

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0167 |[Two Sum II - Input Array Is Sorted](src.save/main/java/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.java)| Medium | Array, Binary_Search, Two_Pointers | 2 | 49.88
| 1608 |[Special Array With X Elements Greater Than or Equal X](src.save/main/java/g1601_1700/s1608_special_array_with_x_elements_greater_than_or_equal_x/Solution.java)| Easy | Array, Sorting, Binary_Search | 2 | 61.14

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1351 |[Count Negative Numbers in a Sorted Matrix](src.save/main/java/g1301_1400/s1351_count_negative_numbers_in_a_sorted_matrix/Solution.java)| Easy | Array, Binary_Search, Matrix | 1 | 49.66
| 0074 |[Search a 2D Matrix](src.save/main/java/g0001_0100/s0074_search_a_2d_matrix/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 0 | 100.00

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1337 |[The K Weakest Rows in a Matrix](src.save/main/java/g1301_1400/s1337_the_k_weakest_rows_in_a_matrix/Solution.java)| Easy | Array, Sorting, Binary_Search, Matrix, Heap_Priority_Queue | 1 | 99.77
| 1346 |[Check If N and Its Double Exist](src.save/main/java/g1301_1400/s1346_check_if_n_and_its_double_exist/Solution.java)| Easy | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 1 | 99.64

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0350 |[Intersection of Two Arrays II](src.save/main/java/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 3 | 81.79
| 0633 |[Sum of Square Numbers](src.save/main/java/g0601_0700/s0633_sum_of_square_numbers/Solution.java)| Medium | Math, Binary_Search, Two_Pointers | 4 | 82.92

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1855 |[Maximum Distance Between a Pair of Values](src.save/main/java/g1801_1900/s1855_maximum_distance_between_a_pair_of_values/Solution.java)| Medium | Array, Greedy, Binary_Search, Two_Pointers | 4 | 62.20
| 0033 |[Search in Rotated Sorted Array](src.save/main/java/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 0 | 100.00

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0153 |[Find Minimum in Rotated Sorted Array](src.save/main/java/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search | 0 | 100.00

### Binary Search II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0209 |[Minimum Size Subarray Sum](src.save/main/java/g0201_0300/s0209_minimum_size_subarray_sum/Solution.java)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 1 | 99.98
| 0611 |[Valid Triangle Number](src.save/main/java/g0601_0700/s0611_valid_triangle_number/Solution.java)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers | 10 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0658 |[Find K Closest Elements](src.save/main/java/g0601_0700/s0658_find_k_closest_elements/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Heap_Priority_Queue | 3 | 99.20
| 1894 |[Find the Student that Will Replace the Chalk](src.save/main/java/g1801_1900/s1894_find_the_student_that_will_replace_the_chalk/Solution.java)| Medium | Array, Binary_Search, Simulation, Prefix_Sum | 2 | 76.67

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src.save/main/java/g0201_0300/s0300_longest_increasing_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 3 | 96.86
| 1760 |[Minimum Limit of Balls in a Bag](src.save/main/java/g1701_1800/s1760_minimum_limit_of_balls_in_a_bag/Solution.java)| Medium | Array, Binary_Search | 44 | 78.49

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0875 |[Koko Eating Bananas](src.save/main/java/g0801_0900/s0875_koko_eating_bananas/Solution.java)| Medium | Array, Binary_Search | 15 | 91.32
| 1552 |[Magnetic Force Between Two Balls](src.save/main/java/g1501_1600/s1552_magnetic_force_between_two_balls/Solution.java)| Medium | Array, Sorting, Binary_Search | 39 | 99.65

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0287 |[Find the Duplicate Number](src.save/main/java/g0201_0300/s0287_find_the_duplicate_number/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Two_Pointers, Bit_Manipulation | 4 | 94.82
| 1283 |[Find the Smallest Divisor Given a Threshold](src.save/main/java/g1201_1300/s1283_find_the_smallest_divisor_given_a_threshold/Solution.java)| Medium | Array, Binary_Search | 9 | 95.49

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1898 |[Maximum Number of Removable Characters](src.save/main/java/g1801_1900/s1898_maximum_number_of_removable_characters/Solution.java)| Medium | Array, String, Binary_Search | 121 | 72.51
| 1870 |[Minimum Speed to Arrive on Time](src.save/main/java/g1801_1900/s1870_minimum_speed_to_arrive_on_time/Solution.java)| Medium | Array, Binary_Search | 86 | 88.58

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1482 |[Minimum Number of Days to Make m Bouquets](src.save/main/java/g1401_1500/s1482_minimum_number_of_days_to_make_m_bouquets/Solution.java)| Medium | Array, Binary_Search | 25 | 69.18
| 1818 |[Minimum Absolute Sum Difference](src.save/main/java/g1801_1900/s1818_minimum_absolute_sum_difference/Solution.java)| Medium | Array, Sorting, Binary_Search, Ordered_Set | 13 | 99.44

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0240 |[Search a 2D Matrix II](src.save/main/java/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer | 9 | 71.40
| 0275 |[H-Index II](src.save/main/java/g0201_0300/s0275_h_index_ii/Solution.java)| Medium | Array, Binary_Search | 0 | 100.00

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1838 |[Frequency of the Most Frequent Element](src.save/main/java/g1801_1900/s1838_frequency_of_the_most_frequent_element/Solution.java)| Medium | Array, Sorting, Greedy, Binary_Search, Prefix_Sum, Sliding_Window | 11 | 100.00
| 0540 |[Single Element in a Sorted Array](src.save/main/java/g0501_0600/s0540_single_element_in_a_sorted_array/Solution.java)| Medium | Array, Binary_Search | 0 | 100.00

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0222 |[Count Complete Tree Nodes](src.save/main/java/g0201_0300/s0222_count_complete_tree_nodes/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Search, Binary_Tree | 0 | 100.00
| 1712 |[Ways to Split Array Into Three Subarrays](src.save/main/java/g1701_1800/s1712_ways_to_split_array_into_three_subarrays/Solution.java)| Medium | Array, Binary_Search, Two_Pointers, Prefix_Sum | 16 | 84.24

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0826 |[Most Profit Assigning Work](src.save/main/java/g0801_0900/s0826_most_profit_assigning_work/Solution.java)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers | 21 | 83.83
| 0436 |[Find Right Interval](src.save/main/java/g0401_0500/s0436_find_right_interval/Solution.java)| Medium | Array, Sorting, Binary_Search | 17 | 87.90

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0081 |[Search in Rotated Sorted Array II](src.save/main/java/g0001_0100/s0081_search_in_rotated_sorted_array_ii/Solution.java)| Medium | Array, Binary_Search | 1 | 73.34
| 0162 |[Find Peak Element](src.save/main/java/g0101_0200/s0162_find_peak_element/Solution.java)| Medium | Top_Interview_Questions, Array, Binary_Search | 0 | 100.00

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0154 |[Find Minimum in Rotated Sorted Array II](src.save/main/java/g0101_0200/s0154_find_minimum_in_rotated_sorted_array_ii/Solution.java)| Hard | Array, Binary_Search | 0 | 100.00
| 0528 |[Random Pick with Weight](src.save/main/java/g0501_0600/s0528_random_pick_with_weight/Solution.java)| Medium | Math, Binary_Search, Prefix_Sum, Randomized | 29 | 83.26

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1508 |[Range Sum of Sorted Subarray Sums](src.save/main/java/g1501_1600/s1508_range_sum_of_sorted_subarray_sums/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 60 | 93.84
| 1574 |[Shortest Subarray to be Removed to Make Array Sorted](src.save/main/java/g1501_1600/s1574_shortest_subarray_to_be_removed_to_make_array_sorted/Solution.java)| Medium | Array, Binary_Search, Two_Pointers, Stack, Monotonic_Stack | 2 | 84.97

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1292 |[Maximum Side Length of a Square with Sum Less than or Equal to Threshold](src.save/main/java/g1201_1300/s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold/Solution.java)| Medium | Array, Binary_Search, Matrix, Prefix_Sum | 23 | 32.97
| 1498 |[Number of Subsequences That Satisfy the Given Sum Condition](src.save/main/java/g1401_1500/s1498_number_of_subsequences_that_satisfy_the_given_sum_condition/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 27 | 99.13

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0981 |[Time Based Key-Value Store](src.save/main/java/g0901_1000/s0981_time_based_key_value_store/TimeMap.java)| Medium | String, Hash_Table, Binary_Search, Design | 239 | 72.78
| 1300 |[Sum of Mutated Array Closest to Target](src.save/main/java/g1201_1300/s1300_sum_of_mutated_array_closest_to_target/Solution.java)| Medium | Array, Sorting, Binary_Search | 7 | 33.33

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1802 |[Maximum Value at a Given Index in a Bounded Array](src.save/main/java/g1801_1900/s1802_maximum_value_at_a_given_index_in_a_bounded_array/Solution.java)| Medium | Greedy, Binary_Search | 2 | 58.44
| 1901 |[Find a Peak Element II](src.save/main/java/g1901_2000/s1901_find_a_peak_element_ii/Solution.java)| Medium | Array, Binary_Search, Matrix, Divide_and_Conquer | 0 | 100.00

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1146 |[Snapshot Array](src.save/main/java/g1101_1200/s1146_snapshot_array/SnapshotArray.java)| Medium | Array, Hash_Table, Binary_Search, Design | 37 | 87.93
| 1488 |[Avoid Flood in The City](src.save/main/java/g1401_1500/s1488_avoid_flood_in_the_city/Solution.java)| Medium | Array, Hash_Table, Greedy, Binary_Search, Heap_Priority_Queue | 82 | 75.08

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1562 |[Find Latest Group of Size M](src.save/main/java/g1501_1600/s1562_find_latest_group_of_size_m/Solution.java)| Medium | Array, Binary_Search, Simulation | 8 | 90.00
| 1648 |[Sell Diminishing-Valued Colored Balls](src.save/main/java/g1601_1700/s1648_sell_diminishing_valued_colored_balls/Solution.java)| Medium | Array, Math, Sorting, Greedy, Binary_Search, Heap_Priority_Queue | 27 | 80.64

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1201 |[Ugly Number III](src.save/main/java/g1201_1300/s1201_ugly_number_iii/Solution.java)| Medium | Math, Binary_Search, Number_Theory | 0 | 100.00
| 0911 |[Online Election](src.save/main/java/g0901_1000/s0911_online_election/TopVotedCandidate.java)| Medium | Array, Hash_Table, Binary_Search, Design | 63 | 98.81

### Dynamic Programming I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0509 |[Fibonacci Number](src.save/main/java/g0501_0600/s0509_fibonacci_number/Solution.java)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 0 | 100.00
| 1137 |[N-th Tribonacci Number](src.save/main/java/g1101_1200/s1137_n_th_tribonacci_number/Solution.java)| Easy | Dynamic_Programming, Math, Memoization | 0 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src.save/main/java/g0001_0100/s0070_climbing_stairs/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 0 | 100.00
| 0746 |[Min Cost Climbing Stairs](src.save/main/java/g0701_0800/s0746_min_cost_climbing_stairs/Solution.java)| Easy | Array, Dynamic_Programming | 1 | 86.38

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0198 |[House Robber](src.save/main/java/g0101_0200/s0198_house_robber/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 0 | 100.00
| 0213 |[House Robber II](src.save/main/java/g0201_0300/s0213_house_robber_ii/Solution.java)| Medium | Array, Dynamic_Programming | 1 | 31.05
| 0740 |[Delete and Earn](src.save/main/java/g0701_0800/s0740_delete_and_earn/Solution.java)| Medium | Array, Hash_Table, Dynamic_Programming | 4 | 77.68

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0055 |[Jump Game](src.save/main/java/g0001_0100/s0055_jump_game/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 2 | 87.28
| 0045 |[Jump Game II](src.save/main/java/g0001_0100/s0045_jump_game_ii/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy | 1 | 99.67

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src.save/main/java/g0001_0100/s0053_maximum_subarray/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer | 1 | 100.00
| 0918 |[Maximum Sum Circular Subarray](src.save/main/java/g0901_1000/s0918_maximum_sum_circular_subarray/Solution.java)| Medium | Array, Dynamic_Programming, Divide_and_Conquer, Queue, Monotonic_Queue | 3 | 92.86

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0152 |[Maximum Product Subarray](src.save/main/java/g0101_0200/s0152_maximum_product_subarray/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 0 | 100.00
| 1567 |[Maximum Length of Subarray With Positive Product](src.save/main/java/g1501_1600/s1567_maximum_length_of_subarray_with_positive_product/Solution.java)| Medium | Array, Dynamic_Programming, Greedy | 4 | 80.86

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1014 |[Best Sightseeing Pair](src.save/main/java/g1001_1100/s1014_best_sightseeing_pair/Solution.java)| Medium | Array, Dynamic_Programming | 2 | 99.86
| 0121 |[Best Time to Buy and Sell Stock](src.save/main/java/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 2 | 85.25
| 0122 |[Best Time to Buy and Sell Stock II](src.save/main/java/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.java)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 2 | 34.31

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0309 |[Best Time to Buy and Sell Stock with Cooldown](src.save/main/java/g0301_0400/s0309_best_time_to_buy_and_sell_stock_with_cooldown/Solution.java)| Medium | Array, Dynamic_Programming | 0 | 100.00
| 0714 |[Best Time to Buy and Sell Stock with Transaction Fee](src.save/main/java/g0701_0800/s0714_best_time_to_buy_and_sell_stock_with_transaction_fee/Solution.java)| Medium | Array, Dynamic_Programming, Greedy | 4 | 78.57

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0139 |[Word Break](src.save/main/java/g0101_0200/s0139_word_break/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization | 2 | 96.55
| 0042 |[Trapping Rain Water](src.save/main/java/g0001_0100/s0042_trapping_rain_water/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack | 1 | 92.60

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0413 |[Arithmetic Slices](src.save/main/java/g0401_0500/s0413_arithmetic_slices/Solution.java)| Medium | Array, Dynamic_Programming | 0 | 100.00
| 0091 |[Decode Ways](src.save/main/java/g0001_0100/s0091_decode_ways/Solution.java)| Medium | Top_Interview_Questions, String, Dynamic_Programming | 2 | 64.33

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0264 |[Ugly Number II](src.save/main/java/g0201_0300/s0264_ugly_number_ii/Solution.java)| Medium | Hash_Table, Dynamic_Programming, Math, Heap_Priority_Queue | 3 | 88.43
| 0096 |[Unique Binary Search Trees](src.save/main/java/g0001_0100/s0096_unique_binary_search_trees/Solution.java)| Medium | Top_100_Liked_Questions, Dynamic_Programming, Math, Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0118 |[Pascal's Triangle](src.save/main/java/g0101_0200/s0118_pascals_triangle/Solution.java)| Easy | Top_Interview_Questions, Array, Dynamic_Programming | 1 | 62.34
| 0119 |[Pascal's Triangle II](src.save/main/java/g0101_0200/s0119_pascals_triangle_ii/Solution.java)| Easy | Array, Dynamic_Programming | 0 | 100.00

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0931 |[Minimum Falling Path Sum](src.save/main/java/g0901_1000/s0931_minimum_falling_path_sum/Solution.java)| Medium | Array, Dynamic_Programming, Matrix | 4 | 72.19
| 0120 |[Triangle](src.save/main/java/g0101_0200/s0120_triangle/Solution.java)| Medium | Array, Dynamic_Programming | 1 | 99.76

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1314 |[Matrix Block Sum](src.save/main/java/g1301_1400/s1314_matrix_block_sum/Solution.java)| Medium | Array, Matrix, Prefix_Sum | 5 | 67.46
| 0304 |[Range Sum Query 2D - Immutable](src.save/main/java/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.java)| Medium | Array, Matrix, Design, Prefix_Sum | 103 | 98.60

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0062 |[Unique Paths](src.save/main/java/g0001_0100/s0062_unique_paths/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics | 1 | 45.44
| 0063 |[Unique Paths II](src.save/main/java/g0001_0100/s0063_unique_paths_ii/Solution.java)| Medium | Array, Dynamic_Programming, Matrix | 1 | 56.99

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0064 |[Minimum Path Sum](src.save/main/java/g0001_0100/s0064_minimum_path_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix | 1 | 99.65
| 0221 |[Maximal Square](src.save/main/java/g0201_0300/s0221_maximal_square/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix | 6 | 80.89

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src.save/main/java/g0001_0100/s0005_longest_palindromic_substring/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 10 | 98.57
| 0516 |[Longest Palindromic Subsequence](src.save/main/java/g0501_0600/s0516_longest_palindromic_subsequence/Solution.java)| Medium | String, Dynamic_Programming | 31 | 96.10

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src.save/main/java/g0201_0300/s0300_longest_increasing_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 3 | 96.86
| 0376 |[Wiggle Subsequence](src.save/main/java/g0301_0400/s0376_wiggle_subsequence/Solution.java)| Medium | Array, Dynamic_Programming, Greedy | 0 | 100.00

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0392 |[Is Subsequence](src.save/main/java/g0301_0400/s0392_is_subsequence/Solution.java)| Easy | String, Dynamic_Programming, Two_Pointers | 0 | 100.00
| 1143 |[Longest Common Subsequence](src.save/main/java/g1101_1200/s1143_longest_common_subsequence/Solution.java)| Medium | String, Dynamic_Programming | 9 | 93.92
| 0072 |[Edit Distance](src.save/main/java/g0001_0100/s0072_edit_distance/Solution.java)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming | 7 | 66.86

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0322 |[Coin Change](src.save/main/java/g0301_0400/s0322_coin_change/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search | 22 | 72.14
| 0518 |[Coin Change 2](src.save/main/java/g0501_0600/s0518_coin_change_2/Solution.java)| Medium | Array, Dynamic_Programming | 3 | 91.32

#### Day 21

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0377 |[Combination Sum IV](src.save/main/java/g0301_0400/s0377_combination_sum_iv/Solution.java)| Medium | Array, Dynamic_Programming | 1 | 91.72
| 0343 |[Integer Break](src.save/main/java/g0301_0400/s0343_integer_break/Solution.java)| Medium | Dynamic_Programming, Math | 0 | 100.00
| 0279 |[Perfect Squares](src.save/main/java/g0201_0300/s0279_perfect_squares/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Breadth_First_Search | 0 | 100.00

### Programming Skills I

#### Day 1 Basic Data Type

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1523 |[Count Odd Numbers in an Interval Range](src.save/main/java/g1501_1600/s1523_count_odd_numbers_in_an_interval_range/Solution.java)| Easy | Math | 0 | 100.00
| 1491 |[Average Salary Excluding the Minimum and Maximum Salary](src.save/main/java/g1401_1500/s1491_average_salary_excluding_the_minimum_and_maximum_salary/Solution.java)| Easy | Array, Sorting | 0 | 100.00

#### Day 2 Operator

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0191 |[Number of 1 Bits](src.save/main/java/g0101_0200/s0191_number_of_1_bits/Solution.java)| Easy | Top_Interview_Questions, Bit_Manipulation | 0 | 100.00
| 1281 |[Subtract the Product and Sum of Digits of an Integer](src.save/main/java/g1201_1300/s1281_subtract_the_product_and_sum_of_digits_of_an_integer/Solution.java)| Easy | Math | 0 | 100.00

#### Day 3 Conditional Statements

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0976 |[Largest Perimeter Triangle](src.save/main/java/g0901_1000/s0976_largest_perimeter_triangle/Solution.java)| Easy | Array, Math, Sorting, Greedy | 12 | 26.01
| 1779 |[Find Nearest Point That Has the Same X or Y Coordinate](src.save/main/java/g1701_1800/s1779_find_nearest_point_that_has_the_same_x_or_y_coordinate/Solution.java)| Easy | Array | 1 | 100.00

#### Day 4 Loop

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1822 |[Sign of the Product of an Array](src.save/main/java/g1801_1900/s1822_sign_of_the_product_of_an_array/Solution.java)| Easy | Array, Math | 1 | 58.05
| 1502 |[Can Make Arithmetic Progression From Sequence](src.save/main/java/g1501_1600/s1502_can_make_arithmetic_progression_from_sequence/Solution.java)| Easy | Array, Sorting | 4 | 14.13
| 0202 |[Happy Number](src.save/main/java/g0201_0300/s0202_happy_number/Solution.java)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 1 | 93.34
| 1790 |[Check if One String Swap Can Make Strings Equal](src.save/main/java/g1701_1800/s1790_check_if_one_string_swap_can_make_strings_equal/Solution.java)| Easy | String, Hash_Table, Counting | 0 | 100.00

#### Day 5 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0589 |[N-ary Tree Preorder Traversal](src.save/main/java/g0501_0600/s0589_n_ary_tree_preorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Stack | 2 | 54.35
| 0496 |[Next Greater Element I](src.save/main/java/g0401_0500/s0496_next_greater_element_i/Solution.java)| Easy | Array, Hash_Table, Stack, Monotonic_Stack | 3 | 84.97
| 1232 |[Check If It Is a Straight Line](src.save/main/java/g1201_1300/s1232_check_if_it_is_a_straight_line/Solution.java)| Easy | Array, Math, Geometry | 0 | 100.00

#### Day 6 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1588 |[Sum of All Odd Length Subarrays](src.save/main/java/g1501_1600/s1588_sum_of_all_odd_length_subarrays/Solution.java)| Easy | Array, Math, Prefix_Sum | 0 | 100.00
| 0283 |[Move Zeroes](src.save/main/java/g0201_0300/s0283_move_zeroes/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers | 2 | 74.00
| 1672 |[Richest Customer Wealth](src.save/main/java/g1601_1700/s1672_richest_customer_wealth/Solution.java)| Easy | Array, Matrix | 0 | 100.00

#### Day 7 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1572 |[Matrix Diagonal Sum](src.save/main/java/g1501_1600/s1572_matrix_diagonal_sum/Solution.java)| Easy | Array, Matrix | 3 | 10.25
| 0566 |[Reshape the Matrix](src.save/main/java/g0501_0600/s0566_reshape_the_matrix/Solution.java)| Easy | Array, Matrix, Simulation | 1 | 84.34

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1768 |[Merge Strings Alternately](src.save/main/java/g1701_1800/s1768_merge_strings_alternately/Solution.java)| Easy | String, Two_Pointers | 1 | 86.26
| 1678 |[Goal Parser Interpretation](src.save/main/java/g1601_1700/s1678_goal_parser_interpretation/Solution.java)| Easy | String | 0 | 100.00
| 0389 |[Find the Difference](src.save/main/java/g0301_0400/s0389_find_the_difference/Solution.java)| Easy | String, Hash_Table, Sorting, Bit_Manipulation | 1 | 99.83

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0709 |[To Lower Case](src.save/main/java/g0701_0800/s0709_to_lower_case/Solution.java)| Easy | String | 1 | 71.74
| 1309 |[Decrypt String from Alphabet to Integer Mapping](src.save/main/java/g1301_1400/s1309_decrypt_string_from_alphabet_to_integer_mapping/Solution.java)| Easy | String | 6 | 28.25
| 0953 |[Verifying an Alien Dictionary](src.save/main/java/g0901_1000/s0953_verifying_an_alien_dictionary/Solution.java)| Easy | Array, String, Hash_Table | 0 | 100.00

#### Day 10 Linked List and Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1290 |[Convert Binary Number in a Linked List to Integer](src.save/main/java/g1201_1300/s1290_convert_binary_number_in_a_linked_list_to_integer/Solution.java)| Easy | Math, Linked_List | 0 | 100.00
| 0876 |[Middle of the Linked List](src.save/main/java/g0801_0900/s0876_middle_of_the_linked_list/Solution.java)| Easy | Two_Pointers, Linked_List | 0 | 100.00
| 0104 |[Maximum Depth of Binary Tree](src.save/main/java/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0404 |[Sum of Left Leaves](src.save/main/java/g0401_0500/s0404_sum_of_left_leaves/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00

#### Day 11 Containers and Libraries

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1356 |[Sort Integers by The Number of 1 Bits](src.save/main/java/g1301_1400/s1356_sort_integers_by_the_number_of_1_bits/Solution.java)| Easy | Array, Sorting, Bit_Manipulation, Counting | 10 | 65.50
| 0232 |[Implement Queue using Stacks](src.save/main/java/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.java)| Easy | Stack, Design, Queue | 1 | 56.63
| 0242 |[Valid Anagram](src.save/main/java/g0201_0300/s0242_valid_anagram/Solution.java)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting | 2 | 98.88
| 0217 |[Contains Duplicate](src.save/main/java/g0201_0300/s0217_contains_duplicate/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 10 | 67.20

#### Day 12 Class and Object

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1603 |[Design Parking System](src.save/main/java/g1601_1700/s1603_design_parking_system/ParkingSystem.java)| Easy | Design, Simulation, Counting | 8 | 76.16
| 0303 |[Range Sum Query - Immutable](src.save/main/java/g0301_0400/s0303_range_sum_query_immutable/NumArray.java)| Easy | Array, Design, Prefix_Sum | 6 | 100.00

### Programming Skills II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0896 |[Monotonic Array](src.save/main/java/g0801_0900/s0896_monotonic_array/Solution.java)| Easy | Array | 2 | 86.21
| 0028 |[Implement strStr()](src.save/main/java/g0001_0100/s0028_implement_strstr/Solution.java)| Easy | Top_Interview_Questions, String, Two_Pointers, String_Matching | 0 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0110 |[Balanced Binary Tree](src.save/main/java/g0101_0200/s0110_balanced_binary_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0459 |[Repeated Substring Pattern](src.save/main/java/g0401_0500/s0459_repeated_substring_pattern/Solution.java)| Easy | String, String_Matching | 9 | 90.15

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0150 |[Evaluate Reverse Polish Notation](src.save/main/java/g0101_0200/s0150_evaluate_reverse_polish_notation/Solution.java)| Medium | Top_Interview_Questions, Array, Math, Stack | 12 | 29.56
| 0066 |[Plus One](src.save/main/java/g0001_0100/s0066_plus_one/Solution.java)| Easy | Top_Interview_Questions, Array, Math | 0 | 100.00

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1367 |[Linked List in Binary Tree](src.save/main/java/g1301_1400/s1367_linked_list_in_binary_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 2 | 61.23
| 0043 |[Multiply Strings](src.save/main/java/g0001_0100/s0043_multiply_strings/Solution.java)| Medium | String, Math, Simulation | 3 | 96.85

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0067 |[Add Binary](src.save/main/java/g0001_0100/s0067_add_binary/Solution.java)| Easy | String, Math, Bit_Manipulation, Simulation | 3 | 67.14
| 0989 |[Add to Array-Form of Integer](src.save/main/java/g0901_1000/s0989_add_to_array_form_of_integer/Solution.java)| Easy | Array, Math | 7 | 65.92

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0739 |[Daily Temperatures](src.save/main/java/g0701_0800/s0739_daily_temperatures/Solution.java)| Medium | Top_100_Liked_Questions, Array, Stack, Monotonic_Stack | 10 | 94.99
| 0058 |[Length of Last Word](src.save/main/java/g0001_0100/s0058_length_of_last_word/Solution.java)| Easy | String | 0 | 100.00

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0048 |[Rotate Image](src.save/main/java/g0001_0100/s0048_rotate_image/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix | 0 | 100.00
| 1886 |[Determine Whether Matrix Can Be Obtained By Rotation](src.save/main/java/g1801_1900/s1886_determine_whether_matrix_can_be_obtained_by_rotation/Solution.java)| Easy | Array, Matrix | 1 | 78.38

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0054 |[Spiral Matrix](src.save/main/java/g0001_0100/s0054_spiral_matrix/Solution.java)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 0 | 100.00
| 0973 |[K Closest Points to Origin](src.save/main/java/g0901_1000/s0973_k_closest_points_to_origin/Solution.java)| Medium | Array, Math, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Geometry, Quickselect | 4 | 98.26

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1630 |[Arithmetic Subarrays](src.save/main/java/g1601_1700/s1630_arithmetic_subarrays/Solution.java)| Medium | Array, Sorting | 8 | 93.62
| 0429 |[N-ary Tree Level Order Traversal](src.save/main/java/g0401_0500/s0429_n_ary_tree_level_order_traversal/Solution.java)| Medium | Breadth_First_Search, Tree | 4 | 57.07

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0503 |[Next Greater Element II](src.save/main/java/g0501_0600/s0503_next_greater_element_ii/Solution.java)| Medium | Array, Stack, Monotonic_Stack | 7 | 95.85
| 0556 |[Next Greater Element III](src.save/main/java/g0501_0600/s0556_next_greater_element_iii/Solution.java)| Medium | String, Math, Two_Pointers | 0 | 100.00

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1376 |[Time Needed to Inform All Employees](src.save/main/java/g1301_1400/s1376_time_needed_to_inform_all_employees/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree | 225 | 22.36
| 0049 |[Group Anagrams](src.save/main/java/g0001_0100/s0049_group_anagrams/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sorting | 10 | 74.79

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src.save/main/java/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.java)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window | 8 | 87.18
| 0713 |[Subarray Product Less Than K](src.save/main/java/g0701_0800/s0713_subarray_product_less_than_k/Solution.java)| Medium | Array, Sliding_Window | 8 | 39.00

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0304 |[Range Sum Query 2D - Immutable](src.save/main/java/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.java)| Medium | Array, Matrix, Design, Prefix_Sum | 103 | 98.60
| 0910 |[Smallest Range II](src.save/main/java/g0901_1000/s0910_smallest_range_ii/Solution.java)| Medium | Array, Math, Sorting, Greedy | 10 | 73.16

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0143 |[Reorder List](src.save/main/java/g0101_0200/s0143_reorder_list/Solution.java)| Medium | Two_Pointers, Stack, Linked_List, Recursion | 2 | 72.16
| 0138 |[Copy List with Random Pointer](src.save/main/java/g0101_0200/s0138_copy_list_with_random_pointer/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List | 0 | 100.00

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0002 |[Add Two Numbers](src.save/main/java/g0001_0100/s0002_add_two_numbers/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion | 2 | 98.23
| 0445 |[Add Two Numbers II](src.save/main/java/g0401_0500/s0445_add_two_numbers_ii/Solution.java)| Medium | Math, Stack, Linked_List | 3 | 81.96

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0061 |[Rotate List](src.save/main/java/g0001_0100/s0061_rotate_list/Solution.java)| Medium | Two_Pointers, Linked_List | 0 | 100.00
| 0173 |[Binary Search Tree Iterator](src.save/main/java/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.java)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 18 | 78.45

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1845 |[Seat Reservation Manager](src.save/main/java/g1801_1900/s1845_seat_reservation_manager/SeatManager.java)| Medium | Design, Heap_Priority_Queue | 47 | 87.63
| 0860 |[Lemonade Change](src.save/main/java/g0801_0900/s0860_lemonade_change/Solution.java)| Easy | Array, Greedy | 2 | 90.84

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src.save/main/java/g0101_0200/s0155_min_stack/MinStack.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 5 | 81.77
| 0341 |[Flatten Nested List Iterator](src.save/main/java/g0301_0400/s0341_flatten_nested_list_iterator/NestedIterator.java)| Medium | Top_Interview_Questions, Depth_First_Search, Tree, Stack, Design, Queue, Iterator | 3 | 86.51

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1797 |[Design Authentication Manager](src.save/main/java/g1701_1800/s1797_design_authentication_manager/AuthenticationManager.java)| Medium | Hash_Table, Design | 41 | 92.67
| 0707 |[Design Linked List](src.save/main/java/g0701_0800/s0707_design_linked_list/MyLinkedList.java)| Medium | Design, Linked_List | 10 | 70.60

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0380 |[Insert Delete GetRandom O(1)](src.save/main/java/g0301_0400/s0380_insert_delete_getrandom_o1/RandomizedSet.java)| Medium | Top_Interview_Questions, Array, Hash_Table, Math, Design, Randomized | 20 | 99.24
| 0622 |[Design Circular Queue](src.save/main/java/g0601_0700/s0622_design_circular_queue/MyCircularQueue.java)| Medium | Array, Design, Linked_List, Queue | 3 | 100.00
| 0729 |[My Calendar I](src.save/main/java/g0701_0800/s0729_my_calendar_i/MyCalendar.java)| Medium | Design, Ordered_Set, Segment_Tree | 17 | 97.23

### Graph Theory I

#### Day 1 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src.save/main/java/g0701_0800/s0733_flood_fill/Solution.java)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 1 | 85.36
| 0200 |[Number of Islands](src.save/main/java/g0101_0200/s0200_number_of_islands/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 4 | 73.02

#### Day 2 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0695 |[Max Area of Island](src.save/main/java/g0601_0700/s0695_max_area_of_island/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 3 | 76.79
| 1254 |[Number of Closed Islands](src.save/main/java/g1201_1300/s1254_number_of_closed_islands/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 3 | 55.59

#### Day 3 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1020 |[Number of Enclaves](src.save/main/java/g1001_1100/s1020_number_of_enclaves/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 6 | 68.24
| 1905 |[Count Sub Islands](src.save/main/java/g1901_2000/s1905_count_sub_islands/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 24 | 85.54

#### Day 4 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1162 |[As Far from Land as Possible](src.save/main/java/g1101_1200/s1162_as_far_from_land_as_possible/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 12 | 89.17
| 0417 |[Pacific Atlantic Water Flow](src.save/main/java/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 5 | 89.66

#### Day 5 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1091 |[Shortest Path in Binary Matrix](src.save/main/java/g1001_1100/s1091_shortest_path_in_binary_matrix/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 22 | 69.99
| 0542 |[01 Matrix](src.save/main/java/g0501_0600/s0542_01_matrix/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 6 | 96.78

#### Day 6 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0934 |[Shortest Bridge](src.save/main/java/g0901_1000/s0934_shortest_bridge/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 6 | 97.87
| 1926 |[Nearest Exit from Entrance in Maze](src.save/main/java/g1901_2000/s1926_nearest_exit_from_entrance_in_maze/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 12 | 40.55

#### Day 7 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0797 |[All Paths From Source to Target](src.save/main/java/g0701_0800/s0797_all_paths_from_source_to_target/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Backtracking | 2 | 90.53
| 0841 |[Keys and Rooms](src.save/main/java/g0801_0900/s0841_keys_and_rooms/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 3 | 51.54

#### Day 8 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0547 |[Number of Provinces](src.save/main/java/g0501_0600/s0547_number_of_provinces/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 1 | 94.56
| 1319 |[Number of Operations to Make Network Connected](src.save/main/java/g1301_1400/s1319_number_of_operations_to_make_network_connected/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 9 | 67.64

#### Day 9 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1376 |[Time Needed to Inform All Employees](src.save/main/java/g1301_1400/s1376_time_needed_to_inform_all_employees/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree | 225 | 22.36
| 0802 |[Find Eventual Safe States](src.save/main/java/g0801_0900/s0802_find_eventual_safe_states/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 7 | 74.93

#### Day 10 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1129 |[Shortest Path with Alternating Colors](src.save/main/java/g1101_1200/s1129_shortest_path_with_alternating_colors/Solution.java)| Medium | Breadth_First_Search, Graph | 5 | 90.28
| 1466 |[Reorder Routes to Make All Paths Lead to the City Zero](src.save/main/java/g1401_1500/s1466_reorder_routes_to_make_all_paths_lead_to_the_city_zero/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 39 | 97.71
| 0847 |[Shortest Path Visiting All Nodes](src.save/main/java/g0801_0900/s0847_shortest_path_visiting_all_nodes/Solution.java)| Hard | Dynamic_Programming, Breadth_First_Search, Bit_Manipulation, Graph, Bitmask | 14 | 78.72

#### Day 11 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1306 |[Jump Game III](src.save/main/java/g1301_1400/s1306_jump_game_iii/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search | 2 | 96.23
| 1654 |[Minimum Jumps to Reach Home](src.save/main/java/g1601_1700/s1654_minimum_jumps_to_reach_home/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search | 6 | 99.87
| 0365 |[Water and Jug Problem](src.save/main/java/g0301_0400/s0365_water_and_jug_problem/Solution.java)| Medium | Math, Depth_First_Search, Breadth_First_Search | 0 | 100.00

#### Day 12 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0433 |[Minimum Genetic Mutation](src.save/main/java/g0401_0500/s0433_minimum_genetic_mutation/Solution.java)| Medium | String, Hash_Table, Breadth_First_Search | 0 | 100.00
| 0752 |[Open the Lock](src.save/main/java/g0701_0800/s0752_open_the_lock/Solution.java)| Medium | Array, String, Hash_Table, Breadth_First_Search | 72 | 91.06
| 0127 |[Word Ladder](src.save/main/java/g0101_0200/s0127_word_ladder/Solution.java)| Hard | Top_Interview_Questions, String, Hash_Table, Breadth_First_Search | 32 | 94.39

#### Day 13 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0997 |[Find the Town Judge](src.save/main/java/g0901_1000/s0997_find_the_town_judge/Solution.java)| Easy | Array, Hash_Table, Graph | 3 | 80.64
| 1557 |[Minimum Number of Vertices to Reach All Nodes](src.save/main/java/g1501_1600/s1557_minimum_number_of_vertices_to_reach_all_nodes/Solution.java)| Medium | Graph | 8 | 99.94

#### Day 14 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1615 |[Maximal Network Rank](src.save/main/java/g1601_1700/s1615_maximal_network_rank/Solution.java)| Medium | Graph | 3 | 97.34
| 0886 |[Possible Bipartition](src.save/main/java/g0801_0900/s0886_possible_bipartition/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 20 | 80.12
| 0785 |[Is Graph Bipartite?](src.save/main/java/g0701_0800/s0785_is_graph_bipartite/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 0 | 100.00

### SQL I

#### Day 1 Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0595 |[Big Countries](src.save/main/java/g0501_0600/s0595_big_countries/script.sql)| Easy | Database | 241 | 92.61
| 1757 |[Recyclable and Low Fat Products](src.save/main/java/g1701_1800/s1757_recyclable_and_low_fat_products/script.sql)| Easy | Database | 475 | 71.54
| 0584 |[Find Customer Referee](src.save/main/java/g0501_0600/s0584_find_customer_referee/script.sql)| Easy | Database | 505 | 43.87
| 0183 |[Customers Who Never Order](src.save/main/java/g0101_0200/s0183_customers_who_never_order/script.sql)| Easy | Database | 581 | 23.03

#### Day 2 Select and Order

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1873 |[Calculate Special Bonus](src.save/main/java/g1801_1900/s1873_calculate_special_bonus/script.sql)| Easy | Database | 543 | 71.60
| 0627 |[Swap Salary](src.save/main/java/g0601_0700/s0627_swap_salary/script.sql)| Easy | Database | 191 | 96.89
| 0196 |[Delete Duplicate Emails](src.save/main/java/g0101_0200/s0196_delete_duplicate_emails/script.sql)| Easy | Database | 541 | 81.09

#### Day 3 String Processing Functions

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1667 |[Fix Names in a Table](src.save/main/java/g1601_1700/s1667_fix_names_in_a_table/script.sql)| Easy | Database | 559 | 80.29
| 1484 |[Group Sold Products By The Date](src.save/main/java/g1401_1500/s1484_group_sold_products_by_the_date/script.sql)| Easy | Database | 395 | 77.20
| 1527 |[Patients With a Condition](src.save/main/java/g1501_1600/s1527_patients_with_a_condition/script.sql)| Easy | Database | 308 | 66.93

#### Day 4 Union and Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1965 |[Employees With Missing Information](src.save/main/java/g1901_2000/s1965_employees_with_missing_information/script.sql)| Easy | Database | 617 | 30.40
| 1795 |[Rearrange Products Table](src.save/main/java/g1701_1800/s1795_rearrange_products_table/script.sql)| Easy | Database | 497 | 64.83
| 0608 |[Tree Node](src.save/main/java/g0601_0700/s0608_tree_node/script.sql)| Medium | Database | 347 | 95.17
| 0176 |[Second Highest Salary](src.save/main/java/g0101_0200/s0176_second_highest_salary/script.sql)| Medium | Database | 203 | 63.47

#### Day 5 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0175 |[Combine Two Tables](src.save/main/java/g0101_0200/s0175_combine_two_tables/script.sql)| Easy | Database | 449 | 30.35
| 1581 |[Customer Who Visited but Did Not Make Any Transactions](src.save/main/java/g1501_1600/s1581_customer_who_visited_but_did_not_make_any_transactions/script.sql)| Easy | Database | 1039 | 76.99
| 1148 |[Article Views I](src.save/main/java/g1101_1200/s1148_article_views_i/script.sql)| Easy | Database | 459 | 44.85

#### Day 6 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0197 |[Rising Temperature](src.save/main/java/g0101_0200/s0197_rising_temperature/script.sql)| Easy | Database | 401 | 79.45
| 0607 |[Sales Person](src.save/main/java/g0601_0700/s0607_sales_person/script.sql)| Easy | Database | 1046 | 86.04

#### Day 7 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1141 |[User Activity for the Past 30 Days I](src.save/main/java/g1101_1200/s1141_user_activity_for_the_past_30_days_i/script.sql)| Easy | Database | 543 | 29.24
| 1693 |[Daily Leads and Partners](src.save/main/java/g1601_1700/s1693_daily_leads_and_partners/script.sql)| Easy | Database | 463 | 78.98
| 1729 |[Find Followers Count](src.save/main/java/g1701_1800/s1729_find_followers_count/script.sql)| Easy | Database | 456 | 88.39

#### Day 8 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0586 |[Customer Placing the Largest Number of Orders](src.save/main/java/g0501_0600/s0586_customer_placing_the_largest_number_of_orders/script.sql)| Easy | Database | 392 | 90.54
| 0511 |[Game Play Analysis I](src.save/main/java/g0501_0600/s0511_game_play_analysis_i/script.sql)| Easy | Database | 620 | 35.70
| 1890 |[The Latest Login in 2020](src.save/main/java/g1801_1900/s1890_the_latest_login_in_2020/script.sql)| Easy | Database | 571 | 73.59
| 1741 |[Find Total Time Spent by Each Employee](src.save/main/java/g1701_1800/s1741_find_total_time_spent_by_each_employee/script.sql)| Easy | Database | 414 | 93.27

#### Day 9 Control of Flow

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1393 |[Capital Gain/Loss](src.save/main/java/g1301_1400/s1393_capital_gainloss/script.sql)| Medium | Database | 457 | 79.39
| 1407 |[Top Travellers](src.save/main/java/g1401_1500/s1407_top_travellers/script.sql)| Easy | Database | 682 | 70.16
| 1158 |[Market Analysis I](src.save/main/java/g1101_1200/s1158_market_analysis_i/script.sql)| Medium | Database | 1039 | 77.70

#### Day 10 Where

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0182 |[Duplicate Emails](src.save/main/java/g0101_0200/s0182_duplicate_emails/script.sql)| Easy | Database | 345 | 59.47
| 1050 |[Actors and Directors Who Cooperated At Least Three Times](src.save/main/java/g1001_1100/s1050_actors_and_directors_who_cooperated_at_least_three_times/script.sql)| Easy | Database | 344 | 76.48
| 1587 |[Bank Account Summary II](src.save/main/java/g1501_1600/s1587_bank_account_summary_ii/script.sql)| Easy | Database | 630 | 60.32
| 1084 |[Sales Analysis III](src.save/main/java/g1001_1100/s1084_sales_analysis_iii/script.sql)| Easy | Database | 1066 | 69.71

## Algorithms

| #    |      Title     | Difficulty  | Tag         | Time, ms | Time, %
|------|----------------|-------------|-------------|----------|---------
| 2300 |[Successful Pairs of Spells and Potions](src/main/java/g2201_2300/s2300_successful_pairs_of_spells_and_potions/Solution.java)| Medium | Array, Two_Pointers, Binary_Search, Sorting | 85 | 71.70
| 2299 |[Strong Password Checker II](src/main/java/g2201_2300/s2299_strong_password_checker_ii/Solution.java)| Easy | String | 1 | 97.32
| 2293 |[Min Max Game](src/main/java/g2201_2300/s2293_min_max_game/Solution.java)| Easy | Array, Simulation | 1 | 90.39
| 2286 |[Booking Concert Tickets in Groups](src/main/java/g2201_2300/s2286_booking_concert_tickets_in_groups/BookMyShow.java)| Hard | Binary_Search, Design, Binary_Indexed_Tree, Segment_Tree | 283 | 67.08
| 2280 |[Minimum Lines to Represent a Line Chart](src/main/java/g2201_2300/s2280_minimum_lines_to_represent_a_line_chart/Solution.java)| Medium | Array, Math, Geometry, Sorting, Number_Theory | 40 | 96.09
| 2274 |[Maximum Consecutive Floors Without Special Floors](src/main/java/g2201_2300/s2274_maximum_consecutive_floors_without_special_floors/Solution.java)| Medium | Array, Sorting | 33 | 99.36
| 2270 |[Number of Ways to Split Array](src/main/java/g2201_2300/s2270_number_of_ways_to_split_array/Solution.java)| Medium | Array, Prefix_Sum | 4 | 77.55
| 2269 |[Find the K-Beauty of a Number](src/main/java/g2201_2300/s2269_find_the_k_beauty_of_a_number/Solution.java)| Easy | Math, String, Sliding_Window | 2 | 38.88
| 2267 |[Check if There Is a Valid Parentheses String Path](src/main/java/g2201_2300/s2267_check_if_there_is_a_valid_parentheses_string_path/Solution.java)| Hard | Array, Dynamic_Programming, Matrix | 93 | 77.48
| 2266 |[Count Number of Texts](src/main/java/g2201_2300/s2266_count_number_of_texts/Solution.java)| Medium | Hash_Table, Math, String, Dynamic_Programming | 38 | 81.43
| 2265 |[Count Nodes Equal to Average of Subtree](src/main/java/g2201_2300/s2265_count_nodes_equal_to_average_of_subtree/Solution.java)| Medium | Tree, Depth_First_Search, Binary_Tree | 1 | 99.12
| 2264 |[Largest 3-Same-Digit Number in String](src/main/java/g2201_2300/s2264_largest_3_same_digit_number_in_string/Solution.java)| Easy | String | 3 | 74.57
| 2262 |[Total Appeal of A String](src/main/java/g2201_2300/s2262_total_appeal_of_a_string/Solution.java)| Hard | Hash_Table, String, Dynamic_Programming | 6 | 97.92
| 2260 |[Minimum Consecutive Cards to Pick Up](src/main/java/g2201_2300/s2260_minimum_consecutive_cards_to_pick_up/Solution.java)| Medium | Array, Hash_Table, Sliding_Window | 50 | 97.04
| 2259 |[Remove Digit From Number to Maximize Result](src/main/java/g2201_2300/s2259_remove_digit_from_number_to_maximize_result/Solution.java)| Easy | String, Greedy, Enumeration | 1 | 97.73
| 2257 |[Count Unguarded Cells in the Grid](src/main/java/g2201_2300/s2257_count_unguarded_cells_in_the_grid/Solution.java)| Medium | Array, Matrix, Simulation | 32 | 70.28
| 2256 |[Minimum Average Difference](src/main/java/g2201_2300/s2256_minimum_average_difference/Solution.java)| Medium | Array, Prefix_Sum | 15 | 97.85
| 2255 |[Count Prefixes of a Given String](src/main/java/g2201_2300/s2255_count_prefixes_of_a_given_string/Solution.java)| Easy | Array, String | 1 | 94.82
| 2251 |[Number of Flowers in Full Bloom](src/main/java/g2201_2300/s2251_number_of_flowers_in_full_bloom/Solution.java)| Hard | Array, Hash, Binary_Search, Sorting, Prefix_Sum, Ordered_Set | 113 | 69.23
| 2250 |[Count Number of Rectangles Containing Each Point](src/main/java/g2201_2300/s2250_count_number_of_rectangles_containing_each_point/Solution.java)| Medium | Array, Binary, Binary_Indexed_Tree, Sorting | 49 | 98.80
| 2249 |[Count Lattice Points Inside a Circle](src/main/java/g2201_2300/s2249_count_lattice_points_inside_a_circle/Solution.java)| Medium | Array, Hash_Table, Math, Geometry, Enumeration | 54 | 92.07
| 2248 |[Intersection of Multiple Arrays](src/main/java/g2201_2300/s2248_intersection_of_multiple_arrays/Solution.java)| Easy | Array, Hash_Table, Counting | 2 | 99.46
| 2246 |[Longest Path With Different Adjacent Characters](src/main/java/g2201_2300/s2246_longest_path_with_different_adjacent_characters/Solution.java)| Hard | Array, String, Depth_First_Search, Tree, Graph, Topological_Sort | 75 | 97.79
| 2245 |[Maximum Trailing Zeros in a Cornered Path](src/main/java/g2201_2300/s2245_maximum_trailing_zeros_in_a_cornered_path/Solution.java)| Medium | Array, Matrix, Prefix_Sum | 96 | 88.49
| 2244 |[Minimum Rounds to Complete All Tasks](src/main/java/g2201_2300/s2244_minimum_rounds_to_complete_all_tasks/Solution.java)| Medium | Array, Hash_Table, Greedy, Counting | 13 | 94.26
| 2243 |[Calculate Digit Sum of a String](src/main/java/g2201_2300/s2243_calculate_digit_sum_of_a_string/Solution.java)| Easy | String, Simulation | 1 | 91.46
| 2242 |[Maximum Score of a Node Sequence](src/main/java/g2201_2300/s2242_maximum_score_of_a_node_sequence/Solution.java)| Hard | Array, Sorting, Graph, Enumeration | 28 | 97.57
| 2241 |[Design an ATM Machine](src/main/java/g2201_2300/s2241_design_an_atm_machine/ATM.java)| Medium | Array, Greedy, Design | 192 | 24.16
| 2240 |[Number of Ways to Buy Pens and Pencils](src/main/java/g2201_2300/s2240_number_of_ways_to_buy_pens_and_pencils/Solution.java)| Medium | Math, Enumeration | 19 | 68.73
| 2239 |[Find Closest Number to Zero](src/main/java/g2201_2300/s2239_find_closest_number_to_zero/Solution.java)| Easy | Array | 2 | 84.21
| 2236 |[Root Equals Sum of Children](src/main/java/g2201_2300/s2236_root_equals_sum_of_children/Solution.java)| Easy | Tree, Binary_Tree | 0 | 100.00
| 2235 |[Add Two Integers](src/main/java/g2201_2300/s2235_add_two_integers/Solution.java)| Easy | Math | 1 | 48.94
| 2234 |[Maximum Total Beauty of the Gardens](src/main/java/g2201_2300/s2234_maximum_total_beauty_of_the_gardens/Solution.java)| Hard | Array, Sorting, Greedy, Binary_Search, Two_Pointers | 63 | 73.03
| 2233 |[Maximum Product After K Increments](src/main/java/g2201_2300/s2233_maximum_product_after_k_increments/Solution.java)| Medium | Array, Greedy, Heap_Priority_Queue | 364 | 75.06
| 2232 |[Minimize Result by Adding Parentheses to Expression](src/main/java/g2201_2300/s2232_minimize_result_by_adding_parentheses_to_expression/Solution.java)| Medium | String, Enumeration | 1 | 99.60
| 2231 |[Largest Number After Digit Swaps by Parity](src/main/java/g2201_2300/s2231_largest_number_after_digit_swaps_by_parity/Solution.java)| Easy | Sorting, Heap_Priority_Queue | 1 | 98.32
| 2227 |[Encrypt and Decrypt Strings](src/main/java/g2201_2300/s2227_encrypt_and_decrypt_strings/Encrypter.java)| Hard | Array, String, Hash_Table, Design, Trie | 143 | 74.74
| 2226 |[Maximum Candies Allocated to K Children](src/main/java/g2201_2300/s2226_maximum_candies_allocated_to_k_children/Solution.java)| Medium | Array, Binary_Search | 46 | 78.19
| 2225 |[Find Players With Zero or One Losses](src/main/java/g2201_2300/s2225_find_players_with_zero_or_one_losses/Solution.java)| Medium | Array, Hash_Table, Sorting, Counting | 96 | 87.03
| 2224 |[Minimum Number of Operations to Convert Time](src/main/java/g2201_2300/s2224_minimum_number_of_operations_to_convert_time/Solution.java)| Easy | String, Greedy | 1 | 97.78
| 2223 |[Sum of Scores of Built Strings](src/main/java/g2201_2300/s2223_sum_of_scores_of_built_strings/Solution.java)| Hard | String, Binary_Search, Hash_Function, String_Matching, Rolling_Hash, Suffix_Array | 21 | 63.91
| 2222 |[Number of Ways to Select Buildings](src/main/java/g2201_2300/s2222_number_of_ways_to_select_buildings/Solution.java)| Medium | String, Dynamic_Programming, Prefix_Sum | 19 | 98.28
| 2221 |[Find Triangular Sum of an Array](src/main/java/g2201_2300/s2221_find_triangular_sum_of_an_array/Solution.java)| Medium | Array, Math, Simulation, Combinatorics | 78 | 83.64
| 2220 |[Minimum Bit Flips to Convert Number](src/main/java/g2201_2300/s2220_minimum_bit_flips_to_convert_number/Solution.java)| Easy | Bit_Manipulation | 1 | 67.86
| 2218 |[Maximum Value of K Coins From Piles](src/main/java/g2201_2300/s2218_maximum_value_of_k_coins_from_piles/Solution.java)| Hard | Array, Dynamic_Programming, Prefix_Sum | 54 | 96.38
| 2217 |[Find Palindrome With Fixed Length](src/main/java/g2201_2300/s2217_find_palindrome_with_fixed_length/Solution.java)| Medium | Array, Math | 37 | 88.60
| 2216 |[Minimum Deletions to Make Array Beautiful](src/main/java/g2201_2300/s2216_minimum_deletions_to_make_array_beautiful/Solution.java)| Medium | Array, Greedy, Stack | 7 | 39.24
| 2215 |[Find the Difference of Two Arrays](src/main/java/g2201_2300/s2215_find_the_difference_of_two_arrays/Solution.java)| Easy | Array, Hash_Table | 11 | 87.39
| 2213 |[Longest Substring of One Repeating Character](src/main/java/g2201_2300/s2213_longest_substring_of_one_repeating_character/Solution.java)| Hard | Array, String, Ordered_Set, Segment_Tree | 141 | 86.81
| 2212 |[Maximum Points in an Archery Competition](src/main/java/g2201_2300/s2212_maximum_points_in_an_archery_competition/Solution.java)| Medium | Array, Bit_Manipulation, Recursion, Enumeration | 7 | 78.16
| 2211 |[Count Collisions on a Road](src/main/java/g2201_2300/s2211_count_collisions_on_a_road/Solution.java)| Medium | String, Stack | 113 | 45.96
| 2210 |[Count Hills and Valleys in an Array](src/main/java/g2201_2300/s2210_count_hills_and_valleys_in_an_array/Solution.java)| Easy | Array | 0 | 100.00
| 2209 |[Minimum White Tiles After Covering With Carpets](src/main/java/g2201_2300/s2209_minimum_white_tiles_after_covering_with_carpets/Solution.java)| Hard | String, Dynamic_Programming, Prefix_Sum | 94 | 88.16
| 2208 |[Minimum Operations to Halve Array Sum](src/main/java/g2201_2300/s2208_minimum_operations_to_halve_array_sum/Solution.java)| Medium | Array, Greedy, Heap_Priority_Queue | 237 | 89.24
| 2207 |[Maximize Number of Subsequences in a String](src/main/java/g2201_2300/s2207_maximize_number_of_subsequences_in_a_string/Solution.java)| Medium | String, Greedy, Prefix_Sum | 8 | 100
| 2206 |[Divide Array Into Equal Pairs](src/main/java/g2201_2300/s2206_divide_array_into_equal_pairs/Solution.java)| Easy | Array, Hash_Table, Bit_Manipulation, Counting | 1 | 100.00
| 2203 |[Minimum Weighted Subgraph With the Required Paths](src/main/java/g2201_2300/s2203_minimum_weighted_subgraph_with_the_required_paths/Solution.java)| Hard | Graph, Shortest_Path | 92 | 97.26
| 2202 |[Maximize the Topmost Element After K Moves](src/main/java/g2201_2300/s2202_maximize_the_topmost_element_after_k_moves/Solution.java)| Medium | Array, Greedy | 1 | 100.00
| 2201 |[Count Artifacts That Can Be Extracted](src/main/java/g2201_2300/s2201_count_artifacts_that_can_be_extracted/Solution.java)| Medium | Array, Hash_Table, Simulation | 7 | 82.97
| 2200 |[Find All K-Distant Indices in an Array](src.save/main/java/g2101_2200/s2200_find_all_k_distant_indices_in_an_array/Solution.java)| Easy | Array | 2 | 95.30
| 2197 |[Replace Non-Coprime Numbers in Array](src.save/main/java/g2101_2200/s2197_replace_non_coprime_numbers_in_array/Solution.java)| Hard | Array, Math, Stack, Number_Theory | 60 | 85.52
| 2196 |[Create Binary Tree From Descriptions](src.save/main/java/g2101_2200/s2196_create_binary_tree_from_descriptions/Solution.java)| Medium | Array, Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 85 | 76.70
| 2195 |[Append K Integers With Minimal Sum](src.save/main/java/g2101_2200/s2195_append_k_integers_with_minimal_sum/Solution.java)| Medium | Array, Math, Sorting, Greedy | 19 | 96.88
| 2194 |[Cells in a Range on an Excel Sheet](src.save/main/java/g2101_2200/s2194_cells_in_a_range_on_an_excel_sheet/Solution.java)| Easy | String | 1 | 99.92
| 2193 |[Minimum Number of Moves to Make Palindrome](src.save/main/java/g2101_2200/s2193_minimum_number_of_moves_to_make_palindrome/Solution.java)| Hard | String, Greedy, Two_Pointers, Binary_Indexed_Tree | 8 | 98.76
| 2192 |[All Ancestors of a Node in a Directed Acyclic Graph](src.save/main/java/g2101_2200/s2192_all_ancestors_of_a_node_in_a_directed_acyclic_graph/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 82 | 90.80
| 2191 |[Sort the Jumbled Numbers](src.save/main/java/g2101_2200/s2191_sort_the_jumbled_numbers/Solution.java)| Medium | Array, Sorting | 117 | 96.53
| 2190 |[Most Frequent Number Following Key In an Array](src.save/main/java/g2101_2200/s2190_most_frequent_number_following_key_in_an_array/Solution.java)| Easy | Array, Hash_Table, Counting | 1 | 100.00
| 2188 |[Minimum Time to Finish the Race](src.save/main/java/g2101_2200/s2188_minimum_time_to_finish_the_race/Solution.java)| Hard | Array, Dynamic_Programming | 15 | 93.69
| 2187 |[Minimum Time to Complete Trips](src.save/main/java/g2101_2200/s2187_minimum_time_to_complete_trips/Solution.java)| Medium | Array, Binary_Search | 187 | 95.03
| 2186 |[Minimum Number of Steps to Make Two Strings Anagram II](src.save/main/java/g2101_2200/s2186_minimum_number_of_steps_to_make_two_strings_anagram_ii/Solution.java)| Medium | String, Hash_Table, Counting | 22 | 77.11
| 2185 |[Counting Words With a Given Prefix](src.save/main/java/g2101_2200/s2185_counting_words_with_a_given_prefix/Solution.java)| Easy | Array, String | 0 | 100.00
| 2183 |[Count Array Pairs Divisible by K](src.save/main/java/g2101_2200/s2183_count_array_pairs_divisible_by_k/Solution.java)| Hard | Array, Math, Number_Theory | 849 | 44.54
| 2182 |[Construct String With Repeat Limit](src.save/main/java/g2101_2200/s2182_construct_string_with_repeat_limit/Solution.java)| Medium | String, Greedy, Heap_Priority_Queue, Counting | 26 | 96.11
| 2181 |[Merge Nodes in Between Zeros](src.save/main/java/g2101_2200/s2181_merge_nodes_in_between_zeros/Solution.java)| Medium | Simulation, Linked_List | 6 | 96.26
| 2180 |[Count Integers With Even Digit Sum](src.save/main/java/g2101_2200/s2180_count_integers_with_even_digit_sum/Solution.java)| Easy | Math, Simulation | 0 | 100.00
| 2179 |[Count Good Triplets in an Array](src.save/main/java/g2101_2200/s2179_count_good_triplets_in_an_array/Solution.java)| Hard | Array, Binary_Search, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Merge_Sort | 16 | 92.94
| 2178 |[Maximum Split of Positive Even Integers](src.save/main/java/g2101_2200/s2178_maximum_split_of_positive_even_integers/Solution.java)| Medium | Math, Greedy | 16 | 78.96
| 2177 |[Find Three Consecutive Integers That Sum to a Given Number](src.save/main/java/g2101_2200/s2177_find_three_consecutive_integers_that_sum_to_a_given_number/Solution.java)| Medium | Math, Simulation | 1 | 78.46
| 2176 |[Count Equal and Divisible Pairs in an Array](src.save/main/java/g2101_2200/s2176_count_equal_and_divisible_pairs_in_an_array/Solution.java)| Easy | Array | 4 | 78.29
| 2172 |[Maximum AND Sum of Array](src.save/main/java/g2101_2200/s2172_maximum_and_sum_of_array/Solution.java)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Bitmask | 21 | 87.50
| 2171 |[Removing Minimum Number of Magic Beans](src.save/main/java/g2101_2200/s2171_removing_minimum_number_of_magic_beans/Solution.java)| Medium | Array, Sorting, Prefix_Sum | 42 | 77.68
| 2170 |[Minimum Operations to Make the Array Alternating](src.save/main/java/g2101_2200/s2170_minimum_operations_to_make_the_array_alternating/Solution.java)| Medium | Array, Hash_Table, Greedy, Counting | 8 | 100.00
| 2169 |[Count Operations to Obtain Zero](src.save/main/java/g2101_2200/s2169_count_operations_to_obtain_zero/Solution.java)| Easy | Math, Simulation | 0 | 100.00
| 2167 |[Minimum Time to Remove All Cars Containing Illegal Goods](src.save/main/java/g2101_2200/s2167_minimum_time_to_remove_all_cars_containing_illegal_goods/Solution.java)| Hard | String, Dynamic_Programming | 46 | 61.00
| 2166 |[Design Bitset](src.save/main/java/g2101_2200/s2166_design_bitset/Bitset.java)| Medium | Array, Hash_Table, Design | 81 | 73.38
| 2165 |[Smallest Value of the Rearranged Number](src.save/main/java/g2101_2200/s2165_smallest_value_of_the_rearranged_number/Solution.java)| Medium | Math, Sorting | 1 | 100.00
| 2164 |[Sort Even and Odd Indices Independently](src.save/main/java/g2101_2200/s2164_sort_even_and_odd_indices_independently/Solution.java)| Easy | Array, Sorting | 2 | 97.22
| 2163 |[Minimum Difference in Sums After Removal of Elements](src.save/main/java/g2101_2200/s2163_minimum_difference_in_sums_after_removal_of_elements/Solution.java)| Hard | Array, Dynamic_Programming, Heap_Priority_Queue | 298 | 57.14
| 2162 |[Minimum Cost to Set Cooking Time](src.save/main/java/g2101_2200/s2162_minimum_cost_to_set_cooking_time/Solution.java)| Medium | Math, Enumeration | 1 | 95.82
| 2161 |[Partition Array According to Given Pivot](src.save/main/java/g2101_2200/s2161_partition_array_according_to_given_pivot/Solution.java)| Medium | Array, Two_Pointers, Simulation | 7 | 72.76
| 2160 |[Minimum Sum of Four Digit Number After Splitting Digits](src.save/main/java/g2101_2200/s2160_minimum_sum_of_four_digit_number_after_splitting_digits/Solution.java)| Easy | Math, Sorting, Greedy | 1 | 78.31
| 2157 |[Groups of Strings](src.save/main/java/g2101_2200/s2157_groups_of_strings/Solution.java)| Hard | String, Bit_Manipulation, Union_Find | 451 | 93.86
| 2156 |[Find Substring With Given Hash Value](src.save/main/java/g2101_2200/s2156_find_substring_with_given_hash_value/Solution.java)| Hard | String, Sliding_Window, Hash_Function, Rolling_Hash | 37 | 36.57
| 2155 |[All Divisions With the Highest Score of a Binary Array](src.save/main/java/g2101_2200/s2155_all_divisions_with_the_highest_score_of_a_binary_array/Solution.java)| Medium | Array | 18 | 98.41
| 2154 |[Keep Multiplying Found Values by Two](src.save/main/java/g2101_2200/s2154_keep_multiplying_found_values_by_two/Solution.java)| Easy | Array, Hash_Table, Sorting, Simulation | 1 | 93.21
| 2151 |[Maximum Good People Based on Statements](src.save/main/java/g2101_2200/s2151_maximum_good_people_based_on_statements/Solution.java)| Hard | Array, Bit_Manipulation, Backtracking, Enumeration | 76 | 47.57
| 2150 |[Find All Lonely Numbers in the Array](src.save/main/java/g2101_2200/s2150_find_all_lonely_numbers_in_the_array/Solution.java)| Medium | Array, Hash_Table, Counting | 93 | 70.66
| 2149 |[Rearrange Array Elements by Sign](src.save/main/java/g2101_2200/s2149_rearrange_array_elements_by_sign/Solution.java)| Medium | Array, Two_Pointers, Simulation | 10 | 34.66
| 2148 |[Count Elements With Strictly Smaller and Greater Elements](src.save/main/java/g2101_2200/s2148_count_elements_with_strictly_smaller_and_greater_elements/Solution.java)| Easy | Array, Sorting | 0 | 100.00
| 2147 |[Number of Ways to Divide a Long Corridor](src.save/main/java/g2101_2200/s2147_number_of_ways_to_divide_a_long_corridor/Solution.java)| Hard | String, Dynamic_Programming, Math | 54 | 62.96
| 2146 |[K Highest Ranked Items Within a Price Range](src.save/main/java/g2101_2200/s2146_k_highest_ranked_items_within_a_price_range/Solution.java)| Medium | Array, Sorting, Breadth_First_Search, Matrix, Heap_Priority_Queue | 81 | 88.84
| 2145 |[Count the Hidden Sequences](src.save/main/java/g2101_2200/s2145_count_the_hidden_sequences/Solution.java)| Medium | Array, Prefix_Sum | 7 | 36.03
| 2144 |[Minimum Cost of Buying Candies With Discount](src.save/main/java/g2101_2200/s2144_minimum_cost_of_buying_candies_with_discount/Solution.java)| Easy | Array, Sorting, Greedy | 2 | 97.50
| 2141 |[Maximum Running Time of N Computers](src.save/main/java/g2101_2200/s2141_maximum_running_time_of_n_computers/Solution.java)| Hard | Array, Sorting, Greedy, Binary_Search | 24 | 70.39
| 2140 |[Solving Questions With Brainpower](src.save/main/java/g2101_2200/s2140_solving_questions_with_brainpower/Solution.java)| Medium | Array, Dynamic_Programming | 5 | 98.77
| 2139 |[Minimum Moves to Reach Target Score](src.save/main/java/g2101_2200/s2139_minimum_moves_to_reach_target_score/Solution.java)| Medium | Math, Greedy | 1 | 37.95
| 2138 |[Divide a String Into Groups of Size k](src.save/main/java/g2101_2200/s2138_divide_a_string_into_groups_of_size_k/Solution.java)| Easy | String, Simulation | 2 | 70.97
| 2136 |[Earliest Possible Day of Full Bloom](src.save/main/java/g2101_2200/s2136_earliest_possible_day_of_full_bloom/Solution.java)| Hard | Array, Sorting, Greedy | 63 | 94.92
| 2135 |[Count Words Obtained After Adding a Letter](src.save/main/java/g2101_2200/s2135_count_words_obtained_after_adding_a_letter/Solution.java)| Medium | Array, String, Hash_Table, Sorting, Bit_Manipulation | 67 | 93.08
| 2134 |[Minimum Swaps to Group All 1's Together II](src.save/main/java/g2101_2200/s2134_minimum_swaps_to_group_all_1s_together_ii/Solution.java)| Medium | Array, Sliding_Window | 11 | 72.59
| 2133 |[Check if Every Row and Column Contains All Numbers](src.save/main/java/g2101_2200/s2133_check_if_every_row_and_column_contains_all_numbers/Solution.java)| Easy | Array, Hash_Table, Matrix | 32 | 64.12
| 2132 |[Stamping the Grid](src.save/main/java/g2101_2200/s2132_stamping_the_grid/Solution.java)| Hard | Array, Greedy, Matrix, Prefix_Sum | 7 | 100.00
| 2131 |[Longest Palindrome by Concatenating Two Letter Words](src.save/main/java/g2101_2200/s2131_longest_palindrome_by_concatenating_two_letter_words/Solution.java)| Medium | Array, String, Hash_Table, Greedy, Counting | 73 | 76.60
| 2130 |[Maximum Twin Sum of a Linked List](src.save/main/java/g2101_2200/s2130_maximum_twin_sum_of_a_linked_list/Solution.java)| Medium | Two_Pointers, Stack, Linked_List | 9 | 57.92
| 2129 |[Capitalize the Title](src.save/main/java/g2101_2200/s2129_capitalize_the_title/Solution.java)| Easy | String | 2 | 94.22
| 2127 |[Maximum Employees to Be Invited to a Meeting](src.save/main/java/g2101_2200/s2127_maximum_employees_to_be_invited_to_a_meeting/Solution.java)| Hard | Depth_First_Search, Graph, Topological_Sort | 37 | 85.71
| 2126 |[Destroying Asteroids](src.save/main/java/g2101_2200/s2126_destroying_asteroids/Solution.java)| Medium | Array, Sorting, Greedy | 6 | 99.27
| 2125 |[Number of Laser Beams in a Bank](src.save/main/java/g2101_2200/s2125_number_of_laser_beams_in_a_bank/Solution.java)| Medium | Array, String, Math, Matrix | 19 | 76.00
| 2124 |[Check if All A's Appears Before All B's](src.save/main/java/g2101_2200/s2124_check_if_all_as_appears_before_all_bs/Solution.java)| Easy | String | 1 | 73.82
| 2122 |[Recover the Original Array](src.save/main/java/g2101_2200/s2122_recover_the_original_array/Solution.java)| Hard | Array, Hash_Table, Sorting, Enumeration | 19 | 89.04
| 2121 |[Intervals Between Identical Elements](src.save/main/java/g2101_2200/s2121_intervals_between_identical_elements/Solution.java)| Medium | Array, Hash_Table, Prefix_Sum | 93 | 79.63
| 2120 |[Execution of All Suffix Instructions Staying in a Grid](src.save/main/java/g2101_2200/s2120_execution_of_all_suffix_instructions_staying_in_a_grid/Solution.java)| Medium | String, Simulation | 31 | 88.00
| 2119 |[A Number After a Double Reversal](src.save/main/java/g2101_2200/s2119_a_number_after_a_double_reversal/Solution.java)| Easy | Math | 0 | 100.00
| 2117 |[Abbreviating the Product of a Range](src.save/main/java/g2101_2200/s2117_abbreviating_the_product_of_a_range/Solution.java)| Hard | Math | 70 | 89.47
| 2116 |[Check if a Parentheses String Can Be Valid](src.save/main/java/g2101_2200/s2116_check_if_a_parentheses_string_can_be_valid/Solution.java)| Medium | String, Greedy, Stack | 19 | 85.53
| 2115 |[Find All Possible Recipes from Given Supplies](src.save/main/java/g2101_2200/s2115_find_all_possible_recipes_from_given_supplies/Solution.java)| Medium | Array, String, Hash_Table, Graph, Topological_Sort | 43 | 85.86
| 2114 |[Maximum Number of Words Found in Sentences](src.save/main/java/g2101_2200/s2114_maximum_number_of_words_found_in_sentences/Solution.java)| Easy | Array, String | 4 | 69.59
| 2111 |[Minimum Operations to Make the Array K-Increasing](src.save/main/java/g2101_2200/s2111_minimum_operations_to_make_the_array_k_increasing/Solution.java)| Hard | Array, Binary_Search | 97 | 22.90
| 2110 |[Number of Smooth Descent Periods of a Stock](src.save/main/java/g2101_2200/s2110_number_of_smooth_descent_periods_of_a_stock/Solution.java)| Medium | Array, Dynamic_Programming, Math | 3 | 77.27
| 2109 |[Adding Spaces to a String](src.save/main/java/g2101_2200/s2109_adding_spaces_to_a_string/Solution.java)| Medium | Array, String, Simulation | 24 | 89.33
| 2108 |[Find First Palindromic String in the Array](src.save/main/java/g2101_2200/s2108_find_first_palindromic_string_in_the_array/Solution.java)| Easy | Array, String, Two_Pointers | 3 | 84.92
| 2106 |[Maximum Fruits Harvested After at Most K Steps](src.save/main/java/g2101_2200/s2106_maximum_fruits_harvested_after_at_most_k_steps/Solution.java)| Hard | Array, Binary_Search, Prefix_Sum, Sliding_Window | 4 | 86.67
| 2105 |[Watering Plants II](src.save/main/java/g2101_2200/s2105_watering_plants_ii/Solution.java)| Medium | Array, Two_Pointers, Simulation | 5 | 78.24
| 2104 |[Sum of Subarray Ranges](src.save/main/java/g2101_2200/s2104_sum_of_subarray_ranges/Solution.java)| Medium | Array, Stack, Monotonic_Stack | 21 | 77.85
| 2103 |[Rings and Rods](src.save/main/java/g2101_2200/s2103_rings_and_rods/Solution.java)| Easy | String, Hash_Table | 2 | 46.84
| 2102 |[Sequentially Ordinal Rank Tracker](src.save/main/java/g2101_2200/s2102_sequentially_ordinal_rank_tracker/SORTracker.java)| Hard | Design, Heap_Priority_Queue, Ordered_Set, Data_Stream | 194 | 79.48
| 2101 |[Detonate the Maximum Bombs](src.save/main/java/g2101_2200/s2101_detonate_the_maximum_bombs/Solution.java)| Medium | Array, Math, Depth_First_Search, Breadth_First_Search, Graph, Geometry | 27 | 94.17
| 2100 |[Find Good Days to Rob the Bank](src.save/main/java/g2001_2100/s2100_find_good_days_to_rob_the_bank/Solution.java)| Medium | Array, Dynamic_Programming, Prefix_Sum | 13 | 46.46
| 2099 |[Find Subsequence of Length K With the Largest Sum](src.save/main/java/g2001_2100/s2099_find_subsequence_of_length_k_with_the_largest_sum/Solution.java)| Easy | Array, Hash_Table, Sorting, Heap_Priority_Queue | 6 | 85.46
| 2097 |[Valid Arrangement of Pairs](src.save/main/java/g2001_2100/s2097_valid_arrangement_of_pairs/Solution.java)| Hard | Depth_First_Search, Graph, Eulerian_Circuit | 158 | 100.00
| 2096 |[Step-By-Step Directions From a Binary Tree Node to Another](src.save/main/java/g2001_2100/s2096_step_by_step_directions_from_a_binary_tree_node_to_another/Solution.java)| Medium | String, Depth_First_Search, Tree, Binary_Tree | 30 | 76.29
| 2095 |[Delete the Middle Node of a Linked List](src.save/main/java/g2001_2100/s2095_delete_the_middle_node_of_a_linked_list/Solution.java)| Medium | Two_Pointers, Linked_List | 4 | 95.21
| 2094 |[Finding 3-Digit Even Numbers](src.save/main/java/g2001_2100/s2094_finding_3_digit_even_numbers/Solution.java)| Easy | Array, Hash_Table, Sorting, Enumeration | 2 | 99.62
| 2092 |[Find All People With Secret](src.save/main/java/g2001_2100/s2092_find_all_people_with_secret/Solution.java)| Hard | Depth_First_Search, Sorting, Breadth_First_Search, Graph, Union_Find | 95 | 84.86
| 2091 |[Removing Minimum and Maximum From Array](src.save/main/java/g2001_2100/s2091_removing_minimum_and_maximum_from_array/Solution.java)| Medium | Array, Greedy | 2 | 100.00
| 2090 |[K Radius Subarray Averages](src.save/main/java/g2001_2100/s2090_k_radius_subarray_averages/Solution.java)| Medium | Array, Sliding_Window | 12 | 83.19
| 2089 |[Find Target Indices After Sorting Array](src.save/main/java/g2001_2100/s2089_find_target_indices_after_sorting_array/Solution.java)| Easy | Array, Sorting, Binary_Search | 1 | 97.90
| 2088 |[Count Fertile Pyramids in a Land](src.save/main/java/g2001_2100/s2088_count_fertile_pyramids_in_a_land/Solution.java)| Hard | Array, Dynamic_Programming, Matrix | 12 | 83.56
| 2087 |[Minimum Cost Homecoming of a Robot in a Grid](src.save/main/java/g2001_2100/s2087_minimum_cost_homecoming_of_a_robot_in_a_grid/Solution.java)| Medium | Array, Greedy, Matrix | 2 | 79.89
| 2086 |[Minimum Number of Buckets Required to Collect Rainwater from Houses](src.save/main/java/g2001_2100/s2086_minimum_number_of_buckets_required_to_collect_rainwater_from_houses/Solution.java)| Medium | String, Dynamic_Programming, Greedy | 8 | 73.71
| 2085 |[Count Common Words With One Occurrence](src.save/main/java/g2001_2100/s2085_count_common_words_with_one_occurrence/Solution.java)| Easy | Array, String, Hash_Table, Counting | 6 | 77.66
| 2081 |[Sum of k-Mirror Numbers](src.save/main/java/g2001_2100/s2081_sum_of_k_mirror_numbers/Solution.java)| Hard | Math, Enumeration | 759 | 81.69
| 2080 |[Range Frequency Queries](src.save/main/java/g2001_2100/s2080_range_frequency_queries/RangeFreqQuery.java)| Medium | Array, Hash_Table, Binary_Search, Design, Segment_Tree | 140 | 97.86
| 2079 |[Watering Plants](src.save/main/java/g2001_2100/s2079_watering_plants/Solution.java)| Medium | Array | 0 | 100.00
| 2078 |[Two Furthest Houses With Different Colors](src.save/main/java/g2001_2100/s2078_two_furthest_houses_with_different_colors/Solution.java)| Easy | Array, Greedy | 0 | 100.00
| 2076 |[Process Restricted Friend Requests](src.save/main/java/g2001_2100/s2076_process_restricted_friend_requests/Solution.java)| Hard | Graph, Union_Find | 102 | 55.25
| 2075 |[Decode the Slanted Ciphertext](src.save/main/java/g2001_2100/s2075_decode_the_slanted_ciphertext/Solution.java)| Medium | String, Simulation | 48 | 68.23
| 2074 |[Reverse Nodes in Even Length Groups](src.save/main/java/g2001_2100/s2074_reverse_nodes_in_even_length_groups/Solution.java)| Medium | Linked_List | 9 | 62.36
| 2073 |[Time Needed to Buy Tickets](src.save/main/java/g2001_2100/s2073_time_needed_to_buy_tickets/Solution.java)| Easy | Array, Simulation, Queue | 0 | 100.00
| 2071 |[Maximum Number of Tasks You Can Assign](src.save/main/java/g2001_2100/s2071_maximum_number_of_tasks_you_can_assign/Solution.java)| Hard | Array, Sorting, Greedy, Binary_Search, Queue, Monotonic_Queue | 156 | 40.49
| 2070 |[Most Beautiful Item for Each Query](src.save/main/java/g2001_2100/s2070_most_beautiful_item_for_each_query/Solution.java)| Medium | Array, Sorting, Binary_Search | 53 | 96.04
| 2069 |[Walking Robot Simulation II](src.save/main/java/g2001_2100/s2069_walking_robot_simulation_ii/Robot.java)| Medium | Design, Simulation | 110 | 56.14
| 2068 |[Check Whether Two Strings are Almost Equivalent](src.save/main/java/g2001_2100/s2068_check_whether_two_strings_are_almost_equivalent/Solution.java)| Easy | String, Hash_Table, Counting | 1 | 95.21
| 2065 |[Maximum Path Quality of a Graph](src.save/main/java/g2001_2100/s2065_maximum_path_quality_of_a_graph/Solution.java)| Hard | Array, Graph, Backtracking | 94 | 95.34
| 2064 |[Minimized Maximum of Products Distributed to Any Store](src.save/main/java/g2001_2100/s2064_minimized_maximum_of_products_distributed_to_any_store/Solution.java)| Medium | Array, Binary_Search | 65 | 70.18
| 2063 |[Vowels of All Substrings](src.save/main/java/g2001_2100/s2063_vowels_of_all_substrings/Solution.java)| Medium | String, Dynamic_Programming, Math, Combinatorics | 21 | 34.49
| 2062 |[Count Vowel Substrings of a String](src.save/main/java/g2001_2100/s2062_count_vowel_substrings_of_a_string/Solution.java)| Easy | String, Hash_Table | 34 | 23.83
| 2060 |[Check if an Original String Exists Given Two Encoded Strings](src.save/main/java/g2001_2100/s2060_check_if_an_original_string_exists_given_two_encoded_strings/Solution.java)| Hard | String, Dynamic_Programming | 354 | 69.39
| 2059 |[Minimum Operations to Convert Number](src.save/main/java/g2001_2100/s2059_minimum_operations_to_convert_number/Solution.java)| Medium | Array, Breadth_First_Search | 97 | 64.14
| 2058 |[Find the Minimum and Maximum Number of Nodes Between Critical Points](src.save/main/java/g2001_2100/s2058_find_the_minimum_and_maximum_number_of_nodes_between_critical_points/Solution.java)| Medium | Linked_List | 4 | 100.00
| 2057 |[Smallest Index With Equal Value](src.save/main/java/g2001_2100/s2057_smallest_index_with_equal_value/Solution.java)| Easy | Array | 1 | 94.39
| 2056 |[Number of Valid Move Combinations On Chessboard](src.save/main/java/g2001_2100/s2056_number_of_valid_move_combinations_on_chessboard/Solution.java)| Hard | Array, String, Simulation, Backtracking | 433 | 24.83
| 2055 |[Plates Between Candles](src.save/main/java/g2001_2100/s2055_plates_between_candles/Solution.java)| Medium | Array, String, Binary_Search, Prefix_Sum | 10 | 92.49
| 2054 |[Two Best Non-Overlapping Events](src.save/main/java/g2001_2100/s2054_two_best_non_overlapping_events/Solution.java)| Medium | Array, Dynamic_Programming, Sorting, Binary_Search, Heap_Priority_Queue | 58 | 70.59
| 2053 |[Kth Distinct String in an Array](src.save/main/java/g2001_2100/s2053_kth_distinct_string_in_an_array/Solution.java)| Easy | Array, String, Hash_Table, Counting | 7 | 65.75
| 2050 |[Parallel Courses III](src.save/main/java/g2001_2100/s2050_parallel_courses_iii/Solution.java)| Hard | Dynamic_Programming, Graph, Topological_Sort | 33 | 86.04
| 2049 |[Count Nodes With the Highest Score](src.save/main/java/g2001_2100/s2049_count_nodes_with_the_highest_score/Solution.java)| Medium | Array, Depth_First_Search, Tree, Binary_Tree | 40 | 93.75
| 2048 |[Next Greater Numerically Balanced Number](src.save/main/java/g2001_2100/s2048_next_greater_numerically_balanced_number/Solution.java)| Medium | Math, Backtracking, Enumeration | 2 | 95.19
| 2047 |[Number of Valid Words in a Sentence](src.save/main/java/g2001_2100/s2047_number_of_valid_words_in_a_sentence/Solution.java)| Easy | String | 19 | 42.57
| 2045 |[Second Minimum Time to Reach Destination](src.save/main/java/g2001_2100/s2045_second_minimum_time_to_reach_destination/Solution.java)| Hard | Breadth_First_Search, Graph, Shortest_Path | 65 | 74.03
| 2044 |[Count Number of Maximum Bitwise-OR Subsets](src.save/main/java/g2001_2100/s2044_count_number_of_maximum_bitwise_or_subsets/Solution.java)| Medium | Array, Bit_Manipulation, Backtracking | 12 | 58.97
| 2043 |[Simple Bank System](src.save/main/java/g2001_2100/s2043_simple_bank_system/Bank.java)| Medium | Array, Hash_Table, Design, Simulation | 128 | 72.30
| 2042 |[Check if Numbers Are Ascending in a Sentence](src.save/main/java/g2001_2100/s2042_check_if_numbers_are_ascending_in_a_sentence/Solution.java)| Easy | String | 2 | 75.46
| 2040 |[Kth Smallest Product of Two Sorted Arrays](src.save/main/java/g2001_2100/s2040_kth_smallest_product_of_two_sorted_arrays/Solution.java)| Hard | Array, Binary_Search | 635 | 75.24
| 2039 |[The Time When the Network Becomes Idle](src.save/main/java/g2001_2100/s2039_the_time_when_the_network_becomes_idle/Solution.java)| Medium | Array, Breadth_First_Search, Graph | 134 | 72.29
| 2038 |[Remove Colored Pieces if Both Neighbors are the Same Color](src.save/main/java/g2001_2100/s2038_remove_colored_pieces_if_both_neighbors_are_the_same_color/Solution.java)| Medium | String, Math, Greedy, Game_Theory | 22 | 47.78
| 2037 |[Minimum Number of Moves to Seat Everyone](src.save/main/java/g2001_2100/s2037_minimum_number_of_moves_to_seat_everyone/Solution.java)| Easy | Array, Sorting | 5 | 22.01
| 2035 |[Partition Array Into Two Arrays to Minimize Sum Difference](src.save/main/java/g2001_2100/s2035_partition_array_into_two_arrays_to_minimize_sum_difference/Solution.java)| Hard | Array, Dynamic_Programming, Binary_Search, Two_Pointers, Bit_Manipulation, Ordered_Set, Bitmask | 1336 | 39.36
| 2034 |[Stock Price Fluctuation](src.save/main/java/g2001_2100/s2034_stock_price_fluctuation/StockPrice.java)| Medium | Hash_Table, Design, Heap_Priority_Queue, Ordered_Set, Data_Stream | 163 | 65.51
| 2033 |[Minimum Operations to Make a Uni-Value Grid](src.save/main/java/g2001_2100/s2033_minimum_operations_to_make_a_uni_value_grid/Solution.java)| Medium | Array, Math, Sorting, Matrix | 41 | 87.53
| 2032 |[Two Out of Three](src.save/main/java/g2001_2100/s2032_two_out_of_three/Solution.java)| Easy | Array, Hash_Table | 9 | 45.56
| 2030 |[Smallest K-Length Subsequence With Occurrences of a Letter](src.save/main/java/g2001_2100/s2030_smallest_k_length_subsequence_with_occurrences_of_a_letter/Solution.java)| Hard | String, Greedy, Stack, Monotonic_Stack | 131 | 64.46
| 2029 |[Stone Game IX](src.save/main/java/g2001_2100/s2029_stone_game_ix/Solution.java)| Medium | Array, Math, Greedy, Counting, Game_Theory | 31 | 10.87
| 2028 |[Find Missing Observations](src.save/main/java/g2001_2100/s2028_find_missing_observations/Solution.java)| Medium | Array, Math, Simulation | 10 | 31.40
| 2027 |[Minimum Moves to Convert String](src.save/main/java/g2001_2100/s2027_minimum_moves_to_convert_string/Solution.java)| Easy | String, Greedy | 0 | 100.00
| 2025 |[Maximum Number of Ways to Partition an Array](src.save/main/java/g2001_2100/s2025_maximum_number_of_ways_to_partition_an_array/Solution.java)| Hard | Array, Hash_Table, Prefix_Sum, Counting, Enumeration | 172 | 100.00
| 2024 |[Maximize the Confusion of an Exam](src.save/main/java/g2001_2100/s2024_maximize_the_confusion_of_an_exam/Solution.java)| Medium | String, Binary_Search, Prefix_Sum, Sliding_Window | 21 | 44.78
| 2023 |[Number of Pairs of Strings With Concatenation Equal to Target](src.save/main/java/g2001_2100/s2023_number_of_pairs_of_strings_with_concatenation_equal_to_target/Solution.java)| Medium | Array, String | 36 | 36.00
| 2022 |[Convert 1D Array Into 2D Array](src.save/main/java/g2001_2100/s2022_convert_1d_array_into_2d_array/Solution.java)| Easy | Array, Matrix, Simulation | 8 | 40.41
| 2019 |[The Score of Students Solving Math Expression](src.save/main/java/g2001_2100/s2019_the_score_of_students_solving_math_expression/Solution.java)| Hard | Array, String, Dynamic_Programming, Math, Stack, Memoization | 435 | 89.93
| 2018 |[Check if Word Can Be Placed In Crossword](src.save/main/java/g2001_2100/s2018_check_if_word_can_be_placed_in_crossword/Solution.java)| Medium | Array, Matrix, Enumeration | 11 | 52.76
| 2017 |[Grid Game](src.save/main/java/g2001_2100/s2017_grid_game/Solution.java)| Medium | Array, Matrix, Prefix_Sum | 10 | 41.46
| 2016 |[Maximum Difference Between Increasing Elements](src.save/main/java/g2001_2100/s2016_maximum_difference_between_increasing_elements/Solution.java)| Easy | Array | 0 | 100.00
| 2014 |[Longest Subsequence Repeated k Times](src.save/main/java/g2001_2100/s2014_longest_subsequence_repeated_k_times/Solution.java)| Hard | String, Greedy, Backtracking, Counting, Enumeration | 169 | 98.59
| 2013 |[Detect Squares](src.save/main/java/g2001_2100/s2013_detect_squares/DetectSquares.java)| Medium | Array, Hash_Table, Design, Counting | 67 | 88.46
| 2012 |[Sum of Beauty in the Array](src.save/main/java/g2001_2100/s2012_sum_of_beauty_in_the_array/Solution.java)| Medium | Array | 10 | 44.69
| 2011 |[Final Value of Variable After Performing Operations](src.save/main/java/g2001_2100/s2011_final_value_of_variable_after_performing_operations/Solution.java)| Easy | Array, String, Simulation | 1 | 94.40
| 2009 |[Minimum Number of Operations to Make Array Continuous](src.save/main/java/g2001_2100/s2009_minimum_number_of_operations_to_make_array_continuous/Solution.java)| Hard | Array, Binary_Search | 57 | 72.43
| 2008 |[Maximum Earnings From Taxi](src.save/main/java/g2001_2100/s2008_maximum_earnings_from_taxi/Solution.java)| Medium | Array, Dynamic_Programming, Sorting, Binary_Search | 116 | 55.59
| 2007 |[Find Original Array From Doubled Array](src.save/main/java/g2001_2100/s2007_find_original_array_from_doubled_array/Solution.java)| Medium | Array, Hash_Table, Sorting, Greedy | 41 | 96.48
| 2006 |[Count Number of Pairs With Absolute Difference K](src.save/main/java/g2001_2100/s2006_count_number_of_pairs_with_absolute_difference_k/Solution.java)| Easy | Array, Hash_Table, Counting | 8 | 58.60
| 2003 |[Smallest Missing Genetic Value in Each Subtree](src.save/main/java/g2001_2100/s2003_smallest_missing_genetic_value_in_each_subtree/Solution.java)| Hard | Dynamic_Programming, Depth_First_Search, Tree, Union_Find | 126 | 85.18
| 2002 |[Maximum Product of the Length of Two Palindromic Subsequences](src.save/main/java/g2001_2100/s2002_maximum_product_of_the_length_of_two_palindromic_subsequences/Solution.java)| Medium | String, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 69 | 89.94
| 2001 |[Number of Pairs of Interchangeable Rectangles](src.save/main/java/g2001_2100/s2001_number_of_pairs_of_interchangeable_rectangles/Solution.java)| Medium | Array, Hash_Table, Math, Counting, Number_Theory | 34 | 99.02
| 2000 |[Reverse Prefix of Word](src.save/main/java/g1901_2000/s2000_reverse_prefix_of_word/Solution.java)| Easy | String, Two_Pointers | 0 | 100.00
| 1998 |[GCD Sort of an Array](src.save/main/java/g1901_2000/s1998_gcd_sort_of_an_array/Solution.java)| Hard | Array, Math, Sorting, Union_Find | 51 | 100.00
| 1997 |[First Day Where You Have Been in All the Rooms](src.save/main/java/g1901_2000/s1997_first_day_where_you_have_been_in_all_the_rooms/Solution.java)| Medium | Array, Dynamic_Programming | 14 | 83.10
| 1996 |[The Number of Weak Characters in the Game](src.save/main/java/g1901_2000/s1996_the_number_of_weak_characters_in_the_game/Solution.java)| Medium | Array, Sorting, Greedy, Stack, Monotonic_Stack | 121 | 81.46
| 1995 |[Count Special Quadruplets](src.save/main/java/g1901_2000/s1995_count_special_quadruplets/Solution.java)| Easy | Array, Enumeration | 2 | 99.20
| 1994 |[The Number of Good Subsets](src.save/main/java/g1901_2000/s1994_the_number_of_good_subsets/Solution.java)| Hard | Array, Dynamic_Programming, Math, Bit_Manipulation, Bitmask | 15 | 94.29
| 1993 |[Operations on Tree](src.save/main/java/g1901_2000/s1993_operations_on_tree/LockingTree.java)| Medium | Hash_Table, Breadth_First_Search, Tree, Design | 394 | 23.03
| 1992 |[Find All Groups of Farmland](src.save/main/java/g1901_2000/s1992_find_all_groups_of_farmland/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 7 | 89.08
| 1991 |[Find the Middle Index in Array](src.save/main/java/g1901_2000/s1991_find_the_middle_index_in_array/Solution.java)| Easy | Array, Prefix_Sum | 0 | 100.00
| 1987 |[Number of Unique Good Subsequences](src.save/main/java/g1901_2000/s1987_number_of_unique_good_subsequences/Solution.java)| Hard | String, Dynamic_Programming | 19 | 53.78
| 1986 |[Minimum Number of Work Sessions to Finish the Tasks](src.save/main/java/g1901_2000/s1986_minimum_number_of_work_sessions_to_finish_the_tasks/Solution.java)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 2 | 90.18
| 1985 |[Find the Kth Largest Integer in the Array](src.save/main/java/g1901_2000/s1985_find_the_kth_largest_integer_in_the_array/Solution.java)| Medium | Array, String, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect | 34 | 77.42
| 1984 |[Minimum Difference Between Highest and Lowest of K Scores](src.save/main/java/g1901_2000/s1984_minimum_difference_between_highest_and_lowest_of_k_scores/Solution.java)| Easy | Array, Sorting, Sliding_Window | 4 | 95.43
| 1982 |[Find Array Given Subset Sums](src.save/main/java/g1901_2000/s1982_find_array_given_subset_sums/Solution.java)| Hard | Array, Divide_and_Conquer | 70 | 64.91
| 1981 |[Minimize the Difference Between Target and Chosen Elements](src.save/main/java/g1901_2000/s1981_minimize_the_difference_between_target_and_chosen_elements/Solution.java)| Medium | Array, Dynamic_Programming, Matrix | 480 | 90.78
| 1980 |[Find Unique Binary String](src.save/main/java/g1901_2000/s1980_find_unique_binary_string/Solution.java)| Medium | Array, String, Backtracking | 7 | 31.88
| 1979 |[Find Greatest Common Divisor of Array](src.save/main/java/g1901_2000/s1979_find_greatest_common_divisor_of_array/Solution.java)| Easy | Array, Math, Number_Theory | 5 | 10.46
| 1977 |[Number of Ways to Separate Numbers](src.save/main/java/g1901_2000/s1977_number_of_ways_to_separate_numbers/Solution.java)| Hard | String, Dynamic_Programming, Suffix_Array | 604 | 59.21
| 1976 |[Number of Ways to Arrive at Destination](src.save/main/java/g1901_2000/s1976_number_of_ways_to_arrive_at_destination/Solution.java)| Medium | Dynamic_Programming, Graph, Topological_Sort, Shortest_Path | 14 | 77.59
| 1975 |[Maximum Matrix Sum](src.save/main/java/g1901_2000/s1975_maximum_matrix_sum/Solution.java)| Medium | Array, Greedy, Matrix | 4 | 100.00
| 1974 |[Minimum Time to Type Word Using Special Typewriter](src.save/main/java/g1901_2000/s1974_minimum_time_to_type_word_using_special_typewriter/Solution.java)| Easy | String, Greedy | 1 | 74.90
| 1971 |[Find if Path Exists in Graph](src.save/main/java/g1901_2000/s1971_find_if_path_exists_in_graph/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Graph | 4 | 99.57
| 1970 |[Last Day Where You Can Still Cross](src.save/main/java/g1901_2000/s1970_last_day_where_you_can_still_cross/Solution.java)| Hard | Array, Depth_First_Search, Breadth_First_Search, Binary_Search, Matrix, Union_Find | 14 | 95.24
| 1969 |[Minimum Non-Zero Product of the Array Elements](src.save/main/java/g1901_2000/s1969_minimum_non_zero_product_of_the_array_elements/Solution.java)| Medium | Math, Greedy, Recursion | 0 | 100.00
| 1968 |[Array With Elements Not Equal to Average of Neighbors](src.save/main/java/g1901_2000/s1968_array_with_elements_not_equal_to_average_of_neighbors/Solution.java)| Medium | Array, Sorting, Greedy | 6 | 92.86
| 1967 |[Number of Strings That Appear as Substrings in Word](src.save/main/java/g1901_2000/s1967_number_of_strings_that_appear_as_substrings_in_word/Solution.java)| Easy | String | 3 | 10.82
| 1965 |[Employees With Missing Information](src.save/main/java/g1901_2000/s1965_employees_with_missing_information/script.sql)| Easy | Database, SQL_I_Day_4_Union_and_Select | 617 | 30.40
| 1964 |[Find the Longest Valid Obstacle Course at Each Position](src.save/main/java/g1901_2000/s1964_find_the_longest_valid_obstacle_course_at_each_position/Solution.java)| Hard | Array, Binary_Search, Binary_Indexed_Tree | 79 | 85.00
| 1963 |[Minimum Number of Swaps to Make the String Balanced](src.save/main/java/g1901_2000/s1963_minimum_number_of_swaps_to_make_the_string_balanced/Solution.java)| Medium | String, Greedy, Two_Pointers, Stack | 17 | 93.71
| 1962 |[Remove Stones to Minimize the Total](src.save/main/java/g1901_2000/s1962_remove_stones_to_minimize_the_total/Solution.java)| Medium | Array, Heap_Priority_Queue | 761 | 48.67
| 1961 |[Check If String Is a Prefix of Array](src.save/main/java/g1901_2000/s1961_check_if_string_is_a_prefix_of_array/Solution.java)| Easy | Array, String | 2 | 60.87
| 1960 |[Maximum Product of the Length of Two Palindromic Substrings](src.save/main/java/g1901_2000/s1960_maximum_product_of_the_length_of_two_palindromic_substrings/Solution.java)| Hard | String, Hash_Function, Rolling_Hash | 32 | 75.00
| 1959 |[Minimum Total Space Wasted With K Resizing Operations](src.save/main/java/g1901_2000/s1959_minimum_total_space_wasted_with_k_resizing_operations/Solution.java)| Medium | Array, Dynamic_Programming | 42 | 95.45
| 1958 |[Check if Move is Legal](src.save/main/java/g1901_2000/s1958_check_if_move_is_legal/Solution.java)| Medium | Array, Matrix, Enumeration | 0 | 100.00
| 1957 |[Delete Characters to Make Fancy String](src.save/main/java/g1901_2000/s1957_delete_characters_to_make_fancy_string/Solution.java)| Easy | String | 54 | 52.94
| 1955 |[Count Number of Special Subsequences](src.save/main/java/g1901_2000/s1955_count_number_of_special_subsequences/Solution.java)| Hard | Array, Dynamic_Programming | 22 | 80.65
| 1954 |[Minimum Garden Perimeter to Collect Enough Apples](src.save/main/java/g1901_2000/s1954_minimum_garden_perimeter_to_collect_enough_apples/Solution.java)| Medium | Math, Binary_Search | 2 | 59.57
| 1953 |[Maximum Number of Weeks for Which You Can Work](src.save/main/java/g1901_2000/s1953_maximum_number_of_weeks_for_which_you_can_work/Solution.java)| Medium | Array, Greedy | 4 | 40.93
| 1952 |[Three Divisors](src.save/main/java/g1901_2000/s1952_three_divisors/Solution.java)| Easy | Math | 1 | 84.91
| 1948 |[Delete Duplicate Folders in System](src.save/main/java/g1901_2000/s1948_delete_duplicate_folders_in_system/Solution.java)| Hard | Array, String, Hash_Table, Trie, Hash_Function | 92 | 97.82
| 1947 |[Maximum Compatibility Score Sum](src.save/main/java/g1901_2000/s1947_maximum_compatibility_score_sum/Solution.java)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 2 | 95.90
| 1946 |[Largest Number After Mutating Substring](src.save/main/java/g1901_2000/s1946_largest_number_after_mutating_substring/Solution.java)| Medium | Array, String, Greedy | 18 | 70.91
| 1945 |[Sum of Digits of String After Convert](src.save/main/java/g1901_2000/s1945_sum_of_digits_of_string_after_convert/Solution.java)| Easy | String, Simulation | 2 | 72.10
| 1944 |[Number of Visible People in a Queue](src.save/main/java/g1901_2000/s1944_number_of_visible_people_in_a_queue/Solution.java)| Hard | Array, Stack, Monotonic_Stack | 9 | 99.65
| 1943 |[Describe the Painting](src.save/main/java/g1901_2000/s1943_describe_the_painting/Solution.java)| Medium | Array, Prefix_Sum | 29 | 93.92
| 1942 |[The Number of the Smallest Unoccupied Chair](src.save/main/java/g1901_2000/s1942_the_number_of_the_smallest_unoccupied_chair/Solution.java)| Medium | Array, Heap_Priority_Queue, Ordered_Set | 73 | 49.69
| 1941 |[Check if All Characters Have Equal Number of Occurrences](src.save/main/java/g1901_2000/s1941_check_if_all_characters_have_equal_number_of_occurrences/Solution.java)| Easy | String, Hash_Table, Counting | 2 | 86.25
| 1938 |[Maximum Genetic Difference Query](src.save/main/java/g1901_2000/s1938_maximum_genetic_difference_query/Solution.java)| Hard | Array, Bit_Manipulation, Trie | 174 | 100.00
| 1937 |[Maximum Number of Points with Cost](src.save/main/java/g1901_2000/s1937_maximum_number_of_points_with_cost/Solution.java)| Medium | Array, Dynamic_Programming | 18 | 44.04
| 1936 |[Add Minimum Number of Rungs](src.save/main/java/g1901_2000/s1936_add_minimum_number_of_rungs/Solution.java)| Medium | Array, Greedy | 1 | 100.00
| 1935 |[Maximum Number of Words You Can Type](src.save/main/java/g1901_2000/s1935_maximum_number_of_words_you_can_type/Solution.java)| Easy | String, Hash_Table | 2 | 95.06
| 1932 |[Merge BSTs to Create Single BST](src.save/main/java/g1901_2000/s1932_merge_bsts_to_create_single_bst/Solution.java)| Hard | Hash_Table, Depth_First_Search, Tree, Binary_Search, Binary_Tree | 87 | 48.43
| 1931 |[Painting a Grid With Three Different Colors](src.save/main/java/g1901_2000/s1931_painting_a_grid_with_three_different_colors/Solution.java)| Hard | Dynamic_Programming | 7 | 99.32
| 1930 |[Unique Length-3 Palindromic Subsequences](src.save/main/java/g1901_2000/s1930_unique_length_3_palindromic_subsequences/Solution.java)| Medium | String, Hash_Table, Prefix_Sum | 31 | 93.44
| 1929 |[Concatenation of Array](src.save/main/java/g1901_2000/s1929_concatenation_of_array/Solution.java)| Easy | Array | 1 | 92.52
| 1928 |[Minimum Cost to Reach Destination in Time](src.save/main/java/g1901_2000/s1928_minimum_cost_to_reach_destination_in_time/Solution.java)| Hard | Dynamic_Programming, Graph | 52 | 87.97
| 1927 |[Sum Game](src.save/main/java/g1901_2000/s1927_sum_game/Solution.java)| Medium | Math, Greedy, Game_Theory | 13 | 34.41
| 1926 |[Nearest Exit from Entrance in Maze](src.save/main/java/g1901_2000/s1926_nearest_exit_from_entrance_in_maze/Solution.java)| Medium | Array, Breadth_First_Search, Matrix, Graph_Theory_I_Day_6_Matrix_Related_Problems | 12 | 40.55
| 1925 |[Count Square Sum Triples](src.save/main/java/g1901_2000/s1925_count_square_sum_triples/Solution.java)| Easy | Math, Enumeration | 25 | 48.78
| 1923 |[Longest Common Subpath](src.save/main/java/g1901_2000/s1923_longest_common_subpath/Solution.java)| Hard | Array, Binary_Search, Hash_Function, Rolling_Hash, Suffix_Array | 517 | 73.88
| 1922 |[Count Good Numbers](src.save/main/java/g1901_2000/s1922_count_good_numbers/Solution.java)| Medium | Math, Recursion | 1 | 87.11
| 1921 |[Eliminate Maximum Number of Monsters](src.save/main/java/g1901_2000/s1921_eliminate_maximum_number_of_monsters/Solution.java)| Medium | Array, Sorting, Greedy | 19 | 90.78
| 1920 |[Build Array from Permutation](src.save/main/java/g1901_2000/s1920_build_array_from_permutation/Solution.java)| Easy | Array, Simulation | 1 | 94.23
| 1916 |[Count Ways to Build Rooms in an Ant Colony](src.save/main/java/g1901_2000/s1916_count_ways_to_build_rooms_in_an_ant_colony/Solution.java)| Hard | Dynamic_Programming, Math, Tree, Graph, Topological_Sort, Combinatorics | 1527 | 34.38
| 1915 |[Number of Wonderful Substrings](src.save/main/java/g1901_2000/s1915_number_of_wonderful_substrings/Solution.java)| Medium | String, Hash_Table, Bit_Manipulation, Prefix_Sum | 31 | 82.46
| 1914 |[Cyclically Rotating a Grid](src.save/main/java/g1901_2000/s1914_cyclically_rotating_a_grid/Solution.java)| Medium | Array, Matrix, Simulation | 2 | 91.30
| 1913 |[Maximum Product Difference Between Two Pairs](src.save/main/java/g1901_2000/s1913_maximum_product_difference_between_two_pairs/Solution.java)| Easy | Array, Sorting | 7 | 70.01
| 1912 |[Design Movie Rental System](src.save/main/java/g1901_2000/s1912_design_movie_rental_system/MovieRentingSystem.java)| Hard | Array, Hash_Table, Design, Heap_Priority_Queue, Ordered_Set | 562 | 74.14
| 1911 |[Maximum Alternating Subsequence Sum](src.save/main/java/g1901_2000/s1911_maximum_alternating_subsequence_sum/Solution.java)| Medium | Array, Dynamic_Programming | 12 | 51.75
| 1910 |[Remove All Occurrences of a Substring](src.save/main/java/g1901_2000/s1910_remove_all_occurrences_of_a_substring/Solution.java)| Medium | String | 11 | 39.18
| 1909 |[Remove One Element to Make the Array Strictly Increasing](src.save/main/java/g1901_2000/s1909_remove_one_element_to_make_the_array_strictly_increasing/Solution.java)| Easy | Array | 0 | 100.00
| 1906 |[Minimum Absolute Difference Queries](src.save/main/java/g1901_2000/s1906_minimum_absolute_difference_queries/Solution.java)| Medium | Array, Hash_Table | 176 | 71.61
| 1905 |[Count Sub Islands](src.save/main/java/g1901_2000/s1905_count_sub_islands/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Graph_Theory_I_Day_3_Matrix_Related_Problems | 24 | 85.54
| 1904 |[The Number of Full Rounds You Have Played](src.save/main/java/g1901_2000/s1904_the_number_of_full_rounds_you_have_played/Solution.java)| Medium | String, Math | 0 | 100.00
| 1903 |[Largest Odd Number in String](src.save/main/java/g1901_2000/s1903_largest_odd_number_in_string/Solution.java)| Easy | String, Math, Greedy | 6 | 23.18
| 1901 |[Find a Peak Element II](src.save/main/java/g1901_2000/s1901_find_a_peak_element_ii/Solution.java)| Medium | Array, Binary_Search, Matrix, Divide_and_Conquer, Binary_Search_II_Day_17 | 0 | 100.00
| 1900 |[The Earliest and Latest Rounds Where Players Compete](src.save/main/java/g1801_1900/s1900_the_earliest_and_latest_rounds_where_players_compete/Solution.java)| Hard | Dynamic_Programming, Memoization | 1 | 92.68
| 1899 |[Merge Triplets to Form Target Triplet](src.save/main/java/g1801_1900/s1899_merge_triplets_to_form_target_triplet/Solution.java)| Medium | Array, Greedy | 1 | 98.96
| 1898 |[Maximum Number of Removable Characters](src.save/main/java/g1801_1900/s1898_maximum_number_of_removable_characters/Solution.java)| Medium | Array, String, Binary_Search, Binary_Search_II_Day_6 | 121 | 72.51
| 1897 |[Redistribute Characters to Make All Strings Equal](src.save/main/java/g1801_1900/s1897_redistribute_characters_to_make_all_strings_equal/Solution.java)| Easy | String, Hash_Table, Counting | 2 | 100.00
| 1896 |[Minimum Cost to Change the Final Value of Expression](src.save/main/java/g1801_1900/s1896_minimum_cost_to_change_the_final_value_of_expression/Solution.java)| Hard | String, Dynamic_Programming, Math, Stack | 29 | 95.24
| 1895 |[Largest Magic Square](src.save/main/java/g1801_1900/s1895_largest_magic_square/Solution.java)| Medium | Array, Matrix, Prefix_Sum | 7 | 80.72
| 1894 |[Find the Student that Will Replace the Chalk](src.save/main/java/g1801_1900/s1894_find_the_student_that_will_replace_the_chalk/Solution.java)| Medium | Array, Binary_Search, Simulation, Prefix_Sum, Binary_Search_II_Day_2 | 2 | 76.67
| 1893 |[Check if All the Integers in a Range Are Covered](src.save/main/java/g1801_1900/s1893_check_if_all_the_integers_in_a_range_are_covered/Solution.java)| Easy | Array, Hash_Table, Prefix_Sum | 1 | 72.81
| 1890 |[The Latest Login in 2020](src.save/main/java/g1801_1900/s1890_the_latest_login_in_2020/script.sql)| Easy | Database, SQL_I_Day_8_Function | 571 | 73.59
| 1889 |[Minimum Space Wasted From Packaging](src.save/main/java/g1801_1900/s1889_minimum_space_wasted_from_packaging/Solution.java)| Hard | Array, Sorting, Binary_Search, Prefix_Sum | 98 | 45.92
| 1888 |[Minimum Number of Flips to Make the Binary String Alternating](src.save/main/java/g1801_1900/s1888_minimum_number_of_flips_to_make_the_binary_string_alternating/Solution.java)| Medium | String, Greedy | 30 | 75.70
| 1887 |[Reduction Operations to Make the Array Elements Equal](src.save/main/java/g1801_1900/s1887_reduction_operations_to_make_the_array_elements_equal/Solution.java)| Medium | Array, Sorting | 26 | 94.56
| 1886 |[Determine Whether Matrix Can Be Obtained By Rotation](src.save/main/java/g1801_1900/s1886_determine_whether_matrix_can_be_obtained_by_rotation/Solution.java)| Easy | Array, Matrix, Programming_Skills_II_Day_7 | 1 | 78.38
| 1884 |[Egg Drop With 2 Eggs and N Floors](src.save/main/java/g1801_1900/s1884_egg_drop_with_2_eggs_and_n_floors/Solution.java)| Medium | Dynamic_Programming, Math | 0 | 100.00
| 1883 |[Minimum Skips to Arrive at Meeting On Time](src.save/main/java/g1801_1900/s1883_minimum_skips_to_arrive_at_meeting_on_time/Solution.java)| Hard | Array, Dynamic_Programming | 70 | 73.08
| 1882 |[Process Tasks Using Servers](src.save/main/java/g1801_1900/s1882_process_tasks_using_servers/Solution.java)| Medium | Array, Heap_Priority_Queue | 290 | 77.45
| 1881 |[Maximum Value after Insertion](src.save/main/java/g1801_1900/s1881_maximum_value_after_insertion/Solution.java)| Medium | String, Greedy | 12 | 85.08
| 1880 |[Check if Word Equals Summation of Two Words](src.save/main/java/g1801_1900/s1880_check_if_word_equals_summation_of_two_words/Solution.java)| Easy | String | 2 | 31.97
| 1879 |[Minimum XOR Sum of Two Arrays](src.save/main/java/g1801_1900/s1879_minimum_xor_sum_of_two_arrays/Solution.java)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Bitmask | 15 | 63.49
| 1878 |[Get Biggest Three Rhombus Sums in a Grid](src.save/main/java/g1801_1900/s1878_get_biggest_three_rhombus_sums_in_a_grid/Solution.java)| Medium | Array, Math, Sorting, Matrix, Heap_Priority_Queue, Prefix_Sum | 41 | 82.03
| 1877 |[Minimize Maximum Pair Sum in Array](src.save/main/java/g1801_1900/s1877_minimize_maximum_pair_sum_in_array/Solution.java)| Medium | Array, Sorting, Greedy, Two_Pointers | 62 | 82.87
| 1876 |[Substrings of Size Three with Distinct Characters](src.save/main/java/g1801_1900/s1876_substrings_of_size_three_with_distinct_characters/Solution.java)| Easy | String, Hash_Table, Counting, Sliding_Window | 2 | 60.62
| 1873 |[Calculate Special Bonus](src.save/main/java/g1801_1900/s1873_calculate_special_bonus/script.sql)| Easy | Database, SQL_I_Day_2_Select_and_Order | 543 | 71.60
| 1872 |[Stone Game VIII](src.save/main/java/g1801_1900/s1872_stone_game_viii/Solution.java)| Hard | Array, Dynamic_Programming, Math, Prefix_Sum, Game_Theory | 3 | 98.18
| 1871 |[Jump Game VII](src.save/main/java/g1801_1900/s1871_jump_game_vii/Solution.java)| Medium | String, Two_Pointers, Prefix_Sum | 14 | 76.25
| 1870 |[Minimum Speed to Arrive on Time](src.save/main/java/g1801_1900/s1870_minimum_speed_to_arrive_on_time/Solution.java)| Medium | Array, Binary_Search, Binary_Search_II_Day_6 | 86 | 88.58
| 1869 |[Longer Contiguous Segments of Ones than Zeros](src.save/main/java/g1801_1900/s1869_longer_contiguous_segments_of_ones_than_zeros/Solution.java)| Easy | String | 1 | 88.10
| 1866 |[Number of Ways to Rearrange Sticks With K Sticks Visible](src.save/main/java/g1801_1900/s1866_number_of_ways_to_rearrange_sticks_with_k_sticks_visible/Solution.java)| Hard | Dynamic_Programming, Math, Combinatorics | 67 | 96.33
| 1865 |[Finding Pairs With a Certain Sum](src.save/main/java/g1801_1900/s1865_finding_pairs_with_a_certain_sum/FindSumPairs.java)| Medium | Array, Hash_Table, Design | 195 | 83.97
| 1864 |[Minimum Number of Swaps to Make the Binary String Alternating](src.save/main/java/g1801_1900/s1864_minimum_number_of_swaps_to_make_the_binary_string_alternating/Solution.java)| Medium | String, Greedy | 3 | 43.20
| 1863 |[Sum of All Subset XOR Totals](src.save/main/java/g1801_1900/s1863_sum_of_all_subset_xor_totals/Solution.java)| Easy | Array, Math, Bit_Manipulation, Backtracking, Combinatorics | 22 | 11.36
| 1862 |[Sum of Floored Pairs](src.save/main/java/g1801_1900/s1862_sum_of_floored_pairs/Solution.java)| Hard | Array, Math, Binary_Search, Prefix_Sum | 115 | 70.91
| 1861 |[Rotating the Box](src.save/main/java/g1801_1900/s1861_rotating_the_box/Solution.java)| Medium | Array, Matrix, Two_Pointers | 8 | 92.84
| 1860 |[Incremental Memory Leak](src.save/main/java/g1801_1900/s1860_incremental_memory_leak/Solution.java)| Medium | Simulation | 5 | 78.57
| 1859 |[Sorting the Sentence](src.save/main/java/g1801_1900/s1859_sorting_the_sentence/Solution.java)| Easy | String, Sorting | 2 | 50.32
| 1857 |[Largest Color Value in a Directed Graph](src.save/main/java/g1801_1900/s1857_largest_color_value_in_a_directed_graph/Solution.java)| Hard | Hash_Table, Dynamic_Programming, Graph, Counting, Memoization, Topological_Sort | 110 | 73.53
| 1856 |[Maximum Subarray Min-Product](src.save/main/java/g1801_1900/s1856_maximum_subarray_min_product/Solution.java)| Medium | Array, Stack, Prefix_Sum, Monotonic_Stack | 28 | 92.10
| 1855 |[Maximum Distance Between a Pair of Values](src.save/main/java/g1801_1900/s1855_maximum_distance_between_a_pair_of_values/Solution.java)| Medium | Array, Greedy, Binary_Search, Two_Pointers, Binary_Search_I_Day_11 | 4 | 62.20
| 1854 |[Maximum Population Year](src.save/main/java/g1801_1900/s1854_maximum_population_year/Solution.java)| Easy | Array, Counting | 0 | 100.00
| 1851 |[Minimum Interval to Include Each Query](src.save/main/java/g1801_1900/s1851_minimum_interval_to_include_each_query/Solution.java)| Hard | Array, Sorting, Binary_Search, Heap_Priority_Queue, Line_Sweep | 140 | 84.24
| 1850 |[Minimum Adjacent Swaps to Reach the Kth Smallest Number](src.save/main/java/g1801_1900/s1850_minimum_adjacent_swaps_to_reach_the_kth_smallest_number/Solution.java)| Medium | String, Greedy, Two_Pointers | 24 | 72.99
| 1849 |[Splitting a String Into Descending Consecutive Values](src.save/main/java/g1801_1900/s1849_splitting_a_string_into_descending_consecutive_values/Solution.java)| Medium | String, Backtracking | 1 | 87.61
| 1848 |[Minimum Distance to the Target Element](src.save/main/java/g1801_1900/s1848_minimum_distance_to_the_target_element/Solution.java)| Easy | Array | 1 | 58.33
| 1847 |[Closest Room](src.save/main/java/g1801_1900/s1847_closest_room/Solution.java)| Hard | Array, Sorting, Binary_Search | 95 | 81.67
| 1846 |[Maximum Element After Decreasing and Rearranging](src.save/main/java/g1801_1900/s1846_maximum_element_after_decreasing_and_rearranging/Solution.java)| Medium | Array, Sorting, Greedy | 4 | 93.59
| 1845 |[Seat Reservation Manager](src.save/main/java/g1801_1900/s1845_seat_reservation_manager/SeatManager.java)| Medium | Design, Heap_Priority_Queue, Programming_Skills_II_Day_17 | 47 | 87.63
| 1844 |[Replace All Digits with Characters](src.save/main/java/g1801_1900/s1844_replace_all_digits_with_characters/Solution.java)| Easy | String | 1 | 70.12
| 1840 |[Maximum Building Height](src.save/main/java/g1801_1900/s1840_maximum_building_height/Solution.java)| Hard | Array, Math | 59 | 94.64
| 1839 |[Longest Substring Of All Vowels in Order](src.save/main/java/g1801_1900/s1839_longest_substring_of_all_vowels_in_order/Solution.java)| Medium | String, Sliding_Window | 24 | 86.13
| 1838 |[Frequency of the Most Frequent Element](src.save/main/java/g1801_1900/s1838_frequency_of_the_most_frequent_element/Solution.java)| Medium | Array, Sorting, Greedy, Binary_Search, Prefix_Sum, Sliding_Window, Binary_Search_II_Day_9 | 11 | 100.00
| 1837 |[Sum of Digits in Base K](src.save/main/java/g1801_1900/s1837_sum_of_digits_in_base_k/Solution.java)| Easy | Math | 1 | 10.42
| 1835 |[Find XOR Sum of All Pairs Bitwise AND](src.save/main/java/g1801_1900/s1835_find_xor_sum_of_all_pairs_bitwise_and/Solution.java)| Hard | Array, Math, Bit_Manipulation | 1 | 100.00
| 1834 |[Single-Threaded CPU](src.save/main/java/g1801_1900/s1834_single_threaded_cpu/Solution.java)| Medium | Array, Sorting, Heap_Priority_Queue | 134 | 83.22
| 1833 |[Maximum Ice Cream Bars](src.save/main/java/g1801_1900/s1833_maximum_ice_cream_bars/Solution.java)| Medium | Array, Sorting, Greedy | 39 | 84.49
| 1832 |[Check if the Sentence Is Pangram](src.save/main/java/g1801_1900/s1832_check_if_the_sentence_is_pangram/Solution.java)| Easy | String, Hash_Table | 3 | 41.29
| 1830 |[Minimum Number of Operations to Make String Sorted](src.save/main/java/g1801_1900/s1830_minimum_number_of_operations_to_make_string_sorted/Solution.java)| Hard | String, Math, Combinatorics | 125 | 94.12
| 1829 |[Maximum XOR for Each Query](src.save/main/java/g1801_1900/s1829_maximum_xor_for_each_query/Solution.java)| Medium | Array, Bit_Manipulation, Prefix_Sum | 7 | 20.94
| 1828 |[Queries on Number of Points Inside a Circle](src.save/main/java/g1801_1900/s1828_queries_on_number_of_points_inside_a_circle/Solution.java)| Medium | Array, Math, Geometry | 23 | 75.03
| 1827 |[Minimum Operations to Make the Array Increasing](src.save/main/java/g1801_1900/s1827_minimum_operations_to_make_the_array_increasing/Solution.java)| Easy | Array, Greedy | 4 | 35.67
| 1825 |[Finding MK Average](src.save/main/java/g1801_1900/s1825_finding_mk_average/MKAverage.java)| Hard | Design, Heap_Priority_Queue, Ordered_Set, Queue | 83 | 60.59
| 1824 |[Minimum Sideway Jumps](src.save/main/java/g1801_1900/s1824_minimum_sideway_jumps/Solution.java)| Medium | Array, Dynamic_Programming, Greedy | 17 | 96.34
| 1823 |[Find the Winner of the Circular Game](src.save/main/java/g1801_1900/s1823_find_the_winner_of_the_circular_game/Solution.java)| Medium | Array, Math, Simulation, Recursion, Queue, Data_Structure_II_Day_14_Stack_Queue | 3 | 64.85
| 1822 |[Sign of the Product of an Array](src.save/main/java/g1801_1900/s1822_sign_of_the_product_of_an_array/Solution.java)| Easy | Array, Math, Programming_Skills_I_Day_4_Loop | 1 | 58.05
| 1819 |[Number of Different Subsequences GCDs](src.save/main/java/g1801_1900/s1819_number_of_different_subsequences_gcds/Solution.java)| Hard | Array, Math, Counting, Number_Theory | 116 | 96.43
| 1818 |[Minimum Absolute Sum Difference](src.save/main/java/g1801_1900/s1818_minimum_absolute_sum_difference/Solution.java)| Medium | Array, Sorting, Binary_Search, Ordered_Set, Binary_Search_II_Day_7 | 13 | 99.44
| 1817 |[Finding the Users Active Minutes](src.save/main/java/g1801_1900/s1817_finding_the_users_active_minutes/Solution.java)| Medium | Array, Hash_Table | 16 | 91.64
| 1816 |[Truncate Sentence](src.save/main/java/g1801_1900/s1816_truncate_sentence/Solution.java)| Easy | Array, String | 2 | 65.71
| 1815 |[Maximum Number of Groups Getting Fresh Donuts](src.save/main/java/g1801_1900/s1815_maximum_number_of_groups_getting_fresh_donuts/Solution.java)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Bitmask, Memoization | 7 | 86.67
| 1814 |[Count Nice Pairs in an Array](src.save/main/java/g1801_1900/s1814_count_nice_pairs_in_an_array/Solution.java)| Medium | Array, Hash_Table, Math, Counting | 47 | 83.12
| 1813 |[Sentence Similarity III](src.save/main/java/g1801_1900/s1813_sentence_similarity_iii/Solution.java)| Medium | Array, String, Two_Pointers | 3 | 41.38
| 1812 |[Determine Color of a Chessboard Square](src.save/main/java/g1801_1900/s1812_determine_color_of_a_chessboard_square/Solution.java)| Easy | String, Math | 1 | 49.36
| 1808 |[Maximize Number of Nice Divisors](src.save/main/java/g1801_1900/s1808_maximize_number_of_nice_divisors/Solution.java)| Hard | Math, Recursion | 1 | 80.77
| 1807 |[Evaluate the Bracket Pairs of a String](src.save/main/java/g1801_1900/s1807_evaluate_the_bracket_pairs_of_a_string/Solution.java)| Medium | Array, String, Hash_Table | 40 | 80.47
| 1806 |[Minimum Number of Operations to Reinitialize a Permutation](src.save/main/java/g1801_1900/s1806_minimum_number_of_operations_to_reinitialize_a_permutation/Solution.java)| Medium | Array, Math, Simulation | 0 | 100.00
| 1805 |[Number of Different Integers in a String](src.save/main/java/g1801_1900/s1805_number_of_different_integers_in_a_string/Solution.java)| Easy | String, Hash_Table | 3 | 79.55
| 1803 |[Count Pairs With XOR in a Range](src.save/main/java/g1801_1900/s1803_count_pairs_with_xor_in_a_range/Solution.java)| Hard | Array, Bit_Manipulation, Trie | 77 | 100.00
| 1802 |[Maximum Value at a Given Index in a Bounded Array](src.save/main/java/g1801_1900/s1802_maximum_value_at_a_given_index_in_a_bounded_array/Solution.java)| Medium | Greedy, Binary_Search, Binary_Search_II_Day_17 | 2 | 58.44
| 1801 |[Number of Orders in the Backlog](src.save/main/java/g1801_1900/s1801_number_of_orders_in_the_backlog/Solution.java)| Medium | Array, Heap_Priority_Queue, Simulation | 39 | 78.46
| 1800 |[Maximum Ascending Subarray Sum](src.save/main/java/g1701_1800/s1800_maximum_ascending_subarray_sum/Solution.java)| Easy | Array | 0 | 100.00
| 1799 |[Maximize Score After N Operations](src.save/main/java/g1701_1800/s1799_maximize_score_after_n_operations/Solution.java)| Hard | Array, Dynamic_Programming, Math, Bit_Manipulation, Backtracking, Bitmask, Number_Theory | 164 | 78.22
| 1798 |[Maximum Number of Consecutive Values You Can Make](src.save/main/java/g1701_1800/s1798_maximum_number_of_consecutive_values_you_can_make/Solution.java)| Medium | Array, Greedy | 11 | 96.30
| 1797 |[Design Authentication Manager](src.save/main/java/g1701_1800/s1797_design_authentication_manager/AuthenticationManager.java)| Medium | Hash_Table, Design, Programming_Skills_II_Day_19 | 41 | 92.67
| 1796 |[Second Largest Digit in a String](src.save/main/java/g1701_1800/s1796_second_largest_digit_in_a_string/Solution.java)| Easy | String, Hash_Table | 2 | 87.67
| 1795 |[Rearrange Products Table](src.save/main/java/g1701_1800/s1795_rearrange_products_table/script.sql)| Easy | Database, SQL_I_Day_4_Union_and_Select | 497 | 64.83
| 1793 |[Maximum Score of a Good Subarray](src.save/main/java/g1701_1800/s1793_maximum_score_of_a_good_subarray/Solution.java)| Hard | Array, Binary_Search, Two_Pointers, Stack, Monotonic_Stack | 3 | 97.56
| 1792 |[Maximum Average Pass Ratio](src.save/main/java/g1701_1800/s1792_maximum_average_pass_ratio/Solution.java)| Medium | Array, Greedy, Heap_Priority_Queue | 456 | 89.78
| 1791 |[Find Center of Star Graph](src.save/main/java/g1701_1800/s1791_find_center_of_star_graph/Solution.java)| Easy | Graph | 0 | 100.00
| 1790 |[Check if One String Swap Can Make Strings Equal](src.save/main/java/g1701_1800/s1790_check_if_one_string_swap_can_make_strings_equal/Solution.java)| Easy | String, Hash_Table, Counting, Programming_Skills_I_Day_4_Loop | 0 | 100.00
| 1787 |[Make the XOR of All Segments Equal to Zero](src.save/main/java/g1701_1800/s1787_make_the_xor_of_all_segments_equal_to_zero/Solution.java)| Hard | Array, Dynamic_Programming, Bit_Manipulation | 102 | 89.47
| 1786 |[Number of Restricted Paths From First to Last Node](src.save/main/java/g1701_1800/s1786_number_of_restricted_paths_from_first_to_last_node/Solution.java)| Medium | Dynamic_Programming, Heap_Priority_Queue, Graph, Topological_Sort, Shortest_Path | 86 | 88.56
| 1785 |[Minimum Elements to Add to Form a Given Sum](src.save/main/java/g1701_1800/s1785_minimum_elements_to_add_to_form_a_given_sum/Solution.java)| Medium | Array, Greedy | 2 | 70.75
| 1784 |[Check if Binary String Has at Most One Segment of Ones](src.save/main/java/g1701_1800/s1784_check_if_binary_string_has_at_most_one_segment_of_ones/Solution.java)| Easy | String | 1 | 65.60
| 1782 |[Count Pairs Of Nodes](src.save/main/java/g1701_1800/s1782_count_pairs_of_nodes/Solution.java)| Hard | Binary_Search, Two_Pointers, Graph | 128 | 86.96
| 1781 |[Sum of Beauty of All Substrings](src.save/main/java/g1701_1800/s1781_sum_of_beauty_of_all_substrings/Solution.java)| Medium | String, Hash_Table, Counting | 38 | 100.00
| 1780 |[Check if Number is a Sum of Powers of Three](src.save/main/java/g1701_1800/s1780_check_if_number_is_a_sum_of_powers_of_three/Solution.java)| Medium | Math | 2 | 19.71
| 1779 |[Find Nearest Point That Has the Same X or Y Coordinate](src.save/main/java/g1701_1800/s1779_find_nearest_point_that_has_the_same_x_or_y_coordinate/Solution.java)| Easy | Array, Programming_Skills_I_Day_3_Conditional_Statements | 1 | 100.00
| 1776 |[Car Fleet II](src.save/main/java/g1701_1800/s1776_car_fleet_ii/Solution.java)| Hard | Array, Math, Stack, Heap_Priority_Queue, Monotonic_Stack | 19 | 93.81
| 1775 |[Equal Sum Arrays With Minimum Number of Operations](src.save/main/java/g1701_1800/s1775_equal_sum_arrays_with_minimum_number_of_operations/Solution.java)| Medium | Array, Hash_Table, Greedy, Counting | 16 | 70.88
| 1774 |[Closest Dessert Cost](src.save/main/java/g1701_1800/s1774_closest_dessert_cost/Solution.java)| Medium | Array, Dynamic_Programming, Backtracking | 5 | 82.32
| 1773 |[Count Items Matching a Rule](src.save/main/java/g1701_1800/s1773_count_items_matching_a_rule/Solution.java)| Easy | Array, String | 3 | 98.33
| 1771 |[Maximize Palindrome Length From Subsequences](src.save/main/java/g1701_1800/s1771_maximize_palindrome_length_from_subsequences/Solution.java)| Hard | String, Dynamic_Programming | 58 | 87.88
| 1770 |[Maximum Score from Performing Multiplication Operations](src.save/main/java/g1701_1800/s1770_maximum_score_from_performing_multiplication_operations/Solution.java)| Medium | Array, Dynamic_Programming | 31 | 92.41
| 1769 |[Minimum Number of Operations to Move All Balls to Each Box](src.save/main/java/g1701_1800/s1769_minimum_number_of_operations_to_move_all_balls_to_each_box/Solution.java)| Medium | Array, String | 3 | 91.66
| 1768 |[Merge Strings Alternately](src.save/main/java/g1701_1800/s1768_merge_strings_alternately/Solution.java)| Easy | String, Two_Pointers, Programming_Skills_I_Day_8_String | 1 | 86.26
| 1766 |[Tree of Coprimes](src.save/main/java/g1701_1800/s1766_tree_of_coprimes/Solution.java)| Hard | Math, Depth_First_Search, Breadth_First_Search, Tree | 111 | 94.07
| 1765 |[Map of Highest Peak](src.save/main/java/g1701_1800/s1765_map_of_highest_peak/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 64 | 85.40
| 1764 |[Form Array by Concatenating Subarrays of Another Array](src.save/main/java/g1701_1800/s1764_form_array_by_concatenating_subarrays_of_another_array/Solution.java)| Medium | Array, Greedy, String_Matching | 7 | 16.90
| 1763 |[Longest Nice Substring](src.save/main/java/g1701_1800/s1763_longest_nice_substring/Solution.java)| Easy | String, Hash_Table, Bit_Manipulation, Sliding_Window | 5 | 61.88
| 1761 |[Minimum Degree of a Connected Trio in a Graph](src.save/main/java/g1701_1800/s1761_minimum_degree_of_a_connected_trio_in_a_graph/Solution.java)| Hard | Graph | 33 | 89.17
| 1760 |[Minimum Limit of Balls in a Bag](src.save/main/java/g1701_1800/s1760_minimum_limit_of_balls_in_a_bag/Solution.java)| Medium | Array, Binary_Search, Binary_Search_II_Day_3 | 44 | 78.49
| 1759 |[Count Number of Homogenous Substrings](src.save/main/java/g1701_1800/s1759_count_number_of_homogenous_substrings/Solution.java)| Medium | String, Math | 19 | 42.40
| 1758 |[Minimum Changes To Make Alternating Binary String](src.save/main/java/g1701_1800/s1758_minimum_changes_to_make_alternating_binary_string/Solution.java)| Easy | String | 2 | 98.92
| 1757 |[Recyclable and Low Fat Products](src.save/main/java/g1701_1800/s1757_recyclable_and_low_fat_products/script.sql)| Easy | Database, SQL_I_Day_1_Select | 475 | 71.54
| 1755 |[Closest Subsequence Sum](src.save/main/java/g1701_1800/s1755_closest_subsequence_sum/Solution.java)| Hard | Array, Dynamic_Programming, Two_Pointers, Bit_Manipulation, Bitmask | 383 | 87.60
| 1754 |[Largest Merge Of Two Strings](src.save/main/java/g1701_1800/s1754_largest_merge_of_two_strings/Solution.java)| Medium | String, Greedy, Two_Pointers | 37 | 89.23
| 1753 |[Maximum Score From Removing Stones](src.save/main/java/g1701_1800/s1753_maximum_score_from_removing_stones/Solution.java)| Medium | Math, Greedy, Heap_Priority_Queue | 0 | 100.00
| 1752 |[Check if Array Is Sorted and Rotated](src.save/main/java/g1701_1800/s1752_check_if_array_is_sorted_and_rotated/Solution.java)| Easy | Array | 0 | 100.00
| 1751 |[Maximum Number of Events That Can Be Attended II](src.save/main/java/g1701_1800/s1751_maximum_number_of_events_that_can_be_attended_ii/Solution.java)| Hard | Array, Dynamic_Programming, Binary_Search | 12 | 98.33
| 1750 |[Minimum Length of String After Deleting Similar Ends](src.save/main/java/g1701_1800/s1750_minimum_length_of_string_after_deleting_similar_ends/Solution.java)| Medium | String, Two_Pointers | 5 | 68.68
| 1749 |[Maximum Absolute Sum of Any Subarray](src.save/main/java/g1701_1800/s1749_maximum_absolute_sum_of_any_subarray/Solution.java)| Medium | Array, Dynamic_Programming | 3 | 90.60
| 1748 |[Sum of Unique Elements](src.save/main/java/g1701_1800/s1748_sum_of_unique_elements/Solution.java)| Easy | Array, Hash_Table, Counting | 2 | 54.08
| 1745 |[Palindrome Partitioning IV](src.save/main/java/g1701_1800/s1745_palindrome_partitioning_iv/Solution.java)| Hard | String, Dynamic_Programming | 10 | 100.00
| 1744 |[Can You Eat Your Favorite Candy on Your Favorite Day?](src.save/main/java/g1701_1800/s1744_can_you_eat_your_favorite_candy_on_your_favorite_day/Solution.java)| Medium | Array, Prefix_Sum | 5 | 100.00
| 1743 |[Restore the Array From Adjacent Pairs](src.save/main/java/g1701_1800/s1743_restore_the_array_from_adjacent_pairs/Solution.java)| Medium | Array, Hash_Table | 95 | 99.08
| 1742 |[Maximum Number of Balls in a Box](src.save/main/java/g1701_1800/s1742_maximum_number_of_balls_in_a_box/Solution.java)| Easy | Hash_Table, Math, Counting | 7 | 98.87
| 1741 |[Find Total Time Spent by Each Employee](src.save/main/java/g1701_1800/s1741_find_total_time_spent_by_each_employee/script.sql)| Easy | Database, SQL_I_Day_8_Function | 414 | 93.27
| 1739 |[Building Boxes](src.save/main/java/g1701_1800/s1739_building_boxes/Solution.java)| Hard | Math, Greedy, Binary_Search | 1 | 84.38
| 1738 |[Find Kth Largest XOR Coordinate Value](src.save/main/java/g1701_1800/s1738_find_kth_largest_xor_coordinate_value/Solution.java)| Medium | Array, Matrix, Bit_Manipulation, Heap_Priority_Queue, Prefix_Sum, Divide_and_Conquer, Quickselect | 40 | 97.08
| 1737 |[Change Minimum Characters to Satisfy One of Three Conditions](src.save/main/java/g1701_1800/s1737_change_minimum_characters_to_satisfy_one_of_three_conditions/Solution.java)| Medium | String, Hash_Table, Prefix_Sum, Counting | 8 | 87.70
| 1736 |[Latest Time by Replacing Hidden Digits](src.save/main/java/g1701_1800/s1736_latest_time_by_replacing_hidden_digits/Solution.java)| Easy | String, Greedy | 3 | 35.96
| 1735 |[Count Ways to Make Array With Product](src.save/main/java/g1701_1800/s1735_count_ways_to_make_array_with_product/Solution.java)| Hard | Array, Dynamic_Programming, Math | 189 | 43.75
| 1734 |[Decode XORed Permutation](src.save/main/java/g1701_1800/s1734_decode_xored_permutation/Solution.java)| Medium | Array, Bit_Manipulation | 6 | 34.52
| 1733 |[Minimum Number of People to Teach](src.save/main/java/g1701_1800/s1733_minimum_number_of_people_to_teach/Solution.java)| Medium | Array, Greedy | 11 | 98.57
| 1732 |[Find the Highest Altitude](src.save/main/java/g1701_1800/s1732_find_the_highest_altitude/Solution.java)| Easy | Array, Prefix_Sum | 0 | 100.00
| 1729 |[Find Followers Count](src.save/main/java/g1701_1800/s1729_find_followers_count/script.sql)| Easy | Database, SQL_I_Day_7_Function | 456 | 88.39
| 1728 |[Cat and Mouse II](src.save/main/java/g1701_1800/s1728_cat_and_mouse_ii/Solution.java)| Hard | Dynamic_Programming, Math, Breadth_First_Search, Graph, Memoization, Game_Theory | 12 | 99.12
| 1727 |[Largest Submatrix With Rearrangements](src.save/main/java/g1701_1800/s1727_largest_submatrix_with_rearrangements/Solution.java)| Medium | Array, Sorting, Greedy, Matrix | 9 | 90.48
| 1726 |[Tuple with Same Product](src.save/main/java/g1701_1800/s1726_tuple_with_same_product/Solution.java)| Medium | Array, Hash_Table | 235 | 90.73
| 1725 |[Number Of Rectangles That Can Form The Largest Square](src.save/main/java/g1701_1800/s1725_number_of_rectangles_that_can_form_the_largest_square/Solution.java)| Easy | Array | 1 | 100.00
| 1723 |[Find Minimum Time to Finish All Jobs](src.save/main/java/g1701_1800/s1723_find_minimum_time_to_finish_all_jobs/Solution.java)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 3 | 76.73
| 1722 |[Minimize Hamming Distance After Swap Operations](src.save/main/java/g1701_1800/s1722_minimize_hamming_distance_after_swap_operations/Solution.java)| Medium | Array, Depth_First_Search, Union_Find | 51 | 94.82
| 1721 |[Swapping Nodes in a Linked List](src.save/main/java/g1701_1800/s1721_swapping_nodes_in_a_linked_list/Solution.java)| Medium | Two_Pointers, Linked_List | 2 | 100.00
| 1720 |[Decode XORed Array](src.save/main/java/g1701_1800/s1720_decode_xored_array/Solution.java)| Easy | Array, Bit_Manipulation | 1 | 100.00
| 1719 |[Number Of Ways To Reconstruct A Tree](src.save/main/java/g1701_1800/s1719_number_of_ways_to_reconstruct_a_tree/Solution.java)| Hard | Tree, Graph, Topological_Sort | 91 | 67.57
| 1718 |[Construct the Lexicographically Largest Valid Sequence](src.save/main/java/g1701_1800/s1718_construct_the_lexicographically_largest_valid_sequence/Solution.java)| Medium | Array, Backtracking | 0 | 100.00
| 1717 |[Maximum Score From Removing Substrings](src.save/main/java/g1701_1800/s1717_maximum_score_from_removing_substrings/Solution.java)| Medium | String, Greedy, Stack | 19 | 99.25
| 1716 |[Calculate Money in Leetcode Bank](src.save/main/java/g1701_1800/s1716_calculate_money_in_leetcode_bank/Solution.java)| Easy | Math | 1 | 65.33
| 1713 |[Minimum Operations to Make a Subsequence](src.save/main/java/g1701_1800/s1713_minimum_operations_to_make_a_subsequence/Solution.java)| Hard | Array, Hash_Table, Greedy, Binary_Search | 81 | 95.39
| 1712 |[Ways to Split Array Into Three Subarrays](src.save/main/java/g1701_1800/s1712_ways_to_split_array_into_three_subarrays/Solution.java)| Medium | Array, Binary_Search, Two_Pointers, Prefix_Sum, Binary_Search_II_Day_10 | 16 | 84.24
| 1711 |[Count Good Meals](src.save/main/java/g1701_1800/s1711_count_good_meals/Solution.java)| Medium | Array, Hash_Table | 75 | 93.77
| 1710 |[Maximum Units on a Truck](src.save/main/java/g1701_1800/s1710_maximum_units_on_a_truck/Solution.java)| Easy | Array, Sorting, Greedy | 9 | 78.69
| 1707 |[Maximum XOR With an Element From Array](src.save/main/java/g1701_1800/s1707_maximum_xor_with_an_element_from_array/Solution.java)| Hard | Array, Bit_Manipulation, Trie | 150 | 97.24
| 1706 |[Where Will the Ball Fall](src.save/main/java/g1701_1800/s1706_where_will_the_ball_fall/Solution.java)| Medium | Array, Dynamic_Programming, Depth_First_Search, Matrix, Simulation | 2 | 64.55
| 1705 |[Maximum Number of Eaten Apples](src.save/main/java/g1701_1800/s1705_maximum_number_of_eaten_apples/Solution.java)| Medium | Array, Greedy, Heap_Priority_Queue | 53 | 77.63
| 1704 |[Determine if String Halves Are Alike](src.save/main/java/g1701_1800/s1704_determine_if_string_halves_are_alike/Solution.java)| Easy | String, Counting | 1 | 100.00
| 1703 |[Minimum Adjacent Swaps for K Consecutive Ones](src.save/main/java/g1701_1800/s1703_minimum_adjacent_swaps_for_k_consecutive_ones/Solution.java)| Hard | Array, Greedy, Prefix_Sum, Sliding_Window | 10 | 96.25
| 1702 |[Maximum Binary String After Change](src.save/main/java/g1701_1800/s1702_maximum_binary_string_after_change/Solution.java)| Medium | String, Greedy | 42 | 82.86
| 1701 |[Average Waiting Time](src.save/main/java/g1701_1800/s1701_average_waiting_time/Solution.java)| Medium | Array, Simulation | 2 | 100.00
| 1700 |[Number of Students Unable to Eat Lunch](src.save/main/java/g1601_1700/s1700_number_of_students_unable_to_eat_lunch/Solution.java)| Easy | Array, Stack, Simulation, Queue | 2 | 63.14
| 1697 |[Checking Existence of Edge Length Limited Paths](src.save/main/java/g1601_1700/s1697_checking_existence_of_edge_length_limited_paths/Solution.java)| Hard | Array, Sorting, Graph, Union_Find | 94 | 90.48
| 1696 |[Jump Game VI](src.save/main/java/g1601_1700/s1696_jump_game_vi/Solution.java)| Medium | Array, Dynamic_Programming, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue | 23 | 86.05
| 1695 |[Maximum Erasure Value](src.save/main/java/g1601_1700/s1695_maximum_erasure_value/Solution.java)| Medium | Array, Hash_Table, Sliding_Window | 5 | 99.82
| 1694 |[Reformat Phone Number](src.save/main/java/g1601_1700/s1694_reformat_phone_number/Solution.java)| Easy | String | 1 | 99.67
| 1693 |[Daily Leads and Partners](src.save/main/java/g1601_1700/s1693_daily_leads_and_partners/script.sql)| Easy | Database, SQL_I_Day_7_Function | 463 | 78.98
| 1691 |[Maximum Height by Stacking Cuboids](src.save/main/java/g1601_1700/s1691_maximum_height_by_stacking_cuboids/Solution.java)| Hard | Array, Dynamic_Programming, Sorting | 6 | 83.07
| 1690 |[Stone Game VII](src.save/main/java/g1601_1700/s1690_stone_game_vii/Solution.java)| Medium | Array, Dynamic_Programming, Math, Game_Theory | 18 | 96.71
| 1689 |[Partitioning Into Minimum Number Of Deci-Binary Numbers](src.save/main/java/g1601_1700/s1689_partitioning_into_minimum_number_of_deci_binary_numbers/Solution.java)| Medium | String, Greedy | 5 | 93.98
| 1688 |[Count of Matches in Tournament](src.save/main/java/g1601_1700/s1688_count_of_matches_in_tournament/Solution.java)| Easy | Math, Simulation | 0 | 100.00
| 1687 |[Delivering Boxes from Storage to Ports](src.save/main/java/g1601_1700/s1687_delivering_boxes_from_storage_to_ports/Solution.java)| Hard | Array, Dynamic_Programming, Heap_Priority_Queue, Queue, Segment_Tree, Monotonic_Queue | 9 | 91.09
| 1686 |[Stone Game VI](src.save/main/java/g1601_1700/s1686_stone_game_vi/Solution.java)| Medium | Array, Math, Sorting, Greedy, Heap_Priority_Queue, Game_Theory | 139 | 62.50
| 1685 |[Sum of Absolute Differences in a Sorted Array](src.save/main/java/g1601_1700/s1685_sum_of_absolute_differences_in_a_sorted_array/Solution.java)| Medium | Array, Math, Prefix_Sum | 4 | 80.17
| 1684 |[Count the Number of Consistent Strings](src.save/main/java/g1601_1700/s1684_count_the_number_of_consistent_strings/Solution.java)| Easy | Array, String, Hash_Table, Bit_Manipulation | 6 | 97.04
| 1681 |[Minimum Incompatibility](src.save/main/java/g1601_1700/s1681_minimum_incompatibility/Solution.java)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Bitmask | 1 | 100.00
| 1680 |[Concatenation of Consecutive Binary Numbers](src.save/main/java/g1601_1700/s1680_concatenation_of_consecutive_binary_numbers/Solution.java)| Medium | Math, Bit_Manipulation, Simulation | 70 | 95.05
| 1679 |[Max Number of K-Sum Pairs](src.save/main/java/g1601_1700/s1679_max_number_of_k_sum_pairs/Solution.java)| Medium | Array, Hash_Table, Sorting, Two_Pointers | 20 | 91.22
| 1678 |[Goal Parser Interpretation](src.save/main/java/g1601_1700/s1678_goal_parser_interpretation/Solution.java)| Easy | String, Programming_Skills_I_Day_8_String | 0 | 100.00
| 1675 |[Minimize Deviation in Array](src.save/main/java/g1601_1700/s1675_minimize_deviation_in_array/Solution.java)| Hard | Array, Greedy, Heap_Priority_Queue, Ordered_Set | 104 | 88.83
| 1674 |[Minimum Moves to Make Array Complementary](src.save/main/java/g1601_1700/s1674_minimum_moves_to_make_array_complementary/Solution.java)| Medium | Array, Hash_Table, Prefix_Sum | 29 | 22.22
| 1673 |[Find the Most Competitive Subsequence](src.save/main/java/g1601_1700/s1673_find_the_most_competitive_subsequence/Solution.java)| Medium | Array, Greedy, Stack, Monotonic_Stack | 7 | 96.82
| 1672 |[Richest Customer Wealth](src.save/main/java/g1601_1700/s1672_richest_customer_wealth/Solution.java)| Easy | Array, Matrix, Programming_Skills_I_Day_6_Array | 0 | 100.00
| 1671 |[Minimum Number of Removals to Make Mountain Array](src.save/main/java/g1601_1700/s1671_minimum_number_of_removals_to_make_mountain_array/Solution.java)| Hard | Array, Dynamic_Programming, Greedy, Binary_Search | 19 | 81.23
| 1670 |[Design Front Middle Back Queue](src.save/main/java/g1601_1700/s1670_design_front_middle_back_queue/FrontMiddleBackQueue.java)| Medium | Array, Design, Linked_List, Queue, Data_Stream | 5 | 100.00
| 1669 |[Merge In Between Linked Lists](src.save/main/java/g1601_1700/s1669_merge_in_between_linked_lists/Solution.java)| Medium | Linked_List | 2 | 76.51
| 1668 |[Maximum Repeating Substring](src.save/main/java/g1601_1700/s1668_maximum_repeating_substring/Solution.java)| Easy | String, String_Matching | 1 | 93.15
| 1667 |[Fix Names in a Table](src.save/main/java/g1601_1700/s1667_fix_names_in_a_table/script.sql)| Easy | Database, SQL_I_Day_3_String_Processing_Functions | 559 | 80.29
| 1665 |[Minimum Initial Energy to Finish Tasks](src.save/main/java/g1601_1700/s1665_minimum_initial_energy_to_finish_tasks/Solution.java)| Hard | Array, Sorting, Greedy | 30 | 81.16
| 1664 |[Ways to Make a Fair Array](src.save/main/java/g1601_1700/s1664_ways_to_make_a_fair_array/Solution.java)| Medium | Array, Dynamic_Programming | 11 | 71.76
| 1663 |[Smallest String With A Given Numeric Value](src.save/main/java/g1601_1700/s1663_smallest_string_with_a_given_numeric_value/Solution.java)| Medium | String, Greedy | 22 | 75.05
| 1662 |[Check If Two String Arrays are Equivalent](src.save/main/java/g1601_1700/s1662_check_if_two_string_arrays_are_equivalent/Solution.java)| Easy | Array, String | 0 | 100.00
| 1659 |[Maximize Grid Happiness](src.save/main/java/g1601_1700/s1659_maximize_grid_happiness/Solution.java)| Hard | Dynamic_Programming, Bit_Manipulation, Bitmask, Memoization | 95 | 75.00
| 1658 |[Minimum Operations to Reduce X to Zero](src.save/main/java/g1601_1700/s1658_minimum_operations_to_reduce_x_to_zero/Solution.java)| Medium | Array, Hash_Table, Binary_Search, Prefix_Sum, Sliding_Window | 4 | 98.95
| 1657 |[Determine if Two Strings Are Close](src.save/main/java/g1601_1700/s1657_determine_if_two_strings_are_close/Solution.java)| Medium | String, Hash_Table, Sorting | 12 | 97.58
| 1656 |[Design an Ordered Stream](src.save/main/java/g1601_1700/s1656_design_an_ordered_stream/OrderedStream.java)| Easy | Array, Hash_Table, Design, Data_Stream | 95 | 74.07
| 1655 |[Distribute Repeating Integers](src.save/main/java/g1601_1700/s1655_distribute_repeating_integers/Solution.java)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 7 | 94.23
| 1654 |[Minimum Jumps to Reach Home](src.save/main/java/g1601_1700/s1654_minimum_jumps_to_reach_home/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Graph_Theory_I_Day_11_Breadth_First_Search | 6 | 99.87
| 1653 |[Minimum Deletions to Make String Balanced](src.save/main/java/g1601_1700/s1653_minimum_deletions_to_make_string_balanced/Solution.java)| Medium | String, Dynamic_Programming, Stack | 26 | 90.44
| 1652 |[Defuse the Bomb](src.save/main/java/g1601_1700/s1652_defuse_the_bomb/Solution.java)| Easy | Array | 0 | 100.00
| 1649 |[Create Sorted Array through Instructions](src.save/main/java/g1601_1700/s1649_create_sorted_array_through_instructions/Solution.java)| Hard | Array, Binary_Search, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Merge_Sort | 35 | 100.00
| 1648 |[Sell Diminishing-Valued Colored Balls](src.save/main/java/g1601_1700/s1648_sell_diminishing_valued_colored_balls/Solution.java)| Medium | Array, Math, Sorting, Greedy, Binary_Search, Heap_Priority_Queue, Binary_Search_II_Day_19 | 27 | 80.64
| 1647 |[Minimum Deletions to Make Character Frequencies Unique](src.save/main/java/g1601_1700/s1647_minimum_deletions_to_make_character_frequencies_unique/Solution.java)| Medium | String, Sorting, Greedy | 8 | 100.00
| 1646 |[Get Maximum in Generated Array](src.save/main/java/g1601_1700/s1646_get_maximum_in_generated_array/Solution.java)| Easy | Array, Dynamic_Programming, Simulation | 0 | 100.00
| 1643 |[Kth Smallest Instructions](src.save/main/java/g1601_1700/s1643_kth_smallest_instructions/Solution.java)| Hard | Array, Dynamic_Programming, Math, Combinatorics | 1 | 100.00
| 1642 |[Furthest Building You Can Reach](src.save/main/java/g1601_1700/s1642_furthest_building_you_can_reach/Solution.java)| Medium | Array, Greedy, Heap_Priority_Queue | 13 | 98.96
| 1641 |[Count Sorted Vowel Strings](src.save/main/java/g1601_1700/s1641_count_sorted_vowel_strings/Solution.java)| Medium | Dynamic_Programming | 0 | 100.00
| 1640 |[Check Array Formation Through Concatenation](src.save/main/java/g1601_1700/s1640_check_array_formation_through_concatenation/Solution.java)| Easy | Array, Hash_Table | 1 | 87.62
| 1639 |[Number of Ways to Form a Target String Given a Dictionary](src.save/main/java/g1601_1700/s1639_number_of_ways_to_form_a_target_string_given_a_dictionary/Solution.java)| Hard | Array, String, Dynamic_Programming | 50 | 95.33
| 1638 |[Count Substrings That Differ by One Character](src.save/main/java/g1601_1700/s1638_count_substrings_that_differ_by_one_character/Solution.java)| Medium | String, Hash_Table, Dynamic_Programming | 5 | 76.39
| 1637 |[Widest Vertical Area Between Two Points Containing No Points](src.save/main/java/g1601_1700/s1637_widest_vertical_area_between_two_points_containing_no_points/Solution.java)| Medium | Array, Sorting | 17 | 74.19
| 1636 |[Sort Array by Increasing Frequency](src.save/main/java/g1601_1700/s1636_sort_array_by_increasing_frequency/Solution.java)| Easy | Array, Hash_Table, Sorting | 7 | 75.30
| 1632 |[Rank Transform of a Matrix](src.save/main/java/g1601_1700/s1632_rank_transform_of_a_matrix/Solution.java)| Hard | Array, Greedy, Matrix, Graph, Union_Find, Topological_Sort | 65 | 100.00
| 1631 |[Path With Minimum Effort](src.save/main/java/g1601_1700/s1631_path_with_minimum_effort/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Binary_Search, Matrix, Heap_Priority_Queue, Union_Find | 75 | 60.52
| 1630 |[Arithmetic Subarrays](src.save/main/java/g1601_1700/s1630_arithmetic_subarrays/Solution.java)| Medium | Array, Sorting, Programming_Skills_II_Day_9 | 8 | 93.62
| 1629 |[Slowest Key](src.save/main/java/g1601_1700/s1629_slowest_key/Solution.java)| Easy | Array, String | 4 | 14.60
| 1627 |[Graph Connectivity With Threshold](src.save/main/java/g1601_1700/s1627_graph_connectivity_with_threshold/Solution.java)| Hard | Array, Math, Union_Find | 7 | 98.45
| 1626 |[Best Team With No Conflicts](src.save/main/java/g1601_1700/s1626_best_team_with_no_conflicts/Solution.java)| Medium | Array, Dynamic_Programming, Sorting | 38 | 92.31
| 1625 |[Lexicographically Smallest String After Applying Operations](src.save/main/java/g1601_1700/s1625_lexicographically_smallest_string_after_applying_operations/Solution.java)| Medium | String, Breadth_First_Search | 91 | 91.80
| 1624 |[Largest Substring Between Two Equal Characters](src.save/main/java/g1601_1700/s1624_largest_substring_between_two_equal_characters/Solution.java)| Easy | String, Hash_Table | 1 | 85.13
| 1622 |[Fancy Sequence](src.save/main/java/g1601_1700/s1622_fancy_sequence/Fancy.java)| Hard | Math, Design, Segment_Tree | 40 | 96.55
| 1621 |[Number of Sets of K Non-Overlapping Line Segments](src.save/main/java/g1601_1700/s1621_number_of_sets_of_k_non_overlapping_line_segments/Solution.java)| Medium | Dynamic_Programming, Math | 16 | 94.74
| 1620 |[Coordinate With Maximum Network Quality](src.save/main/java/g1601_1700/s1620_coordinate_with_maximum_network_quality/Solution.java)| Medium | Array, Enumeration | 58 | 68.75
| 1619 |[Mean of Array After Removing Some Elements](src.save/main/java/g1601_1700/s1619_mean_of_array_after_removing_some_elements/Solution.java)| Easy | Array, Sorting | 2 | 99.81
| 1617 |[Count Subtrees With Max Distance Between Cities](src.save/main/java/g1601_1700/s1617_count_subtrees_with_max_distance_between_cities/Solution.java)| Hard | Dynamic_Programming, Tree, Bit_Manipulation, Bitmask, Enumeration | 52 | 78.95
| 1616 |[Split Two Strings to Make Palindrome](src.save/main/java/g1601_1700/s1616_split_two_strings_to_make_palindrome/Solution.java)| Medium | String, Greedy, Two_Pointers | 4 | 89.77
| 1615 |[Maximal Network Rank](src.save/main/java/g1601_1700/s1615_maximal_network_rank/Solution.java)| Medium | Graph, Graph_Theory_I_Day_14_Graph_Theory | 3 | 97.34
| 1614 |[Maximum Nesting Depth of the Parentheses](src.save/main/java/g1601_1700/s1614_maximum_nesting_depth_of_the_parentheses/Solution.java)| Easy | String, Stack | 1 | 80.44
| 1611 |[Minimum One Bit Operations to Make Integers Zero](src.save/main/java/g1601_1700/s1611_minimum_one_bit_operations_to_make_integers_zero/Solution.java)| Hard | Dynamic_Programming, Bit_Manipulation, Memoization | 1 | 88.24
| 1610 |[Maximum Number of Visible Points](src.save/main/java/g1601_1700/s1610_maximum_number_of_visible_points/Solution.java)| Hard | Array, Math, Sorting, Sliding_Window, Geometry | 122 | 97.44
| 1609 |[Even Odd Tree](src.save/main/java/g1601_1700/s1609_even_odd_tree/Solution.java)| Medium | Breadth_First_Search, Tree, Binary_Tree | 8 | 98.81
| 1608 |[Special Array With X Elements Greater Than or Equal X](src.save/main/java/g1601_1700/s1608_special_array_with_x_elements_greater_than_or_equal_x/Solution.java)| Easy | Array, Sorting, Binary_Search, Binary_Search_I_Day_7 | 2 | 61.14
| 1606 |[Find Servers That Handled Most Number of Requests](src.save/main/java/g1601_1700/s1606_find_servers_that_handled_most_number_of_requests/Solution.java)| Hard | Array, Greedy, Heap_Priority_Queue, Ordered_Set | 118 | 98.21
| 1605 |[Find Valid Matrix Given Row and Column Sums](src.save/main/java/g1601_1700/s1605_find_valid_matrix_given_row_and_column_sums/Solution.java)| Medium | Array, Greedy, Matrix | 2 | 98.45
| 1604 |[Alert Using Same Key-Card Three or More Times in a One Hour Period](src.save/main/java/g1601_1700/s1604_alert_using_same_key_card_three_or_more_times_in_a_one_hour_period/Solution.java)| Medium | Array, String, Hash_Table, Sorting | 77 | 95.79
| 1603 |[Design Parking System](src.save/main/java/g1601_1700/s1603_design_parking_system/ParkingSystem.java)| Easy | Design, Simulation, Counting, Programming_Skills_I_Day_12_Class_and_Object | 8 | 76.16
| 1601 |[Maximum Number of Achievable Transfer Requests](src.save/main/java/g1601_1700/s1601_maximum_number_of_achievable_transfer_requests/Solution.java)| Hard | Array, Bit_Manipulation, Backtracking, Enumeration | 26 | 84.02
| 1600 |[Throne Inheritance](src.save/main/java/g1501_1600/s1600_throne_inheritance/ThroneInheritance.java)| Medium | Hash_Table, Depth_First_Search, Tree, Design | 267 | 90.38
| 1599 |[Maximum Profit of Operating a Centennial Wheel](src.save/main/java/g1501_1600/s1599_maximum_profit_of_operating_a_centennial_wheel/Solution.java)| Medium | Array, Simulation | 4 | 95.65
| 1598 |[Crawler Log Folder](src.save/main/java/g1501_1600/s1598_crawler_log_folder/Solution.java)| Easy | Array, String, Stack | 0 | 100.00
| 1595 |[Minimum Cost to Connect Two Groups of Points](src.save/main/java/g1501_1600/s1595_minimum_cost_to_connect_two_groups_of_points/Solution.java)| Hard | Array, Dynamic_Programming, Matrix, Bit_Manipulation, Bitmask | 74 | 64.83
| 1594 |[Maximum Non Negative Product in a Matrix](src.save/main/java/g1501_1600/s1594_maximum_non_negative_product_in_a_matrix/Solution.java)| Medium | Array, Dynamic_Programming, Matrix | 1 | 100.00
| 1593 |[Split a String Into the Max Number of Unique Substrings](src.save/main/java/g1501_1600/s1593_split_a_string_into_the_max_number_of_unique_substrings/Solution.java)| Medium | String, Hash_Table, Backtracking | 8 | 95.81
| 1592 |[Rearrange Spaces Between Words](src.save/main/java/g1501_1600/s1592_rearrange_spaces_between_words/Solution.java)| Easy | String | 3 | 67.74
| 1591 |[Strange Printer II](src.save/main/java/g1501_1600/s1591_strange_printer_ii/Solution.java)| Hard | Array, Matrix, Graph, Topological_Sort | 12 | 90.00
| 1590 |[Make Sum Divisible by P](src.save/main/java/g1501_1600/s1590_make_sum_divisible_by_p/Solution.java)| Medium | Array, Hash_Table, Prefix_Sum | 56 | 62.20
| 1589 |[Maximum Sum Obtained of Any Permutation](src.save/main/java/g1501_1600/s1589_maximum_sum_obtained_of_any_permutation/Solution.java)| Medium | Array, Sorting, Greedy, Prefix_Sum | 25 | 92.45
| 1588 |[Sum of All Odd Length Subarrays](src.save/main/java/g1501_1600/s1588_sum_of_all_odd_length_subarrays/Solution.java)| Easy | Array, Math, Prefix_Sum, Programming_Skills_I_Day_6_Array | 0 | 100.00
| 1587 |[Bank Account Summary II](src.save/main/java/g1501_1600/s1587_bank_account_summary_ii/script.sql)| Easy | Database, SQL_I_Day_10_Where | 630 | 60.32
| 1585 |[Check If String Is Transformable With Substring Sort Operations](src.save/main/java/g1501_1600/s1585_check_if_string_is_transformable_with_substring_sort_operations/Solution.java)| Hard | String, Sorting, Greedy | 20 | 97.22
| 1584 |[Min Cost to Connect All Points](src.save/main/java/g1501_1600/s1584_min_cost_to_connect_all_points/Solution.java)| Medium | Array, Union_Find, Minimum_Spanning_Tree | 134 | 87.37
| 1583 |[Count Unhappy Friends](src.save/main/java/g1501_1600/s1583_count_unhappy_friends/Solution.java)| Medium | Array, Simulation | 3 | 93.13
| 1582 |[Special Positions in a Binary Matrix](src.save/main/java/g1501_1600/s1582_special_positions_in_a_binary_matrix/Solution.java)| Easy | Array, Matrix | 2 | 82.12
| 1581 |[Customer Who Visited but Did Not Make Any Transactions](src.save/main/java/g1501_1600/s1581_customer_who_visited_but_did_not_make_any_transactions/script.sql)| Easy | Database, SQL_I_Day_5_Union | 1039 | 76.99
| 1579 |[Remove Max Number of Edges to Keep Graph Fully Traversable](src.save/main/java/g1501_1600/s1579_remove_max_number_of_edges_to_keep_graph_fully_traversable/Solution.java)| Hard | Graph, Union_Find | 30 | 66.23
| 1578 |[Minimum Time to Make Rope Colorful](src.save/main/java/g1501_1600/s1578_minimum_time_to_make_rope_colorful/Solution.java)| Medium | Array, String, Dynamic_Programming, Greedy | 4 | 100.00
| 1577 |[Number of Ways Where Square of Number Is Equal to Product of Two Numbers](src.save/main/java/g1501_1600/s1577_number_of_ways_where_square_of_number_is_equal_to_product_of_two_numbers/Solution.java)| Medium | Array, Hash_Table, Math, Two_Pointers | 20 | 86.27
| 1576 |[Replace All ?'s to Avoid Consecutive Repeating Characters](src.save/main/java/g1501_1600/s1576_replace_all_s_to_avoid_consecutive_repeating_characters/Solution.java)| Easy | String | 2 | 82.74
| 1575 |[Count All Possible Routes](src.save/main/java/g1501_1600/s1575_count_all_possible_routes/Solution.java)| Hard | Array, Dynamic_Programming, Memoization | 111 | 72.26
| 1574 |[Shortest Subarray to be Removed to Make Array Sorted](src.save/main/java/g1501_1600/s1574_shortest_subarray_to_be_removed_to_make_array_sorted/Solution.java)| Medium | Array, Binary_Search, Two_Pointers, Stack, Monotonic_Stack, Binary_Search_II_Day_14 | 2 | 84.97
| 1573 |[Number of Ways to Split a String](src.save/main/java/g1501_1600/s1573_number_of_ways_to_split_a_string/Solution.java)| Medium | String, Math | 9 | 82.09
| 1572 |[Matrix Diagonal Sum](src.save/main/java/g1501_1600/s1572_matrix_diagonal_sum/Solution.java)| Easy | Array, Matrix, Programming_Skills_I_Day_7_Array | 3 | 10.25
| 1569 |[Number of Ways to Reorder Array to Get Same BST](src.save/main/java/g1501_1600/s1569_number_of_ways_to_reorder_array_to_get_same_bst/Solution.java)| Hard | Array, Dynamic_Programming, Math, Tree, Binary_Tree, Union_Find, Binary_Search_Tree, Divide_and_Conquer, Memoization, Combinatorics | 21 | 97.44
| 1568 |[Minimum Number of Days to Disconnect Island](src.save/main/java/g1501_1600/s1568_minimum_number_of_days_to_disconnect_island/Solution.java)| Hard | Array, Depth_First_Search, Breadth_First_Search, Matrix, Strongly_Connected_Component | 1 | 100.00
| 1567 |[Maximum Length of Subarray With Positive Product](src.save/main/java/g1501_1600/s1567_maximum_length_of_subarray_with_positive_product/Solution.java)| Medium | Array, Dynamic_Programming, Greedy, Dynamic_Programming_I_Day_6 | 4 | 80.86
| 1566 |[Detect Pattern of Length M Repeated K or More Times](src.save/main/java/g1501_1600/s1566_detect_pattern_of_length_m_repeated_k_or_more_times/Solution.java)| Easy | Array, Enumeration | 1 | 49.25
| 1563 |[Stone Game V](src.save/main/java/g1501_1600/s1563_stone_game_v/Solution.java)| Hard | Array, Dynamic_Programming, Math, Game_Theory | 36 | 95.56
| 1562 |[Find Latest Group of Size M](src.save/main/java/g1501_1600/s1562_find_latest_group_of_size_m/Solution.java)| Medium | Array, Binary_Search, Simulation, Binary_Search_II_Day_19 | 8 | 90.00
| 1561 |[Maximum Number of Coins You Can Get](src.save/main/java/g1501_1600/s1561_maximum_number_of_coins_you_can_get/Solution.java)| Medium | Array, Math, Sorting, Greedy, Game_Theory | 34 | 69.29
| 1560 |[Most Visited Sector in a Circular Track](src.save/main/java/g1501_1600/s1560_most_visited_sector_in_a_circular_track/Solution.java)| Easy | Array, Simulation | 1 | 88.89
| 1559 |[Detect Cycles in 2D Grid](src.save/main/java/g1501_1600/s1559_detect_cycles_in_2d_grid/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 22 | 82.51
| 1558 |[Minimum Numbers of Function Calls to Make Target Array](src.save/main/java/g1501_1600/s1558_minimum_numbers_of_function_calls_to_make_target_array/Solution.java)| Medium | Array, Greedy | 42 | 69.17
| 1557 |[Minimum Number of Vertices to Reach All Nodes](src.save/main/java/g1501_1600/s1557_minimum_number_of_vertices_to_reach_all_nodes/Solution.java)| Medium | Graph, Data_Structure_II_Day_19_Graph, Graph_Theory_I_Day_13_Graph_Theory | 8 | 99.94
| 1556 |[Thousand Separator](src.save/main/java/g1501_1600/s1556_thousand_separator/Solution.java)| Easy | String | 1 | 57.92
| 1553 |[Minimum Number of Days to Eat N Oranges](src.save/main/java/g1501_1600/s1553_minimum_number_of_days_to_eat_n_oranges/Solution.java)| Hard | Dynamic_Programming, Memoization | 5 | 91.90
| 1552 |[Magnetic Force Between Two Balls](src.save/main/java/g1501_1600/s1552_magnetic_force_between_two_balls/Solution.java)| Medium | Array, Sorting, Binary_Search, Binary_Search_II_Day_4 | 39 | 99.65
| 1551 |[Minimum Operations to Make Array Equal](src.save/main/java/g1501_1600/s1551_minimum_operations_to_make_array_equal/Solution.java)| Medium | Math | 7 | 12.93
| 1550 |[Three Consecutive Odds](src.save/main/java/g1501_1600/s1550_three_consecutive_odds/Solution.java)| Easy | Array | 0 | 100.00
| 1547 |[Minimum Cost to Cut a Stick](src.save/main/java/g1501_1600/s1547_minimum_cost_to_cut_a_stick/Solution.java)| Hard | Array, Dynamic_Programming | 6 | 100.00
| 1546 |[Maximum Number of Non-Overlapping Subarrays With Sum Equals Target](src.save/main/java/g1501_1600/s1546_maximum_number_of_non_overlapping_subarrays_with_sum_equals_target/Solution.java)| Medium | Array, Hash_Table, Greedy, Prefix_Sum | 56 | 71.58
| 1545 |[Find Kth Bit in Nth Binary String](src.save/main/java/g1501_1600/s1545_find_kth_bit_in_nth_binary_string/Solution.java)| Medium | String, Recursion | 0 | 100.00
| 1544 |[Make The String Great](src.save/main/java/g1501_1600/s1544_make_the_string_great/Solution.java)| Easy | String, Stack | 6 | 50.00
| 1542 |[Find Longest Awesome Substring](src.save/main/java/g1501_1600/s1542_find_longest_awesome_substring/Solution.java)| Hard | String, Hash_Table, Bit_Manipulation | 12 | 84.16
| 1541 |[Minimum Insertions to Balance a Parentheses String](src.save/main/java/g1501_1600/s1541_minimum_insertions_to_balance_a_parentheses_string/Solution.java)| Medium | String, Greedy, Stack | 12 | 85.50
| 1540 |[Can Convert String in K Moves](src.save/main/java/g1501_1600/s1540_can_convert_string_in_k_moves/Solution.java)| Medium | String, Hash_Table | 10 | 100.00
| 1539 |[Kth Missing Positive Number](src.save/main/java/g1501_1600/s1539_kth_missing_positive_number/Solution.java)| Easy | Array, Binary_Search, Binary_Search_I_Day_6 | 0 | 100.00
| 1537 |[Get the Maximum Score](src.save/main/java/g1501_1600/s1537_get_the_maximum_score/Solution.java)| Hard | Array, Dynamic_Programming, Greedy, Two_Pointers | 6 | 58.14
| 1536 |[Minimum Swaps to Arrange a Binary Grid](src.save/main/java/g1501_1600/s1536_minimum_swaps_to_arrange_a_binary_grid/Solution.java)| Medium | Array, Greedy, Matrix | 1 | 100.00
| 1535 |[Find the Winner of an Array Game](src.save/main/java/g1501_1600/s1535_find_the_winner_of_an_array_game/Solution.java)| Medium | Array, Simulation | 1 | 86.99
| 1534 |[Count Good Triplets](src.save/main/java/g1501_1600/s1534_count_good_triplets/Solution.java)| Easy | Array, Enumeration | 14 | 82.96
| 1531 |[String Compression II](src.save/main/java/g1501_1600/s1531_string_compression_ii/Solution.java)| Hard | String, Dynamic_Programming | 34 | 83.91
| 1530 |[Number of Good Leaf Nodes Pairs](src.save/main/java/g1501_1600/s1530_number_of_good_leaf_nodes_pairs/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 3 | 94.18
| 1529 |[Minimum Suffix Flips](src.save/main/java/g1501_1600/s1529_bulb_switcher_iv/Solution.java)| Medium | String, Greedy | 6 | 89.67
| 1528 |[Shuffle String](src.save/main/java/g1501_1600/s1528_shuffle_string/Solution.java)| Easy | Array, String | 2 | 54.77
| 1527 |[Patients With a Condition](src.save/main/java/g1501_1600/s1527_patients_with_a_condition/script.sql)| Easy | Database, SQL_I_Day_3_String_Processing_Functions | 308 | 66.93
| 1526 |[Minimum Number of Increments on Subarrays to Form a Target Array](src.save/main/java/g1501_1600/s1526_minimum_number_of_increments_on_subarrays_to_form_a_target_array/Solution.java)| Hard | Array, Dynamic_Programming, Greedy, Stack, Monotonic_Stack | 4 | 70.36
| 1525 |[Number of Good Ways to Split a String](src.save/main/java/g1501_1600/s1525_number_of_good_ways_to_split_a_string/Solution.java)| Medium | String, Dynamic_Programming, Bit_Manipulation | 19 | 69.66
| 1524 |[Number of Sub-arrays With Odd Sum](src.save/main/java/g1501_1600/s1524_number_of_sub_arrays_with_odd_sum/Solution.java)| Medium | Array, Dynamic_Programming, Math, Prefix_Sum | 9 | 90.24
| 1523 |[Count Odd Numbers in an Interval Range](src.save/main/java/g1501_1600/s1523_count_odd_numbers_in_an_interval_range/Solution.java)| Easy | Math, Programming_Skills_I_Day_1_Basic_Data_Type | 0 | 100.00
| 1521 |[Find a Value of a Mysterious Function Closest to Target](src.save/main/java/g1501_1600/s1521_find_a_value_of_a_mysterious_function_closest_to_target/Solution.java)| Hard | Array, Binary_Search, Bit_Manipulation, Segment_Tree | 9 | 100.00
| 1520 |[Maximum Number of Non-Overlapping Substrings](src.save/main/java/g1501_1600/s1520_maximum_number_of_non_overlapping_substrings/Solution.java)| Hard | String, Greedy | 15 | 92.93
| 1519 |[Number of Nodes in the Sub-Tree With the Same Label](src.save/main/java/g1501_1600/s1519_number_of_nodes_in_the_sub_tree_with_the_same_label/Solution.java)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Counting | 60 | 98.13
| 1518 |[Water Bottles](src.save/main/java/g1501_1600/s1518_water_bottles/Solution.java)| Easy | Math, Simulation | 0 | 100.00
| 1515 |[Best Position for a Service Centre](src.save/main/java/g1501_1600/s1515_best_position_for_a_service_centre/Solution.java)| Hard | Math, Geometry, Randomized | 6 | 87.14
| 1514 |[Path with Maximum Probability](src.save/main/java/g1501_1600/s1514_path_with_maximum_probability/Solution.java)| Medium | Heap_Priority_Queue, Graph, Shortest_Path | 31 | 93.10
| 1513 |[Number of Substrings With Only 1s](src.save/main/java/g1501_1600/s1513_number_of_substrings_with_only_1s/Solution.java)| Medium | String, Math | 3 | 97.83
| 1512 |[Number of Good Pairs](src.save/main/java/g1501_1600/s1512_number_of_good_pairs/Solution.java)| Easy | Array, Hash_Table, Math, Counting | 1 | 84.97
| 1510 |[Stone Game IV](src.save/main/java/g1501_1600/s1510_stone_game_iv/Solution.java)| Hard | Dynamic_Programming, Math, Game_Theory | 12 | 85.75
| 1509 |[Minimum Difference Between Largest and Smallest Value in Three Moves](src.save/main/java/g1501_1600/s1509_minimum_difference_between_largest_and_smallest_value_in_three_moves/Solution.java)| Medium | Array, Sorting, Greedy | 19 | 76.94
| 1508 |[Range Sum of Sorted Subarray Sums](src.save/main/java/g1501_1600/s1508_range_sum_of_sorted_subarray_sums/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Binary_Search_II_Day_14 | 60 | 93.84
| 1507 |[Reformat Date](src.save/main/java/g1501_1600/s1507_reformat_date/Solution.java)| Easy | String | 1 | 98.73
| 1505 |[Minimum Possible Integer After at Most K Adjacent Swaps On Digits](src.save/main/java/g1501_1600/s1505_minimum_possible_integer_after_at_most_k_adjacent_swaps_on_digits/Solution.java)| Hard | String, Greedy, Segment_Tree, Binary_Indexed_Tree | 12 | 96.77
| 1504 |[Count Submatrices With All Ones](src.save/main/java/g1501_1600/s1504_count_submatrices_with_all_ones/Solution.java)| Medium | Array, Dynamic_Programming, Matrix, Stack, Monotonic_Stack | 9 | 85.86
| 1503 |[Last Moment Before All Ants Fall Out of a Plank](src.save/main/java/g1501_1600/s1503_last_moment_before_all_ants_fall_out_of_a_plank/Solution.java)| Medium | Array, Simulation, Brainteaser | 1 | 81.72
| 1502 |[Can Make Arithmetic Progression From Sequence](src.save/main/java/g1501_1600/s1502_can_make_arithmetic_progression_from_sequence/Solution.java)| Easy | Array, Sorting, Programming_Skills_I_Day_4_Loop | 4 | 14.13
| 1499 |[Max Value of Equation](src.save/main/java/g1401_1500/s1499_max_value_of_equation/Solution.java)| Hard | Array, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue | 7 | 98.61
| 1498 |[Number of Subsequences That Satisfy the Given Sum Condition](src.save/main/java/g1401_1500/s1498_number_of_subsequences_that_satisfy_the_given_sum_condition/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Binary_Search_II_Day_15 | 27 | 99.13
| 1497 |[Check If Array Pairs Are Divisible by k](src.save/main/java/g1401_1500/s1497_check_if_array_pairs_are_divisible_by_k/Solution.java)| Medium | Array, Hash_Table, Counting | 7 | 97.44
| 1496 |[Path Crossing](src.save/main/java/g1401_1500/s1496_path_crossing/Solution.java)| Easy | String, Hash_Table | 1 | 97.41
| 1494 |[Parallel Courses II](src.save/main/java/g1401_1500/s1494_parallel_courses_ii/Solution.java)| Hard | Dynamic_Programming, Bit_Manipulation, Graph, Bitmask | 325 | 42.24
| 1493 |[Longest Subarray of 1's After Deleting One Element](src.save/main/java/g1401_1500/s1493_longest_subarray_of_1s_after_deleting_one_element/Solution.java)| Medium | Dynamic_Programming, Math, Sliding_Window | 2 | 87.25
| 1492 |[The kth Factor of n](src.save/main/java/g1401_1500/s1492_the_kth_factor_of_n/Solution.java)| Medium | Math | 1 | 83.94
| 1491 |[Average Salary Excluding the Minimum and Maximum Salary](src.save/main/java/g1401_1500/s1491_average_salary_excluding_the_minimum_and_maximum_salary/Solution.java)| Easy | Array, Sorting, Programming_Skills_I_Day_1_Basic_Data_Type | 0 | 100.00
| 1489 |[Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree](src.save/main/java/g1401_1500/s1489_find_critical_and_pseudo_critical_edges_in_minimum_spanning_tree/Solution.java)| Hard | Sorting, Graph, Union_Find, Minimum_Spanning_Tree, Strongly_Connected_Component | 17 | 100.00
| 1488 |[Avoid Flood in The City](src.save/main/java/g1401_1500/s1488_avoid_flood_in_the_city/Solution.java)| Medium | Array, Hash_Table, Greedy, Binary_Search, Heap_Priority_Queue, Binary_Search_II_Day_18 | 82 | 75.08
| 1487 |[Making File Names Unique](src.save/main/java/g1401_1500/s1487_making_file_names_unique/Solution.java)| Medium | Array, String, Hash_Table | 36 | 98.46
| 1486 |[XOR Operation in an Array](src.save/main/java/g1401_1500/s1486_xor_operation_in_an_array/Solution.java)| Easy | Math, Bit_Manipulation | 0 | 100.00
| 1484 |[Group Sold Products By The Date](src.save/main/java/g1401_1500/s1484_group_sold_products_by_the_date/script.sql)| Easy | Database, SQL_I_Day_3_String_Processing_Functions | 395 | 77.20
| 1483 |[Kth Ancestor of a Tree Node](src.save/main/java/g1401_1500/s1483_kth_ancestor_of_a_tree_node/TreeAncestor.java)| Hard | Dynamic_Programming, Depth_First_Search, Breadth_First_Search, Tree, Binary_Search, Design | 60 | 93.28
| 1482 |[Minimum Number of Days to Make m Bouquets](src.save/main/java/g1401_1500/s1482_minimum_number_of_days_to_make_m_bouquets/Solution.java)| Medium | Array, Binary_Search, Binary_Search_II_Day_7 | 25 | 69.18
| 1481 |[Least Number of Unique Integers after K Removals](src.save/main/java/g1401_1500/s1481_least_number_of_unique_integers_after_k_removals/Solution.java)| Medium | Array, Hash_Table, Sorting, Greedy, Counting | 62 | 85.33
| 1480 |[Running Sum of 1d Array](src.save/main/java/g1401_1500/s1480_running_sum_of_1d_array/Solution.java)| Easy | Array, Prefix_Sum | 0 | 100.00
| 1478 |[Allocate Mailboxes](src.save/main/java/g1401_1500/s1478_allocate_mailboxes/Solution.java)| Hard | Array, Dynamic_Programming, Math, Sorting | 12 | 78.87
| 1477 |[Find Two Non-overlapping Sub-arrays Each With Target Sum](src.save/main/java/g1401_1500/s1477_find_two_non_overlapping_sub_arrays_each_with_target_sum/Solution.java)| Medium | Array, Hash_Table, Dynamic_Programming, Binary_Search, Sliding_Window | 8 | 89.43
| 1476 |[Subrectangle Queries](src.save/main/java/g1401_1500/s1476_subrectangle_queries/SubrectangleQueries.java)| Medium | Array, Matrix, Design | 20 | 97.61
| 1475 |[Final Prices With a Special Discount in a Shop](src.save/main/java/g1401_1500/s1475_final_prices_with_a_special_discount_in_a_shop/Solution.java)| Easy | Array, Stack, Monotonic_Stack | 2 | 80.33
| 1473 |[Paint House III](src.save/main/java/g1401_1500/s1473_paint_house_iii/Solution.java)| Hard | Array, Dynamic_Programming | 26 | 89.13
| 1472 |[Design Browser History](src.save/main/java/g1401_1500/s1472_design_browser_history/BrowserHistory.java)| Medium | Array, Stack, Design, Linked_List, Data_Stream, Doubly_Linked_List | 76 | 82.33
| 1471 |[The k Strongest Values in an Array](src.save/main/java/g1401_1500/s1471_the_k_strongest_values_in_an_array/Solution.java)| Medium | Array, Sorting, Two_Pointers | 37 | 88.20
| 1470 |[Shuffle the Array](src.save/main/java/g1401_1500/s1470_shuffle_the_array/Solution.java)| Easy | Array | 1 | 51.62
| 1467 |[Probability of a Two Boxes Having The Same Number of Distinct Balls](src.save/main/java/g1401_1500/s1467_probability_of_a_two_boxes_having_the_same_number_of_distinct_balls/Solution.java)| Hard | Dynamic_Programming, Math, Backtracking, Combinatorics, Probability_and_Statistics | 1 | 100.00
| 1466 |[Reorder Routes to Make All Paths Lead to the City Zero](src.save/main/java/g1401_1500/s1466_reorder_routes_to_make_all_paths_lead_to_the_city_zero/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Graph_Theory_I_Day_10_Standard_Traversal | 39 | 97.71
| 1465 |[Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts](src.save/main/java/g1401_1500/s1465_maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts/Solution.java)| Medium | Array, Sorting, Greedy | 21 | 35.40
| 1464 |[Maximum Product of Two Elements in an Array](src.save/main/java/g1401_1500/s1464_maximum_product_of_two_elements_in_an_array/Solution.java)| Easy | Array, Sorting, Heap_Priority_Queue | 1 | 90.39
| 1463 |[Cherry Pickup II](src.save/main/java/g1401_1500/s1463_cherry_pickup_ii/Solution.java)| Hard | Array, Dynamic_Programming, Matrix | 10 | 99.58
| 1462 |[Course Schedule IV](src.save/main/java/g1401_1500/s1462_course_schedule_iv/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 10 | 100.00
| 1461 |[Check If a String Contains All Binary Codes of Size K](src.save/main/java/g1401_1500/s1461_check_if_a_string_contains_all_binary_codes_of_size_k/Solution.java)| Medium | String, Hash_Table, Bit_Manipulation, Hash_Function, Rolling_Hash | 169 | 52.07
| 1460 |[Make Two Arrays Equal by Reversing Sub-arrays](src.save/main/java/g1401_1500/s1460_make_two_arrays_equal_by_reversing_sub_arrays/Solution.java)| Easy | Array, Hash_Table, Sorting | 13 | 14.65
| 1458 |[Max Dot Product of Two Subsequences](src.save/main/java/g1401_1500/s1458_max_dot_product_of_two_subsequences/Solution.java)| Hard | Array, Dynamic_Programming | 6 | 98.36
| 1457 |[Pseudo-Palindromic Paths in a Binary Tree](src.save/main/java/g1401_1500/s1457_pseudo_palindromic_paths_in_a_binary_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Bit_Manipulation | 35 | 43.73
| 1456 |[Maximum Number of Vowels in a Substring of Given Length](src.save/main/java/g1401_1500/s1456_maximum_number_of_vowels_in_a_substring_of_given_length/Solution.java)| Medium | String, Sliding_Window | 19 | 53.73
| 1455 |[Check If a Word Occurs As a Prefix of Any Word in a Sentence](src.save/main/java/g1401_1500/s1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence/Solution.java)| Easy | String, String_Matching | 1 | 32.08
| 1453 |[Maximum Number of Darts Inside of a Circular Dartboard](src.save/main/java/g1401_1500/s1453_maximum_number_of_darts_inside_of_a_circular_dartboard/Solution.java)| Hard | Array, Math, Geometry | 22 | 100.00
| 1452 |[People Whose List of Favorite Companies Is Not a Subset of Another List](src.save/main/java/g1401_1500/s1452_people_whose_list_of_favorite_companies_is_not_a_subset_of_another_list/Solution.java)| Medium | Array, String, Hash_Table | 117 | 78.71
| 1451 |[Rearrange Words in a Sentence](src.save/main/java/g1401_1500/s1451_rearrange_words_in_a_sentence/Solution.java)| Medium | String, Sorting | 21 | 89.94
| 1450 |[Number of Students Doing Homework at a Given Time](src.save/main/java/g1401_1500/s1450_number_of_students_doing_homework_at_a_given_time/Solution.java)| Easy | Array | 0 | 100.00
| 1449 |[Form Largest Integer With Digits That Add up to Target](src.save/main/java/g1401_1500/s1449_form_largest_integer_with_digits_that_add_up_to_target/Solution.java)| Hard | Array, Dynamic_Programming | 8 | 77.46
| 1448 |[Count Good Nodes in Binary Tree](src.save/main/java/g1401_1500/s1448_count_good_nodes_in_binary_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 2 | 99.63
| 1447 |[Simplified Fractions](src.save/main/java/g1401_1500/s1447_simplified_fractions/Solution.java)| Medium | String, Math, Number_Theory | 33 | 69.60
| 1446 |[Consecutive Characters](src.save/main/java/g1401_1500/s1446_consecutive_characters/Solution.java)| Easy | String | 3 | 30.50
| 1444 |[Number of Ways of Cutting a Pizza](src.save/main/java/g1401_1500/s1444_number_of_ways_of_cutting_a_pizza/Solution.java)| Hard | Array, Dynamic_Programming, Matrix, Memoization | 14 | 46.03
| 1443 |[Minimum Time to Collect All Apples in a Tree](src.save/main/java/g1401_1500/s1443_minimum_time_to_collect_all_apples_in_a_tree/Solution.java)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree | 75 | 57.75
| 1442 |[Count Triplets That Can Form Two Arrays of Equal XOR](src.save/main/java/g1401_1500/s1442_count_triplets_that_can_form_two_arrays_of_equal_xor/Solution.java)| Medium | Array, Hash_Table, Math, Bit_Manipulation, Prefix_Sum | 2 | 79.80
| 1441 |[Build an Array With Stack Operations](src.save/main/java/g1401_1500/s1441_build_an_array_with_stack_operations/Solution.java)| Easy | Array, Stack, Simulation | 1 | 38.47
| 1439 |[Find the Kth Smallest Sum of a Matrix With Sorted Rows](src.save/main/java/g1401_1500/s1439_find_the_kth_smallest_sum_of_a_matrix_with_sorted_rows/Solution.java)| Hard | Array, Binary_Search, Matrix, Heap_Priority_Queue | 40 | 75.79
| 1438 |[Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit](src.save/main/java/g1401_1500/s1438_longest_continuous_subarray_with_absolute_diff_less_than_or_equal_to_limit/Solution.java)| Medium | Array, Heap_Priority_Queue, Sliding_Window, Ordered_Set, Queue, Monotonic_Queue | 38 | 81.86
| 1437 |[Check If All 1's Are at Least Length K Places Away](src.save/main/java/g1401_1500/s1437_check_if_all_1s_are_at_least_length_k_places_away/Solution.java)| Easy | Array | 2 | 73.75
| 1436 |[Destination City](src.save/main/java/g1401_1500/s1436_destination_city/Solution.java)| Easy | String, Hash_Table | 7 | 11.79
| 1434 |[Number of Ways to Wear Different Hats to Each Other](src.save/main/java/g1401_1500/s1434_number_of_ways_to_wear_different_hats_to_each_other/Solution.java)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Bitmask | 31 | 77.92
| 1433 |[Check If a String Can Break Another String](src.save/main/java/g1401_1500/s1433_check_if_a_string_can_break_another_string/Solution.java)| Medium | String, Sorting, Greedy | 9 | 77.89
| 1432 |[Max Difference You Can Get From Changing an Integer](src.save/main/java/g1401_1500/s1432_max_difference_you_can_get_from_changing_an_integer/Solution.java)| Medium | Math, Greedy | 1 | 97.22
| 1431 |[Kids With the Greatest Number of Candies](src.save/main/java/g1401_1500/s1431_kids_with_the_greatest_number_of_candies/Solution.java)| Easy | Array | 1 | 84.43
| 1425 |[Constrained Subsequence Sum](src.save/main/java/g1401_1500/s1425_constrained_subsequence_sum/Solution.java)| Hard | Array, Dynamic_Programming, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue | 69 | 30.52
| 1424 |[Diagonal Traverse II](src.save/main/java/g1401_1500/s1424_diagonal_traverse_ii/Solution.java)| Medium | Array, Sorting, Heap_Priority_Queue | 39 | 85.56
| 1423 |[Maximum Points You Can Obtain from Cards](src.save/main/java/g1401_1500/s1423_maximum_points_you_can_obtain_from_cards/Solution.java)| Medium | Array, Prefix_Sum, Sliding_Window | 4 | 31.70
| 1422 |[Maximum Score After Splitting a String](src.save/main/java/g1401_1500/s1422_maximum_score_after_splitting_a_string/Solution.java)| Easy | String | 1 | 96.45
| 1420 |[Build Array Where You Can Find The Maximum Exactly K Comparisons](src.save/main/java/g1401_1500/s1420_build_array_where_you_can_find_the_maximum_exactly_k_comparisons/Solution.java)| Hard | Dynamic_Programming | 22 | 86.32
| 1419 |[Minimum Number of Frogs Croaking](src.save/main/java/g1401_1500/s1419_minimum_number_of_frogs_croaking/Solution.java)| Medium | String, Counting | 19 | 32.16
| 1418 |[Display Table of Food Orders in a Restaurant](src.save/main/java/g1401_1500/s1418_display_table_of_food_orders_in_a_restaurant/Solution.java)| Medium | Array, String, Hash_Table, Sorting, Ordered_Set | 42 | 77.01
| 1417 |[Reformat The String](src.save/main/java/g1401_1500/s1417_reformat_the_string/Solution.java)| Easy | String | 4 | 88.39
| 1416 |[Restore The Array](src.save/main/java/g1401_1500/s1416_restore_the_array/Solution.java)| Hard | String, Dynamic_Programming | 34 | 100.00
| 1415 |[The k-th Lexicographical String of All Happy Strings of Length n](src.save/main/java/g1401_1500/s1415_the_k_th_lexicographical_string_of_all_happy_strings_of_length_n/Solution.java)| Medium | String, Backtracking | 2 | 90.55
| 1414 |[Find the Minimum Number of Fibonacci Numbers Whose Sum Is K](src.save/main/java/g1401_1500/s1414_find_the_minimum_number_of_fibonacci_numbers_whose_sum_is_k/Solution.java)| Medium | Greedy | 2 | 67.22
| 1413 |[Minimum Value to Get Positive Step by Step Sum](src.save/main/java/g1401_1500/s1413_minimum_value_to_get_positive_step_by_step_sum/Solution.java)| Easy | Array, Prefix_Sum | 0 | 100.00
| 1411 |[Number of Ways to Paint N × 3 Grid](src.save/main/java/g1401_1500/s1411_number_of_ways_to_paint_n_3_grid/Solution.java)| Hard | Dynamic_Programming | 14 | 34.91
| 1410 |[HTML Entity Parser](src.save/main/java/g1401_1500/s1410_html_entity_parser/Solution.java)| Medium | String, Hash_Table | 19 | 98.92
| 1409 |[Queries on a Permutation With Key](src.save/main/java/g1401_1500/s1409_queries_on_a_permutation_with_key/Solution.java)| Medium | Array, Simulation, Binary_Indexed_Tree | 15 | 38.43
| 1408 |[String Matching in an Array](src.save/main/java/g1401_1500/s1408_string_matching_in_an_array/Solution.java)| Easy | String, String_Matching | 8 | 24.88
| 1407 |[Top Travellers](src.save/main/java/g1401_1500/s1407_top_travellers/script.sql)| Easy | Database, SQL_I_Day_9_Control_of_Flow | 682 | 70.16
| 1406 |[Stone Game III](src.save/main/java/g1401_1500/s1406_stone_game_iii/Solution.java)| Hard | Array, Dynamic_Programming, Math, Game_Theory | 14 | 82.02
| 1405 |[Longest Happy String](src.save/main/java/g1401_1500/s1405_longest_happy_string/Solution.java)| Medium | String, Greedy, Heap_Priority_Queue | 0 | 100.00
| 1404 |[Number of Steps to Reduce a Number in Binary Representation to One](src.save/main/java/g1401_1500/s1404_number_of_steps_to_reduce_a_number_in_binary_representation_to_one/Solution.java)| Medium | String, Bit_Manipulation | 1 | 62.90
| 1403 |[Minimum Subsequence in Non-Increasing Order](src.save/main/java/g1401_1500/s1403_minimum_subsequence_in_non_increasing_order/Solution.java)| Easy | Array, Sorting, Greedy | 4 | 79.60
| 1402 |[Reducing Dishes](src.save/main/java/g1401_1500/s1402_reducing_dishes/Solution.java)| Hard | Array, Dynamic_Programming, Sorting, Greedy | 3 | 66.20
| 1401 |[Circle and Rectangle Overlapping](src.save/main/java/g1401_1500/s1401_circle_and_rectangle_overlapping/Solution.java)| Medium | Math, Geometry | 0 | 100.00
| 1400 |[Construct K Palindrome Strings](src.save/main/java/g1301_1400/s1400_construct_k_palindrome_strings/Solution.java)| Medium | String, Hash_Table, Greedy, Counting | 5 | 94.62
| 1399 |[Count Largest Group](src.save/main/java/g1301_1400/s1399_count_largest_group/Solution.java)| Easy | Hash_Table, Math | 3 | 98.21
| 1397 |[Find All Good Strings](src.save/main/java/g1301_1400/s1397_find_all_good_strings/Solution.java)| Hard | String, Dynamic_Programming, String_Matching | 85 | 41.25
| 1396 |[Design Underground System](src.save/main/java/g1301_1400/s1396_design_underground_system/UndergroundSystem.java)| Medium | String, Hash_Table, Design | 89 | 89.64
| 1395 |[Count Number of Teams](src.save/main/java/g1301_1400/s1395_count_number_of_teams/Solution.java)| Medium | Array, Dynamic_Programming, Binary_Indexed_Tree | 18 | 91.75
| 1394 |[Find Lucky Integer in an Array](src.save/main/java/g1301_1400/s1394_find_lucky_integer_in_an_array/Solution.java)| Easy | Array, Hash_Table, Counting | 2 | 82.56
| 1393 |[Capital Gain/Loss](src.save/main/java/g1301_1400/s1393_capital_gainloss/script.sql)| Medium | Database, SQL_I_Day_9_Control_of_Flow | 457 | 79.39
| 1392 |[Longest Happy Prefix](src.save/main/java/g1301_1400/s1392_longest_happy_prefix/Solution.java)| Hard | String, Hash_Function, String_Matching, Rolling_Hash | 39 | 28.37
| 1391 |[Check if There is a Valid Path in a Grid](src.save/main/java/g1301_1400/s1391_check_if_there_is_a_valid_path_in_a_grid/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 14 | 85.37
| 1390 |[Four Divisors](src.save/main/java/g1301_1400/s1390_four_divisors/Solution.java)| Medium | Array, Math | 13 | 97.25
| 1389 |[Create Target Array in the Given Order](src.save/main/java/g1301_1400/s1389_create_target_array_in_the_given_order/Solution.java)| Easy | Array, Simulation | 0 | 100.00
| 1388 |[Pizza With 3n Slices](src.save/main/java/g1301_1400/s1388_pizza_with_3n_slices/Solution.java)| Hard | Array, Dynamic_Programming, Greedy, Heap_Priority_Queue | 5 | 93.33
| 1387 |[Sort Integers by The Power Value](src.save/main/java/g1301_1400/s1387_sort_integers_by_the_power_value/Solution.java)| Medium | Dynamic_Programming, Sorting, Memoization | 52 | 87.20
| 1386 |[Cinema Seat Allocation](src.save/main/java/g1301_1400/s1386_cinema_seat_allocation/Solution.java)| Medium | Array, Hash_Table, Greedy, Bit_Manipulation | 32 | 69.41
| 1385 |[Find the Distance Value Between Two Arrays](src.save/main/java/g1301_1400/s1385_find_the_distance_value_between_two_arrays/Solution.java)| Easy | Array, Sorting, Binary_Search, Two_Pointers, Binary_Search_I_Day_3 | 5 | 65.78
| 1383 |[Maximum Performance of a Team](src.save/main/java/g1301_1400/s1383_maximum_performance_of_a_team/Solution.java)| Hard | Array, Sorting, Greedy, Heap_Priority_Queue | 66 | 66.03
| 1382 |[Balance a Binary Search Tree](src.save/main/java/g1301_1400/s1382_balance_a_binary_search_tree/Solution.java)| Medium | Depth_First_Search, Greedy, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 5 | 65.24
| 1381 |[Design a Stack With Increment Operation](src.save/main/java/g1301_1400/s1381_design_a_stack_with_increment_operation/CustomStack.java)| Medium | Array, Stack, Design | 8 | 62.23
| 1380 |[Lucky Numbers in a Matrix](src.save/main/java/g1301_1400/s1380_lucky_numbers_in_a_matrix/Solution.java)| Easy | Array, Matrix | 2 | 82.40
| 1379 |[Find a Corresponding Node of a Binary Tree in a Clone of That Tree](src.save/main/java/g1301_1400/s1379_find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 2 | 77.89
| 1377 |[Frog Position After T Seconds](src.save/main/java/g1301_1400/s1377_frog_position_after_t_seconds/Solution.java)| Hard | Depth_First_Search, Breadth_First_Search, Tree, Graph | 6 | 81.30
| 1376 |[Time Needed to Inform All Employees](src.save/main/java/g1301_1400/s1376_time_needed_to_inform_all_employees/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Programming_Skills_II_Day_11, Graph_Theory_I_Day_9_Standard_Traversal | 225 | 22.36
| 1375 |[Number of Times Binary String Is Prefix-Aligned](src.save/main/java/g1301_1400/s1375_number_of_times_binary_string_is_prefix_aligned/Solution.java)| Medium | Array | 2 | 89.02
| 1374 |[Generate a String With Characters That Have Odd Counts](src.save/main/java/g1301_1400/s1374_generate_a_string_with_characters_that_have_odd_counts/Solution.java)| Easy | String | 1 | 90.52
| 1373 |[Maximum Sum BST in Binary Tree](src.save/main/java/g1301_1400/s1373_maximum_sum_bst_in_binary_tree/Solution.java)| Hard | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 15 | 47.56
| 1372 |[Longest ZigZag Path in a Binary Tree](src.save/main/java/g1301_1400/s1372_longest_zigzag_path_in_a_binary_tree/Solution.java)| Medium | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 9 | 64.47
| 1371 |[Find the Longest Substring Containing Vowels in Even Counts](src.save/main/java/g1301_1400/s1371_find_the_longest_substring_containing_vowels_in_even_counts/Solution.java)| Medium | String, Hash_Table, Bit_Manipulation, Prefix_Sum | 25 | 80.38
| 1370 |[Increasing Decreasing String](src.save/main/java/g1301_1400/s1370_increasing_decreasing_string/Solution.java)| Easy | String, Hash_Table, Counting | 4 | 80.41
| 1368 |[Minimum Cost to Make at Least One Valid Path in a Grid](src.save/main/java/g1301_1400/s1368_minimum_cost_to_make_at_least_one_valid_path_in_a_grid/Solution.java)| Hard | Array, Breadth_First_Search, Matrix, Heap_Priority_Queue, Graph, Shortest_Path | 8 | 99.38
| 1367 |[Linked List in Binary Tree](src.save/main/java/g1301_1400/s1367_linked_list_in_binary_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List, Programming_Skills_II_Day_4 | 2 | 61.23
| 1366 |[Rank Teams by Votes](src.save/main/java/g1301_1400/s1366_rank_teams_by_votes/Solution.java)| Medium | Array, String, Hash_Table, Sorting, Counting | 5 | 95.68
| 1365 |[How Many Numbers Are Smaller Than the Current Number](src.save/main/java/g1301_1400/s1365_how_many_numbers_are_smaller_than_the_current_number/Solution.java)| Easy | Array, Hash_Table, Sorting, Counting | 1 | 99.78
| 1363 |[Largest Multiple of Three](src.save/main/java/g1301_1400/s1363_largest_multiple_of_three/Solution.java)| Hard | Array, Dynamic_Programming, Greedy | 5 | 84.67
| 1362 |[Closest Divisors](src.save/main/java/g1301_1400/s1362_closest_divisors/Solution.java)| Medium | Math | 8 | 84.91
| 1361 |[Validate Binary Tree Nodes](src.save/main/java/g1301_1400/s1361_validate_binary_tree_nodes/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Graph, Union_Find | 8 | 69.78
| 1360 |[Number of Days Between Two Dates](src.save/main/java/g1301_1400/s1360_number_of_days_between_two_dates/Solution.java)| Easy | String, Math | 2 | 78.82
| 1359 |[Count All Valid Pickup and Delivery Options](src.save/main/java/g1301_1400/s1359_count_all_valid_pickup_and_delivery_options/Solution.java)| Hard | Dynamic_Programming, Math, Combinatorics | 0 | 100.00
| 1358 |[Number of Substrings Containing All Three Characters](src.save/main/java/g1301_1400/s1358_number_of_substrings_containing_all_three_characters/Solution.java)| Medium | String, Hash_Table, Sliding_Window | 15 | 53.82
| 1357 |[Apply Discount Every n Orders](src.save/main/java/g1301_1400/s1357_apply_discount_every_n_orders/Cashier.java)| Medium | Array, Hash_Table, Design | 174 | 58.82
| 1356 |[Sort Integers by The Number of 1 Bits](src.save/main/java/g1301_1400/s1356_sort_integers_by_the_number_of_1_bits/Solution.java)| Easy | Array, Sorting, Bit_Manipulation, Counting, Programming_Skills_I_Day_11_Containers_and_Libraries | 10 | 65.50
| 1354 |[Construct Target Array With Multiple Sums](src.save/main/java/g1301_1400/s1354_construct_target_array_with_multiple_sums/Solution.java)| Hard | Array, Heap_Priority_Queue | 2 | 100.00
| 1353 |[Maximum Number of Events That Can Be Attended](src.save/main/java/g1301_1400/s1353_maximum_number_of_events_that_can_be_attended/Solution.java)| Medium | Array, Greedy, Heap_Priority_Queue | 70 | 21.66
| 1352 |[Product of the Last K Numbers](src.save/main/java/g1301_1400/s1352_product_of_the_last_k_numbers/ProductOfNumbers.java)| Medium | Array, Math, Design, Queue, Data_Stream | 24 | 60.43
| 1351 |[Count Negative Numbers in a Sorted Matrix](src.save/main/java/g1301_1400/s1351_count_negative_numbers_in_a_sorted_matrix/Solution.java)| Easy | Array, Binary_Search, Matrix, Binary_Search_I_Day_8 | 1 | 49.66
| 1349 |[Maximum Students Taking Exam](src.save/main/java/g1301_1400/s1349_maximum_students_taking_exam/Solution.java)| Hard | Array, Dynamic_Programming, Matrix, Bit_Manipulation, Bitmask | 4 | 76.98
| 1348 |[Tweet Counts Per Frequency](src.save/main/java/g1301_1400/s1348_tweet_counts_per_frequency/TweetCounts.java)| Medium | Hash_Table, Sorting, Binary_Search, Design, Ordered_Set | 86 | 99.44
| 1347 |[Minimum Number of Steps to Make Two Strings Anagram](src.save/main/java/g1301_1400/s1347_minimum_number_of_steps_to_make_two_strings_anagram/Solution.java)| Medium | String, Hash_Table, Counting | 13 | 76.34
| 1346 |[Check If N and Its Double Exist](src.save/main/java/g1301_1400/s1346_check_if_n_and_its_double_exist/Solution.java)| Easy | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers, Binary_Search_I_Day_9 | 1 | 99.64
| 1345 |[Jump Game IV](src.save/main/java/g1301_1400/s1345_jump_game_iv/Solution.java)| Hard | Array, Hash_Table, Breadth_First_Search | 65 | 89.91
| 1344 |[Angle Between Hands of a Clock](src.save/main/java/g1301_1400/s1344_angle_between_hands_of_a_clock/Solution.java)| Medium | Math | 0 | 100.00
| 1343 |[Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold](src.save/main/java/g1301_1400/s1343_number_of_sub_arrays_of_size_k_and_average_greater_than_or_equal_to_threshold/Solution.java)| Medium | Array, Sliding_Window | 5 | 46.57
| 1342 |[Number of Steps to Reduce a Number to Zero](src.save/main/java/g1301_1400/s1342_number_of_steps_to_reduce_a_number_to_zero/Solution.java)| Easy | Math, Bit_Manipulation | 1 | 58.49
| 1340 |[Jump Game V](src.save/main/java/g1301_1400/s1340_jump_game_v/Solution.java)| Hard | Array, Dynamic_Programming, Sorting | 13 | 71.33
| 1339 |[Maximum Product of Splitted Binary Tree](src.save/main/java/g1301_1400/s1339_maximum_product_of_splitted_binary_tree/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 11 | 83.43
| 1338 |[Reduce Array Size to The Half](src.save/main/java/g1301_1400/s1338_reduce_array_size_to_the_half/Solution.java)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue | 61 | 73.82
| 1337 |[The K Weakest Rows in a Matrix](src.save/main/java/g1301_1400/s1337_the_k_weakest_rows_in_a_matrix/Solution.java)| Easy | Array, Sorting, Binary_Search, Matrix, Heap_Priority_Queue, Binary_Search_I_Day_9 | 1 | 99.77
| 1335 |[Minimum Difficulty of a Job Schedule](src.save/main/java/g1301_1400/s1335_minimum_difficulty_of_a_job_schedule/Solution.java)| Hard | Array, Dynamic_Programming | 11 | 79.28
| 1334 |[Find the City With the Smallest Number of Neighbors at a Threshold Distance](src.save/main/java/g1301_1400/s1334_find_the_city_with_the_smallest_number_of_neighbors_at_a_threshold_distance/Solution.java)| Medium | Dynamic_Programming, Graph, Shortest_Path | 21 | 49.75
| 1333 |[Filter Restaurants by Vegan-Friendly, Price and Distance](src.save/main/java/g1301_1400/s1333_filter_restaurants_by_vegan_friendly_price_and_distance/Solution.java)| Medium | Array, Sorting | 10 | 55.43
| 1332 |[Remove Palindromic Subsequences](src.save/main/java/g1301_1400/s1332_remove_palindromic_subsequences/Solution.java)| Easy | String, Two_Pointers | 0 | 100.00
| 1331 |[Rank Transform of an Array](src.save/main/java/g1301_1400/s1331_rank_transform_of_an_array/Solution.java)| Easy | Array, Hash_Table, Sorting | 22 | 98.50
| 1330 |[Reverse Subarray To Maximize Array Value](src.save/main/java/g1301_1400/s1330_reverse_subarray_to_maximize_array_value/Solution.java)| Hard | Array, Math, Greedy | 9 | 88.00
| 1329 |[Sort the Matrix Diagonally](src.save/main/java/g1301_1400/s1329_sort_the_matrix_diagonally/Solution.java)| Medium | Array, Sorting, Matrix | 15 | 26.03
| 1328 |[Break a Palindrome](src.save/main/java/g1301_1400/s1328_break_a_palindrome/Solution.java)| Medium | String, Greedy | 0 | 100.00
| 1326 |[Minimum Number of Taps to Open to Water a Garden](src.save/main/java/g1301_1400/s1326_minimum_number_of_taps_to_open_to_water_a_garden/Solution.java)| Hard | Array, Dynamic_Programming, Greedy | 3 | 90.04
| 1325 |[Delete Leaves With a Given Value](src.save/main/java/g1301_1400/s1325_delete_leaves_with_a_given_value/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 2 | 33.61
| 1324 |[Print Words Vertically](src.save/main/java/g1301_1400/s1324_print_words_vertically/Solution.java)| Medium | Array, String, Simulation | 1 | 90.59
| 1323 |[Maximum 69 Number](src.save/main/java/g1301_1400/s1323_maximum_69_number/Solution.java)| Easy | Math, Greedy | 3 | 32.03
| 1320 |[Minimum Distance to Type a Word Using Two Fingers](src.save/main/java/g1301_1400/s1320_minimum_distance_to_type_a_word_using_two_fingers/Solution.java)| Hard | String, Dynamic_Programming | 16 | 82.29
| 1319 |[Number of Operations to Make Network Connected](src.save/main/java/g1301_1400/s1319_number_of_operations_to_make_network_connected/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Graph_Theory_I_Day_8_Standard_Traversal | 9 | 67.64
| 1318 |[Minimum Flips to Make a OR b Equal to c](src.save/main/java/g1301_1400/s1318_minimum_flips_to_make_a_or_b_equal_to_c/Solution.java)| Medium | Bit_Manipulation | 0 | 100.00
| 1317 |[Convert Integer to the Sum of Two No-Zero Integers](src.save/main/java/g1301_1400/s1317_convert_integer_to_the_sum_of_two_no_zero_integers/Solution.java)| Easy | Math | 1 | 84.36
| 1316 |[Distinct Echo Substrings](src.save/main/java/g1301_1400/s1316_distinct_echo_substrings/Solution.java)| Hard | String, Dynamic_Programming, Sliding_Window, Trie, Hash_Function, Rolling_Hash | 165 | 93.15
| 1315 |[Sum of Nodes with Even-Valued Grandparent](src.save/main/java/g1301_1400/s1315_sum_of_nodes_with_even_valued_grandparent/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 2 | 78.61
| 1314 |[Matrix Block Sum](src.save/main/java/g1301_1400/s1314_matrix_block_sum/Solution.java)| Medium | Array, Matrix, Prefix_Sum, Dynamic_Programming_I_Day_14 | 5 | 67.46
| 1313 |[Decompress Run-Length Encoded List](src.save/main/java/g1301_1400/s1313_decompress_run_length_encoded_list/Solution.java)| Easy | Array | 11 | 10.55
| 1312 |[Minimum Insertion Steps to Make a String Palindrome](src.save/main/java/g1301_1400/s1312_minimum_insertion_steps_to_make_a_string_palindrome/Solution.java)| Hard | String, Dynamic_Programming | 25 | 85.70
| 1311 |[Get Watched Videos by Your Friends](src.save/main/java/g1301_1400/s1311_get_watched_videos_by_your_friends/Solution.java)| Medium | Array, Hash_Table, Sorting, Breadth_First_Search | 39 | 73.81
| 1310 |[XOR Queries of a Subarray](src.save/main/java/g1301_1400/s1310_xor_queries_of_a_subarray/Solution.java)| Medium | Array, Bit_Manipulation, Prefix_Sum | 3 | 68.91
| 1309 |[Decrypt String from Alphabet to Integer Mapping](src.save/main/java/g1301_1400/s1309_decrypt_string_from_alphabet_to_integer_mapping/Solution.java)| Easy | String, Programming_Skills_I_Day_9_String | 6 | 28.25
| 1307 |[Verbal Arithmetic Puzzle](src.save/main/java/g1301_1400/s1307_verbal_arithmetic_puzzle/Solution.java)| Hard | Array, String, Math, Backtracking | 6 | 95.74
| 1306 |[Jump Game III](src.save/main/java/g1301_1400/s1306_jump_game_iii/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Graph_Theory_I_Day_11_Breadth_First_Search | 2 | 96.23
| 1305 |[All Elements in Two Binary Search Trees](src.save/main/java/g1301_1400/s1305_all_elements_in_two_binary_search_trees/Solution.java)| Medium | Depth_First_Search, Sorting, Tree, Binary_Tree, Binary_Search_Tree | 25 | 63.82
| 1304 |[Find N Unique Integers Sum up to Zero](src.save/main/java/g1301_1400/s1304_find_n_unique_integers_sum_up_to_zero/Solution.java)| Easy | Array, Math | 0 | 100.00
| 1302 |[Deepest Leaves Sum](src.save/main/java/g1301_1400/s1302_deepest_leaves_sum/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 5 | 59.50
| 1301 |[Number of Paths with Max Score](src.save/main/java/g1301_1400/s1301_number_of_paths_with_max_score/Solution.java)| Hard | Array, Dynamic_Programming, Matrix | 14 | 72.31
| 1300 |[Sum of Mutated Array Closest to Target](src.save/main/java/g1201_1300/s1300_sum_of_mutated_array_closest_to_target/Solution.java)| Medium | Array, Sorting, Binary_Search, Binary_Search_II_Day_16 | 7 | 33.33
| 1299 |[Replace Elements with Greatest Element on Right Side](src.save/main/java/g1201_1300/s1299_replace_elements_with_greatest_element_on_right_side/Solution.java)| Easy | Array | 1 | 99.82
| 1298 |[Maximum Candies You Can Get from Boxes](src.save/main/java/g1201_1300/s1298_maximum_candies_you_can_get_from_boxes/Solution.java)| Hard | Array, Breadth_First_Search | 3 | 100.00
| 1297 |[Maximum Number of Occurrences of a Substring](src.save/main/java/g1201_1300/s1297_maximum_number_of_occurrences_of_a_substring/Solution.java)| Medium | String, Hash_Table, Sliding_Window | 42 | 90.85
| 1296 |[Divide Array in Sets of K Consecutive Numbers](src.save/main/java/g1201_1300/s1296_divide_array_in_sets_of_k_consecutive_numbers/Solution.java)| Medium | Array, Hash_Table, Sorting, Greedy | 39 | 97.80
| 1295 |[Find Numbers with Even Number of Digits](src.save/main/java/g1201_1300/s1295_find_numbers_with_even_number_of_digits/Solution.java)| Easy | Array | 2 | 58.23
| 1293 |[Shortest Path in a Grid with Obstacles Elimination](src.save/main/java/g1201_1300/s1293_shortest_path_in_a_grid_with_obstacles_elimination/Solution.java)| Hard | Array, Breadth_First_Search, Matrix | 35 | 63.17
| 1292 |[Maximum Side Length of a Square with Sum Less than or Equal to Threshold](src.save/main/java/g1201_1300/s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold/Solution.java)| Medium | Array, Binary_Search, Matrix, Prefix_Sum, Binary_Search_II_Day_15 | 23 | 32.97
| 1291 |[Sequential Digits](src.save/main/java/g1201_1300/s1291_sequential_digits/Solution.java)| Medium | Enumeration | 0 | 100.00
| 1290 |[Convert Binary Number in a Linked List to Integer](src.save/main/java/g1201_1300/s1290_convert_binary_number_in_a_linked_list_to_integer/Solution.java)| Easy | Math, Linked_List, Programming_Skills_I_Day_10_Linked_List_and_Tree | 0 | 100.00
| 1289 |[Minimum Falling Path Sum II](src.save/main/java/g1201_1300/s1289_minimum_falling_path_sum_ii/Solution.java)| Hard | Array, Dynamic_Programming, Matrix | 2 | 99.45
| 1288 |[Remove Covered Intervals](src.save/main/java/g1201_1300/s1288_remove_covered_intervals/Solution.java)| Medium | Array, Sorting | 6 | 78.87
| 1287 |[Element Appearing More Than 25% In Sorted Array](src.save/main/java/g1201_1300/s1287_element_appearing_more_than_25_in_sorted_array/Solution.java)| Easy | Array | 0 | 100.00
| 1286 |[Iterator for Combination](src.save/main/java/g1201_1300/s1286_iterator_for_combination/CombinationIterator.java)| Medium | String, Design, Backtracking, Iterator | 10 | 95.00
| 1284 |[Minimum Number of Flips to Convert Binary Matrix to Zero Matrix](src.save/main/java/g1201_1300/s1284_minimum_number_of_flips_to_convert_binary_matrix_to_zero_matrix/Solution.java)| Hard | Array, Breadth_First_Search, Matrix, Bit_Manipulation | 2 | 89.29
| 1283 |[Find the Smallest Divisor Given a Threshold](src.save/main/java/g1201_1300/s1283_find_the_smallest_divisor_given_a_threshold/Solution.java)| Medium | Array, Binary_Search, Binary_Search_II_Day_5 | 9 | 95.49
| 1282 |[Group the People Given the Group Size They Belong To](src.save/main/java/g1201_1300/s1282_group_the_people_given_the_group_size_they_belong_to/Solution.java)| Medium | Array, Hash_Table | 6 | 79.04
| 1281 |[Subtract the Product and Sum of Digits of an Integer](src.save/main/java/g1201_1300/s1281_subtract_the_product_and_sum_of_digits_of_an_integer/Solution.java)| Easy | Math, Programming_Skills_I_Day_2_Operator | 0 | 100.00
| 1278 |[Palindrome Partitioning III](src.save/main/java/g1201_1300/s1278_palindrome_partitioning_iii/Solution.java)| Hard | String, Dynamic_Programming | 4 | 89.93
| 1277 |[Count Square Submatrices with All Ones](src.save/main/java/g1201_1300/s1277_count_square_submatrices_with_all_ones/Solution.java)| Medium | Array, Dynamic_Programming, Matrix | 5 | 95.33
| 1276 |[Number of Burgers with No Waste of Ingredients](src.save/main/java/g1201_1300/s1276_number_of_burgers_with_no_waste_of_ingredients/Solution.java)| Medium | Math | 2 | 87.88
| 1275 |[Find Winner on a Tic Tac Toe Game](src.save/main/java/g1201_1300/s1275_find_winner_on_a_tic_tac_toe_game/Solution.java)| Easy | Array, Hash_Table, Matrix, Simulation | 0 | 100.00
| 1269 |[Number of Ways to Stay in the Same Place After Some Steps](src.save/main/java/g1201_1300/s1269_number_of_ways_to_stay_in_the_same_place_after_some_steps/Solution.java)| Hard | Dynamic_Programming | 12 | 89.11
| 1268 |[Search Suggestions System](src.save/main/java/g1201_1300/s1268_search_suggestions_system/Solution.java)| Medium | Array, String, Trie | 28 | 78.06
| 1267 |[Count Servers that Communicate](src.save/main/java/g1201_1300/s1267_count_servers_that_communicate/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Counting, Union_Find | 5 | 41.00
| 1266 |[Minimum Time Visiting All Points](src.save/main/java/g1201_1300/s1266_minimum_time_visiting_all_points/Solution.java)| Easy | Array, Math, Geometry | 1 | 80.97
| 1263 |[Minimum Moves to Move a Box to Their Target Location](src.save/main/java/g1201_1300/s1263_minimum_moves_to_move_a_box_to_their_target_location/Solution.java)| Hard | Array, Breadth_First_Search, Matrix, Heap_Priority_Queue | 16 | 76.00
| 1262 |[Greatest Sum Divisible by Three](src.save/main/java/g1201_1300/s1262_greatest_sum_divisible_by_three/Solution.java)| Medium | Array, Dynamic_Programming, Greedy | 5 | 95.82
| 1261 |[Find Elements in a Contaminated Binary Tree](src.save/main/java/g1201_1300/s1261_find_elements_in_a_contaminated_binary_tree/FindElements.java)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design | 24 | 84.00
| 1260 |[Shift 2D Grid](src.save/main/java/g1201_1300/s1260_shift_2d_grid/Solution.java)| Easy | Array, Matrix, Simulation | 17 | 14.82
| 1255 |[Maximum Score Words Formed by Letters](src.save/main/java/g1201_1300/s1255_maximum_score_words_formed_by_letters/Solution.java)| Hard | Array, String, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 1 | 98.36
| 1254 |[Number of Closed Islands](src.save/main/java/g1201_1300/s1254_number_of_closed_islands/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Graph_Theory_I_Day_2_Matrix_Related_Problems | 3 | 55.59
| 1253 |[Reconstruct a 2-Row Binary Matrix](src.save/main/java/g1201_1300/s1253_reconstruct_a_2_row_binary_matrix/Solution.java)| Medium | Array, Greedy, Matrix | 18 | 57.27
| 1252 |[Cells with Odd Values in a Matrix](src.save/main/java/g1201_1300/s1252_cells_with_odd_values_in_a_matrix/Solution.java)| Easy | Array, Math, Simulation | 1 | 87.47
| 1250 |[Check If It Is a Good Array](src.save/main/java/g1201_1300/s1250_check_if_it_is_a_good_array/Solution.java)| Hard | Array, Math, Number_Theory | 4 | 58.82
| 1249 |[Minimum Remove to Make Valid Parentheses](src.save/main/java/g1201_1300/s1249_minimum_remove_to_make_valid_parentheses/Solution.java)| Medium | String, Stack, Data_Structure_II_Day_14_Stack_Queue | 13 | 94.62
| 1248 |[Count Number of Nice Subarrays](src.save/main/java/g1201_1300/s1248_count_number_of_nice_subarrays/Solution.java)| Medium | Array, Hash_Table, Math, Sliding_Window | 14 | 69.78
| 1247 |[Minimum Swaps to Make Strings Equal](src.save/main/java/g1201_1300/s1247_minimum_swaps_to_make_strings_equal/Solution.java)| Medium | String, Math, Greedy | 1 | 79.83
| 1240 |[Tiling a Rectangle with the Fewest Squares](src.save/main/java/g1201_1300/s1240_tiling_a_rectangle_with_the_fewest_squares/Solution.java)| Hard | Dynamic_Programming, Backtracking | 3 | 62.18
| 1239 |[Maximum Length of a Concatenated String with Unique Characters](src.save/main/java/g1201_1300/s1239_maximum_length_of_a_concatenated_string_with_unique_characters/Solution.java)| Medium | Array, String, Bit_Manipulation, Backtracking | 9 | 88.28
| 1238 |[Circular Permutation in Binary Representation](src.save/main/java/g1201_1300/s1238_circular_permutation_in_binary_representation/Solution.java)| Medium | Math, Bit_Manipulation, Backtracking | 4 | 100.00
| 1237 |[Find Positive Integer Solution for a Given Equation](src.save/main/java/g1201_1300/s1237_find_positive_integer_solution_for_a_given_equation/Solution.java)| Medium | Math, Binary_Search, Two_Pointers, Interactive | 2 | 79.60
| 1235 |[Maximum Profit in Job Scheduling](src.save/main/java/g1201_1300/s1235_maximum_profit_in_job_scheduling/Solution.java)| Hard | Array, Dynamic_Programming, Sorting, Binary_Search | 27 | 89.19
| 1234 |[Replace the Substring for Balanced String](src.save/main/java/g1201_1300/s1234_replace_the_substring_for_balanced_string/Solution.java)| Medium | String, Sliding_Window | 7 | 89.84
| 1233 |[Remove Sub-Folders from the Filesystem](src.save/main/java/g1201_1300/s1233_remove_sub_folders_from_the_filesystem/Solution.java)| Medium | Array, String, Trie | 32 | 96.54
| 1232 |[Check If It Is a Straight Line](src.save/main/java/g1201_1300/s1232_check_if_it_is_a_straight_line/Solution.java)| Easy | Array, Math, Geometry, Programming_Skills_I_Day_5_Function | 0 | 100.00
| 1227 |[Airplane Seat Assignment Probability](src.save/main/java/g1201_1300/s1227_airplane_seat_assignment_probability/Solution.java)| Medium | Dynamic_Programming, Math, Brainteaser, Probability_and_Statistics | 1 | 15.63
| 1226 |[The Dining Philosophers](src.save/main/java/g1201_1300/s1226_the_dining_philosophers/DiningPhilosophers.java)| Medium | Concurrency | 10 | 83.56
| 1224 |[Maximum Equal Frequency](src.save/main/java/g1201_1300/s1224_maximum_equal_frequency/Solution.java)| Hard | Array, Hash_Table | 17 | 93.59
| 1223 |[Dice Roll Simulation](src.save/main/java/g1201_1300/s1223_dice_roll_simulation/Solution.java)| Hard | Array, Dynamic_Programming | 9 | 90.98
| 1222 |[Queens That Can Attack the King](src.save/main/java/g1201_1300/s1222_queens_that_can_attack_the_king/Solution.java)| Medium | Array, Matrix, Simulation | 1 | 89.88
| 1221 |[Split a String in Balanced Strings](src.save/main/java/g1201_1300/s1221_split_a_string_in_balanced_strings/Solution.java)| Easy | String, Greedy, Counting | 1 | 53.71
| 1220 |[Count Vowels Permutation](src.save/main/java/g1201_1300/s1220_count_vowels_permutation/Solution.java)| Hard | Dynamic_Programming | 7 | 98.50
| 1219 |[Path with Maximum Gold](src.save/main/java/g1201_1300/s1219_path_with_maximum_gold/Solution.java)| Medium | Array, Matrix, Backtracking | 48 | 57.00
| 1218 |[Longest Arithmetic Subsequence of Given Difference](src.save/main/java/g1201_1300/s1218_longest_arithmetic_subsequence_of_given_difference/Solution.java)| Medium | Array, Hash_Table, Dynamic_Programming | 11 | 98.23
| 1217 |[Minimum Cost to Move Chips to The Same Position](src.save/main/java/g1201_1300/s1217_minimum_cost_to_move_chips_to_the_same_position/Solution.java)| Easy | Array, Math, Greedy | 0 | 100.00
| 1210 |[Minimum Moves to Reach Target with Rotations](src.save/main/java/g1201_1300/s1210_minimum_moves_to_reach_target_with_rotations/Solution.java)| Hard | Array, Breadth_First_Search, Matrix | 29 | 78.57
| 1209 |[Remove All Adjacent Duplicates in String II](src.save/main/java/g1201_1300/s1209_remove_all_adjacent_duplicates_in_string_ii/Solution.java)| Medium | String, Stack | 15 | 88.34
| 1208 |[Get Equal Substrings Within Budget](src.save/main/java/g1201_1300/s1208_get_equal_substrings_within_budget/Solution.java)| Medium | String, Binary_Search, Prefix_Sum, Sliding_Window | 7 | 73.41
| 1207 |[Unique Number of Occurrences](src.save/main/java/g1201_1300/s1207_unique_number_of_occurrences/Solution.java)| Easy | Array, Hash_Table | 2 | 82.71
| 1206 |[Design Skiplist](src.save/main/java/g1201_1300/s1206_design_skiplist/Skiplist.java)| Hard | Design, Linked_List | 14 | 96.71
| 1203 |[Sort Items by Groups Respecting Dependencies](src.save/main/java/g1201_1300/s1203_sort_items_by_groups_respecting_dependencies/Solution.java)| Hard | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 44 | 88.89
| 1202 |[Smallest String With Swaps](src.save/main/java/g1201_1300/s1202_smallest_string_with_swaps/Solution.java)| Medium | String, Hash_Table, Depth_First_Search, Breadth_First_Search, Union_Find | 43 | 86.82
| 1201 |[Ugly Number III](src.save/main/java/g1201_1300/s1201_ugly_number_iii/Solution.java)| Medium | Math, Binary_Search, Number_Theory, Binary_Search_II_Day_20 | 0 | 100.00
| 1200 |[Minimum Absolute Difference](src.save/main/java/g1101_1200/s1200_minimum_absolute_difference/Solution.java)| Easy | Array, Sorting | 14 | 98.30
| 1195 |[Fizz Buzz Multithreaded](src.save/main/java/g1101_1200/s1195_fizz_buzz_multithreaded/FizzBuzz.java)| Medium | Concurrency | 8 | 80.09
| 1192 |[Critical Connections in a Network](src.save/main/java/g1101_1200/s1192_critical_connections_in_a_network/Solution.java)| Hard | Depth_First_Search, Graph, Biconnected_Component | 127 | 89.39
| 1191 |[K-Concatenation Maximum Sum](src.save/main/java/g1101_1200/s1191_k_concatenation_maximum_sum/Solution.java)| Medium | Array, Dynamic_Programming | 6 | 73.85
| 1190 |[Reverse Substrings Between Each Pair of Parentheses](src.save/main/java/g1101_1200/s1190_reverse_substrings_between_each_pair_of_parentheses/Solution.java)| Medium | String, Stack | 1 | 98.26
| 1189 |[Maximum Number of Balloons](src.save/main/java/g1101_1200/s1189_maximum_number_of_balloons/Solution.java)| Easy | String, Hash_Table, Counting | 3 | 68.13
| 1187 |[Make Array Strictly Increasing](src.save/main/java/g1101_1200/s1187_make_array_strictly_increasing/Solution.java)| Hard | Array, Dynamic_Programming, Binary_Search | 33 | 95.51
| 1186 |[Maximum Subarray Sum with One Deletion](src.save/main/java/g1101_1200/s1186_maximum_subarray_sum_with_one_deletion/Solution.java)| Medium | Array, Dynamic_Programming | 3 | 94.48
| 1185 |[Day of the Week](src.save/main/java/g1101_1200/s1185_day_of_the_week/Solution.java)| Easy | Math | 0 | 100.00
| 1184 |[Distance Between Bus Stops](src.save/main/java/g1101_1200/s1184_distance_between_bus_stops/Solution.java)| Easy | Array | 0 | 100.00
| 1179 |[Reformat Department Table](src.save/main/java/g1101_1200/s1179_reformat_department_table/script.sql)| Easy | Database | 493 | 64.80
| 1178 |[Number of Valid Words for Each Puzzle](src.save/main/java/g1101_1200/s1178_number_of_valid_words_for_each_puzzle/Solution.java)| Hard | Array, String, Hash_Table, Bit_Manipulation, Trie | 139 | 48.41
| 1177 |[Can Make Palindrome from Substring](src.save/main/java/g1101_1200/s1177_can_make_palindrome_from_substring/Solution.java)| Medium | String, Hash_Table, Bit_Manipulation, Prefix_Sum | 13 | 93.08
| 1175 |[Prime Arrangements](src.save/main/java/g1101_1200/s1175_prime_arrangements/Solution.java)| Easy | Math | 0 | 100.00
| 1172 |[Dinner Plate Stacks](src.save/main/java/g1101_1200/s1172_dinner_plate_stacks/DinnerPlates.java)| Hard | Hash_Table, Stack, Design, Heap_Priority_Queue | 63 | 96.74
| 1171 |[Remove Zero Sum Consecutive Nodes from Linked List](src.save/main/java/g1101_1200/s1171_remove_zero_sum_consecutive_nodes_from_linked_list/Solution.java)| Medium | Hash_Table, Linked_List | 2 | 90.39
| 1170 |[Compare Strings by Frequency of the Smallest Character](src.save/main/java/g1101_1200/s1170_compare_strings_by_frequency_of_the_smallest_character/Solution.java)| Medium | Array, String, Hash_Table, Sorting, Binary_Search | 7 | 57.89
| 1169 |[Invalid Transactions](src.save/main/java/g1101_1200/s1169_invalid_transactions/Solution.java)| Medium | Array, String, Hash_Table, Sorting | 11 | 89.89
| 1163 |[Last Substring in Lexicographical Order](src.save/main/java/g1101_1200/s1163_last_substring_in_lexicographical_order/Solution.java)| Hard | String, Two_Pointers | 12 | 96.43
| 1162 |[As Far from Land as Possible](src.save/main/java/g1101_1200/s1162_as_far_from_land_as_possible/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix, Graph_Theory_I_Day_4_Matrix_Related_Problems | 12 | 89.17
| 1161 |[Maximum Level Sum of a Binary Tree](src.save/main/java/g1101_1200/s1161_maximum_level_sum_of_a_binary_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 9 | 78.65
| 1160 |[Find Words That Can Be Formed by Characters](src.save/main/java/g1101_1200/s1160_find_words_that_can_be_formed_by_characters/Solution.java)| Easy | Array, String, Hash_Table | 53 | 30.13
| 1158 |[Market Analysis I](src.save/main/java/g1101_1200/s1158_market_analysis_i/script.sql)| Medium | Database, SQL_I_Day_9_Control_of_Flow | 1039 | 77.70
| 1157 |[Online Majority Element In Subarray](src.save/main/java/g1101_1200/s1157_online_majority_element_in_subarray/MajorityChecker.java)| Hard | Array, Binary_Search, Design, Segment_Tree, Binary_Indexed_Tree | 56 | 100.00
| 1156 |[Swap For Longest Repeated Character Substring](src.save/main/java/g1101_1200/s1156_swap_for_longest_repeated_character_substring/Solution.java)| Medium | String, Sliding_Window | 12 | 47.37
| 1155 |[Number of Dice Rolls With Target Sum](src.save/main/java/g1101_1200/s1155_number_of_dice_rolls_with_target_sum/Solution.java)| Medium | Dynamic_Programming | 17 | 78.89
| 1154 |[Day of the Year](src.save/main/java/g1101_1200/s1154_day_of_the_year/Solution.java)| Easy | String, Math | 9 | 95.40
| 1148 |[Article Views I](src.save/main/java/g1101_1200/s1148_article_views_i/script.sql)| Easy | Database, SQL_I_Day_5_Union | 459 | 44.85
| 1147 |[Longest Chunked Palindrome Decomposition](src.save/main/java/g1101_1200/s1147_longest_chunked_palindrome_decomposition/Solution.java)| Hard | String, Dynamic_Programming, Greedy, Two_Pointers, Hash_Function, Rolling_Hash | 11 | 44.95
| 1146 |[Snapshot Array](src.save/main/java/g1101_1200/s1146_snapshot_array/SnapshotArray.java)| Medium | Array, Hash_Table, Binary_Search, Design, Binary_Search_II_Day_18 | 37 | 87.93
| 1145 |[Binary Tree Coloring Game](src.save/main/java/g1101_1200/s1145_binary_tree_coloring_game/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 1144 |[Decrease Elements To Make Array Zigzag](src.save/main/java/g1101_1200/s1144_decrease_elements_to_make_array_zigzag/Solution.java)| Medium | Array, Greedy | 0 | 100.00
| 1143 |[Longest Common Subsequence](src.save/main/java/g1101_1200/s1143_longest_common_subsequence/Solution.java)| Medium | String, Dynamic_Programming, Algorithm_II_Day_17_Dynamic_Programming, Dynamic_Programming_I_Day_19 | 9 | 93.92
| 1141 |[User Activity for the Past 30 Days I](src.save/main/java/g1101_1200/s1141_user_activity_for_the_past_30_days_i/script.sql)| Easy | Database, SQL_I_Day_7_Function | 543 | 29.24
| 1140 |[Stone Game II](src.save/main/java/g1101_1200/s1140_stone_game_ii/Solution.java)| Medium | Array, Dynamic_Programming, Math, Game_Theory | 12 | 44.22
| 1139 |[Largest 1-Bordered Square](src.save/main/java/g1101_1200/s1139_largest_1_bordered_square/Solution.java)| Medium | Array, Dynamic_Programming, Matrix | 8 | 53.28
| 1138 |[Alphabet Board Path](src.save/main/java/g1101_1200/s1138_alphabet_board_path/Solution.java)| Medium | String, Hash_Table | 1 | 76.10
| 1137 |[N-th Tribonacci Number](src.save/main/java/g1101_1200/s1137_n_th_tribonacci_number/Solution.java)| Easy | Dynamic_Programming, Math, Memoization, Dynamic_Programming_I_Day_1 | 0 | 100.00
| 1131 |[Maximum of Absolute Value Expression](src.save/main/java/g1101_1200/s1131_maximum_of_absolute_value_expression/Solution.java)| Medium | Array, Math | 8 | 60.95
| 1130 |[Minimum Cost Tree From Leaf Values](src.save/main/java/g1101_1200/s1130_minimum_cost_tree_from_leaf_values/Solution.java)| Medium | Dynamic_Programming, Greedy, Stack, Monotonic_Stack | 2 | 82.90
| 1129 |[Shortest Path with Alternating Colors](src.save/main/java/g1101_1200/s1129_shortest_path_with_alternating_colors/Solution.java)| Medium | Breadth_First_Search, Graph, Graph_Theory_I_Day_10_Standard_Traversal | 5 | 90.28
| 1128 |[Number of Equivalent Domino Pairs](src.save/main/java/g1101_1200/s1128_number_of_equivalent_domino_pairs/Solution.java)| Easy | Array, Hash_Table, Counting | 10 | 69.88
| 1125 |[Smallest Sufficient Team](src.save/main/java/g1101_1200/s1125_smallest_sufficient_team/Solution.java)| Hard | Array, Dynamic_Programming, Bit_Manipulation, Bitmask | 3 | 98.82
| 1124 |[Longest Well-Performing Interval](src.save/main/java/g1101_1200/s1124_longest_well_performing_interval/Solution.java)| Medium | Array, Hash_Table, Stack, Prefix_Sum, Monotonic_Stack | 13 | 71.38
| 1123 |[Lowest Common Ancestor of Deepest Leaves](src.save/main/java/g1101_1200/s1123_lowest_common_ancestor_of_deepest_leaves/Solution.java)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 76.02
| 1122 |[Relative Sort Array](src.save/main/java/g1101_1200/s1122_relative_sort_array/Solution.java)| Easy | Array, Hash_Table, Sorting, Counting_Sort | 0 | 100.00
| 1117 |[Building H2O](src.save/main/java/g1101_1200/s1117_building_h2o/H2O.java)| Medium | Concurrency | 12 | 93.81
| 1116 |[Print Zero Even Odd](src.save/main/java/g1101_1200/s1116_print_zero_even_odd/ZeroEvenOdd.java)| Medium | Concurrency | 5 | 99.83
| 1115 |[Print FooBar Alternately](src.save/main/java/g1101_1200/s1115_print_foobar_alternately/FooBar.java)| Medium | Concurrency | 16 | 90.05
| 1114 |[Print in Order](src.save/main/java/g1101_1200/s1114_print_in_order/Foo.java)| Easy | Concurrency | 16 | 77.21
| 1111 |[Maximum Nesting Depth of Two Valid Parentheses Strings](src.save/main/java/g1101_1200/s1111_maximum_nesting_depth_of_two_valid_parentheses_strings/Solution.java)| Medium | String, Stack | 1 | 99.73
| 1110 |[Delete Nodes And Return Forest](src.save/main/java/g1101_1200/s1110_delete_nodes_and_return_forest/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 5 | 15.90
| 1109 |[Corporate Flight Bookings](src.save/main/java/g1101_1200/s1109_corporate_flight_bookings/Solution.java)| Medium | Array, Prefix_Sum | 3 | 87.75
| 1108 |[Defanging an IP Address](src.save/main/java/g1101_1200/s1108_defanging_an_ip_address/Solution.java)| Easy | String | 0 | 100.00
| 1106 |[Parsing A Boolean Expression](src.save/main/java/g1101_1200/s1106_parsing_a_boolean_expression/Solution.java)| Hard | String, Stack, Recursion | 3 | 93.78
| 1105 |[Filling Bookcase Shelves](src.save/main/java/g1101_1200/s1105_filling_bookcase_shelves/Solution.java)| Medium | Array, Dynamic_Programming | 4 | 23.85
| 1104 |[Path In Zigzag Labelled Binary Tree](src.save/main/java/g1101_1200/s1104_path_in_zigzag_labelled_binary_tree/Solution.java)| Medium | Math, Tree, Binary_Tree | 1 | 58.50
| 1103 |[Distribute Candies to People](src.save/main/java/g1101_1200/s1103_distribute_candies_to_people/Solution.java)| Easy | Math, Simulation | 2 | 49.07
| 1096 |[Brace Expansion II](src.save/main/java/g1001_1100/s1096_brace_expansion_ii/Solution.java)| Hard | String, Breadth_First_Search, Stack, Backtracking | 23 | 60.36
| 1095 |[Find in Mountain Array](src.save/main/java/g1001_1100/s1095_find_in_mountain_array/Solution.java)| Hard | Array, Binary_Search, Interactive | 0 | 100.00
| 1094 |[Car Pooling](src.save/main/java/g1001_1100/s1094_car_pooling/Solution.java)| Medium | Array, Sorting, Heap_Priority_Queue, Simulation, Prefix_Sum | 1 | 99.38
| 1093 |[Statistics from a Large Sample](src.save/main/java/g1001_1100/s1093_statistics_from_a_large_sample/Solution.java)| Medium | Math, Two_Pointers, Probability_and_Statistics | 1 | 86.00
| 1092 |[Shortest Common Supersequence](src.save/main/java/g1001_1100/s1092_shortest_common_supersequence/Solution.java)| Hard | String, Dynamic_Programming | 10 | 96.12
| 1091 |[Shortest Path in Binary Matrix](src.save/main/java/g1001_1100/s1091_shortest_path_in_binary_matrix/Solution.java)| Medium | Array, Breadth_First_Search, Matrix, Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_5_Matrix_Related_Problems | 22 | 69.99
| 1090 |[Largest Values From Labels](src.save/main/java/g1001_1100/s1090_largest_values_from_labels/Solution.java)| Medium | Array, Hash_Table, Sorting, Greedy, Counting | 14 | 95.96
| 1089 |[Duplicate Zeros](src.save/main/java/g1001_1100/s1089_duplicate_zeros/Solution.java)| Easy | Array, Two_Pointers | 2 | 67.91
| 1084 |[Sales Analysis III](src.save/main/java/g1001_1100/s1084_sales_analysis_iii/script.sql)| Easy | Database, SQL_I_Day_10_Where | 1066 | 69.71
| 1081 |[Smallest Subsequence of Distinct Characters](src.save/main/java/g1001_1100/s1081_smallest_subsequence_of_distinct_characters/Solution.java)| Medium | String, Greedy, Stack, Monotonic_Stack | 2 | 97.16
| 1080 |[Insufficient Nodes in Root to Leaf Paths](src.save/main/java/g1001_1100/s1080_insufficient_nodes_in_root_to_leaf_paths/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 1 | 76.12
| 1079 |[Letter Tile Possibilities](src.save/main/java/g1001_1100/s1079_letter_tile_possibilities/Solution.java)| Medium | String, Backtracking | 3 | 86.86
| 1078 |[Occurrences After Bigram](src.save/main/java/g1001_1100/s1078_occurrences_after_bigram/Solution.java)| Easy | String | 0 | 100.00
| 1074 |[Number of Submatrices That Sum to Target](src.save/main/java/g1001_1100/s1074_number_of_submatrices_that_sum_to_target/Solution.java)| Hard | Array, Hash_Table, Matrix, Prefix_Sum | 171 | 68.35
| 1073 |[Adding Two Negabinary Numbers](src.save/main/java/g1001_1100/s1073_adding_two_negabinary_numbers/Solution.java)| Medium | Array, Math | 1 | 100.00
| 1072 |[Flip Columns For Maximum Number of Equal Rows](src.save/main/java/g1001_1100/s1072_flip_columns_for_maximum_number_of_equal_rows/Solution.java)| Medium | Array, Hash_Table, Matrix | 26 | 95.71
| 1071 |[Greatest Common Divisor of Strings](src.save/main/java/g1001_1100/s1071_greatest_common_divisor_of_strings/Solution.java)| Easy | String, Math | 1 | 82.09
| 1054 |[Distant Barcodes](src.save/main/java/g1001_1100/s1054_distant_barcodes/Solution.java)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting | 45 | 64.21
| 1053 |[Previous Permutation With One Swap](src.save/main/java/g1001_1100/s1053_previous_permutation_with_one_swap/Solution.java)| Medium | Array, Greedy | 0 | 100.00
| 1052 |[Grumpy Bookstore Owner](src.save/main/java/g1001_1100/s1052_grumpy_bookstore_owner/Solution.java)| Medium | Array, Sliding_Window | 4 | 70.26
| 1051 |[Height Checker](src.save/main/java/g1001_1100/s1051_height_checker/Solution.java)| Easy | Array, Sorting, Counting_Sort | 1 | 94.01
| 1050 |[Actors and Directors Who Cooperated At Least Three Times](src.save/main/java/g1001_1100/s1050_actors_and_directors_who_cooperated_at_least_three_times/script.sql)| Easy | Database, SQL_I_Day_10_Where | 344 | 76.48
| 1049 |[Last Stone Weight II](src.save/main/java/g1001_1100/s1049_last_stone_weight_ii/Solution.java)| Medium | Array, Dynamic_Programming | 2 | 95.98
| 1048 |[Longest String Chain](src.save/main/java/g1001_1100/s1048_longest_string_chain/Solution.java)| Medium | Array, String, Hash_Table, Dynamic_Programming, Two_Pointers | 23 | 97.92
| 1047 |[Remove All Adjacent Duplicates In String](src.save/main/java/g1001_1100/s1047_remove_all_adjacent_duplicates_in_string/Solution.java)| Easy | String, Stack | 3 | 99.99
| 1046 |[Last Stone Weight](src.save/main/java/g1001_1100/s1046_last_stone_weight/Solution.java)| Easy | Array, Heap_Priority_Queue | 2 | 73.81
| 1044 |[Longest Duplicate Substring](src.save/main/java/g1001_1100/s1044_longest_duplicate_substring/Solution.java)| Hard | String, Binary_Search, Sliding_Window, Hash_Function, Rolling_Hash, Suffix_Array | 447 | 62.53
| 1043 |[Partition Array for Maximum Sum](src.save/main/java/g1001_1100/s1043_partition_array_for_maximum_sum/Solution.java)| Medium | Array, Dynamic_Programming | 5 | 90.43
| 1042 |[Flower Planting With No Adjacent](src.save/main/java/g1001_1100/s1042_flower_planting_with_no_adjacent/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph | 19 | 89.02
| 1041 |[Robot Bounded In Circle](src.save/main/java/g1001_1100/s1041_robot_bounded_in_circle/Solution.java)| Medium | String, Math, Simulation | 0 | 100.00
| 1040 |[Moving Stones Until Consecutive II](src.save/main/java/g1001_1100/s1040_moving_stones_until_consecutive_ii/Solution.java)| Medium | Array, Math, Sorting, Two_Pointers | 8 | 55.00
| 1039 |[Minimum Score Triangulation of Polygon](src.save/main/java/g1001_1100/s1039_minimum_score_triangulation_of_polygon/Solution.java)| Medium | Array, Dynamic_Programming | 6 | 38.60
| 1038 |[Binary Search Tree to Greater Sum Tree](src.save/main/java/g1001_1100/s1038_binary_search_tree_to_greater_sum_tree/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 1037 |[Valid Boomerang](src.save/main/java/g1001_1100/s1037_valid_boomerang/Solution.java)| Easy | Math, Geometry | 0 | 100.00
| 1036 |[Escape a Large Maze](src.save/main/java/g1001_1100/s1036_escape_a_large_maze/Solution.java)| Hard | Array, Hash_Table, Depth_First_Search, Breadth_First_Search | 115 | 73.46
| 1035 |[Uncrossed Lines](src.save/main/java/g1001_1100/s1035_uncrossed_lines/Solution.java)| Medium | Array, Dynamic_Programming | 5 | 85.32
| 1034 |[Coloring A Border](src.save/main/java/g1001_1100/s1034_coloring_a_border/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 1 | 93.85
| 1033 |[Moving Stones Until Consecutive](src.save/main/java/g1001_1100/s1033_moving_stones_until_consecutive/Solution.java)| Medium | Math, Brainteaser | 1 | 86.36
| 1032 |[Stream of Characters](src.save/main/java/g1001_1100/s1032_stream_of_characters/StreamChecker.java)| Hard | Array, String, Design, Trie, Data_Stream | 137 | 81.54
| 1031 |[Maximum Sum of Two Non-Overlapping Subarrays](src.save/main/java/g1001_1100/s1031_maximum_sum_of_two_non_overlapping_subarrays/Solution.java)| Medium | Array, Dynamic_Programming, Sliding_Window | 3 | 46.04
| 1030 |[Matrix Cells in Distance Order](src.save/main/java/g1001_1100/s1030_matrix_cells_in_distance_order/Solution.java)| Easy | Array, Math, Sorting, Matrix, Geometry | 15 | 69.74
| 1029 |[Two City Scheduling](src.save/main/java/g1001_1100/s1029_two_city_scheduling/Solution.java)| Medium | Array, Sorting, Greedy | 1 | 97.54
| 1028 |[Recover a Tree From Preorder Traversal](src.save/main/java/g1001_1100/s1028_recover_a_tree_from_preorder_traversal/Solution.java)| Hard | String, Depth_First_Search, Tree, Binary_Tree | 5 | 77.57
| 1027 |[Longest Arithmetic Subsequence](src.save/main/java/g1001_1100/s1027_longest_arithmetic_subsequence/Solution.java)| Medium | Array, Hash_Table, Dynamic_Programming, Binary_Search | 47 | 98.28
| 1026 |[Maximum Difference Between Node and Ancestor](src.save/main/java/g1001_1100/s1026_maximum_difference_between_node_and_ancestor/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 1 | 65.84
| 1025 |[Divisor Game](src.save/main/java/g1001_1100/s1025_divisor_game/Solution.java)| Easy | Dynamic_Programming, Math, Game_Theory, Brainteaser | 0 | 100.00
| 1024 |[Video Stitching](src.save/main/java/g1001_1100/s1024_video_stitching/Solution.java)| Medium | Array, Dynamic_Programming, Greedy | 1 | 88.78
| 1023 |[Camelcase Matching](src.save/main/java/g1001_1100/s1023_camelcase_matching/Solution.java)| Medium | String, Two_Pointers, Trie, String_Matching | 1 | 73.86
| 1022 |[Sum of Root To Leaf Binary Numbers](src.save/main/java/g1001_1100/s1022_sum_of_root_to_leaf_binary_numbers/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree | 3 | 28.58
| 1021 |[Remove Outermost Parentheses](src.save/main/java/g1001_1100/s1021_remove_outermost_parentheses/Solution.java)| Easy | String, Stack | 4 | 75.39
| 1020 |[Number of Enclaves](src.save/main/java/g1001_1100/s1020_number_of_enclaves/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Graph_Theory_I_Day_3_Matrix_Related_Problems | 6 | 68.24
| 1019 |[Next Greater Node In Linked List](src.save/main/java/g1001_1100/s1019_next_greater_node_in_linked_list/Solution.java)| Medium | Array, Stack, Linked_List, Monotonic_Stack | 11 | 96.35
| 1018 |[Binary Prefix Divisible By 5](src.save/main/java/g1001_1100/s1018_binary_prefix_divisible_by_5/Solution.java)| Easy | Array | 3 | 84.58
| 1017 |[Convert to Base -2](src.save/main/java/g1001_1100/s1017_convert_to_base_2/Solution.java)| Medium | Math | 1 | 89.45
| 1016 |[Binary String With Substrings Representing 1 To N](src.save/main/java/g1001_1100/s1016_binary_string_with_substrings_representing_1_to_n/Solution.java)| Medium | String | 0 | 100.00
| 1015 |[Smallest Integer Divisible by K](src.save/main/java/g1001_1100/s1015_smallest_integer_divisible_by_k/Solution.java)| Medium | Hash_Table, Math | 2 | 90.67
| 1014 |[Best Sightseeing Pair](src.save/main/java/g1001_1100/s1014_best_sightseeing_pair/Solution.java)| Medium | Array, Dynamic_Programming, Dynamic_Programming_I_Day_7 | 2 | 99.86
| 1013 |[Partition Array Into Three Parts With Equal Sum](src.save/main/java/g1001_1100/s1013_partition_array_into_three_parts_with_equal_sum/Solution.java)| Easy | Array, Greedy | 1 | 100.00
| 1012 |[Numbers With Repeated Digits](src.save/main/java/g1001_1100/s1012_numbers_with_repeated_digits/Solution.java)| Hard | Dynamic_Programming, Math | 3 | 28.17
| 1011 |[Capacity To Ship Packages Within D Days](src.save/main/java/g1001_1100/s1011_capacity_to_ship_packages_within_d_days/Solution.java)| Medium | Array, Greedy, Binary_Search | 10 | 75.31
| 1010 |[Pairs of Songs With Total Durations Divisible by 60](src.save/main/java/g1001_1100/s1010_pairs_of_songs_with_total_durations_divisible_by_60/Solution.java)| Medium | Array, Hash_Table, Counting | 4 | 64.39
| 1009 |[Complement of Base 10 Integer](src.save/main/java/g1001_1100/s1009_complement_of_base_10_integer/Solution.java)| Easy | Bit_Manipulation | 1 | 41.56
| 1008 |[Construct Binary Search Tree from Preorder Traversal](src.save/main/java/g1001_1100/s1008_construct_binary_search_tree_from_preorder_traversal/Solution.java)| Medium | Array, Tree, Binary_Tree, Stack, Monotonic_Stack, Binary_Search_Tree | 0 | 100.00
| 1007 |[Minimum Domino Rotations For Equal Row](src.save/main/java/g1001_1100/s1007_minimum_domino_rotations_for_equal_row/Solution.java)| Medium | Array, Greedy | 5 | 79.64
| 1006 |[Clumsy Factorial](src.save/main/java/g1001_1100/s1006_clumsy_factorial/Solution.java)| Medium | Math, Stack, Simulation | 1 | 87.97
| 1005 |[Maximize Sum Of Array After K Negations](src.save/main/java/g1001_1100/s1005_maximize_sum_of_array_after_k_negations/Solution.java)| Easy | Array, Sorting, Greedy | 3 | 81.75
| 1004 |[Max Consecutive Ones III](src.save/main/java/g1001_1100/s1004_max_consecutive_ones_iii/Solution.java)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 3 | 79.01
| 1003 |[Check If Word Is Valid After Substitutions](src.save/main/java/g1001_1100/s1003_check_if_word_is_valid_after_substitutions/Solution.java)| Medium | String, Stack | 5 | 98.54
| 1002 |[Find Common Characters](src.save/main/java/g1001_1100/s1002_find_common_characters/Solution.java)| Easy | Array, String, Hash_Table | 4 | 83.51
| 1001 |[Grid Illumination](src.save/main/java/g1001_1100/s1001_grid_illumination/Solution.java)| Hard | Array, Hash_Table | 75 | 90.57
| 1000 |[Minimum Cost to Merge Stones](src.save/main/java/g0901_1000/s1000_minimum_cost_to_merge_stones/Solution.java)| Hard | Array, Dynamic_Programming | 1 | 99.65
| 0999 |[Available Captures for Rook](src.save/main/java/g0901_1000/s0999_available_captures_for_rook/Solution.java)| Easy | Array, Matrix, Simulation | 0 | 100.00
| 0998 |[Maximum Binary Tree II](src.save/main/java/g0901_1000/s0998_maximum_binary_tree_ii/Solution.java)| Medium | Tree, Binary_Tree | 0 | 100.00
| 0997 |[Find the Town Judge](src.save/main/java/g0901_1000/s0997_find_the_town_judge/Solution.java)| Easy | Array, Hash_Table, Graph, Data_Structure_II_Day_19_Graph, Graph_Theory_I_Day_13_Graph_Theory | 3 | 80.64
| 0996 |[Number of Squareful Arrays](src.save/main/java/g0901_1000/s0996_number_of_squareful_arrays/Solution.java)| Hard | Array, Dynamic_Programming, Math, Bit_Manipulation, Backtracking, Bitmask | 2 | 72.32
| 0995 |[Minimum Number of K Consecutive Bit Flips](src.save/main/java/g0901_1000/s0995_minimum_number_of_k_consecutive_bit_flips/Solution.java)| Hard | Array, Bit_Manipulation, Prefix_Sum, Sliding_Window | 6 | 93.95
| 0994 |[Rotting Oranges](src.save/main/java/g0901_1000/s0994_rotting_oranges/Solution.java)| Medium | Array, Breadth_First_Search, Matrix, Algorithm_I_Day_9_Breadth_First_Search_Depth_First_Search | 3 | 74.27
| 0993 |[Cousins in Binary Tree](src.save/main/java/g0901_1000/s0993_cousins_in_binary_tree/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 60.08
| 0992 |[Subarrays with K Different Integers](src.save/main/java/g0901_1000/s0992_subarrays_with_k_different_integers/Solution.java)| Hard | Array, Hash_Table, Counting, Sliding_Window | 4 | 99.36
| 0991 |[Broken Calculator](src.save/main/java/g0901_1000/s0991_broken_calculator/Solution.java)| Medium | Math, Greedy | 0 | 100.00
| 0990 |[Satisfiability of Equality Equations](src.save/main/java/g0901_1000/s0990_satisfiability_of_equality_equations/Solution.java)| Medium | Array, String, Graph, Union_Find | 5 | 24.79
| 0989 |[Add to Array-Form of Integer](src.save/main/java/g0901_1000/s0989_add_to_array_form_of_integer/Solution.java)| Easy | Array, Math, Programming_Skills_II_Day_5 | 7 | 65.92
| 0988 |[Smallest String Starting From Leaf](src.save/main/java/g0901_1000/s0988_smallest_string_starting_from_leaf/Solution.java)| Medium | String, Depth_First_Search, Tree, Binary_Tree | 4 | 58.47
| 0987 |[Vertical Order Traversal of a Binary Tree](src.save/main/java/g0901_1000/s0987_vertical_order_traversal_of_a_binary_tree/Solution.java)| Hard | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 4 | 71.48
| 0986 |[Interval List Intersections](src.save/main/java/g0901_1000/s0986_interval_list_intersections/Solution.java)| Medium | Array, Two_Pointers, Algorithm_II_Day_4_Two_Pointers | 2 | 99.95
| 0985 |[Sum of Even Numbers After Queries](src.save/main/java/g0901_1000/s0985_sum_of_even_numbers_after_queries/Solution.java)| Medium | Array, Simulation | 6 | 71.11
| 0984 |[String Without AAA or BBB](src.save/main/java/g0901_1000/s0984_string_without_aaa_or_bbb/Solution.java)| Medium | String, Greedy | 0 | 100.00
| 0983 |[Minimum Cost For Tickets](src.save/main/java/g0901_1000/s0983_minimum_cost_for_tickets/Solution.java)| Medium | Array, Dynamic_Programming | 1 | 93.95
| 0982 |[Triples with Bitwise AND Equal To Zero](src.save/main/java/g0901_1000/s0982_triples_with_bitwise_and_equal_to_zero/Solution.java)| Hard | Array, Hash_Table, Bit_Manipulation | 120 | 79.59
| 0981 |[Time Based Key-Value Store](src.save/main/java/g0901_1000/s0981_time_based_key_value_store/TimeMap.java)| Medium | String, Hash_Table, Binary_Search, Design, Binary_Search_II_Day_16 | 239 | 72.78
| 0980 |[Unique Paths III](src.save/main/java/g0901_1000/s0980_unique_paths_iii/Solution.java)| Hard | Array, Matrix, Bit_Manipulation, Backtracking | 0 | 100.00
| 0979 |[Distribute Coins in Binary Tree](src.save/main/java/g0901_1000/s0979_distribute_coins_in_binary_tree/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0978 |[Longest Turbulent Subarray](src.save/main/java/g0901_1000/s0978_longest_turbulent_subarray/Solution.java)| Medium | Array, Dynamic_Programming, Sliding_Window | 7 | 48.10
| 0977 |[Squares of a Sorted Array](src.save/main/java/g0901_1000/s0977_squares_of_a_sorted_array/Solution.java)| Easy | Array, Sorting, Two_Pointers, Algorithm_I_Day_2_Two_Pointers | 1 | 100.00
| 0976 |[Largest Perimeter Triangle](src.save/main/java/g0901_1000/s0976_largest_perimeter_triangle/Solution.java)| Easy | Array, Math, Sorting, Greedy, Programming_Skills_I_Day_3_Conditional_Statements | 12 | 26.01
| 0975 |[Odd Even Jump](src.save/main/java/g0901_1000/s0975_odd_even_jump/Solution.java)| Hard | Array, Dynamic_Programming, Stack, Ordered_Set, Monotonic_Stack | 49 | 98.38
| 0974 |[Subarray Sums Divisible by K](src.save/main/java/g0901_1000/s0974_subarray_sums_divisible_by_k/Solution.java)| Medium | Array, Hash_Table, Prefix_Sum | 3 | 99.95
| 0973 |[K Closest Points to Origin](src.save/main/java/g0901_1000/s0973_k_closest_points_to_origin/Solution.java)| Medium | Array, Math, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Geometry, Quickselect, Data_Structure_II_Day_21_Heap_Priority_Queue, Programming_Skills_II_Day_8 | 4 | 98.26
| 0972 |[Equal Rational Numbers](src.save/main/java/g0901_1000/s0972_equal_rational_numbers/Solution.java)| Hard | String, Math | 4 | 56.67
| 0971 |[Flip Binary Tree To Match Preorder Traversal](src.save/main/java/g0901_1000/s0971_flip_binary_tree_to_match_preorder_traversal/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0970 |[Powerful Integers](src.save/main/java/g0901_1000/s0970_powerful_integers/Solution.java)| Medium | Hash_Table, Math | 1 | 100.00
| 0969 |[Pancake Sorting](src.save/main/java/g0901_1000/s0969_pancake_sorting/Solution.java)| Medium | Array, Sorting, Greedy, Two_Pointers | 1 | 100.00
| 0968 |[Binary Tree Cameras](src.save/main/java/g0901_1000/s0968_binary_tree_cameras/Solution.java)| Hard | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0967 |[Numbers With Same Consecutive Differences](src.save/main/java/g0901_1000/s0967_numbers_with_same_consecutive_differences/Solution.java)| Medium | Breadth_First_Search, Backtracking | 1 | 100.00
| 0966 |[Vowel Spellchecker](src.save/main/java/g0901_1000/s0966_vowel_spellchecker/Solution.java)| Medium | Array, String, Hash_Table | 17 | 98.95
| 0965 |[Univalued Binary Tree](src.save/main/java/g0901_1000/s0965_univalued_binary_tree/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 17.57
| 0964 |[Least Operators to Express Number](src.save/main/java/g0901_1000/s0964_least_operators_to_express_number/Solution.java)| Hard | Dynamic_Programming, Math | 16 | 37.78
| 0963 |[Minimum Area Rectangle II](src.save/main/java/g0901_1000/s0963_minimum_area_rectangle_ii/Solution.java)| Medium | Array, Math, Geometry | 12 | 92.95
| 0962 |[Maximum Width Ramp](src.save/main/java/g0901_1000/s0962_maximum_width_ramp/Solution.java)| Medium | Array, Stack, Monotonic_Stack | 6 | 90.69
| 0961 |[N-Repeated Element in Size 2N Array](src.save/main/java/g0901_1000/s0961_n_repeated_element_in_size_2n_array/Solution.java)| Easy | Array, Hash_Table | 1 | 87.33
| 0960 |[Delete Columns to Make Sorted III](src.save/main/java/g0901_1000/s0960_delete_columns_to_make_sorted_iii/Solution.java)| Hard | Array, String, Dynamic_Programming | 13 | 43.86
| 0959 |[Regions Cut By Slashes](src.save/main/java/g0901_1000/s0959_regions_cut_by_slashes/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 9 | 39.29
| 0958 |[Check Completeness of a Binary Tree](src.save/main/java/g0901_1000/s0958_check_completeness_of_a_binary_tree/Solution.java)| Medium | Breadth_First_Search, Tree, Binary_Tree | 2 | 43.56
| 0957 |[Prison Cells After N Days](src.save/main/java/g0901_1000/s0957_prison_cells_after_n_days/Solution.java)| Medium | Array, Hash_Table, Math, Bit_Manipulation | 1 | 97.82
| 0956 |[Tallest Billboard](src.save/main/java/g0901_1000/s0956_tallest_billboard/Solution.java)| Hard | Array, Dynamic_Programming | 18 | 92.68
| 0955 |[Delete Columns to Make Sorted II](src.save/main/java/g0901_1000/s0955_delete_columns_to_make_sorted_ii/Solution.java)| Medium | Array, String, Greedy | 2 | 68.84
| 0954 |[Array of Doubled Pairs](src.save/main/java/g0901_1000/s0954_array_of_doubled_pairs/Solution.java)| Medium | Array, Hash_Table, Sorting, Greedy | 18 | 97.19
| 0953 |[Verifying an Alien Dictionary](src.save/main/java/g0901_1000/s0953_verifying_an_alien_dictionary/Solution.java)| Easy | Array, String, Hash_Table, Programming_Skills_I_Day_9_String | 0 | 100.00
| 0952 |[Largest Component Size by Common Factor](src.save/main/java/g0901_1000/s0952_largest_component_size_by_common_factor/Solution.java)| Hard | Array, Math, Union_Find | 225 | 76.99
| 0951 |[Flip Equivalent Binary Trees](src.save/main/java/g0901_1000/s0951_flip_equivalent_binary_trees/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0950 |[Reveal Cards In Increasing Order](src.save/main/java/g0901_1000/s0950_reveal_cards_in_increasing_order/Solution.java)| Medium | Array, Sorting, Simulation, Queue | 1 | 100.00
| 0949 |[Largest Time for Given Digits](src.save/main/java/g0901_1000/s0949_largest_time_for_given_digits/Solution.java)| Medium | String, Enumeration | 3 | 91.21
| 0948 |[Bag of Tokens](src.save/main/java/g0901_1000/s0948_bag_of_tokens/Solution.java)| Medium | Array, Sorting, Greedy, Two_Pointers | 4 | 32.05
| 0947 |[Most Stones Removed with Same Row or Column](src.save/main/java/g0901_1000/s0947_most_stones_removed_with_same_row_or_column/Solution.java)| Medium | Depth_First_Search, Graph, Union_Find | 5 | 98.95
| 0946 |[Validate Stack Sequences](src.save/main/java/g0901_1000/s0946_validate_stack_sequences/Solution.java)| Medium | Array, Stack, Simulation | 6 | 20.54
| 0945 |[Minimum Increment to Make Array Unique](src.save/main/java/g0901_1000/s0945_minimum_increment_to_make_array_unique/Solution.java)| Medium | Array, Sorting, Greedy, Counting | 9 | 95.25
| 0944 |[Delete Columns to Make Sorted](src.save/main/java/g0901_1000/s0944_delete_columns_to_make_sorted/Solution.java)| Easy | Array, String | 11 | 59.39
| 0943 |[Find the Shortest Superstring](src.save/main/java/g0901_1000/s0943_find_the_shortest_superstring/Solution.java)| Hard | Array, String, Dynamic_Programming, Bit_Manipulation, Bitmask | 16 | 100.00
| 0942 |[DI String Match](src.save/main/java/g0901_1000/s0942_di_string_match/Solution.java)| Easy | Array, String, Math, Greedy, Two_Pointers | 4 | 33.74
| 0941 |[Valid Mountain Array](src.save/main/java/g0901_1000/s0941_valid_mountain_array/Solution.java)| Easy | Array | 1 | 100.00
| 0940 |[Distinct Subsequences II](src.save/main/java/g0901_1000/s0940_distinct_subsequences_ii/Solution.java)| Hard | String, Dynamic_Programming | 2 | 99.41
| 0939 |[Minimum Area Rectangle](src.save/main/java/g0901_1000/s0939_minimum_area_rectangle/Solution.java)| Medium | Array, Hash_Table, Math, Sorting, Geometry | 63 | 94.31
| 0938 |[Range Sum of BST](src.save/main/java/g0901_1000/s0938_range_sum_of_bst/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 0937 |[Reorder Data in Log Files](src.save/main/java/g0901_1000/s0937_reorder_data_in_log_files/Solution.java)| Easy | Array, String, Sorting | 4 | 92.15
| 0936 |[Stamping The Sequence](src.save/main/java/g0901_1000/s0936_stamping_the_sequence/Solution.java)| Hard | String, Greedy, Stack, Queue | 6 | 78.43
| 0935 |[Knight Dialer](src.save/main/java/g0901_1000/s0935_knight_dialer/Solution.java)| Medium | Dynamic_Programming | 4 | 99.08
| 0934 |[Shortest Bridge](src.save/main/java/g0901_1000/s0934_shortest_bridge/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Graph_Theory_I_Day_6_Matrix_Related_Problems | 6 | 97.87
| 0933 |[Number of Recent Calls](src.save/main/java/g0901_1000/s0933_number_of_recent_calls/RecentCounter.java)| Easy | Design, Queue, Data_Stream | 16 | 97.58
| 0932 |[Beautiful Array](src.save/main/java/g0901_1000/s0932_beautiful_array/Solution.java)| Medium | Array, Math, Divide_and_Conquer | 1 | 89.66
| 0931 |[Minimum Falling Path Sum](src.save/main/java/g0901_1000/s0931_minimum_falling_path_sum/Solution.java)| Medium | Array, Dynamic_Programming, Matrix, Dynamic_Programming_I_Day_13 | 4 | 72.19
| 0930 |[Binary Subarrays With Sum](src.save/main/java/g0901_1000/s0930_binary_subarrays_with_sum/Solution.java)| Medium | Array, Hash_Table, Prefix_Sum, Sliding_Window | 3 | 84.84
| 0929 |[Unique Email Addresses](src.save/main/java/g0901_1000/s0929_unique_email_addresses/Solution.java)| Easy | Array, String, Hash_Table | 10 | 92.59
| 0928 |[Minimize Malware Spread II](src.save/main/java/g0901_1000/s0928_minimize_malware_spread_ii/Solution.java)| Hard | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 41 | 31.01
| 0927 |[Three Equal Parts](src.save/main/java/g0901_1000/s0927_three_equal_parts/Solution.java)| Hard | Array, Math | 2 | 90.20
| 0926 |[Flip String to Monotone Increasing](src.save/main/java/g0901_1000/s0926_flip_string_to_monotone_increasing/Solution.java)| Medium | String, Dynamic_Programming | 12 | 63.41
| 0925 |[Long Pressed Name](src.save/main/java/g0901_1000/s0925_long_pressed_name/Solution.java)| Easy | String, Two_Pointers | 1 | 84.87
| 0924 |[Minimize Malware Spread](src.save/main/java/g0901_1000/s0924_minimize_malware_spread/Solution.java)| Hard | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 10 | 47.21
| 0923 |[3Sum With Multiplicity](src.save/main/java/g0901_1000/s0923_3sum_with_multiplicity/Solution.java)| Medium | Array, Hash_Table, Sorting, Two_Pointers, Counting | 14 | 69.20
| 0922 |[Sort Array By Parity II](src.save/main/java/g0901_1000/s0922_sort_array_by_parity_ii/Solution.java)| Easy | Array, Sorting, Two_Pointers | 4 | 52.95
| 0921 |[Minimum Add to Make Parentheses Valid](src.save/main/java/g0901_1000/s0921_minimum_add_to_make_parentheses_valid/Solution.java)| Medium | String, Greedy, Stack | 2 | 33.69
| 0920 |[Number of Music Playlists](src.save/main/java/g0901_1000/s0920_number_of_music_playlists/Solution.java)| Hard | Dynamic_Programming, Math, Combinatorics | 2 | 96.55
| 0919 |[Complete Binary Tree Inserter](src.save/main/java/g0901_1000/s0919_complete_binary_tree_inserter/CBTInserter.java)| Medium | Breadth_First_Search, Tree, Binary_Tree, Design | 11 | 96.06
| 0918 |[Maximum Sum Circular Subarray](src.save/main/java/g0901_1000/s0918_maximum_sum_circular_subarray/Solution.java)| Medium | Array, Dynamic_Programming, Divide_and_Conquer, Queue, Monotonic_Queue, Dynamic_Programming_I_Day_5 | 3 | 92.86
| 0917 |[Reverse Only Letters](src.save/main/java/g0901_1000/s0917_reverse_only_letters/Solution.java)| Easy | String, Two_Pointers | 0 | 100.00
| 0916 |[Word Subsets](src.save/main/java/g0901_1000/s0916_word_subsets/Solution.java)| Medium | Array, String, Hash_Table | 30 | 57.30
| 0915 |[Partition Array into Disjoint Intervals](src.save/main/java/g0901_1000/s0915_partition_array_into_disjoint_intervals/Solution.java)| Medium | Array | 2 | 99.81
| 0914 |[X of a Kind in a Deck of Cards](src.save/main/java/g0901_1000/s0914_x_of_a_kind_in_a_deck_of_cards/Solution.java)| Easy | Array, Hash_Table, Math, Counting, Number_Theory | 16 | 19.29
| 0913 |[Cat and Mouse](src.save/main/java/g0901_1000/s0913_cat_and_mouse/Solution.java)| Hard | Dynamic_Programming, Math, Breadth_First_Search, Graph, Memoization, Game_Theory | 16 | 97.20
| 0912 |[Sort an Array](src.save/main/java/g0901_1000/s0912_sort_an_array/Solution.java)| Medium | Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Merge_Sort, Bucket_Sort, Counting_Sort, Radix_Sort | 25 | 38.15
| 0911 |[Online Election](src.save/main/java/g0901_1000/s0911_online_election/TopVotedCandidate.java)| Medium | Array, Hash_Table, Binary_Search, Design, Binary_Search_II_Day_20 | 63 | 98.81
| 0910 |[Smallest Range II](src.save/main/java/g0901_1000/s0910_smallest_range_ii/Solution.java)| Medium | Array, Math, Sorting, Greedy, Programming_Skills_II_Day_13 | 10 | 73.16
| 0909 |[Snakes and Ladders](src.save/main/java/g0901_1000/s0909_snakes_and_ladders/Solution.java)| Medium | Array, Breadth_First_Search, Matrix | 7 | 79.52
| 0908 |[Smallest Range I](src.save/main/java/g0901_1000/s0908_smallest_range_i/Solution.java)| Easy | Array, Math | 2 | 88.84
| 0907 |[Sum of Subarray Minimums](src.save/main/java/g0901_1000/s0907_sum_of_subarray_minimums/Solution.java)| Medium | Array, Dynamic_Programming, Stack, Monotonic_Stack | 20 | 95.88
| 0906 |[Super Palindromes](src.save/main/java/g0901_1000/s0906_super_palindromes/Solution.java)| Hard | Math, Enumeration | 229 | 91.38
| 0905 |[Sort Array By Parity](src.save/main/java/g0901_1000/s0905_sort_array_by_parity/Solution.java)| Easy | Array, Sorting, Two_Pointers | 1 | 95.51
| 0904 |[Fruit Into Baskets](src.save/main/java/g0901_1000/s0904_fruit_into_baskets/Solution.java)| Medium | Array, Hash_Table, Sliding_Window | 6 | 95.60
| 0903 |[Valid Permutations for DI Sequence](src.save/main/java/g0901_1000/s0903_valid_permutations_for_di_sequence/Solution.java)| Hard | Dynamic_Programming | 3 | 74.00
| 0902 |[Numbers At Most N Given Digit Set](src.save/main/java/g0901_1000/s0902_numbers_at_most_n_given_digit_set/Solution.java)| Hard | Array, Dynamic_Programming, Math, Binary_Search | 2 | 18.29
| 0901 |[Online Stock Span](src.save/main/java/g0901_1000/s0901_online_stock_span/StockSpanner.java)| Medium | Stack, Design, Monotonic_Stack, Data_Stream | 47 | 76.17
| 0900 |[RLE Iterator](src.save/main/java/g0801_0900/s0900_rle_iterator/RLEIterator.java)| Medium | Array, Design, Counting, Iterator | 3 | 100.00
| 0899 |[Orderly Queue](src.save/main/java/g0801_0900/s0899_orderly_queue/Solution.java)| Hard | String, Math, Sorting | 1 | 100.00
| 0898 |[Bitwise ORs of Subarrays](src.save/main/java/g0801_0900/s0898_bitwise_ors_of_subarrays/Solution.java)| Medium | Array, Dynamic_Programming, Bit_Manipulation | 151 | 97.74
| 0897 |[Increasing Order Search Tree](src.save/main/java/g0801_0900/s0897_increasing_order_search_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack, Binary_Search_Tree | 0 | 100.00
| 0896 |[Monotonic Array](src.save/main/java/g0801_0900/s0896_monotonic_array/Solution.java)| Easy | Array, Programming_Skills_II_Day_1 | 2 | 86.21
| 0895 |[Maximum Frequency Stack](src.save/main/java/g0801_0900/s0895_maximum_frequency_stack/FreqStack.java)| Hard | Hash_Table, Stack, Design, Ordered_Set | 43 | 65.81
| 0894 |[All Possible Full Binary Trees](src.save/main/java/g0801_0900/s0894_all_possible_full_binary_trees/Solution.java)| Medium | Dynamic_Programming, Tree, Binary_Tree, Recursion, Memoization | 3 | 68.56
| 0893 |[Groups of Special-Equivalent Strings](src.save/main/java/g0801_0900/s0893_groups_of_special_equivalent_strings/Solution.java)| Medium | Array, String, Hash_Table | 3 | 99.09
| 0892 |[Surface Area of 3D Shapes](src.save/main/java/g0801_0900/s0892_surface_area_of_3d_shapes/Solution.java)| Easy | Array, Math, Matrix, Geometry | 2 | 98.73
| 0891 |[Sum of Subsequence Widths](src.save/main/java/g0801_0900/s0891_sum_of_subsequence_widths/Solution.java)| Hard | Array, Math, Sorting | 56 | 30.61
| 0890 |[Find and Replace Pattern](src.save/main/java/g0801_0900/s0890_find_and_replace_pattern/Solution.java)| Medium | Array, String, Hash_Table | 1 | 97.13
| 0889 |[Construct Binary Tree from Preorder and Postorder Traversal](src.save/main/java/g0801_0900/s0889_construct_binary_tree_from_preorder_and_postorder_traversal/Solution.java)| Medium | Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer | 1 | 91.04
| 0888 |[Fair Candy Swap](src.save/main/java/g0801_0900/s0888_fair_candy_swap/Solution.java)| Easy | Array, Hash_Table, Sorting, Binary_Search | 18 | 68.20
| 0887 |[Super Egg Drop](src.save/main/java/g0801_0900/s0887_super_egg_drop/Solution.java)| Hard | Dynamic_Programming, Math, Binary_Search | 0 | 100.00
| 0886 |[Possible Bipartition](src.save/main/java/g0801_0900/s0886_possible_bipartition/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Graph_Theory_I_Day_14_Graph_Theory | 20 | 80.12
| 0885 |[Spiral Matrix III](src.save/main/java/g0801_0900/s0885_spiral_matrix_iii/Solution.java)| Medium | Array, Matrix, Simulation | 3 | 95.45
| 0884 |[Uncommon Words from Two Sentences](src.save/main/java/g0801_0900/s0884_uncommon_words_from_two_sentences/Solution.java)| Easy | String, Hash_Table | 1 | 100.00
| 0883 |[Projection Area of 3D Shapes](src.save/main/java/g0801_0900/s0883_projection_area_of_3d_shapes/Solution.java)| Easy | Array, Math, Matrix, Geometry | 1 | 100.00
| 0882 |[Reachable Nodes In Subdivided Graph](src.save/main/java/g0801_0900/s0882_reachable_nodes_in_subdivided_graph/Solution.java)| Hard | Heap_Priority_Queue, Graph, Shortest_Path | 28 | 95.85
| 0881 |[Boats to Save People](src.save/main/java/g0801_0900/s0881_boats_to_save_people/Solution.java)| Medium | Array, Sorting, Greedy, Two_Pointers | 20 | 61.11
| 0880 |[Decoded String at Index](src.save/main/java/g0801_0900/s0880_decoded_string_at_index/Solution.java)| Medium | String, Stack | 0 | 100.00
| 0879 |[Profitable Schemes](src.save/main/java/g0801_0900/s0879_profitable_schemes/Solution.java)| Hard | Array, Dynamic_Programming | 80 | 43.42
| 0878 |[Nth Magical Number](src.save/main/java/g0801_0900/s0878_nth_magical_number/Solution.java)| Hard | Math, Binary_Search | 0 | 100.00
| 0877 |[Stone Game](src.save/main/java/g0801_0900/s0877_stone_game/Solution.java)| Medium | Array, Dynamic_Programming, Math, Game_Theory | 0 | 100.00
| 0876 |[Middle of the Linked List](src.save/main/java/g0801_0900/s0876_middle_of_the_linked_list/Solution.java)| Easy | Two_Pointers, Linked_List, Algorithm_I_Day_5_Two_Pointers, Programming_Skills_I_Day_10_Linked_List_and_Tree | 0 | 100.00
| 0875 |[Koko Eating Bananas](src.save/main/java/g0801_0900/s0875_koko_eating_bananas/Solution.java)| Medium | Array, Binary_Search, Binary_Search_II_Day_4 | 15 | 91.32
| 0874 |[Walking Robot Simulation](src.save/main/java/g0801_0900/s0874_walking_robot_simulation/Solution.java)| Medium | Array, Simulation | 16 | 93.75
| 0873 |[Length of Longest Fibonacci Subsequence](src.save/main/java/g0801_0900/s0873_length_of_longest_fibonacci_subsequence/Solution.java)| Medium | Array, Hash_Table, Dynamic_Programming | 120 | 92.64
| 0872 |[Leaf-Similar Trees](src.save/main/java/g0801_0900/s0872_leaf_similar_trees/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0871 |[Minimum Number of Refueling Stops](src.save/main/java/g0801_0900/s0871_minimum_number_of_refueling_stops/Solution.java)| Hard | Array, Dynamic_Programming, Greedy, Heap_Priority_Queue | 3 | 88.52
| 0870 |[Advantage Shuffle](src.save/main/java/g0801_0900/s0870_advantage_shuffle/Solution.java)| Medium | Array, Sorting, Greedy | 188 | 28.01
| 0869 |[Reordered Power of 2](src.save/main/java/g0801_0900/s0869_reordered_power_of_2/Solution.java)| Medium | Math, Sorting, Counting, Enumeration | 9 | 25.97
| 0868 |[Binary Gap](src.save/main/java/g0801_0900/s0868_binary_gap/Solution.java)| Easy | Math, Bit_Manipulation | 1 | 82.94
| 0867 |[Transpose Matrix](src.save/main/java/g0801_0900/s0867_transpose_matrix/Solution.java)| Easy | Array, Matrix, Simulation | 1 | 60.83
| 0866 |[Prime Palindrome](src.save/main/java/g0801_0900/s0866_prime_palindrome/Solution.java)| Medium | Math | 2 | 84.68
| 0865 |[Smallest Subtree with all the Deepest Nodes](src.save/main/java/g0801_0900/s0865_smallest_subtree_with_all_the_deepest_nodes/Solution.java)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0864 |[Shortest Path to Get All Keys](src.save/main/java/g0801_0900/s0864_shortest_path_to_get_all_keys/Solution.java)| Hard | Breadth_First_Search, Bit_Manipulation | 12 | 100.00
| 0863 |[All Nodes Distance K in Binary Tree](src.save/main/java/g0801_0900/s0863_all_nodes_distance_k_in_binary_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 12 | 80.25
| 0862 |[Shortest Subarray with Sum at Least K](src.save/main/java/g0801_0900/s0862_shortest_subarray_with_sum_at_least_k/Solution.java)| Hard | Array, Binary_Search, Heap_Priority_Queue, Prefix_Sum, Sliding_Window, Queue, Monotonic_Queue | 53 | 74.73
| 0861 |[Score After Flipping Matrix](src.save/main/java/g0801_0900/s0861_score_after_flipping_matrix/Solution.java)| Medium | Array, Greedy, Matrix, Bit_Manipulation | 1 | 70.04
| 0860 |[Lemonade Change](src.save/main/java/g0801_0900/s0860_lemonade_change/Solution.java)| Easy | Array, Greedy, Programming_Skills_II_Day_17 | 2 | 90.84
| 0859 |[Buddy Strings](src.save/main/java/g0801_0900/s0859_buddy_strings/Solution.java)| Easy | String, Hash_Table | 2 | 85.33
| 0858 |[Mirror Reflection](src.save/main/java/g0801_0900/s0858_mirror_reflection/Solution.java)| Medium | Math, Geometry | 0 | 100.00
| 0857 |[Minimum Cost to Hire K Workers](src.save/main/java/g0801_0900/s0857_minimum_cost_to_hire_k_workers/Solution.java)| Hard | Array, Sorting, Greedy, Heap_Priority_Queue | 26 | 85.40
| 0856 |[Score of Parentheses](src.save/main/java/g0801_0900/s0856_score_of_parentheses/Solution.java)| Medium | String, Stack | 1 | 67.71
| 0855 |[Exam Room](src.save/main/java/g0801_0900/s0855_exam_room/ExamRoom.java)| Medium | Design, Ordered_Set | 19 | 74.01
| 0854 |[K-Similar Strings](src.save/main/java/g0801_0900/s0854_k_similar_strings/Solution.java)| Hard | String, Breadth_First_Search | 2 | 99.58
| 0853 |[Car Fleet](src.save/main/java/g0801_0900/s0853_car_fleet/Solution.java)| Medium | Array, Sorting, Stack, Monotonic_Stack | 118 | 74.11
| 0852 |[Peak Index in a Mountain Array](src.save/main/java/g0801_0900/s0852_peak_index_in_a_mountain_array/Solution.java)| Easy | Array, Binary_Search, Binary_Search_I_Day_2 | 0 | 100.00
| 0851 |[Loud and Rich](src.save/main/java/g0801_0900/s0851_loud_and_rich/Solution.java)| Medium | Array, Depth_First_Search, Graph, Topological_Sort | 3 | 99.67
| 0850 |[Rectangle Area II](src.save/main/java/g0801_0900/s0850_rectangle_area_ii/Solution.java)| Hard | Array, Ordered_Set, Segment_Tree, Line_Sweep | 4 | 97.00
| 0849 |[Maximize Distance to Closest Person](src.save/main/java/g0801_0900/s0849_maximize_distance_to_closest_person/Solution.java)| Medium | Array | 1 | 100.00
| 0848 |[Shifting Letters](src.save/main/java/g0801_0900/s0848_shifting_letters/Solution.java)| Medium | Array, String | 11 | 88.11
| 0847 |[Shortest Path Visiting All Nodes](src.save/main/java/g0801_0900/s0847_shortest_path_visiting_all_nodes/Solution.java)| Hard | Dynamic_Programming, Breadth_First_Search, Bit_Manipulation, Graph, Bitmask, Graph_Theory_I_Day_10_Standard_Traversal | 14 | 78.72
| 0846 |[Hand of Straights](src.save/main/java/g0801_0900/s0846_hand_of_straights/Solution.java)| Medium | Array, Hash_Table, Sorting, Greedy | 19 | 96.16
| 0845 |[Longest Mountain in Array](src.save/main/java/g0801_0900/s0845_longest_mountain_in_array/Solution.java)| Medium | Array, Dynamic_Programming, Two_Pointers, Enumeration | 2 | 94.37
| 0844 |[Backspace String Compare](src.save/main/java/g0801_0900/s0844_backspace_string_compare/Solution.java)| Easy | String, Two_Pointers, Stack, Simulation, Algorithm_II_Day_4_Two_Pointers | 0 | 100.00
| 0843 |[Guess the Word](src.save/main/java/g0801_0900/s0843_guess_the_word/Solution.java)| Hard | Array, String, Math, Game_Theory, Interactive | 2 | 68.01
| 0842 |[Split Array into Fibonacci Sequence](src.save/main/java/g0801_0900/s0842_split_array_into_fibonacci_sequence/Solution.java)| Medium | String, Backtracking | 4 | 62.81
| 0841 |[Keys and Rooms](src.save/main/java/g0801_0900/s0841_keys_and_rooms/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Data_Structure_II_Day_19_Graph, Graph_Theory_I_Day_7_Standard_Traversal | 3 | 51.54
| 0840 |[Magic Squares In Grid](src.save/main/java/g0801_0900/s0840_magic_squares_in_grid/Solution.java)| Medium | Array, Math, Matrix | 0 | 100.00
| 0839 |[Similar String Groups](src.save/main/java/g0801_0900/s0839_similar_string_groups/Solution.java)| Hard | Array, String, Depth_First_Search, Breadth_First_Search, Union_Find | 15 | 80.39
| 0838 |[Push Dominoes](src.save/main/java/g0801_0900/s0838_push_dominoes/Solution.java)| Medium | String, Dynamic_Programming, Two_Pointers | 21 | 73.78
| 0837 |[New 21 Game](src.save/main/java/g0801_0900/s0837_new_21_game/Solution.java)| Medium | Dynamic_Programming, Math, Sliding_Window, Probability_and_Statistics | 5 | 77.70
| 0836 |[Rectangle Overlap](src.save/main/java/g0801_0900/s0836_rectangle_overlap/Solution.java)| Easy | Math, Geometry | 0 | 100.00
| 0835 |[Image Overlap](src.save/main/java/g0801_0900/s0835_image_overlap/Solution.java)| Medium | Array, Matrix | 6 | 98.73
| 0834 |[Sum of Distances in Tree](src.save/main/java/g0801_0900/s0834_sum_of_distances_in_tree/Solution.java)| Hard | Dynamic_Programming, Depth_First_Search, Tree, Graph | 52 | 91.09
| 0833 |[Find And Replace in String](src.save/main/java/g0801_0900/s0833_find_and_replace_in_string/Solution.java)| Medium | Array, String, Sorting | 3 | 70.10
| 0832 |[Flipping an Image](src.save/main/java/g0801_0900/s0832_flipping_an_image/Solution.java)| Easy | Array, Matrix, Two_Pointers, Simulation | 1 | 68.54
| 0831 |[Masking Personal Information](src.save/main/java/g0801_0900/s0831_masking_personal_information/Solution.java)| Medium | String | 1 | 84.30
| 0830 |[Positions of Large Groups](src.save/main/java/g0801_0900/s0830_positions_of_large_groups/Solution.java)| Easy | String | 2 | 80.94
| 0829 |[Consecutive Numbers Sum](src.save/main/java/g0801_0900/s0829_consecutive_numbers_sum/Solution.java)| Hard | Math, Enumeration | 3 | 93.37
| 0828 |[Count Unique Characters of All Substrings of a Given String](src.save/main/java/g0801_0900/s0828_count_unique_characters_of_all_substrings_of_a_given_string/Solution.java)| Hard | String, Dynamic_Programming | 101 | 18.42
| 0827 |[Making A Large Island](src.save/main/java/g0801_0900/s0827_making_a_large_island/Solution.java)| Hard | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 147 | 74.37
| 0826 |[Most Profit Assigning Work](src.save/main/java/g0801_0900/s0826_most_profit_assigning_work/Solution.java)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers, Binary_Search_II_Day_11 | 21 | 83.83
| 0825 |[Friends Of Appropriate Ages](src.save/main/java/g0801_0900/s0825_friends_of_appropriate_ages/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 3 | 87.71
| 0824 |[Goat Latin](src.save/main/java/g0801_0900/s0824_goat_latin/Solution.java)| Easy | String | 2 | 94.82
| 0823 |[Binary Trees With Factors](src.save/main/java/g0801_0900/s0823_binary_trees_with_factors/Solution.java)| Medium | Array, Hash_Table, Dynamic_Programming | 28 | 80.54
| 0822 |[Card Flipping Game](src.save/main/java/g0801_0900/s0822_card_flipping_game/Solution.java)| Medium | Array, Hash_Table | 2 | 96.55
| 0821 |[Shortest Distance to a Character](src.save/main/java/g0801_0900/s0821_shortest_distance_to_a_character/Solution.java)| Easy | Array, String, Two_Pointers | 3 | 42.73
| 0820 |[Short Encoding of Words](src.save/main/java/g0801_0900/s0820_short_encoding_of_words/Solution.java)| Medium | Array, String, Hash_Table, Trie | 35 | 49.44
| 0819 |[Most Common Word](src.save/main/java/g0801_0900/s0819_most_common_word/Solution.java)| Easy | String, Hash_Table, Counting | 10 | 88.85
| 0818 |[Race Car](src.save/main/java/g0801_0900/s0818_race_car/Solution.java)| Hard | Dynamic_Programming | 9 | 82.90
| 0817 |[Linked List Components](src.save/main/java/g0801_0900/s0817_linked_list_components/Solution.java)| Medium | Hash_Table, Linked_List | 7 | 76.10
| 0816 |[Ambiguous Coordinates](src.save/main/java/g0801_0900/s0816_ambiguous_coordinates/Solution.java)| Medium | String, Backtracking | 4 | 98.95
| 0815 |[Bus Routes](src.save/main/java/g0801_0900/s0815_bus_routes/Solution.java)| Hard | Array, Hash_Table, Breadth_First_Search | 49 | 89.11
| 0814 |[Binary Tree Pruning](src.save/main/java/g0801_0900/s0814_binary_tree_pruning/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0813 |[Largest Sum of Averages](src.save/main/java/g0801_0900/s0813_largest_sum_of_averages/Solution.java)| Medium | Array, Dynamic_Programming | 4 | 97.01
| 0812 |[Largest Triangle Area](src.save/main/java/g0801_0900/s0812_largest_triangle_area/Solution.java)| Easy | Array, Math, Geometry | 5 | 92.04
| 0811 |[Subdomain Visit Count](src.save/main/java/g0801_0900/s0811_subdomain_visit_count/Solution.java)| Medium | Array, String, Hash_Table, Counting | 5 | 100.00
| 0810 |[Chalkboard XOR Game](src.save/main/java/g0801_0900/s0810_chalkboard_xor_game/Solution.java)| Hard | Array, Math, Bit_Manipulation, Game_Theory, Brainteaser | 0 | 100.00
| 0809 |[Expressive Words](src.save/main/java/g0801_0900/s0809_expressive_words/Solution.java)| Medium | Array, String, Two_Pointers | 2 | 86.09
| 0808 |[Soup Servings](src.save/main/java/g0801_0900/s0808_soup_servings/Solution.java)| Medium | Dynamic_Programming, Math, Probability_and_Statistics | 1 | 96.04
| 0807 |[Max Increase to Keep City Skyline](src.save/main/java/g0801_0900/s0807_max_increase_to_keep_city_skyline/Solution.java)| Medium | Array, Greedy, Matrix | 2 | 23.49
| 0806 |[Number of Lines To Write String](src.save/main/java/g0801_0900/s0806_number_of_lines_to_write_string/Solution.java)| Easy | Array, String | 1 | 65.23
| 0805 |[Split Array With Same Average](src.save/main/java/g0801_0900/s0805_split_array_with_same_average/Solution.java)| Hard | Array, Dynamic_Programming, Math, Bit_Manipulation, Bitmask | 1323 | 22.41
| 0804 |[Unique Morse Code Words](src.save/main/java/g0801_0900/s0804_unique_morse_code_words/Solution.java)| Easy | Array, String, Hash_Table | 2 | 89.27
| 0803 |[Bricks Falling When Hit](src.save/main/java/g0801_0900/s0803_bricks_falling_when_hit/Solution.java)| Hard | Array, Matrix, Union_Find | 12 | 94.92
| 0802 |[Find Eventual Safe States](src.save/main/java/g0801_0900/s0802_find_eventual_safe_states/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort, Graph_Theory_I_Day_9_Standard_Traversal | 7 | 74.93
| 0801 |[Minimum Swaps To Make Sequences Increasing](src.save/main/java/g0801_0900/s0801_minimum_swaps_to_make_sequences_increasing/Solution.java)| Hard | Array, Dynamic_Programming | 6 | 71.94
| 0799 |[Champagne Tower](src.save/main/java/g0701_0800/s0799_champagne_tower/Solution.java)| Medium | Dynamic_Programming | 4 | 92.45
| 0798 |[Smallest Rotation with Highest Score](src.save/main/java/g0701_0800/s0798_smallest_rotation_with_highest_score/Solution.java)| Hard | Array, Prefix_Sum | 9 | 78.22
| 0797 |[All Paths From Source to Target](src.save/main/java/g0701_0800/s0797_all_paths_from_source_to_target/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Backtracking, Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_7_Standard_Traversal | 2 | 90.53
| 0796 |[Rotate String](src.save/main/java/g0701_0800/s0796_rotate_string/Solution.java)| Easy | String, String_Matching | 0 | 100.00
| 0795 |[Number of Subarrays with Bounded Maximum](src.save/main/java/g0701_0800/s0795_number_of_subarrays_with_bounded_maximum/Solution.java)| Medium | Array, Two_Pointers | 2 | 100.00
| 0794 |[Valid Tic-Tac-Toe State](src.save/main/java/g0701_0800/s0794_valid_tic_tac_toe_state/Solution.java)| Medium | Array, String | 0 | 100.00
| 0793 |[Preimage Size of Factorial Zeroes Function](src.save/main/java/g0701_0800/s0793_preimage_size_of_factorial_zeroes_function/Solution.java)| Hard | Math, Binary_Search | 0 | 100.00
| 0792 |[Number of Matching Subsequences](src.save/main/java/g0701_0800/s0792_number_of_matching_subsequences/Solution.java)| Medium | String, Hash_Table, Sorting, Trie | 92 | 84.26
| 0791 |[Custom Sort String](src.save/main/java/g0701_0800/s0791_custom_sort_string/Solution.java)| Medium | String, Hash_Table, Sorting | 1 | 78.82
| 0790 |[Domino and Tromino Tiling](src.save/main/java/g0701_0800/s0790_domino_and_tromino_tiling/Solution.java)| Medium | Dynamic_Programming | 0 | 100.00
| 0789 |[Escape The Ghosts](src.save/main/java/g0701_0800/s0789_escape_the_ghosts/Solution.java)| Medium | Array, Math | 0 | 100.00
| 0788 |[Rotated Digits](src.save/main/java/g0701_0800/s0788_rotated_digits/Solution.java)| Medium | Dynamic_Programming, Math | 2 | 98.95
| 0787 |[Cheapest Flights Within K Stops](src.save/main/java/g0701_0800/s0787_cheapest_flights_within_k_stops/Solution.java)| Medium | Dynamic_Programming, Depth_First_Search, Breadth_First_Search, Heap_Priority_Queue, Graph, Shortest_Path | 9 | 53.93
| 0786 |[K-th Smallest Prime Fraction](src.save/main/java/g0701_0800/s0786_k_th_smallest_prime_fraction/Solution.java)| Hard | Array, Binary_Search, Heap_Priority_Queue | 2 | 96.60
| 0785 |[Is Graph Bipartite?](src.save/main/java/g0701_0800/s0785_is_graph_bipartite/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Graph_Theory_I_Day_14_Graph_Theory | 0 | 100.00
| 0784 |[Letter Case Permutation](src.save/main/java/g0701_0800/s0784_letter_case_permutation/Solution.java)| Medium | String, Bit_Manipulation, Backtracking, Algorithm_I_Day_11_Recursion_Backtracking | 10 | 40.38
| 0783 |[Minimum Distance Between BST Nodes](src.save/main/java/g0701_0800/s0783_minimum_distance_between_bst_nodes/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 0782 |[Transform to Chessboard](src.save/main/java/g0701_0800/s0782_transform_to_chessboard/Solution.java)| Hard | Array, Math, Matrix, Bit_Manipulation | 2 | 53.57
| 0781 |[Rabbits in Forest](src.save/main/java/g0701_0800/s0781_rabbits_in_forest/Solution.java)| Medium | Array, Hash_Table, Math, Greedy | 1 | 99.15
| 0780 |[Reaching Points](src.save/main/java/g0701_0800/s0780_reaching_points/Solution.java)| Hard | Math | 0 | 100.00
| 0779 |[K-th Symbol in Grammar](src.save/main/java/g0701_0800/s0779_k_th_symbol_in_grammar/Solution.java)| Medium | Math, Bit_Manipulation, Recursion | 0 | 100.00
| 0778 |[Swim in Rising Water](src.save/main/java/g0701_0800/s0778_swim_in_rising_water/Solution.java)| Hard | Array, Depth_First_Search, Breadth_First_Search, Binary_Search, Matrix, Heap_Priority_Queue, Union_Find | 13 | 69.75
| 0777 |[Swap Adjacent in LR String](src.save/main/java/g0701_0800/s0777_swap_adjacent_in_lr_string/Solution.java)| Medium | String, Two_Pointers | 4 | 85.13
| 0775 |[Global and Local Inversions](src.save/main/java/g0701_0800/s0775_global_and_local_inversions/Solution.java)| Medium | Array, Math | 1 | 99.74
| 0773 |[Sliding Puzzle](src.save/main/java/g0701_0800/s0773_sliding_puzzle/Solution.java)| Hard | Array, Breadth_First_Search, Matrix | 9 | 81.80
| 0771 |[Jewels and Stones](src.save/main/java/g0701_0800/s0771_jewels_and_stones/Solution.java)| Easy | String, Hash_Table | 1 | 91.74
| 0770 |[Basic Calculator IV](src.save/main/java/g0701_0800/s0770_basic_calculator_iv/Solution.java)| Hard | String, Hash_Table, Math, Stack, Recursion | 8 | 96.92
| 0769 |[Max Chunks To Make Sorted](src.save/main/java/g0701_0800/s0769_max_chunks_to_make_sorted/Solution.java)| Medium | Array, Sorting, Greedy, Stack, Monotonic_Stack | 0 | 100.00
| 0768 |[Max Chunks To Make Sorted II](src.save/main/java/g0701_0800/s0768_max_chunks_to_make_sorted_ii/Solution.java)| Hard | Array, Sorting, Greedy, Stack, Monotonic_Stack | 1 | 87.58
| 0767 |[Reorganize String](src.save/main/java/g0701_0800/s0767_reorganize_string/Solution.java)| Medium | String, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting | 1 | 94.60
| 0766 |[Toeplitz Matrix](src.save/main/java/g0701_0800/s0766_toeplitz_matrix/Solution.java)| Easy | Array, Matrix | 1 | 83.45
| 0765 |[Couples Holding Hands](src.save/main/java/g0701_0800/s0765_couples_holding_hands/Solution.java)| Hard | Depth_First_Search, Greedy, Breadth_First_Search, Graph, Union_Find | 0 | 100.00
| 0764 |[Largest Plus Sign](src.save/main/java/g0701_0800/s0764_largest_plus_sign/Solution.java)| Medium | Array, Dynamic_Programming | 39 | 87.23
| 0763 |[Partition Labels](src.save/main/java/g0701_0800/s0763_partition_labels/Solution.java)| Medium | Top_100_Liked_Questions, String, Hash_Table, Greedy, Two_Pointers, Data_Structure_II_Day_7_String | 1 | 100.00
| 0762 |[Prime Number of Set Bits in Binary Representation](src.save/main/java/g0701_0800/s0762_prime_number_of_set_bits_in_binary_representation/Solution.java)| Easy | Math, Bit_Manipulation | 4 | 98.39
| 0761 |[Special Binary String](src.save/main/java/g0701_0800/s0761_special_binary_string/Solution.java)| Hard | String, Recursion | 1 | 100.00
| 0757 |[Set Intersection Size At Least Two](src.save/main/java/g0701_0800/s0757_set_intersection_size_at_least_two/Solution.java)| Hard | Array, Sorting, Greedy | 4 | 100.00
| 0756 |[Pyramid Transition Matrix](src.save/main/java/g0701_0800/s0756_pyramid_transition_matrix/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Bit_Manipulation | 129 | 82.94
| 0754 |[Reach a Number](src.save/main/java/g0701_0800/s0754_reach_a_number/Solution.java)| Medium | Math, Binary_Search | 0 | 100.00
| 0753 |[Cracking the Safe](src.save/main/java/g0701_0800/s0753_cracking_the_safe/Solution.java)| Hard | Depth_First_Search, Graph, Eulerian_Circuit | 4 | 96.44
| 0752 |[Open the Lock](src.save/main/java/g0701_0800/s0752_open_the_lock/Solution.java)| Medium | Array, String, Hash_Table, Breadth_First_Search, Graph_Theory_I_Day_12_Breadth_First_Search | 72 | 91.06
| 0749 |[Contain Virus](src.save/main/java/g0701_0800/s0749_contain_virus/Solution.java)| Hard | Array, Depth_First_Search, Breadth_First_Search, Matrix, Simulation | 23 | 37.62
| 0748 |[Shortest Completing Word](src.save/main/java/g0701_0800/s0748_shortest_completing_word/Solution.java)| Easy | Array, String, Hash_Table | 3 | 93.75
| 0747 |[Largest Number At Least Twice of Others](src.save/main/java/g0701_0800/s0747_largest_number_at_least_twice_of_others/Solution.java)| Easy | Array, Sorting | 0 | 100.00
| 0746 |[Min Cost Climbing Stairs](src.save/main/java/g0701_0800/s0746_min_cost_climbing_stairs/Solution.java)| Easy | Array, Dynamic_Programming, Dynamic_Programming_I_Day_2 | 1 | 86.38
| 0745 |[Prefix and Suffix Search](src.save/main/java/g0701_0800/s0745_prefix_and_suffix_search/WordFilter.java)| Hard | String, Design, Trie | 366 | 76.15
| 0744 |[Find Smallest Letter Greater Than Target](src.save/main/java/g0701_0800/s0744_find_smallest_letter_greater_than_target/Solution.java)| Easy | Array, Binary_Search, Binary_Search_I_Day_4 | 0 | 100.00
| 0743 |[Network Delay Time](src.save/main/java/g0701_0800/s0743_network_delay_time/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Heap_Priority_Queue, Graph, Shortest_Path | 3 | 99.87
| 0741 |[Cherry Pickup](src.save/main/java/g0701_0800/s0741_cherry_pickup/Solution.java)| Hard | Array, Dynamic_Programming, Matrix | 11 | 99.40
| 0740 |[Delete and Earn](src.save/main/java/g0701_0800/s0740_delete_and_earn/Solution.java)| Medium | Array, Hash_Table, Dynamic_Programming, Dynamic_Programming_I_Day_3 | 4 | 77.68
| 0739 |[Daily Temperatures](src.save/main/java/g0701_0800/s0739_daily_temperatures/Solution.java)| Medium | Top_100_Liked_Questions, Array, Stack, Monotonic_Stack, Programming_Skills_II_Day_6 | 10 | 94.99
| 0738 |[Monotone Increasing Digits](src.save/main/java/g0701_0800/s0738_monotone_increasing_digits/Solution.java)| Medium | Math, Greedy | 0 | 100.00
| 0736 |[Parse Lisp Expression](src.save/main/java/g0701_0800/s0736_parse_lisp_expression/Solution.java)| Hard | String, Hash_Table, Stack, Recursion | 4 | 95.58
| 0735 |[Asteroid Collision](src.save/main/java/g0701_0800/s0735_asteroid_collision/Solution.java)| Medium | Array, Stack | 2 | 99.59
| 0733 |[Flood Fill](src.save/main/java/g0701_0800/s0733_flood_fill/Solution.java)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix, Algorithm_I_Day_7_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_1_Matrix_Related_Problems | 1 | 85.36
| 0732 |[My Calendar III](src.save/main/java/g0701_0800/s0732_my_calendar_iii/MyCalendarThree.java)| Hard | Design, Ordered_Set, Segment_Tree | 40 | 95.37
| 0731 |[My Calendar II](src.save/main/java/g0701_0800/s0731_my_calendar_ii/MyCalendarTwo.java)| Medium | Design, Ordered_Set, Segment_Tree | 27 | 97.74
| 0730 |[Count Different Palindromic Subsequences](src.save/main/java/g0701_0800/s0730_count_different_palindromic_subsequences/Solution.java)| Hard | String, Dynamic_Programming | 45 | 92.84
| 0729 |[My Calendar I](src.save/main/java/g0701_0800/s0729_my_calendar_i/MyCalendar.java)| Medium | Design, Ordered_Set, Segment_Tree, Programming_Skills_II_Day_20 | 17 | 97.23
| 0728 |[Self Dividing Numbers](src.save/main/java/g0701_0800/s0728_self_dividing_numbers/Solution.java)| Easy | Math | 1 | 100.00
| 0726 |[Number of Atoms](src.save/main/java/g0701_0800/s0726_number_of_atoms/Solution.java)| Hard | String, Hash_Table, Sorting, Stack | 4 | 87.22
| 0725 |[Split Linked List in Parts](src.save/main/java/g0701_0800/s0725_split_linked_list_in_parts/Solution.java)| Medium | Linked_List | 1 | 30.85
| 0724 |[Find Pivot Index](src.save/main/java/g0701_0800/s0724_find_pivot_index/Solution.java)| Easy | Array, Prefix_Sum | 2 | 69.67
| 0722 |[Remove Comments](src.save/main/java/g0701_0800/s0722_remove_comments/Solution.java)| Medium | Array, String | 1 | 80.24
| 0721 |[Accounts Merge](src.save/main/java/g0701_0800/s0721_accounts_merge/Solution.java)| Medium | Array, String, Depth_First_Search, Breadth_First_Search, Union_Find | 71 | 31.21
| 0720 |[Longest Word in Dictionary](src.save/main/java/g0701_0800/s0720_longest_word_in_dictionary/Solution.java)| Medium | Array, String, Hash_Table, Sorting, Trie | 13 | 84.66
| 0719 |[Find K-th Smallest Pair Distance](src.save/main/java/g0701_0800/s0719_find_k_th_smallest_pair_distance/Solution.java)| Hard | Array, Sorting, Binary_Search, Two_Pointers | 8 | 81.40
| 0718 |[Maximum Length of Repeated Subarray](src.save/main/java/g0701_0800/s0718_maximum_length_of_repeated_subarray/Solution.java)| Medium | Array, Dynamic_Programming, Binary_Search, Sliding_Window, Hash_Function, Rolling_Hash | 58 | 77.21
| 0717 |[1-bit and 2-bit Characters](src.save/main/java/g0701_0800/s0717_1_bit_and_2_bit_characters/Solution.java)| Easy | Array | 0 | 100.00
| 0715 |[Range Module](src.save/main/java/g0701_0800/s0715_range_module/RangeModule.java)| Hard | Design, Ordered_Set, Segment_Tree | 35 | 98.62
| 0714 |[Best Time to Buy and Sell Stock with Transaction Fee](src.save/main/java/g0701_0800/s0714_best_time_to_buy_and_sell_stock_with_transaction_fee/Solution.java)| Medium | Array, Dynamic_Programming, Greedy, Dynamic_Programming_I_Day_8 | 4 | 78.57
| 0713 |[Subarray Product Less Than K](src.save/main/java/g0701_0800/s0713_subarray_product_less_than_k/Solution.java)| Medium | Array, Sliding_Window, Algorithm_II_Day_5_Sliding_Window, Programming_Skills_II_Day_12 | 8 | 39.00
| 0712 |[Minimum ASCII Delete Sum for Two Strings](src.save/main/java/g0701_0800/s0712_minimum_ascii_delete_sum_for_two_strings/Solution.java)| Medium | String, Dynamic_Programming | 18 | 91.28
| 0710 |[Random Pick with Blacklist](src.save/main/java/g0701_0800/s0710_random_pick_with_blacklist/Solution.java)| Hard | Hash_Table, Math, Sorting, Binary_Search, Randomized | 56 | 74.41
| 0709 |[To Lower Case](src.save/main/java/g0701_0800/s0709_to_lower_case/Solution.java)| Easy | String, Programming_Skills_I_Day_9_String | 1 | 71.74
| 0707 |[Design Linked List](src.save/main/java/g0701_0800/s0707_design_linked_list/MyLinkedList.java)| Medium | Design, Linked_List, Data_Structure_II_Day_12_Linked_List, Programming_Skills_II_Day_19 | 10 | 70.60
| 0706 |[Design HashMap](src.save/main/java/g0701_0800/s0706_design_hashmap/MyHashMap.java)| Easy | Array, Hash_Table, Design, Linked_List, Hash_Function, Data_Structure_II_Day_2_Array | 13 | 95.71
| 0705 |[Design HashSet](src.save/main/java/g0701_0800/s0705_design_hashset/MyHashSet.java)| Easy | Array, Hash_Table, Design, Linked_List, Hash_Function | 29 | 57.06
| 0704 |[Binary Search](src.save/main/java/g0701_0800/s0704_binary_search/Solution.java)| Easy | Array, Binary_Search, Algorithm_I_Day_1_Binary_Search, Binary_Search_I_Day_1 | 0 | 100.00
| 0703 |[Kth Largest Element in a Stream](src.save/main/java/g0701_0800/s0703_kth_largest_element_in_a_stream/KthLargest.java)| Easy | Tree, Binary_Tree, Design, Heap_Priority_Queue, Binary_Search_Tree, Data_Stream | 22 | 52.43
| 0701 |[Insert into a Binary Search Tree](src.save/main/java/g0701_0800/s0701_insert_into_a_binary_search_tree/Solution.java)| Medium | Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_I_Day_13_Tree | 0 | 100.00
| 0700 |[Search in a Binary Search Tree](src.save/main/java/g0601_0700/s0700_search_in_a_binary_search_tree/Solution.java)| Easy | Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_I_Day_13_Tree | 0 | 100.00
| 0699 |[Falling Squares](src.save/main/java/g0601_0700/s0699_falling_squares/Solution.java)| Hard | Array, Ordered_Set, Segment_Tree | 8 | 91.03
| 0698 |[Partition to K Equal Sum Subsets](src.save/main/java/g0601_0700/s0698_partition_to_k_equal_sum_subsets/Solution.java)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask, Memoization | 24 | 85.43
| 0697 |[Degree of an Array](src.save/main/java/g0601_0700/s0697_degree_of_an_array/Solution.java)| Easy | Array, Hash_Table | 14 | 93.19
| 0696 |[Count Binary Substrings](src.save/main/java/g0601_0700/s0696_count_binary_substrings/Solution.java)| Easy | String, Two_Pointers | 5 | 100.00
| 0695 |[Max Area of Island](src.save/main/java/g0601_0700/s0695_max_area_of_island/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Algorithm_I_Day_7_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_2_Matrix_Related_Problems | 3 | 76.79
| 0693 |[Binary Number with Alternating Bits](src.save/main/java/g0601_0700/s0693_binary_number_with_alternating_bits/Solution.java)| Easy | Bit_Manipulation | 0 | 100.00
| 0692 |[Top K Frequent Words](src.save/main/java/g0601_0700/s0692_top_k_frequent_words/Solution.java)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Trie, Bucket_Sort | 11 | 38.54
| 0691 |[Stickers to Spell Word](src.save/main/java/g0601_0700/s0691_stickers_to_spell_word/Solution.java)| Hard | Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 34 | 70.23
| 0690 |[Employee Importance](src.save/main/java/g0601_0700/s0690_employee_importance/Solution.java)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search | 7 | 77.84
| 0689 |[Maximum Sum of 3 Non-Overlapping Subarrays](src.save/main/java/g0601_0700/s0689_maximum_sum_of_3_non_overlapping_subarrays/Solution.java)| Hard | Array, Dynamic_Programming | 5 | 64.24
| 0688 |[Knight Probability in Chessboard](src.save/main/java/g0601_0700/s0688_knight_probability_in_chessboard/Solution.java)| Medium | Dynamic_Programming | 7 | 85.13
| 0687 |[Longest Univalue Path](src.save/main/java/g0601_0700/s0687_longest_univalue_path/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 3 | 79.43
| 0686 |[Repeated String Match](src.save/main/java/g0601_0700/s0686_repeated_string_match/Solution.java)| Medium | String, String_Matching | 7 | 94.56
| 0685 |[Redundant Connection II](src.save/main/java/g0601_0700/s0685_redundant_connection_ii/Solution.java)| Hard | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 1 | 96.65
| 0684 |[Redundant Connection](src.save/main/java/g0601_0700/s0684_redundant_connection/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 0 | 100.00
| 0682 |[Baseball Game](src.save/main/java/g0601_0700/s0682_baseball_game/Solution.java)| Easy | Array, Stack, Simulation | 4 | 57.60
| 0680 |[Valid Palindrome II](src.save/main/java/g0601_0700/s0680_valid_palindrome_ii/Solution.java)| Easy | String, Greedy, Two_Pointers | 10 | 61.31
| 0679 |[24 Game](src.save/main/java/g0601_0700/s0679_24_game/Solution.java)| Hard | Array, Math, Backtracking | 3 | 87.01
| 0678 |[Valid Parenthesis String](src.save/main/java/g0601_0700/s0678_valid_parenthesis_string/Solution.java)| Medium | String, Dynamic_Programming, Greedy, Stack | 0 | 100.00
| 0677 |[Map Sum Pairs](src.save/main/java/g0601_0700/s0677_map_sum_pairs/MapSum.java)| Medium | String, Hash_Table, Design, Trie | 17 | 70.10
| 0676 |[Implement Magic Dictionary](src.save/main/java/g0601_0700/s0676_implement_magic_dictionary/MagicDictionary.java)| Medium | String, Hash_Table, Design, Trie | 38 | 86.83
| 0675 |[Cut Off Trees for Golf Event](src.save/main/java/g0601_0700/s0675_cut_off_trees_for_golf_event/Solution.java)| Hard | Array, Breadth_First_Search, Matrix, Heap_Priority_Queue | 417 | 73.86
| 0674 |[Longest Continuous Increasing Subsequence](src.save/main/java/g0601_0700/s0674_longest_continuous_increasing_subsequence/Solution.java)| Easy | Array | 2 | 40.35
| 0673 |[Number of Longest Increasing Subsequence](src.save/main/java/g0601_0700/s0673_number_of_longest_increasing_subsequence/Solution.java)| Medium | Array, Dynamic_Programming, Segment_Tree, Binary_Indexed_Tree, Algorithm_II_Day_16_Dynamic_Programming | 25 | 68.75
| 0672 |[Bulb Switcher II](src.save/main/java/g0601_0700/s0672_bulb_switcher_ii/Solution.java)| Medium | Math, Depth_First_Search, Breadth_First_Search, Bit_Manipulation | 0 | 100.00
| 0671 |[Second Minimum Node In a Binary Tree](src.save/main/java/g0601_0700/s0671_second_minimum_node_in_a_binary_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0670 |[Maximum Swap](src.save/main/java/g0601_0700/s0670_maximum_swap/Solution.java)| Medium | Math, Greedy | 1 | 80.14
| 0669 |[Trim a Binary Search Tree](src.save/main/java/g0601_0700/s0669_trim_a_binary_search_tree/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 0668 |[Kth Smallest Number in Multiplication Table](src.save/main/java/g0601_0700/s0668_kth_smallest_number_in_multiplication_table/Solution.java)| Hard | Binary_Search | 12 | 97.84
| 0667 |[Beautiful Arrangement II](src.save/main/java/g0601_0700/s0667_beautiful_arrangement_ii/Solution.java)| Medium | Array, Math | 1 | 84.62
| 0665 |[Non-decreasing Array](src.save/main/java/g0601_0700/s0665_non_decreasing_array/Solution.java)| Medium | Array | 1 | 86.75
| 0664 |[Strange Printer](src.save/main/java/g0601_0700/s0664_strange_printer/Solution.java)| Hard | String, Dynamic_Programming | 24 | 76.35
| 0662 |[Maximum Width of Binary Tree](src.save/main/java/g0601_0700/s0662_maximum_width_of_binary_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 2 | 78.93
| 0661 |[Image Smoother](src.save/main/java/g0601_0700/s0661_image_smoother/Solution.java)| Easy | Array, Matrix | 2 | 100.00
| 0659 |[Split Array into Consecutive Subsequences](src.save/main/java/g0601_0700/s0659_split_array_into_consecutive_subsequences/Solution.java)| Medium | Array, Hash_Table, Greedy, Heap_Priority_Queue | 4 | 95.88
| 0658 |[Find K Closest Elements](src.save/main/java/g0601_0700/s0658_find_k_closest_elements/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Heap_Priority_Queue, Binary_Search_II_Day_2 | 3 | 99.20
| 0657 |[Robot Return to Origin](src.save/main/java/g0601_0700/s0657_robot_return_to_origin/Solution.java)| Easy | String, Simulation | 3 | 99.87
| 0655 |[Print Binary Tree](src.save/main/java/g0601_0700/s0655_print_binary_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 98.04
| 0654 |[Maximum Binary Tree](src.save/main/java/g0601_0700/s0654_maximum_binary_tree/Solution.java)| Medium | Array, Tree, Binary_Tree, Stack, Monotonic_Stack, Divide_and_Conquer | 3 | 84.36
| 0653 |[Two Sum IV - Input is a BST](src.save/main/java/g0601_0700/s0653_two_sum_iv_input_is_a_bst/Solution.java)| Easy | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Two_Pointers, Binary_Search_Tree, Data_Structure_I_Day_14_Tree | 5 | 74.23
| 0652 |[Find Duplicate Subtrees](src.save/main/java/g0601_0700/s0652_find_duplicate_subtrees/Solution.java)| Medium | Hash_Table, Depth_First_Search, Tree, Binary_Tree | 32 | 60.16
| 0650 |[2 Keys Keyboard](src.save/main/java/g0601_0700/s0650_2_keys_keyboard/Solution.java)| Medium | Dynamic_Programming, Math | 0 | 100.00
| 0649 |[Dota2 Senate](src.save/main/java/g0601_0700/s0649_dota2_senate/Solution.java)| Medium | String, Greedy, Queue | 4 | 95.00
| 0648 |[Replace Words](src.save/main/java/g0601_0700/s0648_replace_words/Solution.java)| Medium | Array, String, Hash_Table, Trie | 14 | 87.12
| 0647 |[Palindromic Substrings](src.save/main/java/g0601_0700/s0647_palindromic_substrings/Solution.java)| Medium | String, Dynamic_Programming | 2 | 98.77
| 0646 |[Maximum Length of Pair Chain](src.save/main/java/g0601_0700/s0646_maximum_length_of_pair_chain/Solution.java)| Medium | Array, Dynamic_Programming, Sorting, Greedy | 11 | 88.84
| 0645 |[Set Mismatch](src.save/main/java/g0601_0700/s0645_set_mismatch/Solution.java)| Easy | Array, Hash_Table, Sorting, Bit_Manipulation | 2 | 97.45
| 0643 |[Maximum Average Subarray I](src.save/main/java/g0601_0700/s0643_maximum_average_subarray_i/Solution.java)| Easy | Array, Sliding_Window | 5 | 74.81
| 0641 |[Design Circular Deque](src.save/main/java/g0601_0700/s0641_design_circular_deque/MyCircularDeque.java)| Medium | Array, Design, Linked_List, Queue | 3 | 100.00
| 0640 |[Solve the Equation](src.save/main/java/g0601_0700/s0640_solve_the_equation/Solution.java)| Medium | String, Math, Simulation | 5 | 69.29
| 0639 |[Decode Ways II](src.save/main/java/g0601_0700/s0639_decode_ways_ii/Solution.java)| Hard | String, Dynamic_Programming | 22 | 93.12
| 0638 |[Shopping Offers](src.save/main/java/g0601_0700/s0638_shopping_offers/Solution.java)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask, Memoization | 6 | 71.06
| 0637 |[Average of Levels in Binary Tree](src.save/main/java/g0601_0700/s0637_average_of_levels_in_binary_tree/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 2 | 89.32
| 0636 |[Exclusive Time of Functions](src.save/main/java/g0601_0700/s0636_exclusive_time_of_functions/Solution.java)| Medium | Array, Stack | 17 | 76.73
| 0633 |[Sum of Square Numbers](src.save/main/java/g0601_0700/s0633_sum_of_square_numbers/Solution.java)| Medium | Math, Binary_Search, Two_Pointers, Binary_Search_I_Day_10 | 4 | 82.92
| 0632 |[Smallest Range Covering Elements from K Lists](src.save/main/java/g0601_0700/s0632_smallest_range_covering_elements_from_k_lists/Solution.java)| Hard | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Sliding_Window | 31 | 87.39
| 0630 |[Course Schedule III](src.save/main/java/g0601_0700/s0630_course_schedule_iii/Solution.java)| Hard | Array, Greedy, Heap_Priority_Queue | 53 | 58.83
| 0629 |[K Inverse Pairs Array](src.save/main/java/g0601_0700/s0629_k_inverse_pairs_array/Solution.java)| Hard | Dynamic_Programming | 19 | 94.44
| 0628 |[Maximum Product of Three Numbers](src.save/main/java/g0601_0700/s0628_maximum_product_of_three_numbers/Solution.java)| Easy | Array, Math, Sorting | 2 | 99.90
| 0627 |[Swap Salary](src.save/main/java/g0601_0700/s0627_swap_salary/script.sql)| Easy | Database, SQL_I_Day_2_Select_and_Order | 191 | 96.89
| 0626 |[Exchange Seats](src.save/main/java/g0601_0700/s0626_exchange_seats/script.sql)| Medium | Database | 274 | 65.75
| 0623 |[Add One Row to Tree](src.save/main/java/g0601_0700/s0623_add_one_row_to_tree/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0622 |[Design Circular Queue](src.save/main/java/g0601_0700/s0622_design_circular_queue/MyCircularQueue.java)| Medium | Array, Design, Linked_List, Queue, Programming_Skills_II_Day_20 | 3 | 100.00
| 0621 |[Task Scheduler](src.save/main/java/g0601_0700/s0621_task_scheduler/Solution.java)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting | 3 | 84.32
| 0620 |[Not Boring Movies](src.save/main/java/g0601_0700/s0620_not_boring_movies/script.sql)| Easy | Database | 258 | 28.33
| 0617 |[Merge Two Binary Trees](src.save/main/java/g0601_0700/s0617_merge_two_binary_trees/Solution.java)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Algorithm_I_Day_8_Breadth_First_Search_Depth_First_Search | 1 | 72.47
| 0611 |[Valid Triangle Number](src.save/main/java/g0601_0700/s0611_valid_triangle_number/Solution.java)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers, Binary_Search_II_Day_1 | 10 | 100.00
| 0609 |[Find Duplicate File in System](src.save/main/java/g0601_0700/s0609_find_duplicate_file_in_system/Solution.java)| Medium | Array, String, Hash_Table | 20 | 97.68
| 0608 |[Tree Node](src.save/main/java/g0601_0700/s0608_tree_node/script.sql)| Medium | Database, SQL_I_Day_4_Union_and_Select | 347 | 95.17
| 0607 |[Sales Person](src.save/main/java/g0601_0700/s0607_sales_person/script.sql)| Easy | Database, SQL_I_Day_6_Union | 1046 | 86.04
| 0606 |[Construct String from Binary Tree](src.save/main/java/g0601_0700/s0606_construct_string_from_binary_tree/Solution.java)| Easy | String, Depth_First_Search, Tree, Binary_Tree | 1 | 100.00
| 0605 |[Can Place Flowers](src.save/main/java/g0601_0700/s0605_can_place_flowers/Solution.java)| Easy | Array, Greedy | 1 | 96.77
| 0601 |[Human Traffic of Stadium](src.save/main/java/g0601_0700/s0601_human_traffic_of_stadium/script.sql)| Hard | Database | 328 | 62.41
| 0600 |[Non-negative Integers without Consecutive Ones](src.save/main/java/g0501_0600/s0600_non_negative_integers_without_consecutive_ones/Solution.java)| Hard | Dynamic_Programming | 2 | 74.62
| 0599 |[Minimum Index Sum of Two Lists](src.save/main/java/g0501_0600/s0599_minimum_index_sum_of_two_lists/Solution.java)| Easy | Array, String, Hash_Table | 7 | 93.97
| 0598 |[Range Addition II](src.save/main/java/g0501_0600/s0598_range_addition_ii/Solution.java)| Easy | Array, Math | 0 | 100.00
| 0596 |[Classes More Than 5 Students](src.save/main/java/g0501_0600/s0596_classes_more_than_5_students/script.sql)| Easy | Database | 243 | 92.65
| 0595 |[Big Countries](src.save/main/java/g0501_0600/s0595_big_countries/script.sql)| Easy | Database, SQL_I_Day_1_Select | 241 | 92.61
| 0594 |[Longest Harmonious Subsequence](src.save/main/java/g0501_0600/s0594_longest_harmonious_subsequence/Solution.java)| Easy | Array, Hash_Table, Sorting | 11 | 99.77
| 0593 |[Valid Square](src.save/main/java/g0501_0600/s0593_valid_square/Solution.java)| Medium | Math, Geometry | 1 | 97.14
| 0592 |[Fraction Addition and Subtraction](src.save/main/java/g0501_0600/s0592_fraction_addition_and_subtraction/Solution.java)| Medium | String, Math, Simulation | 4 | 98.58
| 0591 |[Tag Validator](src.save/main/java/g0501_0600/s0591_tag_validator/Solution.java)| Hard | String, Stack | 3 | 70.89
| 0590 |[N-ary Tree Postorder Traversal](src.save/main/java/g0501_0600/s0590_n_ary_tree_postorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Stack | 0 | 100.00
| 0589 |[N-ary Tree Preorder Traversal](src.save/main/java/g0501_0600/s0589_n_ary_tree_preorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Stack, Programming_Skills_I_Day_5_Function | 2 | 54.35
| 0587 |[Erect the Fence](src.save/main/java/g0501_0600/s0587_erect_the_fence/Solution.java)| Hard | Array, Math, Geometry | 10 | 87.50
| 0586 |[Customer Placing the Largest Number of Orders](src.save/main/java/g0501_0600/s0586_customer_placing_the_largest_number_of_orders/script.sql)| Easy | Database, SQL_I_Day_8_Function | 392 | 90.54
| 0584 |[Find Customer Referee](src.save/main/java/g0501_0600/s0584_find_customer_referee/script.sql)| Easy | Database, SQL_I_Day_1_Select | 505 | 43.87
| 0583 |[Delete Operation for Two Strings](src.save/main/java/g0501_0600/s0583_delete_operation_for_two_strings/Solution.java)| Medium | String, Dynamic_Programming, Algorithm_II_Day_17_Dynamic_Programming | 12 | 73.04
| 0581 |[Shortest Unsorted Continuous Subarray](src.save/main/java/g0501_0600/s0581_shortest_unsorted_continuous_subarray/Solution.java)| Medium | Array, Sorting, Greedy, Two_Pointers, Stack, Monotonic_Stack | 1 | 98.19
| 0576 |[Out of Boundary Paths](src.save/main/java/g0501_0600/s0576_out_of_boundary_paths/Solution.java)| Medium | Dynamic_Programming | 7 | 74.13
| 0575 |[Distribute Candies](src.save/main/java/g0501_0600/s0575_distribute_candies/Solution.java)| Easy | Array, Hash_Table | 64 | 40.90
| 0572 |[Subtree of Another Tree](src.save/main/java/g0501_0600/s0572_subtree_of_another_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Hash_Function, String_Matching, Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search | 0 | 100.00
| 0567 |[Permutation in String](src.save/main/java/g0501_0600/s0567_permutation_in_string/Solution.java)| Medium | String, Hash_Table, Two_Pointers, Sliding_Window, Algorithm_I_Day_6_Sliding_Window | 4 | 95.23
| 0566 |[Reshape the Matrix](src.save/main/java/g0501_0600/s0566_reshape_the_matrix/Solution.java)| Easy | Array, Matrix, Simulation, Data_Structure_I_Day_4_Array, Programming_Skills_I_Day_7_Array | 1 | 84.34
| 0565 |[Array Nesting](src.save/main/java/g0501_0600/s0565_array_nesting/Solution.java)| Medium | Array, Depth_First_Search | 4 | 98.54
| 0564 |[Find the Closest Palindrome](src.save/main/java/g0501_0600/s0564_find_the_closest_palindrome/Solution.java)| Hard | String, Math | 1 | 100.00
| 0563 |[Binary Tree Tilt](src.save/main/java/g0501_0600/s0563_binary_tree_tilt/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0561 |[Array Partition I](src.save/main/java/g0501_0600/s0561_array_partition_i/Solution.java)| Easy | Array, Sorting, Greedy, Counting_Sort | 18 | 31.77
| 0560 |[Subarray Sum Equals K](src.save/main/java/g0501_0600/s0560_subarray_sum_equals_k/Solution.java)| Medium | Top_100_Liked_Questions, Array, Hash_Table, Prefix_Sum, Data_Structure_II_Day_5_Array | 18 | 89.51
| 0559 |[Maximum Depth of N-ary Tree](src.save/main/java/g0501_0600/s0559_maximum_depth_of_n_ary_tree/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree | 1 | 78.18
| 0558 |[Logical OR of Two Binary Grids Represented as Quad-Trees](src.save/main/java/g0501_0600/s0558_logical_or_of_two_binary_grids_represented_as_quad_trees/Solution.java)| Medium | Tree, Divide_and_Conquer | 0 | 100.00
| 0557 |[Reverse Words in a String III](src.save/main/java/g0501_0600/s0557_reverse_words_in_a_string_iii/Solution.java)| Easy | String, Two_Pointers, Algorithm_I_Day_4_Two_Pointers | 5 | 88.09
| 0556 |[Next Greater Element III](src.save/main/java/g0501_0600/s0556_next_greater_element_iii/Solution.java)| Medium | String, Math, Two_Pointers, Programming_Skills_II_Day_10 | 0 | 100.00
| 0554 |[Brick Wall](src.save/main/java/g0501_0600/s0554_brick_wall/Solution.java)| Medium | Array, Hash_Table | 13 | 75.64
| 0553 |[Optimal Division](src.save/main/java/g0501_0600/s0553_optimal_division/Solution.java)| Medium | Array, Dynamic_Programming, Math | 1 | 96.63
| 0552 |[Student Attendance Record II](src.save/main/java/g0501_0600/s0552_student_attendance_record_ii/Solution.java)| Hard | Dynamic_Programming | 8 | 99.21
| 0551 |[Student Attendance Record I](src.save/main/java/g0501_0600/s0551_student_attendance_record_i/Solution.java)| Easy | String | 1 | 68.22
| 0547 |[Number of Provinces](src.save/main/java/g0501_0600/s0547_number_of_provinces/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Algorithm_II_Day_6_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_8_Standard_Traversal | 1 | 94.56
| 0546 |[Remove Boxes](src.save/main/java/g0501_0600/s0546_remove_boxes/Solution.java)| Hard | Array, Dynamic_Programming, Memoization | 86 | 60.93
| 0543 |[Diameter of Binary Tree](src.save/main/java/g0501_0600/s0543_diameter_of_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree | 1 | 55.16
| 0542 |[01 Matrix](src.save/main/java/g0501_0600/s0542_01_matrix/Solution.java)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix, Algorithm_I_Day_9_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_5_Matrix_Related_Problems | 6 | 96.78
| 0541 |[Reverse String II](src.save/main/java/g0501_0600/s0541_reverse_string_ii/Solution.java)| Easy | String, Two_Pointers | 1 | 93.18
| 0540 |[Single Element in a Sorted Array](src.save/main/java/g0501_0600/s0540_single_element_in_a_sorted_array/Solution.java)| Medium | Array, Binary_Search, Binary_Search_II_Day_9 | 0 | 100.00
| 0539 |[Minimum Time Difference](src.save/main/java/g0501_0600/s0539_minimum_time_difference/Solution.java)| Medium | Array, String, Math, Sorting | 3 | 93.52
| 0538 |[Convert BST to Greater Tree](src.save/main/java/g0501_0600/s0538_convert_bst_to_greater_tree/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 1 | 83.78
| 0537 |[Complex Number Multiplication](src.save/main/java/g0501_0600/s0537_complex_number_multiplication/Solution.java)| Medium | String, Math, Simulation | 7 | 62.22
| 0535 |[Encode and Decode TinyURL](src.save/main/java/g0501_0600/s0535_encode_and_decode_tinyurl/Codec.java)| Medium | String, Hash_Table, Design, Hash_Function | 4 | 65.42
| 0532 |[K-diff Pairs in an Array](src.save/main/java/g0501_0600/s0532_k_diff_pairs_in_an_array/Solution.java)| Medium | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 14 | 49.69
| 0530 |[Minimum Absolute Difference in BST](src.save/main/java/g0501_0600/s0530_minimum_absolute_difference_in_bst/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 0 | 100.00
| 0529 |[Minesweeper](src.save/main/java/g0501_0600/s0529_minesweeper/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 0 | 100.00
| 0528 |[Random Pick with Weight](src.save/main/java/g0501_0600/s0528_random_pick_with_weight/Solution.java)| Medium | Math, Binary_Search, Prefix_Sum, Randomized, Binary_Search_II_Day_13 | 29 | 83.26
| 0526 |[Beautiful Arrangement](src.save/main/java/g0501_0600/s0526_beautiful_arrangement/Solution.java)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 3 | 98.99
| 0525 |[Contiguous Array](src.save/main/java/g0501_0600/s0525_contiguous_array/Solution.java)| Medium | Array, Hash_Table, Prefix_Sum | 17 | 92.02
| 0524 |[Longest Word in Dictionary through Deleting](src.save/main/java/g0501_0600/s0524_longest_word_in_dictionary_through_deleting/Solution.java)| Medium | Array, String, Sorting, Two_Pointers | 10 | 97.43
| 0523 |[Continuous Subarray Sum](src.save/main/java/g0501_0600/s0523_continuous_subarray_sum/Solution.java)| Medium | Array, Hash_Table, Math, Prefix_Sum | 25 | 78.40
| 0522 |[Longest Uncommon Subsequence II](src.save/main/java/g0501_0600/s0522_longest_uncommon_subsequence_ii/Solution.java)| Medium | Array, String, Hash_Table, Sorting, Two_Pointers | 1 | 100.00
| 0521 |[Longest Uncommon Subsequence I](src.save/main/java/g0501_0600/s0521_longest_uncommon_subsequence_i/Solution.java)| Easy | String | 0 | 100.00
| 0520 |[Detect Capital](src.save/main/java/g0501_0600/s0520_detect_capital/Solution.java)| Easy | String | 2 | 72.44
| 0519 |[Random Flip Matrix](src.save/main/java/g0501_0600/s0519_random_flip_matrix/Solution.java)| Medium | Hash_Table, Math, Randomized, Reservoir_Sampling | 39 | 68.47
| 0518 |[Coin Change 2](src.save/main/java/g0501_0600/s0518_coin_change_2/Solution.java)| Medium | Array, Dynamic_Programming, Dynamic_Programming_I_Day_20 | 3 | 91.32
| 0517 |[Super Washing Machines](src.save/main/java/g0501_0600/s0517_super_washing_machines/Solution.java)| Hard | Array, Greedy | 0 | 100.00
| 0516 |[Longest Palindromic Subsequence](src.save/main/java/g0501_0600/s0516_longest_palindromic_subsequence/Solution.java)| Medium | String, Dynamic_Programming, Dynamic_Programming_I_Day_17 | 31 | 96.10
| 0515 |[Find Largest Value in Each Tree Row](src.save/main/java/g0501_0600/s0515_find_largest_value_in_each_tree_row/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 96.84
| 0514 |[Freedom Trail](src.save/main/java/g0501_0600/s0514_freedom_trail/Solution.java)| Hard | String, Dynamic_Programming, Depth_First_Search, Breadth_First_Search | 17 | 75.84
| 0513 |[Find Bottom Left Tree Value](src.save/main/java/g0501_0600/s0513_find_bottom_left_tree_value/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 80.06
| 0511 |[Game Play Analysis I](src.save/main/java/g0501_0600/s0511_game_play_analysis_i/script.sql)| Easy | Database, SQL_I_Day_8_Function | 620 | 35.70
| 0509 |[Fibonacci Number](src.save/main/java/g0501_0600/s0509_fibonacci_number/Solution.java)| Easy | Dynamic_Programming, Math, Recursion, Memoization, Dynamic_Programming_I_Day_1 | 0 | 100.00
| 0508 |[Most Frequent Subtree Sum](src.save/main/java/g0501_0600/s0508_most_frequent_subtree_sum/Solution.java)| Medium | Hash_Table, Depth_First_Search, Tree, Binary_Tree | 6 | 77.55
| 0507 |[Perfect Number](src.save/main/java/g0501_0600/s0507_perfect_number/Solution.java)| Easy | Math | 2 | 73.73
| 0506 |[Relative Ranks](src.save/main/java/g0501_0600/s0506_relative_ranks/Solution.java)| Easy | Array, Sorting, Heap_Priority_Queue | 4 | 99.79
| 0504 |[Base 7](src.save/main/java/g0501_0600/s0504_base_7/Solution.java)| Easy | Math | 1 | 94.93
| 0503 |[Next Greater Element II](src.save/main/java/g0501_0600/s0503_next_greater_element_ii/Solution.java)| Medium | Array, Stack, Monotonic_Stack, Programming_Skills_II_Day_10 | 7 | 95.85
| 0502 |[IPO](src.save/main/java/g0501_0600/s0502_ipo/Solution.java)| Hard | Array, Sorting, Greedy, Heap_Priority_Queue | 43 | 92.06
| 0501 |[Find Mode in Binary Search Tree](src.save/main/java/g0501_0600/s0501_find_mode_in_binary_search_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 1 | 91.60
| 0500 |[Keyboard Row](src.save/main/java/g0401_0500/s0500_keyboard_row/Solution.java)| Easy | Array, String, Hash_Table | 0 | 100.00
| 0498 |[Diagonal Traverse](src.save/main/java/g0401_0500/s0498_diagonal_traverse/Solution.java)| Medium | Array, Matrix, Simulation | 2 | 96.07
| 0497 |[Random Point in Non-overlapping Rectangles](src.save/main/java/g0401_0500/s0497_random_point_in_non_overlapping_rectangles/Solution.java)| Medium | Math, Binary_Search, Prefix_Sum, Ordered_Set, Randomized, Reservoir_Sampling | 44 | 97.50
| 0496 |[Next Greater Element I](src.save/main/java/g0401_0500/s0496_next_greater_element_i/Solution.java)| Easy | Array, Hash_Table, Stack, Monotonic_Stack, Programming_Skills_I_Day_5_Function | 3 | 84.97
| 0495 |[Teemo Attacking](src.save/main/java/g0401_0500/s0495_teemo_attacking/Solution.java)| Easy | Array, Simulation | 4 | 26.85
| 0494 |[Target Sum](src.save/main/java/g0401_0500/s0494_target_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Backtracking | 10 | 82.41
| 0493 |[Reverse Pairs](src.save/main/java/g0401_0500/s0493_reverse_pairs/Solution.java)| Hard | Array, Binary_Search, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Merge_Sort | 121 | 31.13
| 0492 |[Construct the Rectangle](src.save/main/java/g0401_0500/s0492_construct_the_rectangle/Solution.java)| Easy | Math | 1 | 74.25
| 0491 |[Increasing Subsequences](src.save/main/java/g0401_0500/s0491_increasing_subsequences/Solution.java)| Medium | Array, Hash_Table, Bit_Manipulation, Backtracking | 22 | 46.38
| 0488 |[Zuma Game](src.save/main/java/g0401_0500/s0488_zuma_game/Solution.java)| Hard | String, Dynamic_Programming, Breadth_First_Search, Memoization | 2077 | 7.41
| 0486 |[Predict the Winner](src.save/main/java/g0401_0500/s0486_predict_the_winner/Solution.java)| Medium | Array, Dynamic_Programming, Math, Recursion, Game_Theory | 0 | 100.00
| 0485 |[Max Consecutive Ones](src.save/main/java/g0401_0500/s0485_max_consecutive_ones/Solution.java)| Easy | Array | 1 | 100.00
| 0483 |[Smallest Good Base](src.save/main/java/g0401_0500/s0483_smallest_good_base/Solution.java)| Hard | Math, Binary_Search | 3 | 87.88
| 0482 |[License Key Formatting](src.save/main/java/g0401_0500/s0482_license_key_formatting/Solution.java)| Easy | String | 7 | 98.60
| 0481 |[Magical String](src.save/main/java/g0401_0500/s0481_magical_string/Solution.java)| Medium | String, Two_Pointers | 5 | 88.46
| 0480 |[Sliding Window Median](src.save/main/java/g0401_0500/s0480_sliding_window_median/Solution.java)| Hard | Array, Hash_Table, Heap_Priority_Queue, Sliding_Window | 46 | 80.65
| 0479 |[Largest Palindrome Product](src.save/main/java/g0401_0500/s0479_largest_palindrome_product/Solution.java)| Hard | Math | 6 | 97.54
| 0478 |[Generate Random Point in a Circle](src.save/main/java/g0401_0500/s0478_generate_random_point_in_a_circle/Solution.java)| Medium | Math, Geometry, Randomized, Rejection_Sampling | 196 | 98.10
| 0477 |[Total Hamming Distance](src.save/main/java/g0401_0500/s0477_total_hamming_distance/Solution.java)| Medium | Array, Math, Bit_Manipulation | 5 | 90.97
| 0476 |[Number Complement](src.save/main/java/g0401_0500/s0476_number_complement/Solution.java)| Easy | Bit_Manipulation | 0 | 100.00
| 0475 |[Heaters](src.save/main/java/g0401_0500/s0475_heaters/Solution.java)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 8 | 99.30
| 0474 |[Ones and Zeroes](src.save/main/java/g0401_0500/s0474_ones_and_zeroes/Solution.java)| Medium | Array, String, Dynamic_Programming | 41 | 68.79
| 0473 |[Matchsticks to Square](src.save/main/java/g0401_0500/s0473_matchsticks_to_square/Solution.java)| Medium | Array, Dynamic_Programming, Bit_Manipulation, Backtracking, Bitmask | 241 | 18.95
| 0472 |[Concatenated Words](src.save/main/java/g0401_0500/s0472_concatenated_words/Solution.java)| Hard | Array, String, Dynamic_Programming, Depth_First_Search, Trie | 84 | 79.03
| 0470 |[Implement Rand10() Using Rand7()](src.save/main/java/g0401_0500/s0470_implement_rand10_using_rand7/Solution.java)| Medium | Math, Randomized, Probability_and_Statistics, Rejection_Sampling | 10 | 51.04
| 0468 |[Validate IP Address](src.save/main/java/g0401_0500/s0468_validate_ip_address/Solution.java)| Medium | String | 1 | 98.15
| 0467 |[Unique Substrings in Wraparound String](src.save/main/java/g0401_0500/s0467_unique_substrings_in_wraparound_string/Solution.java)| Medium | String, Dynamic_Programming | 5 | 88.61
| 0466 |[Count The Repetitions](src.save/main/java/g0401_0500/s0466_count_the_repetitions/Solution.java)| Hard | String, Dynamic_Programming | 1 | 100.00
| 0464 |[Can I Win](src.save/main/java/g0401_0500/s0464_can_i_win/Solution.java)| Medium | Dynamic_Programming, Math, Bit_Manipulation, Bitmask, Memoization, Game_Theory | 159 | 84.80
| 0463 |[Island Perimeter](src.save/main/java/g0401_0500/s0463_island_perimeter/Solution.java)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 9 | 74.15
| 0462 |[Minimum Moves to Equal Array Elements II](src.save/main/java/g0401_0500/s0462_minimum_moves_to_equal_array_elements_ii/Solution.java)| Medium | Array, Math, Sorting | 3 | 94.38
| 0461 |[Hamming Distance](src.save/main/java/g0401_0500/s0461_hamming_distance/Solution.java)| Easy | Bit_Manipulation | 1 | 39.19
| 0460 |[LFU Cache](src.save/main/java/g0401_0500/s0460_lfu_cache/LFUCache.java)| Hard | Hash_Table, Design, Linked_List, Doubly_Linked_List | 45 | 99.66
| 0459 |[Repeated Substring Pattern](src.save/main/java/g0401_0500/s0459_repeated_substring_pattern/Solution.java)| Easy | String, String_Matching, Programming_Skills_II_Day_2 | 9 | 90.15
| 0458 |[Poor Pigs](src.save/main/java/g0401_0500/s0458_poor_pigs/Solution.java)| Hard | Dynamic_Programming, Math, Combinatorics | 0 | 100.00
| 0457 |[Circular Array Loop](src.save/main/java/g0401_0500/s0457_circular_array_loop/Solution.java)| Medium | Array, Hash_Table, Two_Pointers | 2 | 73.72
| 0456 |[132 Pattern](src.save/main/java/g0401_0500/s0456_132_pattern/Solution.java)| Medium | Array, Binary_Search, Stack, Ordered_Set, Monotonic_Stack | 15 | 80.22
| 0455 |[Assign Cookies](src.save/main/java/g0401_0500/s0455_assign_cookies/Solution.java)| Easy | Array, Sorting, Greedy | 11 | 42.95
| 0454 |[4Sum II](src.save/main/java/g0401_0500/s0454_4sum_ii/Solution.java)| Medium | Top_Interview_Questions, Array, Hash_Table | 157 | 74.79
| 0453 |[Minimum Moves to Equal Array Elements](src.save/main/java/g0401_0500/s0453_minimum_moves_to_equal_array_elements/Solution.java)| Medium | Array, Math | 1 | 100.00
| 0452 |[Minimum Number of Arrows to Burst Balloons](src.save/main/java/g0401_0500/s0452_minimum_number_of_arrows_to_burst_balloons/Solution.java)| Medium | Array, Sorting, Greedy | 80 | 76.91
| 0451 |[Sort Characters By Frequency](src.save/main/java/g0401_0500/s0451_sort_characters_by_frequency/Solution.java)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Bucket_Sort, Data_Structure_II_Day_21_Heap_Priority_Queue | 18 | 70.93
| 0450 |[Delete Node in a BST](src.save/main/java/g0401_0500/s0450_delete_node_in_a_bst/Solution.java)| Medium | Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_II_Day_16_Tree | 0 | 100.00
| 0449 |[Serialize and Deserialize BST](src.save/main/java/g0401_0500/s0449_serialize_and_deserialize_bst/Codec.java)| Medium | String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design, Binary_Search_Tree | 1 | 99.70
| 0448 |[Find All Numbers Disappeared in an Array](src.save/main/java/g0401_0500/s0448_find_all_numbers_disappeared_in_an_array/Solution.java)| Easy | Array, Hash_Table | 3 | 100.00
| 0447 |[Number of Boomerangs](src.save/main/java/g0401_0500/s0447_number_of_boomerangs/Solution.java)| Medium | Array, Hash_Table, Math | 156 | 80.44
| 0446 |[Arithmetic Slices II - Subsequence](src.save/main/java/g0401_0500/s0446_arithmetic_slices_ii_subsequence/Solution.java)| Hard | Array, Dynamic_Programming | 67 | 95.78
| 0445 |[Add Two Numbers II](src.save/main/java/g0401_0500/s0445_add_two_numbers_ii/Solution.java)| Medium | Math, Stack, Linked_List, Programming_Skills_II_Day_15 | 3 | 81.96
| 0443 |[String Compression](src.save/main/java/g0401_0500/s0443_string_compression/Solution.java)| Medium | String, Two_Pointers | 2 | 60.36
| 0442 |[Find All Duplicates in an Array](src.save/main/java/g0401_0500/s0442_find_all_duplicates_in_an_array/Solution.java)| Medium | Array, Hash_Table | 5 | 94.88
| 0441 |[Arranging Coins](src.save/main/java/g0401_0500/s0441_arranging_coins/Solution.java)| Easy | Math, Binary_Search, Binary_Search_I_Day_6 | 2 | 87.99
| 0440 |[K-th Smallest in Lexicographical Order](src.save/main/java/g0401_0500/s0440_k_th_smallest_in_lexicographical_order/Solution.java)| Hard | Trie | 0 | 100.00
| 0438 |[Find All Anagrams in a String](src.save/main/java/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.java)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window, Algorithm_II_Day_5_Sliding_Window, Programming_Skills_II_Day_12 | 8 | 87.18
| 0437 |[Path Sum III](src.save/main/java/g0401_0500/s0437_path_sum_iii/Solution.java)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree | 4 | 87.75
| 0436 |[Find Right Interval](src.save/main/java/g0401_0500/s0436_find_right_interval/Solution.java)| Medium | Array, Sorting, Binary_Search, Binary_Search_II_Day_11 | 17 | 87.90
| 0435 |[Non-overlapping Intervals](src.save/main/java/g0401_0500/s0435_non_overlapping_intervals/Solution.java)| Medium | Array, Dynamic_Programming, Sorting, Greedy, Data_Structure_II_Day_4_Array | 109 | 26.80
| 0434 |[Number of Segments in a String](src.save/main/java/g0401_0500/s0434_number_of_segments_in_a_string/Solution.java)| Easy | String | 0 | 100.00
| 0433 |[Minimum Genetic Mutation](src.save/main/java/g0401_0500/s0433_minimum_genetic_mutation/Solution.java)| Medium | String, Hash_Table, Breadth_First_Search, Graph_Theory_I_Day_12_Breadth_First_Search | 0 | 100.00
| 0432 |[All O\`one Data Structure](src.save/main/java/g0401_0500/s0432_all_oone_data_structure/AllOne.java)| Hard | Hash_Table, Design, Linked_List, Doubly_Linked_List | 87 | 62.81
| 0430 |[Flatten a Multilevel Doubly Linked List](src.save/main/java/g0401_0500/s0430_flatten_a_multilevel_doubly_linked_list/Solution.java)| Medium | Depth_First_Search, Linked_List, Doubly_Linked_List | 0 | 100.00
| 0429 |[N-ary Tree Level Order Traversal](src.save/main/java/g0401_0500/s0429_n_ary_tree_level_order_traversal/Solution.java)| Medium | Breadth_First_Search, Tree, Programming_Skills_II_Day_9 | 4 | 57.07
| 0427 |[Construct Quad Tree](src.save/main/java/g0401_0500/s0427_construct_quad_tree/Solution.java)| Medium | Array, Tree, Matrix, Divide_and_Conquer | 1 | 85.16
| 0424 |[Longest Repeating Character Replacement](src.save/main/java/g0401_0500/s0424_longest_repeating_character_replacement/Solution.java)| Medium | String, Hash_Table, Sliding_Window | 5 | 92.61
| 0423 |[Reconstruct Original Digits from English](src.save/main/java/g0401_0500/s0423_reconstruct_original_digits_from_english/Solution.java)| Medium | String, Hash_Table, Math | 3 | 100.00
| 0421 |[Maximum XOR of Two Numbers in an Array](src.save/main/java/g0401_0500/s0421_maximum_xor_of_two_numbers_in_an_array/Solution.java)| Medium | Array, Hash_Table, Bit_Manipulation, Trie | 22 | 99.22
| 0420 |[Strong Password Checker](src.save/main/java/g0401_0500/s0420_strong_password_checker/Solution.java)| Hard | String, Greedy, Heap_Priority_Queue | 0 | 100.00
| 0419 |[Battleships in a Board](src.save/main/java/g0401_0500/s0419_battleships_in_a_board/Solution.java)| Medium | Array, Depth_First_Search, Matrix | 1 | 83.10
| 0417 |[Pacific Atlantic Water Flow](src.save/main/java/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Graph_Theory_I_Day_4_Matrix_Related_Problems | 5 | 89.66
| 0416 |[Partition Equal Subset Sum](src.save/main/java/g0401_0500/s0416_partition_equal_subset_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming | 1 | 99.87
| 0415 |[Add Strings](src.save/main/java/g0401_0500/s0415_add_strings/Solution.java)| Easy | String, Math, Simulation, Data_Structure_II_Day_6_String | 3 | 75.64
| 0414 |[Third Maximum Number](src.save/main/java/g0401_0500/s0414_third_maximum_number/Solution.java)| Easy | Array, Sorting | 1 | 96.71
| 0413 |[Arithmetic Slices](src.save/main/java/g0401_0500/s0413_arithmetic_slices/Solution.java)| Medium | Array, Dynamic_Programming, Algorithm_II_Day_14_Dynamic_Programming, Dynamic_Programming_I_Day_10 | 0 | 100.00
| 0412 |[Fizz Buzz](src.save/main/java/g0401_0500/s0412_fizz_buzz/Solution.java)| Easy | Top_Interview_Questions, String, Math, Simulation | 3 | 32.80
| 0410 |[Split Array Largest Sum](src.save/main/java/g0401_0500/s0410_split_array_largest_sum/Solution.java)| Hard | Array, Dynamic_Programming, Greedy, Binary_Search | 1 | 84.88
| 0409 |[Longest Palindrome](src.save/main/java/g0401_0500/s0409_longest_palindrome/Solution.java)| Easy | String, Hash_Table, Greedy, Data_Structure_II_Day_6_String | 1 | 100.00
| 0407 |[Trapping Rain Water II](src.save/main/java/g0401_0500/s0407_trapping_rain_water_ii/Solution.java)| Hard | Array, Breadth_First_Search, Matrix, Heap_Priority_Queue | 10 | 99.01
| 0406 |[Queue Reconstruction by Height](src.save/main/java/g0401_0500/s0406_queue_reconstruction_by_height/Solution.java)| Medium | Array, Sorting, Greedy, Segment_Tree, Binary_Indexed_Tree | 9 | 74.45
| 0405 |[Convert a Number to Hexadecimal](src.save/main/java/g0401_0500/s0405_convert_a_number_to_hexadecimal/Solution.java)| Easy | Math, Bit_Manipulation | 0 | 100.00
| 0404 |[Sum of Left Leaves](src.save/main/java/g0401_0500/s0404_sum_of_left_leaves/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Programming_Skills_I_Day_10_Linked_List_and_Tree | 0 | 100.00
| 0403 |[Frog Jump](src.save/main/java/g0401_0500/s0403_frog_jump/Solution.java)| Hard | Array, Dynamic_Programming | 18 | 97.19
| 0402 |[Remove K Digits](src.save/main/java/g0401_0500/s0402_remove_k_digits/Solution.java)| Medium | String, Greedy, Stack, Monotonic_Stack | 6 | 90.82
| 0401 |[Binary Watch](src.save/main/java/g0401_0500/s0401_binary_watch/Solution.java)| Easy | Bit_Manipulation, Backtracking | 1 | 98.21
| 0400 |[Nth Digit](src.save/main/java/g0301_0400/s0400_nth_digit/Solution.java)| Medium | Math, Binary_Search | 0 | 100.00
| 0399 |[Evaluate Division](src.save/main/java/g0301_0400/s0399_evaluate_division/Solution.java)| Medium | Array, Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Shortest_Path | 1 | 97.67
| 0398 |[Random Pick Index](src.save/main/java/g0301_0400/s0398_random_pick_index/Solution.java)| Medium | Hash_Table, Math, Randomized, Reservoir_Sampling | 75 | 74.64
| 0397 |[Integer Replacement](src.save/main/java/g0301_0400/s0397_integer_replacement/Solution.java)| Medium | Dynamic_Programming, Greedy, Bit_Manipulation, Memoization | 0 | 100.00
| 0396 |[Rotate Function](src.save/main/java/g0301_0400/s0396_rotate_function/Solution.java)| Medium | Array, Dynamic_Programming, Math | 3 | 98.51
| 0395 |[Longest Substring with At Least K Repeating Characters](src.save/main/java/g0301_0400/s0395_longest_substring_with_at_least_k_repeating_characters/Solution.java)| Medium | Top_Interview_Questions, String, Hash_Table, Sliding_Window, Divide_and_Conquer | 0 | 100.00
| 0394 |[Decode String](src.save/main/java/g0301_0400/s0394_decode_string/Solution.java)| Medium | Top_100_Liked_Questions, String, Stack, Recursion | 1 | 83.81
| 0393 |[UTF-8 Validation](src.save/main/java/g0301_0400/s0393_utf_8_validation/Solution.java)| Medium | Array, Bit_Manipulation | 1 | 100.00
| 0392 |[Is Subsequence](src.save/main/java/g0301_0400/s0392_is_subsequence/Solution.java)| Easy | String, Dynamic_Programming, Two_Pointers, Dynamic_Programming_I_Day_19 | 0 | 100.00
| 0391 |[Perfect Rectangle](src.save/main/java/g0301_0400/s0391_perfect_rectangle/Solution.java)| Hard | Array, Line_Sweep | 49 | 67.32
| 0390 |[Elimination Game](src.save/main/java/g0301_0400/s0390_elimination_game/Solution.java)| Medium | Math | 2 | 100.00
| 0389 |[Find the Difference](src.save/main/java/g0301_0400/s0389_find_the_difference/Solution.java)| Easy | String, Hash_Table, Sorting, Bit_Manipulation, Programming_Skills_I_Day_8_String | 1 | 99.83
| 0388 |[Longest Absolute File Path](src.save/main/java/g0301_0400/s0388_longest_absolute_file_path/Solution.java)| Medium | String, Depth_First_Search, Stack | 2 | 52.22
| 0387 |[First Unique Character in a String](src.save/main/java/g0301_0400/s0387_first_unique_character_in_a_string/Solution.java)| Easy | Top_Interview_Questions, String, Hash_Table, Counting, Queue, Data_Structure_I_Day_6_String | 2 | 99.53
| 0386 |[Lexicographical Numbers](src.save/main/java/g0301_0400/s0386_lexicographical_numbers/Solution.java)| Medium | Depth_First_Search, Trie | 4 | 87.17
| 0385 |[Mini Parser](src.save/main/java/g0301_0400/s0385_mini_parser/Solution.java)| Medium | String, Depth_First_Search, Stack | 3 | 97.44
| 0384 |[Shuffle an Array](src.save/main/java/g0301_0400/s0384_shuffle_an_array/Solution.java)| Medium | Top_Interview_Questions, Array, Math, Randomized, Algorithm_II_Day_20_Others | 65 | 94.59
| 0383 |[Ransom Note](src.save/main/java/g0301_0400/s0383_ransom_note/Solution.java)| Easy | String, Hash_Table, Counting, Data_Structure_I_Day_6_String | 1 | 99.79
| 0382 |[Linked List Random Node](src.save/main/java/g0301_0400/s0382_linked_list_random_node/Solution.java)| Medium | Math, Linked_List, Randomized, Reservoir_Sampling | 7 | 100.00
| 0381 |[Insert Delete GetRandom O(1) - Duplicates allowed](src.save/main/java/g0301_0400/s0381_insert_delete_getrandom_o1_duplicates_allowed/RandomizedCollection.java)| Hard | Array, Hash_Table, Math, Design, Randomized | 26 | 100.00
| 0380 |[Insert Delete GetRandom O(1)](src.save/main/java/g0301_0400/s0380_insert_delete_getrandom_o1/RandomizedSet.java)| Medium | Top_Interview_Questions, Array, Hash_Table, Math, Design, Randomized, Programming_Skills_II_Day_20 | 20 | 99.24
| 0378 |[Kth Smallest Element in a Sorted Matrix](src.save/main/java/g0301_0400/s0378_kth_smallest_element_in_a_sorted_matrix/Solution.java)| Medium | Top_Interview_Questions, Array, Sorting, Binary_Search, Matrix, Heap_Priority_Queue | 0 | 100.00
| 0377 |[Combination Sum IV](src.save/main/java/g0301_0400/s0377_combination_sum_iv/Solution.java)| Medium | Array, Dynamic_Programming, Dynamic_Programming_I_Day_21 | 1 | 91.72
| 0376 |[Wiggle Subsequence](src.save/main/java/g0301_0400/s0376_wiggle_subsequence/Solution.java)| Medium | Array, Dynamic_Programming, Greedy, Dynamic_Programming_I_Day_18 | 0 | 100.00
| 0375 |[Guess Number Higher or Lower II](src.save/main/java/g0301_0400/s0375_guess_number_higher_or_lower_ii/Solution.java)| Medium | Dynamic_Programming, Math, Game_Theory | 1 | 100.00
| 0374 |[Guess Number Higher or Lower](src.save/main/java/g0301_0400/s0374_guess_number_higher_or_lower/Solution.java)| Easy | Binary_Search, Interactive, Binary_Search_I_Day_1 | 0 | 100.00
| 0373 |[Find K Pairs with Smallest Sums](src.save/main/java/g0301_0400/s0373_find_k_pairs_with_smallest_sums/Solution.java)| Medium | Array, Heap_Priority_Queue | 58 | 29.29
| 0372 |[Super Pow](src.save/main/java/g0301_0400/s0372_super_pow/Solution.java)| Medium | Math, Divide_and_Conquer | 2 | 91.10
| 0371 |[Sum of Two Integers](src.save/main/java/g0301_0400/s0371_sum_of_two_integers/Solution.java)| Medium | Top_Interview_Questions, Math, Bit_Manipulation | 0 | 100.00
| 0368 |[Largest Divisible Subset](src.save/main/java/g0301_0400/s0368_largest_divisible_subset/Solution.java)| Medium | Array, Dynamic_Programming, Math, Sorting | 20 | 87.61
| 0367 |[Valid Perfect Square](src.save/main/java/g0301_0400/s0367_valid_perfect_square/Solution.java)| Easy | Math, Binary_Search, Binary_Search_I_Day_3 | 0 | 100.00
| 0365 |[Water and Jug Problem](src.save/main/java/g0301_0400/s0365_water_and_jug_problem/Solution.java)| Medium | Math, Depth_First_Search, Breadth_First_Search, Graph_Theory_I_Day_11_Breadth_First_Search | 0 | 100.00
| 0363 |[Max Sum of Rectangle No Larger Than K](src.save/main/java/g0301_0400/s0363_max_sum_of_rectangle_no_larger_than_k/Solution.java)| Hard | Array, Dynamic_Programming, Binary_Search, Matrix, Ordered_Set | 69 | 97.33
| 0357 |[Count Numbers with Unique Digits](src.save/main/java/g0301_0400/s0357_count_numbers_with_unique_digits/Solution.java)| Medium | Dynamic_Programming, Math, Backtracking | 0 | 100.00
| 0355 |[Design Twitter](src.save/main/java/g0301_0400/s0355_design_twitter/Twitter.java)| Medium | Hash_Table, Design, Heap_Priority_Queue, Linked_List | 8 | 99.79
| 0354 |[Russian Doll Envelopes](src.save/main/java/g0301_0400/s0354_russian_doll_envelopes/Solution.java)| Hard | Array, Dynamic_Programming, Sorting, Binary_Search | 65 | 67.49
| 0352 |[Data Stream as Disjoint Intervals](src.save/main/java/g0301_0400/s0352_data_stream_as_disjoint_intervals/SummaryRanges.java)| Hard | Binary_Search, Design, Ordered_Set | 94 | 76.26
| 0350 |[Intersection of Two Arrays II](src.save/main/java/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Binary_Search, Two_Pointers, Data_Structure_I_Day_3_Array, Binary_Search_I_Day_10 | 3 | 81.79
| 0349 |[Intersection of Two Arrays](src.save/main/java/g0301_0400/s0349_intersection_of_two_arrays/Solution.java)| Easy | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 1 | 99.75
| 0347 |[Top K Frequent Elements](src.save/main/java/g0301_0400/s0347_top_k_frequent_elements/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Divide_and_Conquer, Quickselect, Bucket_Sort, Data_Structure_II_Day_20_Heap_Priority_Queue | 7 | 99.54
| 0345 |[Reverse Vowels of a String](src.save/main/java/g0301_0400/s0345_reverse_vowels_of_a_string/Solution.java)| Easy | String, Two_Pointers | 4 | 86.90
| 0344 |[Reverse String](src.save/main/java/g0301_0400/s0344_reverse_string/Solution.java)| Easy | Top_Interview_Questions, String, Two_Pointers, Recursion, Algorithm_I_Day_4_Two_Pointers | 1 | 87.94
| 0343 |[Integer Break](src.save/main/java/g0301_0400/s0343_integer_break/Solution.java)| Medium | Dynamic_Programming, Math, Algorithm_II_Day_18_Dynamic_Programming, Dynamic_Programming_I_Day_21 | 0 | 100.00
| 0342 |[Power of Four](src.save/main/java/g0301_0400/s0342_power_of_four/Solution.java)| Easy | Math, Bit_Manipulation, Recursion | 1 | 91.73
| 0341 |[Flatten Nested List Iterator](src.save/main/java/g0301_0400/s0341_flatten_nested_list_iterator/NestedIterator.java)| Medium | Top_Interview_Questions, Depth_First_Search, Tree, Stack, Design, Queue, Iterator, Programming_Skills_II_Day_18 | 3 | 86.51
| 0338 |[Counting Bits](src.save/main/java/g0301_0400/s0338_counting_bits/Solution.java)| Easy | Top_100_Liked_Questions, Dynamic_Programming, Bit_Manipulation | 1 | 99.97
| 0337 |[House Robber III](src.save/main/java/g0301_0400/s0337_house_robber_iii/Solution.java)| Medium | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 1 | 87.96
| 0336 |[Palindrome Pairs](src.save/main/java/g0301_0400/s0336_palindrome_pairs/Solution.java)| Hard | Array, String, Hash_Table, Trie | 1219 | 54.97
| 0335 |[Self Crossing](src.save/main/java/g0301_0400/s0335_self_crossing/Solution.java)| Hard | Array, Math, Geometry | 6 | 44.12
| 0334 |[Increasing Triplet Subsequence](src.save/main/java/g0301_0400/s0334_increasing_triplet_subsequence/Solution.java)| Medium | Top_Interview_Questions, Array, Greedy, Data_Structure_II_Day_5_Array | 3 | 61.85
| 0332 |[Reconstruct Itinerary](src.save/main/java/g0301_0400/s0332_reconstruct_itinerary/Solution.java)| Hard | Depth_First_Search, Graph, Eulerian_Circuit | 11 | 47.68
| 0331 |[Verify Preorder Serialization of a Binary Tree](src.save/main/java/g0301_0400/s0331_verify_preorder_serialization_of_a_binary_tree/Solution.java)| Medium | String, Tree, Binary_Tree, Stack | 3 | 94.01
| 0330 |[Patching Array](src.save/main/java/g0301_0400/s0330_patching_array/Solution.java)| Hard | Array, Greedy | 0 | 100.00
| 0329 |[Longest Increasing Path in a Matrix](src.save/main/java/g0301_0400/s0329_longest_increasing_path_in_a_matrix/Solution.java)| Hard | Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Breadth_First_Search, Graph, Memoization, Topological_Sort | 8 | 91.02
| 0328 |[Odd Even Linked List](src.save/main/java/g0301_0400/s0328_odd_even_linked_list/Solution.java)| Medium | Top_Interview_Questions, Linked_List | 0 | 100.00
| 0327 |[Count of Range Sum](src.save/main/java/g0301_0400/s0327_count_of_range_sum/Solution.java)| Hard | Array, Binary_Search, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Merge_Sort | 64 | 87.41
| 0326 |[Power of Three](src.save/main/java/g0301_0400/s0326_power_of_three/Solution.java)| Easy | Top_Interview_Questions, Math, Recursion | 18 | 79.91
| 0324 |[Wiggle Sort II](src.save/main/java/g0301_0400/s0324_wiggle_sort_ii/Solution.java)| Medium | Top_Interview_Questions, Array, Sorting, Divide_and_Conquer, Quickselect | 6 | 69.23
| 0322 |[Coin Change](src.save/main/java/g0301_0400/s0322_coin_change/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search, Algorithm_II_Day_18_Dynamic_Programming, Dynamic_Programming_I_Day_20 | 22 | 72.14
| 0321 |[Create Maximum Number](src.save/main/java/g0301_0400/s0321_create_maximum_number/Solution.java)| Hard | Greedy, Stack, Monotonic_Stack | 9 | 93.46
| 0319 |[Bulb Switcher](src.save/main/java/g0301_0400/s0319_bulb_switcher/Solution.java)| Medium | Math, Brainteaser | 0 | 100.00
| 0318 |[Maximum Product of Word Lengths](src.save/main/java/g0301_0400/s0318_maximum_product_of_word_lengths/Solution.java)| Medium | Array, String, Bit_Manipulation | 10 | 81.97
| 0316 |[Remove Duplicate Letters](src.save/main/java/g0301_0400/s0316_remove_duplicate_letters/Solution.java)| Medium | String, Greedy, Stack, Monotonic_Stack | 2 | 98.39
| 0315 |[Count of Smaller Numbers After Self](src.save/main/java/g0301_0400/s0315_count_of_smaller_numbers_after_self/Solution.java)| Hard | Top_Interview_Questions, Array, Binary_Search, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Merge_Sort | 34 | 96.38
| 0313 |[Super Ugly Number](src.save/main/java/g0301_0400/s0313_super_ugly_number/Solution.java)| Medium | Array, Hash_Table, Dynamic_Programming, Math, Heap_Priority_Queue | 280 | 86.61
| 0312 |[Burst Balloons](src.save/main/java/g0301_0400/s0312_burst_balloons/Solution.java)| Hard | Array, Dynamic_Programming | 53 | 86.06
| 0310 |[Minimum Height Trees](src.save/main/java/g0301_0400/s0310_minimum_height_trees/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 22 | 94.43
| 0309 |[Best Time to Buy and Sell Stock with Cooldown](src.save/main/java/g0301_0400/s0309_best_time_to_buy_and_sell_stock_with_cooldown/Solution.java)| Medium | Array, Dynamic_Programming, Dynamic_Programming_I_Day_8 | 0 | 100.00
| 0307 |[Range Sum Query - Mutable](src.save/main/java/g0301_0400/s0307_range_sum_query_mutable/NumArray.java)| Medium | Array, Design, Segment_Tree, Binary_Indexed_Tree | 61 | 98.40
| 0306 |[Additive Number](src.save/main/java/g0301_0400/s0306_additive_number/Solution.java)| Medium | String, Backtracking | 1 | 87.31
| 0304 |[Range Sum Query 2D - Immutable](src.save/main/java/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.java)| Medium | Array, Matrix, Design, Prefix_Sum, Dynamic_Programming_I_Day_14, Programming_Skills_II_Day_13 | 103 | 98.60
| 0303 |[Range Sum Query - Immutable](src.save/main/java/g0301_0400/s0303_range_sum_query_immutable/NumArray.java)| Easy | Array, Design, Prefix_Sum, Programming_Skills_I_Day_12_Class_and_Object | 6 | 100.00
| 0301 |[Remove Invalid Parentheses](src.save/main/java/g0301_0400/s0301_remove_invalid_parentheses/Solution.java)| Hard | String, Breadth_First_Search, Backtracking | 4 | 86.17
| 0300 |[Longest Increasing Subsequence](src.save/main/java/g0201_0300/s0300_longest_increasing_subsequence/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search, Algorithm_II_Day_16_Dynamic_Programming, Binary_Search_II_Day_3, Dynamic_Programming_I_Day_18 | 3 | 96.86
| 0299 |[Bulls and Cows](src.save/main/java/g0201_0300/s0299_bulls_and_cows/Solution.java)| Medium | String, Hash_Table, Counting | 8 | 67.24
| 0297 |[Serialize and Deserialize Binary Tree](src.save/main/java/g0201_0300/s0297_serialize_and_deserialize_binary_tree/Codec.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design, Data_Structure_II_Day_18_Tree | 9 | 91.82
| 0295 |[Find Median from Data Stream](src.save/main/java/g0201_0300/s0295_find_median_from_data_stream/MedianFinder.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Design, Heap_Priority_Queue, Data_Stream | 88 | 98.03
| 0292 |[Nim Game](src.save/main/java/g0201_0300/s0292_nim_game/Solution.java)| Easy | Math, Game_Theory, Brainteaser | 0 | 100.00
| 0290 |[Word Pattern](src.save/main/java/g0201_0300/s0290_word_pattern/Solution.java)| Easy | String, Hash_Table, Data_Structure_II_Day_7_String | 1 | 91.62
| 0289 |[Game of Life](src.save/main/java/g0201_0300/s0289_game_of_life/Solution.java)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 0 | 100.00
| 0287 |[Find the Duplicate Number](src.save/main/java/g0201_0300/s0287_find_the_duplicate_number/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Two_Pointers, Bit_Manipulation, Binary_Search_II_Day_5 | 4 | 94.82
| 0284 |[Peeking Iterator](src.save/main/java/g0201_0300/s0284_peeking_iterator/PeekingIterator.java)| Medium | Array, Design, Iterator | 5 | 78.72
| 0283 |[Move Zeroes](src.save/main/java/g0201_0300/s0283_move_zeroes/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers, Algorithm_I_Day_3_Two_Pointers, Programming_Skills_I_Day_6_Array | 2 | 74.00
| 0282 |[Expression Add Operators](src.save/main/java/g0201_0300/s0282_expression_add_operators/Solution.java)| Hard | String, Math, Backtracking | 7 | 99.73
| 0279 |[Perfect Squares](src.save/main/java/g0201_0300/s0279_perfect_squares/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Breadth_First_Search, Dynamic_Programming_I_Day_21 | 0 | 100.00
| 0278 |[First Bad Version](src.save/main/java/g0201_0300/s0278_first_bad_version/Solution.java)| Easy | Binary_Search, Interactive, Algorithm_I_Day_1_Binary_Search, Binary_Search_I_Day_5 | 12 | 99.50
| 0275 |[H-Index II](src.save/main/java/g0201_0300/s0275_h_index_ii/Solution.java)| Medium | Array, Binary_Search, Binary_Search_II_Day_8 | 0 | 100.00
| 0274 |[H-Index](src.save/main/java/g0201_0300/s0274_h_index/Solution.java)| Medium | Array, Sorting, Counting_Sort | 2 | 51.85
| 0273 |[Integer to English Words](src.save/main/java/g0201_0300/s0273_integer_to_english_words/Solution.java)| Hard | String, Math, Recursion | 5 | 83.37
| 0268 |[Missing Number](src.save/main/java/g0201_0300/s0268_missing_number/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Math, Sorting, Bit_Manipulation | 0 | 100.00
| 0264 |[Ugly Number II](src.save/main/java/g0201_0300/s0264_ugly_number_ii/Solution.java)| Medium | Hash_Table, Dynamic_Programming, Math, Heap_Priority_Queue, Dynamic_Programming_I_Day_11 | 3 | 88.43
| 0263 |[Ugly Number](src.save/main/java/g0201_0300/s0263_ugly_number/Solution.java)| Easy | Math | 1 | 95.93
| 0262 |[Trips and Users](src.save/main/java/g0201_0300/s0262_trips_and_users/script.sql)| Hard | Database | 449 | 79.92
| 0260 |[Single Number III](src.save/main/java/g0201_0300/s0260_single_number_iii/Solution.java)| Medium | Array, Bit_Manipulation | 1 | 98.18
| 0258 |[Add Digits](src.save/main/java/g0201_0300/s0258_add_digits/Solution.java)| Easy | Math, Simulation, Number_Theory | 1 | 95.33
| 0257 |[Binary Tree Paths](src.save/main/java/g0201_0300/s0257_binary_tree_paths/Solution.java)| Easy | String, Depth_First_Search, Tree, Binary_Tree, Backtracking | 2 | 91.59
| 0242 |[Valid Anagram](src.save/main/java/g0201_0300/s0242_valid_anagram/Solution.java)| Easy | Top_Interview_Questions, String, Hash_Table, Sorting, Data_Structure_I_Day_6_String, Programming_Skills_I_Day_11_Containers_and_Libraries | 2 | 98.88
| 0241 |[Different Ways to Add Parentheses](src.save/main/java/g0201_0300/s0241_different_ways_to_add_parentheses/Solution.java)| Medium | String, Dynamic_Programming, Math, Recursion, Memoization | 2 | 81.46
| 0240 |[Search a 2D Matrix II](src.save/main/java/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer, Data_Structure_II_Day_4_Array, Binary_Search_II_Day_8 | 9 | 71.40
| 0239 |[Sliding Window Maximum](src.save/main/java/g0201_0300/s0239_sliding_window_maximum/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue | 25 | 95.01
| 0238 |[Product of Array Except Self](src.save/main/java/g0201_0300/s0238_product_of_array_except_self/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum, Data_Structure_II_Day_5_Array | 1 | 100.00
| 0237 |[Delete Node in a Linked List](src.save/main/java/g0201_0300/s0237_delete_node_in_a_linked_list/Solution.java)| Easy | Top_Interview_Questions, Linked_List | 0 | 100.00
| 0236 |[Lowest Common Ancestor of a Binary Tree](src.save/main/java/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Data_Structure_II_Day_18_Tree | 11 | 46.61
| 0235 |[Lowest Common Ancestor of a Binary Search Tree](src.save/main/java/g0201_0300/s0235_lowest_common_ancestor_of_a_binary_search_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_I_Day_14_Tree | 7 | 52.79
| 0234 |[Palindrome Linked List](src.save/main/java/g0201_0300/s0234_palindrome_linked_list/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Stack, Linked_List, Recursion | 5 | 89.76
| 0233 |[Number of Digit One](src.save/main/java/g0201_0300/s0233_number_of_digit_one/Solution.java)| Hard | Dynamic_Programming, Math, Recursion | 0 | 100.00
| 0232 |[Implement Queue using Stacks](src.save/main/java/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.java)| Easy | Stack, Design, Queue, Data_Structure_I_Day_9_Stack_Queue, Programming_Skills_I_Day_11_Containers_and_Libraries | 1 | 56.63
| 0231 |[Power of Two](src.save/main/java/g0201_0300/s0231_power_of_two/Solution.java)| Easy | Math, Bit_Manipulation, Recursion, Algorithm_I_Day_13_Bit_Manipulation | 1 | 95.76
| 0230 |[Kth Smallest Element in a BST](src.save/main/java/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.java)| Medium | Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_II_Day_17_Tree | 0 | 100.00
| 0229 |[Majority Element II](src.save/main/java/g0201_0300/s0229_majority_element_ii/Solution.java)| Medium | Array, Hash_Table, Sorting, Counting | 2 | 91.84
| 0228 |[Summary Ranges](src.save/main/java/g0201_0300/s0228_summary_ranges/Solution.java)| Easy | Array | 0 | 100.00
| 0227 |[Basic Calculator II](src.save/main/java/g0201_0300/s0227_basic_calculator_ii/Solution.java)| Medium | Top_Interview_Questions, String, Math, Stack | 9 | 88.15
| 0226 |[Invert Binary Tree](src.save/main/java/g0201_0300/s0226_invert_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_12_Tree | 0 | 100.00
| 0225 |[Implement Stack using Queues](src.save/main/java/g0201_0300/s0225_implement_stack_using_queues/MyStack.java)| Easy | Stack, Design, Queue | 0 | 100.00
| 0224 |[Basic Calculator](src.save/main/java/g0201_0300/s0224_basic_calculator/Solution.java)| Hard | String, Math, Stack, Recursion | 3 | 98.82
| 0223 |[Rectangle Area](src.save/main/java/g0201_0300/s0223_rectangle_area/Solution.java)| Medium | Math, Geometry | 2 | 99.58
| 0222 |[Count Complete Tree Nodes](src.save/main/java/g0201_0300/s0222_count_complete_tree_nodes/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Search, Binary_Tree, Binary_Search_II_Day_10 | 0 | 100.00
| 0221 |[Maximal Square](src.save/main/java/g0201_0300/s0221_maximal_square/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Dynamic_Programming_I_Day_16 | 6 | 80.89
| 0220 |[Contains Duplicate III](src.save/main/java/g0201_0300/s0220_contains_duplicate_iii/Solution.java)| Medium | Array, Sorting, Sliding_Window, Ordered_Set, Bucket_Sort | 46 | 62.24
| 0219 |[Contains Duplicate II](src.save/main/java/g0201_0300/s0219_contains_duplicate_ii/Solution.java)| Easy | Array, Hash_Table, Sliding_Window | 44 | 42.18
| 0218 |[The Skyline Problem](src.save/main/java/g0201_0300/s0218_the_skyline_problem/Solution.java)| Hard | Top_Interview_Questions, Array, Heap_Priority_Queue, Ordered_Set, Divide_and_Conquer, Segment_Tree, Binary_Indexed_Tree, Line_Sweep | 21 | 80.36
| 0217 |[Contains Duplicate](src.save/main/java/g0201_0300/s0217_contains_duplicate/Solution.java)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting, Data_Structure_I_Day_1_Array, Programming_Skills_I_Day_11_Containers_and_Libraries | 10 | 67.20
| 0216 |[Combination Sum III](src.save/main/java/g0201_0300/s0216_combination_sum_iii/Solution.java)| Medium | Array, Backtracking | 1 | 78.74
| 0215 |[Kth Largest Element in an Array](src.save/main/java/g0201_0300/s0215_kth_largest_element_in_an_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect, Data_Structure_II_Day_20_Heap_Priority_Queue | 2 | 93.01
| 0214 |[Shortest Palindrome](src.save/main/java/g0201_0300/s0214_shortest_palindrome/Solution.java)| Hard | String, Hash_Function, String_Matching, Rolling_Hash | 3 | 94.71
| 0213 |[House Robber II](src.save/main/java/g0201_0300/s0213_house_robber_ii/Solution.java)| Medium | Array, Dynamic_Programming, Algorithm_II_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_3 | 1 | 31.05
| 0212 |[Word Search II](src.save/main/java/g0201_0300/s0212_word_search_ii/Solution.java)| Hard | Top_Interview_Questions, Array, String, Matrix, Backtracking, Trie | 20 | 96.11
| 0211 |[Design Add and Search Words Data Structure](src.save/main/java/g0201_0300/s0211_design_add_and_search_words_data_structure/WordDictionary.java)| Medium | String, Depth_First_Search, Design, Trie | 403 | 18.89
| 0210 |[Course Schedule II](src.save/main/java/g0201_0300/s0210_course_schedule_ii/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 7 | 74.90
| 0209 |[Minimum Size Subarray Sum](src.save/main/java/g0201_0300/s0209_minimum_size_subarray_sum/Solution.java)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window, Algorithm_II_Day_5_Sliding_Window, Binary_Search_II_Day_1 | 1 | 99.98
| 0208 |[Implement Trie (Prefix Tree)](src.save/main/java/g0201_0300/s0208_implement_trie_prefix_tree/Trie.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie | 63 | 55.40
| 0207 |[Course Schedule](src.save/main/java/g0201_0300/s0207_course_schedule/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 2 | 99.76
| 0206 |[Reverse Linked List](src.save/main/java/g0201_0300/s0206_reverse_linked_list/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Data_Structure_I_Day_8_Linked_List, Algorithm_I_Day_10_Recursion_Backtracking | 0 | 100.00
| 0205 |[Isomorphic Strings](src.save/main/java/g0201_0300/s0205_isomorphic_strings/Solution.java)| Easy | String, Hash_Table | 1 | 100.00
| 0204 |[Count Primes](src.save/main/java/g0201_0300/s0204_count_primes/Solution.java)| Medium | Top_Interview_Questions, Array, Math, Enumeration, Number_Theory | 146 | 72.74
| 0203 |[Remove Linked List Elements](src.save/main/java/g0201_0300/s0203_remove_linked_list_elements/Solution.java)| Easy | Linked_List, Recursion, Data_Structure_I_Day_7_Linked_List | 1 | 90.35
| 0202 |[Happy Number](src.save/main/java/g0201_0300/s0202_happy_number/Solution.java)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers, Algorithm_II_Day_21_Others, Programming_Skills_I_Day_4_Loop | 1 | 93.34
| 0201 |[Bitwise AND of Numbers Range](src.save/main/java/g0201_0300/s0201_bitwise_and_of_numbers_range/Solution.java)| Medium | Bit_Manipulation, Algorithm_II_Day_19_Bit_Manipulation | 10 | 40.99
| 0200 |[Number of Islands](src.save/main/java/g0101_0200/s0200_number_of_islands/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Algorithm_II_Day_6_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_1_Matrix_Related_Problems | 4 | 73.02
| 0199 |[Binary Tree Right Side View](src.save/main/java/g0101_0200/s0199_binary_tree_right_side_view/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_II_Day_16_Tree | 1 | 92.96
| 0198 |[House Robber](src.save/main/java/g0101_0200/s0198_house_robber/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Algorithm_I_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_3 | 0 | 100.00
| 0197 |[Rising Temperature](src.save/main/java/g0101_0200/s0197_rising_temperature/script.sql)| Easy | Database, SQL_I_Day_6_Union | 401 | 79.45
| 0196 |[Delete Duplicate Emails](src.save/main/java/g0101_0200/s0196_delete_duplicate_emails/script.sql)| Easy | Database, SQL_I_Day_2_Select_and_Order | 541 | 81.09
| 0195 |[Tenth Line](src.save/main/java/g0101_0200/s0195_tenth_line/script.sh)| Easy | Shell | 4 | 93.33
| 0194 |[Transpose File](src.save/main/java/g0101_0200/s0194_transpose_file/script.sh)| Medium | Shell | 0 | 100.00
| 0193 |[Valid Phone Numbers](src.save/main/java/g0101_0200/s0193_valid_phone_numbers/script.sh)| Easy | Shell | 129 | 42.86
| 0192 |[Word Frequency](src.save/main/java/g0101_0200/s0192_word_frequency/script.sh)| Medium | Shell | 152 | 38.56
| 0191 |[Number of 1 Bits](src.save/main/java/g0101_0200/s0191_number_of_1_bits/Solution.java)| Easy | Top_Interview_Questions, Bit_Manipulation, Algorithm_I_Day_13_Bit_Manipulation, Programming_Skills_I_Day_2_Operator | 0 | 100.00
| 0190 |[Reverse Bits](src.save/main/java/g0101_0200/s0190_reverse_bits/Solution.java)| Easy | Top_Interview_Questions, Bit_Manipulation, Divide_and_Conquer, Algorithm_I_Day_14_Bit_Manipulation | 1 | 89.07
| 0189 |[Rotate Array](src.save/main/java/g0101_0200/s0189_rotate_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers, Algorithm_I_Day_2_Two_Pointers | 1 | 83.21
| 0188 |[Best Time to Buy and Sell Stock IV](src.save/main/java/g0101_0200/s0188_best_time_to_buy_and_sell_stock_iv/Solution.java)| Hard | Array, Dynamic_Programming | 2 | 92.32
| 0187 |[Repeated DNA Sequences](src.save/main/java/g0101_0200/s0187_repeated_dna_sequences/Solution.java)| Medium | String, Hash_Table, Bit_Manipulation, Sliding_Window, Hash_Function, Rolling_Hash, Data_Structure_II_Day_9_String | 32 | 67.58
| 0185 |[Department Top Three Salaries](src.save/main/java/g0101_0200/s0185_department_top_three_salaries/script.sql)| Hard | Database | 763 | 63.69
| 0184 |[Department Highest Salary](src.save/main/java/g0101_0200/s0184_department_highest_salary/script.sql)| Medium | Database | 576 | 64.14
| 0183 |[Customers Who Never Order](src.save/main/java/g0101_0200/s0183_customers_who_never_order/script.sql)| Easy | Database, SQL_I_Day_1_Select | 581 | 23.03
| 0182 |[Duplicate Emails](src.save/main/java/g0101_0200/s0182_duplicate_emails/script.sql)| Easy | Database, SQL_I_Day_10_Where | 345 | 59.47
| 0181 |[Employees Earning More Than Their Managers](src.save/main/java/g0101_0200/s0181_employees_earning_more_than_their_managers/script.sql)| Easy | Database | 385 | 52.30
| 0180 |[Consecutive Numbers](src.save/main/java/g0101_0200/s0180_consecutive_numbers/script.sql)| Medium | Database | 636 | 19.31
| 0179 |[Largest Number](src.save/main/java/g0101_0200/s0179_largest_number/Solution.java)| Medium | Top_Interview_Questions, String, Sorting, Greedy | 11 | 45.93
| 0178 |[Rank Scores](src.save/main/java/g0101_0200/s0178_rank_scores/script.sql)| Medium | Database | 299 | 52.08
| 0177 |[Nth Highest Salary](src.save/main/java/g0101_0200/s0177_nth_highest_salary/script.sql)| Medium | Database | 328 | 65.32
| 0176 |[Second Highest Salary](src.save/main/java/g0101_0200/s0176_second_highest_salary/script.sql)| Medium | Database, SQL_I_Day_4_Union_and_Select | 203 | 63.47
| 0175 |[Combine Two Tables](src.save/main/java/g0101_0200/s0175_combine_two_tables/script.sql)| Easy | Database, SQL_I_Day_5_Union | 449 | 30.35
| 0174 |[Dungeon Game](src.save/main/java/g0101_0200/s0174_dungeon_game/Solution.java)| Hard | Array, Dynamic_Programming, Matrix | 1 | 96.60
| 0173 |[Binary Search Tree Iterator](src.save/main/java/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.java)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator, Data_Structure_II_Day_17_Tree, Programming_Skills_II_Day_16 | 18 | 78.45
| 0172 |[Factorial Trailing Zeroes](src.save/main/java/g0101_0200/s0172_factorial_trailing_zeroes/Solution.java)| Medium | Top_Interview_Questions, Math | 1 | 81.96
| 0171 |[Excel Sheet Column Number](src.save/main/java/g0101_0200/s0171_excel_sheet_column_number/Solution.java)| Easy | Top_Interview_Questions, String, Math | 3 | 24.67
| 0169 |[Majority Element](src.save/main/java/g0101_0200/s0169_majority_element/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer, Data_Structure_II_Day_1_Array | 2 | 83.81
| 0168 |[Excel Sheet Column Title](src.save/main/java/g0101_0200/s0168_excel_sheet_column_title/Solution.java)| Easy | String, Math | 0 | 100.00
| 0167 |[Two Sum II - Input Array Is Sorted](src.save/main/java/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.java)| Medium | Array, Binary_Search, Two_Pointers, Algorithm_I_Day_3_Two_Pointers, Binary_Search_I_Day_7 | 2 | 49.88
| 0166 |[Fraction to Recurring Decimal](src.save/main/java/g0101_0200/s0166_fraction_to_recurring_decimal/Solution.java)| Medium | Top_Interview_Questions, String, Hash_Table, Math | 4 | 33.10
| 0165 |[Compare Version Numbers](src.save/main/java/g0101_0200/s0165_compare_version_numbers/Solution.java)| Medium | String, Two_Pointers | 1 | 90.80
| 0164 |[Maximum Gap](src.save/main/java/g0101_0200/s0164_maximum_gap/Solution.java)| Hard | Array, Sorting, Bucket_Sort, Radix_Sort | 36 | 66.54
| 0162 |[Find Peak Element](src.save/main/java/g0101_0200/s0162_find_peak_element/Solution.java)| Medium | Top_Interview_Questions, Array, Binary_Search, Algorithm_II_Day_2_Binary_Search, Binary_Search_II_Day_12 | 0 | 100.00
| 0160 |[Intersection of Two Linked Lists](src.save/main/java/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Data_Structure_II_Day_11_Linked_List | 2 | 61.05
| 0155 |[Min Stack](src.save/main/java/g0101_0200/s0155_min_stack/MinStack.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Data_Structure_II_Day_14_Stack_Queue, Programming_Skills_II_Day_18 | 5 | 81.77
| 0154 |[Find Minimum in Rotated Sorted Array II](src.save/main/java/g0101_0200/s0154_find_minimum_in_rotated_sorted_array_ii/Solution.java)| Hard | Array, Binary_Search, Binary_Search_II_Day_13 | 0 | 100.00
| 0153 |[Find Minimum in Rotated Sorted Array](src.save/main/java/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Algorithm_II_Day_2_Binary_Search, Binary_Search_I_Day_12 | 0 | 100.00
| 0152 |[Maximum Product Subarray](src.save/main/java/g0101_0200/s0152_maximum_product_subarray/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Dynamic_Programming_I_Day_6 | 0 | 100.00
| 0151 |[Reverse Words in a String](src.save/main/java/g0101_0200/s0151_reverse_words_in_a_string/Solution.java)| Medium | String, Two_Pointers | 3 | 96.37
| 0150 |[Evaluate Reverse Polish Notation](src.save/main/java/g0101_0200/s0150_evaluate_reverse_polish_notation/Solution.java)| Medium | Top_Interview_Questions, Array, Math, Stack, Programming_Skills_II_Day_3 | 12 | 29.56
| 0149 |[Max Points on a Line](src.save/main/java/g0101_0200/s0149_max_points_on_a_line/Solution.java)| Hard | Top_Interview_Questions, Array, Hash_Table, Math, Geometry, Algorithm_II_Day_21_Others | 4 | 98.44
| 0148 |[Sort List](src.save/main/java/g0101_0200/s0148_sort_list/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Linked_List, Divide_and_Conquer, Merge_Sort | 8 | 78.95
| 0147 |[Insertion Sort List](src.save/main/java/g0101_0200/s0147_insertion_sort_list/Solution.java)| Medium | Sorting, Linked_List | 3 | 92.25
| 0146 |[LRU Cache](src.save/main/java/g0101_0200/s0146_lru_cache/LRUCache.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Design, Linked_List, Doubly_Linked_List | 82 | 59.12
| 0145 |[Binary Tree Postorder Traversal](src.save/main/java/g0101_0200/s0145_binary_tree_postorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack, Data_Structure_I_Day_10_Tree | 1 | 42.74
| 0144 |[Binary Tree Preorder Traversal](src.save/main/java/g0101_0200/s0144_binary_tree_preorder_traversal/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack, Data_Structure_I_Day_10_Tree | 1 | 42.23
| 0143 |[Reorder List](src.save/main/java/g0101_0200/s0143_reorder_list/Solution.java)| Medium | Two_Pointers, Stack, Linked_List, Recursion, Data_Structure_II_Day_13_Linked_List, Programming_Skills_II_Day_14 | 2 | 72.16
| 0142 |[Linked List Cycle II](src.save/main/java/g0101_0200/s0142_linked_list_cycle_ii/Solution.java)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List, Data_Structure_II_Day_10_Linked_List | 0 | 100.00
| 0141 |[Linked List Cycle](src.save/main/java/g0101_0200/s0141_linked_list_cycle/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Data_Structure_I_Day_7_Linked_List | 0 | 100.00
| 0140 |[Word Break II](src.save/main/java/g0101_0200/s0140_word_break_ii/Solution.java)| Hard | Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Backtracking, Trie, Memoization | 1 | 95.98
| 0139 |[Word Break](src.save/main/java/g0101_0200/s0139_word_break/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization, Algorithm_II_Day_15_Dynamic_Programming, Dynamic_Programming_I_Day_9 | 2 | 96.55
| 0138 |[Copy List with Random Pointer](src.save/main/java/g0101_0200/s0138_copy_list_with_random_pointer/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List, Programming_Skills_II_Day_14 | 0 | 100.00
| 0137 |[Single Number II](src.save/main/java/g0101_0200/s0137_single_number_ii/Solution.java)| Medium | Array, Bit_Manipulation | 1 | 91.46
| 0136 |[Single Number](src.save/main/java/g0101_0200/s0136_single_number/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Data_Structure_II_Day_1_Array, Algorithm_I_Day_14_Bit_Manipulation | 2 | 58.97
| 0135 |[Candy](src.save/main/java/g0101_0200/s0135_candy/Solution.java)| Hard | Array, Greedy | 3 | 76.49
| 0134 |[Gas Station](src.save/main/java/g0101_0200/s0134_gas_station/Solution.java)| Medium | Top_Interview_Questions, Array, Greedy | 3 | 61.54
| 0133 |[Clone Graph](src.save/main/java/g0101_0200/s0133_clone_graph/Solution.java)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Graph | 55 | 16.92
| 0132 |[Palindrome Partitioning II](src.save/main/java/g0101_0200/s0132_palindrome_partitioning_ii/Solution.java)| Hard | String, Dynamic_Programming | 2 | 99.72
| 0131 |[Palindrome Partitioning](src.save/main/java/g0101_0200/s0131_palindrome_partitioning/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking | 19 | 53.74
| 0130 |[Surrounded Regions](src.save/main/java/g0101_0200/s0130_surrounded_regions/Solution.java)| Medium | Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search | 2 | 80.58
| 0129 |[Sum Root to Leaf Numbers](src.save/main/java/g0101_0200/s0129_sum_root_to_leaf_numbers/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0128 |[Longest Consecutive Sequence](src.save/main/java/g0101_0200/s0128_longest_consecutive_sequence/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Union_Find | 17 | 84.46
| 0127 |[Word Ladder](src.save/main/java/g0101_0200/s0127_word_ladder/Solution.java)| Hard | Top_Interview_Questions, String, Hash_Table, Breadth_First_Search, Graph_Theory_I_Day_12_Breadth_First_Search | 32 | 94.39
| 0126 |[Word Ladder II](src.save/main/java/g0101_0200/s0126_word_ladder_ii/Solution.java)| Hard | String, Hash_Table, Breadth_First_Search, Backtracking | 4 | 99.18
| 0125 |[Valid Palindrome](src.save/main/java/g0101_0200/s0125_valid_palindrome/Solution.java)| Easy | Top_Interview_Questions, String, Two_Pointers | 3 | 88.82
| 0124 |[Binary Tree Maximum Path Sum](src.save/main/java/g0101_0200/s0124_binary_tree_maximum_path_sum/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 1 | 76.01
| 0123 |[Best Time to Buy and Sell Stock III](src.save/main/java/g0101_0200/s0123_best_time_to_buy_and_sell_stock_iii/Solution.java)| Hard | Array, Dynamic_Programming | 1 | 100.00
| 0122 |[Best Time to Buy and Sell Stock II](src.save/main/java/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.java)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Dynamic_Programming_I_Day_7 | 2 | 34.31
| 0121 |[Best Time to Buy and Sell Stock](src.save/main/java/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Data_Structure_I_Day_3_Array, Dynamic_Programming_I_Day_7 | 2 | 85.25
| 0120 |[Triangle](src.save/main/java/g0101_0200/s0120_triangle/Solution.java)| Medium | Array, Dynamic_Programming, Algorithm_I_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_13 | 1 | 99.76
| 0119 |[Pascal's Triangle II](src.save/main/java/g0101_0200/s0119_pascals_triangle_ii/Solution.java)| Easy | Array, Dynamic_Programming, Data_Structure_II_Day_3_Array, Dynamic_Programming_I_Day_12 | 0 | 100.00
| 0118 |[Pascal's Triangle](src.save/main/java/g0101_0200/s0118_pascals_triangle/Solution.java)| Easy | Top_Interview_Questions, Array, Dynamic_Programming, Data_Structure_I_Day_4_Array, Dynamic_Programming_I_Day_12 | 1 | 62.34
| 0117 |[Populating Next Right Pointers in Each Node II](src.save/main/java/g0101_0200/s0117_populating_next_right_pointers_in_each_node_ii/Solution.java)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List, Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search | 0 | 100.00
| 0116 |[Populating Next Right Pointers in Each Node](src.save/main/java/g0101_0200/s0116_populating_next_right_pointers_in_each_node/Solution.java)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List, Algorithm_I_Day_8_Breadth_First_Search_Depth_First_Search | 0 | 100.00
| 0115 |[Distinct Subsequences](src.save/main/java/g0101_0200/s0115_distinct_subsequences/Solution.java)| Hard | String, Dynamic_Programming | 3 | 99.53
| 0114 |[Flatten Binary Tree to Linked List](src.save/main/java/g0101_0200/s0114_flatten_binary_tree_to_linked_list/Solution.java)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Linked_List | 1 | 69.36
| 0113 |[Path Sum II](src.save/main/java/g0101_0200/s0113_path_sum_ii/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree, Backtracking, Data_Structure_II_Day_16_Tree | 1 | 100.00
| 0112 |[Path Sum](src.save/main/java/g0101_0200/s0112_path_sum/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_12_Tree | 0 | 100.00
| 0111 |[Minimum Depth of Binary Tree](src.save/main/java/g0101_0200/s0111_minimum_depth_of_binary_tree/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 1 | 94.17
| 0110 |[Balanced Binary Tree](src.save/main/java/g0101_0200/s0110_balanced_binary_tree/Solution.java)| Easy | Depth_First_Search, Tree, Binary_Tree, Programming_Skills_II_Day_2 | 0 | 100.00
| 0109 |[Convert Sorted List to Binary Search Tree](src.save/main/java/g0101_0200/s0109_convert_sorted_list_to_binary_search_tree/Solution.java)| Medium | Tree, Binary_Tree, Linked_List, Binary_Search_Tree, Divide_and_Conquer | 1 | 80.17
| 0108 |[Convert Sorted Array to Binary Search Tree](src.save/main/java/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.java)| Easy | Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer, Data_Structure_II_Day_15_Tree | 0 | 100.00
| 0107 |[Binary Tree Level Order Traversal II](src.save/main/java/g0101_0200/s0107_binary_tree_level_order_traversal_ii/Solution.java)| Medium | Breadth_First_Search, Tree, Binary_Tree | 1 | 93.94
| 0106 |[Construct Binary Tree from Inorder and Postorder Traversal](src.save/main/java/g0101_0200/s0106_construct_binary_tree_from_inorder_and_postorder_traversal/Solution.java)| Medium | Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer | 1 | 99.20
| 0105 |[Construct Binary Tree from Preorder and Inorder Traversal](src.save/main/java/g0101_0200/s0105_construct_binary_tree_from_preorder_and_inorder_traversal/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer, Data_Structure_II_Day_15_Tree | 1 | 99.69
| 0104 |[Maximum Depth of Binary Tree](src.save/main/java/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_11_Tree, Programming_Skills_I_Day_10_Linked_List_and_Tree | 0 | 100.00
| 0103 |[Binary Tree Zigzag Level Order Traversal](src.save/main/java/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.java)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_II_Day_15_Tree | 1 | 86.98
| 0102 |[Binary Tree Level Order Traversal](src.save/main/java/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_11_Tree | 0 | 100.00
| 0101 |[Symmetric Tree](src.save/main/java/g0101_0200/s0101_symmetric_tree/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_11_Tree | 0 | 100.00
| 0100 |[Same Tree](src.save/main/java/g0001_0100/s0100_same_tree/Solution.java)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 0 | 100.00
| 0099 |[Recover Binary Search Tree](src.save/main/java/g0001_0100/s0099_recover_binary_search_tree/Solution.java)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 3 | 71.74
| 0098 |[Validate Binary Search Tree](src.save/main/java/g0001_0100/s0098_validate_binary_search_tree/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_I_Day_14_Tree | 0 | 100.00
| 0097 |[Interleaving String](src.save/main/java/g0001_0100/s0097_interleaving_string/Solution.java)| Medium | String, Dynamic_Programming | 1 | 96.15
| 0096 |[Unique Binary Search Trees](src.save/main/java/g0001_0100/s0096_unique_binary_search_trees/Solution.java)| Medium | Top_100_Liked_Questions, Dynamic_Programming, Math, Tree, Binary_Tree, Binary_Search_Tree, Dynamic_Programming_I_Day_11 | 0 | 100.00
| 0095 |[Unique Binary Search Trees II](src.save/main/java/g0001_0100/s0095_unique_binary_search_trees_ii/Solution.java)| Medium | Dynamic_Programming, Tree, Binary_Tree, Backtracking, Binary_Search_Tree | 1 | 97.38
| 0094 |[Binary Tree Inorder Traversal](src.save/main/java/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Data_Structure_I_Day_10_Tree | 0 | 100.00
| 0093 |[Restore IP Addresses](src.save/main/java/g0001_0100/s0093_restore_ip_addresses/Solution.java)| Medium | String, Backtracking | 12 | 26.89
| 0092 |[Reverse Linked List II](src.save/main/java/g0001_0100/s0092_reverse_linked_list_ii/Solution.java)| Medium | Linked_List | 0 | 100.00
| 0091 |[Decode Ways](src.save/main/java/g0001_0100/s0091_decode_ways/Solution.java)| Medium | Top_Interview_Questions, String, Dynamic_Programming, Algorithm_II_Day_15_Dynamic_Programming, Dynamic_Programming_I_Day_10 | 2 | 64.33
| 0090 |[Subsets II](src.save/main/java/g0001_0100/s0090_subsets_ii/Solution.java)| Medium | Array, Bit_Manipulation, Backtracking, Algorithm_II_Day_9_Recursion_Backtracking | 2 | 75.68
| 0089 |[Gray Code](src.save/main/java/g0001_0100/s0089_gray_code/Solution.java)| Medium | Math, Bit_Manipulation, Backtracking | 2 | 99.93
| 0088 |[Merge Sorted Array](src.save/main/java/g0001_0100/s0088_merge_sorted_array/Solution.java)| Easy | Top_Interview_Questions, Array, Sorting, Two_Pointers, Data_Structure_I_Day_2_Array | 0 | 100.00
| 0087 |[Scramble String](src.save/main/java/g0001_0100/s0087_scramble_string/Solution.java)| Hard | String, Dynamic_Programming | 23 | 54.15
| 0086 |[Partition List](src.save/main/java/g0001_0100/s0086_partition_list/Solution.java)| Medium | Two_Pointers, Linked_List | 1 | 59.29
| 0085 |[Maximal Rectangle](src.save/main/java/g0001_0100/s0085_maximal_rectangle/Solution.java)| Hard | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Stack, Monotonic_Stack | 4 | 95.78
| 0084 |[Largest Rectangle in Histogram](src.save/main/java/g0001_0100/s0084_largest_rectangle_in_histogram/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Stack, Monotonic_Stack | 11 | 94.31
| 0083 |[Remove Duplicates from Sorted List](src.save/main/java/g0001_0100/s0083_remove_duplicates_from_sorted_list/Solution.java)| Easy | Linked_List, Data_Structure_I_Day_8_Linked_List | 0 | 100.00
| 0082 |[Remove Duplicates from Sorted List II](src.save/main/java/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.java)| Medium | Two_Pointers, Linked_List, Data_Structure_II_Day_11_Linked_List, Algorithm_II_Day_3_Two_Pointers | 1 | 70.85
| 0081 |[Search in Rotated Sorted Array II](src.save/main/java/g0001_0100/s0081_search_in_rotated_sorted_array_ii/Solution.java)| Medium | Array, Binary_Search, Binary_Search_II_Day_12 | 1 | 73.34
| 0080 |[Remove Duplicates from Sorted Array II](src.save/main/java/g0001_0100/s0080_remove_duplicates_from_sorted_array_ii/Solution.java)| Medium | Array, Two_Pointers | 1 | 77.11
| 0079 |[Word Search](src.save/main/java/g0001_0100/s0079_word_search/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Backtracking, Algorithm_II_Day_11_Recursion_Backtracking | 178 | 45.01
| 0078 |[Subsets](src.save/main/java/g0001_0100/s0078_subsets/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking, Algorithm_II_Day_9_Recursion_Backtracking | 1 | 79.43
| 0077 |[Combinations](src.save/main/java/g0001_0100/s0077_combinations/Solution.java)| Medium | Backtracking, Algorithm_I_Day_11_Recursion_Backtracking | 5 | 89.72
| 0076 |[Minimum Window Substring](src.save/main/java/g0001_0100/s0076_minimum_window_substring/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 3 | 98.09
| 0075 |[Sort Colors](src.save/main/java/g0001_0100/s0075_sort_colors/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Data_Structure_II_Day_2_Array | 1 | 33.23
| 0074 |[Search a 2D Matrix](src.save/main/java/g0001_0100/s0074_search_a_2d_matrix/Solution.java)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Data_Structure_I_Day_5_Array, Algorithm_II_Day_1_Binary_Search, Binary_Search_I_Day_8 | 0 | 100.00
| 0073 |[Set Matrix Zeroes](src.save/main/java/g0001_0100/s0073_set_matrix_zeroes/Solution.java)| Medium | Top_Interview_Questions, Array, Hash_Table, Matrix | 2 | 60.26
| 0072 |[Edit Distance](src.save/main/java/g0001_0100/s0072_edit_distance/Solution.java)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming, Algorithm_II_Day_18_Dynamic_Programming, Dynamic_Programming_I_Day_19 | 7 | 66.86
| 0071 |[Simplify Path](src.save/main/java/g0001_0100/s0071_simplify_path/Solution.java)| Medium | String, Stack | 4 | 87.52
| 0070 |[Climbing Stairs](src.save/main/java/g0001_0100/s0070_climbing_stairs/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Algorithm_I_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_2 | 0 | 100.00
| 0069 |[Sqrt(x)](src.save/main/java/g0001_0100/s0069_sqrtx/Solution.java)| Easy | Top_Interview_Questions, Math, Binary_Search, Binary_Search_I_Day_4 | 1 | 99.48
| 0068 |[Text Justification](src.save/main/java/g0001_0100/s0068_text_justification/Solution.java)| Hard | Array, String, Simulation | 1 | 77.17
| 0067 |[Add Binary](src.save/main/java/g0001_0100/s0067_add_binary/Solution.java)| Easy | String, Math, Bit_Manipulation, Simulation, Programming_Skills_II_Day_5 | 3 | 67.14
| 0066 |[Plus One](src.save/main/java/g0001_0100/s0066_plus_one/Solution.java)| Easy | Top_Interview_Questions, Array, Math, Programming_Skills_II_Day_3 | 0 | 100.00
| 0065 |[Valid Number](src.save/main/java/g0001_0100/s0065_valid_number/Solution.java)| Hard | String | 4 | 46.38
| 0064 |[Minimum Path Sum](src.save/main/java/g0001_0100/s0064_minimum_path_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Dynamic_Programming_I_Day_16 | 1 | 99.65
| 0063 |[Unique Paths II](src.save/main/java/g0001_0100/s0063_unique_paths_ii/Solution.java)| Medium | Array, Dynamic_Programming, Matrix, Dynamic_Programming_I_Day_15 | 1 | 56.99
| 0062 |[Unique Paths](src.save/main/java/g0001_0100/s0062_unique_paths/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics, Algorithm_II_Day_13_Dynamic_Programming, Dynamic_Programming_I_Day_15 | 1 | 45.44
| 0061 |[Rotate List](src.save/main/java/g0001_0100/s0061_rotate_list/Solution.java)| Medium | Two_Pointers, Linked_List, Programming_Skills_II_Day_16 | 0 | 100.00
| 0060 |[Permutation Sequence](src.save/main/java/g0001_0100/s0060_permutation_sequence/Solution.java)| Hard | Math, Recursion | 0 | 100.00
| 0059 |[Spiral Matrix II](src.save/main/java/g0001_0100/s0059_spiral_matrix_ii/Solution.java)| Medium | Array, Matrix, Simulation, Data_Structure_II_Day_3_Array | 0 | 100.00
| 0058 |[Length of Last Word](src.save/main/java/g0001_0100/s0058_length_of_last_word/Solution.java)| Easy | String, Programming_Skills_II_Day_6 | 0 | 100.00
| 0057 |[Insert Interval](src.save/main/java/g0001_0100/s0057_insert_interval/Solution.java)| Medium | Array | 1 | 99.15
| 0056 |[Merge Intervals](src.save/main/java/g0001_0100/s0056_merge_intervals/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Data_Structure_II_Day_2_Array | 7 | 97.44
| 0055 |[Jump Game](src.save/main/java/g0001_0100/s0055_jump_game/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Algorithm_II_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_4 | 2 | 87.28
| 0054 |[Spiral Matrix](src.save/main/java/g0001_0100/s0054_spiral_matrix/Solution.java)| Medium | Top_Interview_Questions, Array, Matrix, Simulation, Programming_Skills_II_Day_8 | 0 | 100.00
| 0053 |[Maximum Subarray](src.save/main/java/g0001_0100/s0053_maximum_subarray/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer, Data_Structure_I_Day_1_Array, Dynamic_Programming_I_Day_5 | 1 | 100.00
| 0052 |[N-Queens II](src.save/main/java/g0001_0100/s0052_n_queens_ii/Solution.java)| Hard | Backtracking | 1 | 95.66
| 0051 |[N-Queens](src.save/main/java/g0001_0100/s0051_n_queens/Solution.java)| Hard | Array, Backtracking | 3 | 87.94
| 0050 |[Pow(x, n)](src.save/main/java/g0001_0100/s0050_powx_n/Solution.java)| Medium | Top_Interview_Questions, Math, Recursion | 1 | 71.59
| 0049 |[Group Anagrams](src.save/main/java/g0001_0100/s0049_group_anagrams/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sorting, Data_Structure_II_Day_8_String, Programming_Skills_II_Day_11 | 10 | 74.79
| 0048 |[Rotate Image](src.save/main/java/g0001_0100/s0048_rotate_image/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix, Data_Structure_II_Day_3_Array, Programming_Skills_II_Day_7 | 0 | 100.00
| 0047 |[Permutations II](src.save/main/java/g0001_0100/s0047_permutations_ii/Solution.java)| Medium | Array, Backtracking, Algorithm_II_Day_10_Recursion_Backtracking | 2 | 86.24
| 0046 |[Permutations](src.save/main/java/g0001_0100/s0046_permutations/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking, Algorithm_I_Day_11_Recursion_Backtracking | 2 | 71.89
| 0045 |[Jump Game II](src.save/main/java/g0001_0100/s0045_jump_game_ii/Solution.java)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy, Algorithm_II_Day_13_Dynamic_Programming, Dynamic_Programming_I_Day_4 | 1 | 99.67
| 0044 |[Wildcard Matching](src.save/main/java/g0001_0100/s0044_wildcard_matching/Solution.java)| Hard | Top_Interview_Questions, String, Dynamic_Programming, Greedy, Recursion | 4 | 92.10
| 0043 |[Multiply Strings](src.save/main/java/g0001_0100/s0043_multiply_strings/Solution.java)| Medium | String, Math, Simulation, Data_Structure_II_Day_8_String, Programming_Skills_II_Day_4 | 3 | 96.85
| 0042 |[Trapping Rain Water](src.save/main/java/g0001_0100/s0042_trapping_rain_water/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack, Dynamic_Programming_I_Day_9 | 1 | 92.60
| 0041 |[First Missing Positive](src.save/main/java/g0001_0100/s0041_first_missing_positive/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 3 | 85.60
| 0040 |[Combination Sum II](src.save/main/java/g0001_0100/s0040_combination_sum_ii/Solution.java)| Medium | Array, Backtracking, Algorithm_II_Day_10_Recursion_Backtracking | 4 | 86.03
| 0039 |[Combination Sum](src.save/main/java/g0001_0100/s0039_combination_sum/Solution.java)| Medium | Top_100_Liked_Questions, Array, Backtracking, Algorithm_II_Day_10_Recursion_Backtracking | 3 | 92.97
| 0038 |[Count and Say](src.save/main/java/g0001_0100/s0038_count_and_say/Solution.java)| Medium | Top_Interview_Questions, String | 2 | 99.52
| 0037 |[Sudoku Solver](src.save/main/java/g0001_0100/s0037_sudoku_solver/Solution.java)| Hard | Array, Matrix, Backtracking | 3 | 98.89
| 0036 |[Valid Sudoku](src.save/main/java/g0001_0100/s0036_valid_sudoku/Solution.java)| Medium | Top_Interview_Questions, Array, Hash_Table, Matrix, Data_Structure_I_Day_5_Array | 2 | 95.85
| 0035 |[Search Insert Position](src.save/main/java/g0001_0100/s0035_search_insert_position/Solution.java)| Easy | Top_100_Liked_Questions, Array, Binary_Search, Algorithm_I_Day_1_Binary_Search, Binary_Search_I_Day_2 | 0 | 100.00
| 0034 |[Find First and Last Position of Element in Sorted Array](src.save/main/java/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Algorithm_II_Day_1_Binary_Search, Binary_Search_I_Day_5 | 0 | 100.00
| 0033 |[Search in Rotated Sorted Array](src.save/main/java/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Algorithm_II_Day_1_Binary_Search, Binary_Search_I_Day_11 | 0 | 100.00
| 0032 |[Longest Valid Parentheses](src.save/main/java/g0001_0100/s0032_longest_valid_parentheses/Solution.java)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming, Stack | 2 | 93.91
| 0031 |[Next Permutation](src.save/main/java/g0001_0100/s0031_next_permutation/Solution.java)| Medium | Top_100_Liked_Questions, Array, Two_Pointers | 1 | 85.59
| 0030 |[Substring with Concatenation of All Words](src.save/main/java/g0001_0100/s0030_substring_with_concatenation_of_all_words/Solution.java)| Hard | String, Hash_Table, Sliding_Window | 9 | 97.68
| 0029 |[Divide Two Integers](src.save/main/java/g0001_0100/s0029_divide_two_integers/Solution.java)| Medium | Top_Interview_Questions, Math, Bit_Manipulation | 1 | 99.96
| 0028 |[Implement strStr()](src.save/main/java/g0001_0100/s0028_implement_strstr/Solution.java)| Easy | Top_Interview_Questions, String, Two_Pointers, String_Matching, Programming_Skills_II_Day_1 | 0 | 100.00
| 0027 |[Remove Element](src.save/main/java/g0001_0100/s0027_remove_element/Solution.java)| Easy | Array, Two_Pointers | 0 | 100.00
| 0026 |[Remove Duplicates from Sorted Array](src.save/main/java/g0001_0100/s0026_remove_duplicates_from_sorted_array/Solution.java)| Easy | Top_Interview_Questions, Array, Two_Pointers | 1 | 99.47
| 0025 |[Reverse Nodes in k-Group](src.save/main/java/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.java)| Hard | Top_100_Liked_Questions, Linked_List, Recursion, Data_Structure_II_Day_13_Linked_List | 0 | 100.00
| 0024 |[Swap Nodes in Pairs](src.save/main/java/g0001_0100/s0024_swap_nodes_in_pairs/Solution.java)| Medium | Top_100_Liked_Questions, Linked_List, Recursion, Data_Structure_II_Day_12_Linked_List | 0 | 100.00
| 0023 |[Merge k Sorted Lists](src.save/main/java/g0001_0100/s0023_merge_k_sorted_lists/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Heap_Priority_Queue, Linked_List, Divide_and_Conquer, Merge_Sort | 2 | 97.31
| 0022 |[Generate Parentheses](src.save/main/java/g0001_0100/s0022_generate_parentheses/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking, Algorithm_II_Day_11_Recursion_Backtracking | 2 | 63.16
| 0021 |[Merge Two Sorted Lists](src.save/main/java/g0001_0100/s0021_merge_two_sorted_lists/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Data_Structure_I_Day_7_Linked_List, Algorithm_I_Day_10_Recursion_Backtracking | 1 | 69.17
| 0020 |[Valid Parentheses](src.save/main/java/g0001_0100/s0020_valid_parentheses/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack, Data_Structure_I_Day_9_Stack_Queue | 3 | 51.72
| 0019 |[Remove Nth Node From End of List](src.save/main/java/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List, Algorithm_I_Day_5_Two_Pointers | 1 | 59.72
| 0018 |[4Sum](src.save/main/java/g0001_0100/s0018_4sum/Solution.java)| Medium | Array, Sorting, Two_Pointers | 23 | 63.00
| 0017 |[Letter Combinations of a Phone Number](src.save/main/java/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking, Algorithm_II_Day_11_Recursion_Backtracking | 0 | 100.00
| 0016 |[3Sum Closest](src.save/main/java/g0001_0100/s0016_3sum_closest/Solution.java)| Medium | Array, Sorting, Two_Pointers | 3 | 99.98
| 0015 |[3Sum](src.save/main/java/g0001_0100/s0015_3sum/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Data_Structure_II_Day_1_Array, Algorithm_II_Day_3_Two_Pointers | 28 | 71.04
| 0014 |[Longest Common Prefix](src.save/main/java/g0001_0100/s0014_longest_common_prefix/Solution.java)| Easy | Top_Interview_Questions, String | 1 | 84.75
| 0013 |[Roman to Integer](src.save/main/java/g0001_0100/s0013_roman_to_integer/Solution.java)| Easy | Top_Interview_Questions, String, Hash_Table, Math | 6 | 79.00
| 0012 |[Integer to Roman](src.save/main/java/g0001_0100/s0012_integer_to_roman/Solution.java)| Medium | String, Hash_Table, Math | 7 | 75.71
| 0011 |[Container With Most Water](src.save/main/java/g0001_0100/s0011_container_with_most_water/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Greedy, Two_Pointers, Algorithm_II_Day_4_Two_Pointers | 2 | 99.81
| 0010 |[Regular Expression Matching](src.save/main/java/g0001_0100/s0010_regular_expression_matching/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Recursion | 3 | 80.22
| 0009 |[Palindrome Number](src.save/main/java/g0001_0100/s0009_palindrome_number/Solution.java)| Easy | Math | 13 | 58.99
| 0008 |[String to Integer (atoi)](src.save/main/java/g0001_0100/s0008_string_to_integer_atoi/Solution.java)| Medium | Top_Interview_Questions, String | 3 | 57.89
| 0007 |[Reverse Integer](src.save/main/java/g0001_0100/s0007_reverse_integer/Solution.java)| Medium | Top_Interview_Questions, Math | 2 | 66.74
| 0006 |[Zigzag Conversion](src.save/main/java/g0001_0100/s0006_zigzag_conversion/Solution.java)| Medium | String | 3 | 98.64
| 0005 |[Longest Palindromic Substring](src.save/main/java/g0001_0100/s0005_longest_palindromic_substring/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Data_Structure_II_Day_9_String, Algorithm_II_Day_14_Dynamic_Programming, Dynamic_Programming_I_Day_17 | 10 | 98.57
| 0004 |[Median of Two Sorted Arrays](src.save/main/java/g0001_0100/s0004_median_of_two_sorted_arrays/Solution.java)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Divide_and_Conquer | 3 | 81.72
| 0003 |[Longest Substring Without Repeating Characters](src.save/main/java/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Algorithm_I_Day_6_Sliding_Window | 5 | 91.03
| 0002 |[Add Two Numbers](src.save/main/java/g0001_0100/s0002_add_two_numbers/Solution.java)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion, Data_Structure_II_Day_10_Linked_List, Programming_Skills_II_Day_15 | 2 | 98.23
| 0001 |[Two Sum](src.save/main/java/g0001_0100/s0001_two_sum/Solution.java)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Data_Structure_I_Day_2_Array | 4 | 69.91

## Contributing
Your ideas/fixes/algorithms are more than welcome!

1. Fork this repo
2. Clone your forked repo (`git clone https://github.com/YOUR_GITHUB_USERNAME/LeetCode-in-Java.git`) onto your local machine
3. `cd` into your cloned directory, create your feature branch (`git checkout -b my-awesome-fix`)
4. `git add` your desired changes to this repo
5. Commit your changes (`git commit -m 'Added some awesome features/fixes'`)
6. Push to the branch (`git push origin my-awesome-feature`)
7. Open your forked repo on Github website, create a new Pull Request to this repo!
