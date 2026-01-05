class Solution {
    public int maxSubarraySum(int[] arr, int k) {
    int n = arr.length;
    
    // Edge case
    if (k > n) return -1;

    // Sum of first window
    int windowSum = 0;
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];
    }

    int maxSum = windowSum;

    // Slide the window
    for (int i = k; i < n; i++) {
        windowSum = windowSum + arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
}

}