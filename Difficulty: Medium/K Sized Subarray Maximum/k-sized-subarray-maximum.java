class Solution {
    
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        
        for (int i = 0; i < arr.length; i++) {
            // Remove elements out of this window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            
            // Remove smaller elements (they are useless)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            
            // Add current element index
            dq.offerLast(i);
            
            // Add maximum of current window to result
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }
        
        return result;
    }


}