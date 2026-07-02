class Solution {

    public boolean can_allocate(int[] arr, int k, int max_pages) {

        int current_pages = 0;
        int students = 1;

        for (int pages : arr) {

            current_pages += pages;

            if (current_pages > max_pages) {
                students++;
                current_pages = pages;
            }

            if (students > k) {
                return false;
            }
        }

        return true;
    }

    public int findPages(int[] arr, int k) {

        if (k > arr.length) {
            return -1;
        }

        int start = 0;
        int end = 0;
        int ans = -1;

        for (int pages : arr) {
            start = Math.max(start, pages);
            end += pages;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (can_allocate(arr, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}