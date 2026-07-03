class Solution {

    public boolean can_allocate(int[] nums, int k,int maxsum)
    {
        int subarray = 1;
        int current_sum = 0;

        for(int num:nums)
        {
            current_sum +=num;
            
            if(current_sum > maxsum)
            {
                subarray ++;
                current_sum = num;
            }
            if(subarray > k)
            {
                return false;
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        
        if(k > nums.length)
        {
            return -1;
        }
        
        int start = 0;
        int end = 0;
        int ans = -1;

        for(int num : nums)
        {
            start = Math.max(start,num);
            end += num;  
        }
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(can_allocate(nums,k,mid))
            {
                ans = mid;
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return ans;
    }
}