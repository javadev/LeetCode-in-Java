package com_github_leetcode;

import java.util.List;

public class CommonUtils {

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
}
