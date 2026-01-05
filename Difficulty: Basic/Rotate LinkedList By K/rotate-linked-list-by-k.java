// User function Template for Java
class Solution {
    public static void rotateByK(LinkedList<Integer> ll, int k) {
        // Your code here
        int n=ll.size();
        
        k=k % n;
        
        for(int i=0;i<k;i++){
            int last=ll.removeLast();
            ll.addFirst(last);
        }

        // You don't need to print
    }
}
