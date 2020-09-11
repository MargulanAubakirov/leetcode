package prob1_TwoSum;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int t = 9;
        int[] arr = {2,7,11,15};
        Solution s = new Solution();
        int[] result = (s.twoSum(arr, t));
        System.out.println(Arrays.toString(result));
    }

}