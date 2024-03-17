class Solution {
    public int maxSubArray(int[] nums) {
        int count=nums[0]; int maxsofar=nums[0];
        for(int i =1; i< nums.length; i++)
        {
            count = Math.max(nums[i], count+nums[i]);
            maxsofar = Math.max(maxsofar, count);
        }
    return maxsofar;
    }
}