class Solution {
   public int countSubarrays(int[] arr, int k) {
    int prefixSum = 0;
    int count = 0;

    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); // base case

    for (int num : arr) {
        if (num % 2 != 0) {
            prefixSum++;
        }

        if (map.containsKey(prefixSum - k)) {
            count += map.get(prefixSum - k);
        }

        map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
    }

    return count;
}

}
