// User function Template for Java
class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x: arr){
            pq.add(x);
        }
        return pq;
    }
}