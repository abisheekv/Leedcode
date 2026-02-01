class Solution {

    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // swap root with last element
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // heapify reduced heap
            heapify(nums, i, 0);
        }

        return nums;
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}

