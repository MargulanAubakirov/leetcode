package NumberOfGoodPairs_1512;

//Given an array of integers nums.
//
//        A pair (i,j) is called good if nums[i] == nums[j] and i < j.
//
//        Return the number of good pairs.

public class Solution1 {
    public int numIdenticalPairs(int[] nums) {
        int number = 0;
        int i = 0;
        int j = i+1;
        while (i<nums.length) {
            if ((nums[i] == nums[j]) && i < j) {
                number++;
            }
            i++;

        }
    return number;

    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.numIdenticalPairs(nums));
//        int [] nums1 = {1,1,1,1};
//        int [] nums2 = {1,2,3};
    }
}
