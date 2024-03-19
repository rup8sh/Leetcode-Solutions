class Solution {
    public int search(int[] nums, int target) {
        int a =0;
        boolean flag = false; 
        for(int i=0; i< nums.length; i++)
        {
            if(target == nums[i])
            {a = i;
            flag = true;}
        }
        if( flag == false)
        {a =-1;}
    return a;
    }
}