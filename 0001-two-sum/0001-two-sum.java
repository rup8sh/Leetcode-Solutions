class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.fill(result, -1); // Initialize the result array with -1

        // Create an array of indices and sort it along with the nums array
        Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[indices[left]] + nums[indices[right]];
            if (sum == target) {
                result[0] = indices[left];
                result[1] = indices[right];
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;

    }
}