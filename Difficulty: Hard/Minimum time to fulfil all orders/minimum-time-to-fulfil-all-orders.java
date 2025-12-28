class Solution {
    public int minTime(int[] ranks, int n) {
        // code here
        int minRank = Integer.MAX_VALUE;
        for (int r : ranks) {
            minRank = Math.min(minRank, r);
        }

        int low = 0;
        int high = minRank * n * (n + 1) / 2;
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMake(mid, ranks, n)) {
                ans = mid;
                high = mid - 1; // try smaller time
            } else {
                low = mid + 1;  // need more time
            }
        }
        return ans;
    }
    private boolean canMake(int time, int[] ranks, int n) {
        int donuts = 0;

        for (int r : ranks) {
            int k = 0;
            int currTime = 0;

            while (true) {
                currTime += r * (k + 1);
                if (currTime > time) break;
                k++;
                donuts++;
                if (donuts >= n) return true;
            }
        }
        return false;
    }
}