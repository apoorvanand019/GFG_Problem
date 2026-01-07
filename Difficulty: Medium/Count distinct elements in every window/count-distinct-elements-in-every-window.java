class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
    ArrayList<Integer> result = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    
    // First window
    for (int i = 0; i < k; i++) {
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    
    // Add result for first window
    result.add(map.size());
    
    // Slide the window
    for (int i = k; i < arr.length; i++) {
        // Remove element going out
        int out = arr[i - k];
        map.put(out, map.get(out) - 1);
        if (map.get(out) == 0) {
            map.remove(out);
        }
        
        // Add new element coming in
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        
        // Add current count
        result.add(map.size());
    }
    
    return result;
}

}