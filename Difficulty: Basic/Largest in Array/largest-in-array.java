class Solution {
    public static int largest(int[] arr) {

        int largestArray = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestArray) {
                largestArray = arr[i];
            }
        }

        return largestArray;
    }
}