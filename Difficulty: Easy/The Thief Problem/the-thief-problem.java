class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int x : arr){
            pq.offer(x);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        int sum=0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}