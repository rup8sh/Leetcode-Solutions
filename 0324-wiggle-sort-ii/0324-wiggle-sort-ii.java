import java.util.Arrays;

public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] temp = Arrays.copyOf(nums, nums.length);
        int n = nums.length;
        int left = (n - 1) / 2;
        int right = n - 1;
        for (int i = 0; i < n; i++) {
            nums[i] = i % 2 == 0 ? temp[left--] : temp[right--];
        }
    }
}
