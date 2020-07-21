package RunningSumof1dArray_1480;

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//        Return the running sum of nums.
//Explanation
//        Loop once, we can get the sum of subarray starting from the initial point.
//
//        Complexity
//
//        Time O(N)
//        Space O(1)

import java.util.Arrays;

public class Solution {
    public int[] runningSum(int[] nums) {
            int i = 1;
            while (i<nums.length){
                nums[i]+=nums[i-1];
                i++;
            }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
//        int[] nums1 = {1,1,1,1,1};
//        int[] nums2 = {3,1,2,10,1};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.runningSum(nums)));
//        System.out.println(Arrays.toString(solution.runningSum(nums1)));
//        System.out.println(Arrays.toString(solution.runningSum(nums2)));


    }
}


