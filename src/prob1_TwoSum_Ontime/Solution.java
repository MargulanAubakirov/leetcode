package prob1_TwoSum_Ontime;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int pair = target - nums[i];
            if (map.containsKey(pair)){
                return new int[]{i, map.get(pair)};
            }
            map.put(nums[i],i );

        }
        throw new IllegalArgumentException("No pair");
    }
    public static void main(String[] args) {
        int t = 9;
        int[] arr = {2,7,11,15};
        Solution s = new Solution();
        int[] result =  (s.twoSum(arr, t));
        System.out.println(Arrays.toString(result));

        int t1 = 6;
        int[] arr1 = {3,2,4};
        Solution s1 = new Solution();
        int[] result1 =  (s1.twoSum(arr1, t1));
        System.out.println(Arrays.toString(result1));
    }
}