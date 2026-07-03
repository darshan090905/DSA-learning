class Solution {
    
    public boolean canAllocate(int[] weights, int days, int maxWeights)
    {
        int dayUsed = 1;
        int currentWeights = 0;

        for(int weight : weights)
        {
            currentWeights += weight;
            if(currentWeights > maxWeights)
            {
                dayUsed ++;
                currentWeights = weight;
            }
            if(dayUsed > days )
            {
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        
        if(days > weights.length)
        {
            return -1;
        }
        int start = 0;
        int end = 0;
        int ans = -1;

        for(int weight : weights)
        {
            start = Math.max(start,weight);
            end += weight;
        }

        while(start<=end)
        {
           int mid = start + (end-start)/2;
            if(canAllocate(weights,days,mid))
            {
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return ans;
        
    }
}