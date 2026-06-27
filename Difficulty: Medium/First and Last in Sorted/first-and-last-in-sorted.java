class Solution {

    int firstOccurance(int arr[], int x) {

        int l = 0;
        int r = arr.length - 1;
        int ans = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                ans = mid;
                r = mid - 1;
            }
            else if (x < arr[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return ans;
    }

    int lastOccurance(int arr[], int x) {

        int l = 0;
        int r = arr.length - 1;
        int ans = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                ans = mid;
                l = mid + 1;
            }
            else if (x < arr[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return ans;
    }

    ArrayList<Integer> find(int arr[], int x) {

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(firstOccurance(arr, x));
        ans.add(lastOccurance(arr, x));

        return ans;
    }
}