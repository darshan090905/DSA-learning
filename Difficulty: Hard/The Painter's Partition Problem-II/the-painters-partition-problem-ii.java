class Solution {
    
    public boolean can_allocate(int arr[],int k,int max_time)
    {
        int painters = 1;
        int current_time = 0;
        
        for(int board : arr)
        {
            current_time += board;
            
            if(current_time > max_time)
            {
                painters ++;
                current_time = board;
            }
            if(painters > k)
            {
                return false;
            }
        }
        return true;
    }
    
    public int minTime(int[] arr, int k) {
        
        if(k > arr.length)
        {
            return -1;
        }
        
        int start = 0;
        int end = 0;
        int ans = -1;
        
        for(int board : arr)
        {
            start = Math.max(start,board);
            end += board;
        }
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(can_allocate(arr,k,mid))
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
