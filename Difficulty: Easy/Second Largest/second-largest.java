class Solution {
    public int getSecondLargest(int[] arr) {
        
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE)
        {
            return -1;
        }
        return secondLargest;
    }
    
}