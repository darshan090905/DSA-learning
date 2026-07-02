class Solution {

    public int firstOccurance(int[] arr, int target) {

        int l = 0;
        int r = arr.length - 1;
        int ans = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                ans = mid;
                r = mid - 1;
            }
            else if (target < arr[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public int lastOccurance(int[] arr, int target) {

        int l = 0;
        int r = arr.length - 1;
        int ans = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                ans = mid;
                l = mid + 1;
            }
            else if (target < arr[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return ans;
    }

    int countFreq(int[] arr, int target) {

        int first = firstOccurance(arr, target);

        if (first == -1) {
            return 0;
        }

        int last = lastOccurance(arr, target);

        return last - first + 1;
    }
}