package g0001_0100.s0045_jump_game_ii;

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Greedy
// #Algorithm_II_Day_13_Dynamic_Programming #Dynamic_Programming_I_Day_4
// #Big_O_Time_O(n)_Space_O(1) #2024_11_10_Time_0_ms_(100.00%)_Space_44.9_MB_(75.73%)

class Solution {
  public int jump(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }
    return minJumps(nums, 0, 0);
  }


  private static int minJumps(int[] nums, int currIndex, int jumpStatus) {
    if (currIndex + nums[currIndex] >= nums.length - 1) {
      return jumpStatus + 1;
    }
    int nextIndex = currIndex + 1;
    int distanceLeft = (nums.length - 1 - (currIndex + 1)) - nums[currIndex + 1];
    for (int i = currIndex + 2; i <= (currIndex + nums[currIndex]); i++) {
      int tempDistanceLeft = (nums.length - 1 - i) - nums[i];
      if (distanceLeft > tempDistanceLeft) {
        distanceLeft = tempDistanceLeft;
        nextIndex = i;
      }
    }
    return minJumps(nums, nextIndex, jumpStatus + 1);
  }
}
