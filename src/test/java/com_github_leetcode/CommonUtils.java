package com_github_leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonUtils {

    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void printArray(double[] nums) {
        for (double i : nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static boolean compareArray(int[] arr1, int[] arr2) {
        for (int i : arr1) {
            boolean include = false;
            for (int j : arr2) {
                if (i == j) {
                    include = true;
                    break;
                }
            }
            if (!include) {
                return false;
            }
        }
        return true;
    }

    public static boolean compareArray(List<Integer> arr1, List<Integer> arr2) {
        for (int i : arr1) {
            boolean include = false;
            for (int j : arr2) {
                if (i == j) {
                    include = true;
                    break;
                }
            }
            if (!include) {
                return false;
            }
        }
        return true;
    }

    public static boolean compareMatrix(List<List<Integer>> mt1, List<List<Integer>> mt2) {
        for (List<Integer> i : mt1) {
            boolean include = false;
            for (List<Integer> j : mt2) {
                if (i.toString().equals(j.toString())) {
                    include = true;
                    break;
                }
            }
            if (!include) {
                return false;
            }
        }
        return true;
    }

    public static char[][] convertLeetCodeRegular2DCharArrayInputIntoJavaArray(String input) {
        /*
         * LeetCode 2-d char array usually comes in like this:
         * ["#"," ","#"],[" "," ","#"],["#","c"," "] which is wrapped in double quotes instead
         * of single quotes which makes it not usable in Java code.
         * This method helps with the conversion.
         */
        String[] arrays = input.split("],\\[");
        int m = arrays.length;
        int n = arrays[1].split(",").length;
        char[][] ans = new char[m][n];
        for (int i = 0; i < m; i++) {
            if (i == 0) {
                String str = arrays[i].substring(1);
                String[] strs = str.split(",");
                for (int j = 0; j < strs.length; j++) {
                    ans[i][j] = strs[j].charAt(1);
                }
            } else if (i == m - 1) {
                String str = arrays[i].substring(0, arrays[i].length() - 1);
                String[] strs = str.split(",");
                for (int j = 0; j < strs.length; j++) {
                    ans[i][j] = strs[j].charAt(1);
                }
            } else {
                String[] strs = arrays[i].split(",");
                for (int j = 0; j < strs.length; j++) {
                    ans[i][j] = strs[j].charAt(1);
                }
            }
        }
        return ans;
    }

    public static int[][] convertLeetCodeRegularRectangleArrayInputIntoJavaArray(String input) {
        /*
         * LeetCode 2-d array input usually comes like this: it's a REGULAR rectangle
         * [[448,931],[234,889],[214,962],[576,746]]
         * The expected input for this method is: "[448,931],[234,889],[214,962],[576,746]"
         * i.e. strip off the beginning and ending square brackets, that's it.
         * The output of this method will be a standard Java 2-d array.
         * */
        String[] arrays = input.split("],\\[");
        int size = arrays[1].split(",").length;
        int[][] output = new int[arrays.length][size];
        for (int i = 0; i < arrays.length; i++) {
            if (i == 0) {
                String str = arrays[i].substring(1);
                String[] nums = str.split(",");
                for (int j = 0; j < nums.length; j++) {
                    output[i][j] = Integer.parseInt(nums[j]);
                }
            } else if (i == arrays.length - 1) {
                String str = arrays[i].substring(0, arrays[i].length() - 1);
                String[] nums = str.split(",");
                for (int j = 0; j < nums.length; j++) {
                    output[i][j] = Integer.parseInt(nums[j]);
                }
            } else {
                String[] nums = arrays[i].split(",");
                for (int j = 0; j < nums.length; j++) {
                    output[i][j] = Integer.parseInt(nums[j]);
                }
            }
        }
        return output;
    }

    public static int[][] convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(String input) {
        /*
         * LeetCode 2-d array input usually comes like this: each row could have different length
         * [[448,931,123,345],[889],[214,962],[576,746,897]]
         * The expected input for this method is: "[448,931,123,345],[889],[214,962],[576,746,897]"
         * i.e. strip off the beginning and ending square brackets, that's it.
         * The output of this method will be a standard Java 2-d array.
         * */
        String[] arrays = input.split("],\\[");
        int maxLen = 0;
        int[] sizes = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            String[] strs = arrays[i].split(",");
            maxLen = Math.max(maxLen, strs.length);
            sizes[i] = strs.length;
        }
        int[][] output = new int[arrays.length][];
        if (arrays.length == 1) {
            String str = arrays[0].substring(1, arrays[0].length() - 1);
            String[] nums = str.split(",");
            output[0] = new int[sizes[0]];
            for (int j = 0; j < sizes[0]; j++) {
                output[0][j] = Integer.parseInt(nums[j]);
            }
        } else {
            for (int i = 0; i < arrays.length; i++) {
                if (i == 0) {
                    String str = arrays[i].substring(1);
                    String[] nums = str.split(",");
                    output[i] = new int[sizes[i]];
                    for (int j = 0; j < sizes[i]; j++) {
                        output[i][j] = Integer.parseInt(nums[j]);
                    }
                } else if (i == arrays.length - 1) {
                    String str = arrays[i].substring(0, arrays[i].length() - 1);
                    String[] nums = str.split(",");
                    output[i] = new int[sizes[i]];
                    for (int j = 0; j < sizes[i]; j++) {
                        output[i][j] = Integer.parseInt(nums[j]);
                    }
                } else {
                    String[] nums = arrays[i].split(",");
                    output[i] = new int[sizes[i]];
                    for (int j = 0; j < sizes[i]; j++) {
                        output[i][j] = Integer.parseInt(nums[j]);
                    }
                }
            }
        }
        return output;
    }

    public static List<List<String>> convertLeetCode2DStringArrayInputIntoJavaArray(String input) {
        /*
         * How to copy LeetCode 2-d String array into this method:
         * 1. remove the beginning and ending quotes;
         * 2. put double quotes into this method parameter;
         * 3. copy the input into the double quotes.
         *
         * LeetCode 2-d array input usually comes like this: each row could have different length
         * [["A","B"],["C"],["B","C"],["D"]]
         * The expected input for this method is: "[\"A\",\"B\"],[\"C\"],[\"B\",\"C\"],[\"D\"]"
         * just copy the LeetCode input: ["A","B"],["C"],["B","C"],["D"] into double quotes in Java,
         * it'll auto escape the double quotes.
         * i.e. strip off the beginning and ending square brackets, that's it.
         * The output of this method will be a standard Java 2-d array.
         * */
        String[] arrays = input.split("],\\[");
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            List<String> level = new ArrayList<>();
            String[] strings;
            if (i == 0) {
                strings = arrays[i].substring(1).split(",");
            } else if (i == arrays.length - 1) {
                strings = arrays[i].substring(0, arrays[i].length() - 1).split(",");
            } else {
                strings = arrays[i].split(",");
            }
            Collections.addAll(level, strings);
            result.add(level);
        }
        return result;
    }

    public static List<String> convertLeetCode1DStringArrayInputIntoJavaArray(String input) {
        /*
         * LeetCode 2-d array input usually comes like this: each row could have different length
         * ["A","B","C"]
         * The expected input for this method is: "[\"A\",\"B\",\"C\"]"
         * just copy the LeetCode input: ["A","B","C"] into double quotes in Java,
         * it'll auto escape the double quotes.
         * The output of this method will be a standard Java 1-d array.
         * */
        String[] arrays = input.split(",");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            String word;
            if (i == 0) {
                word = arrays[i].substring(1);
            } else if (i == arrays.length - 1) {
                word = arrays[i].substring(0, arrays[i].length() - 1);
            } else {
                word = arrays[i];
            }
            result.add(word);
        }
        return result;
    }
}
