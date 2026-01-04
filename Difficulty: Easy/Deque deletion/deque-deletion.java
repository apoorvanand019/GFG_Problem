class Solution {
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        // code here
        if(deq.isEmpty() || X<0 || X>=deq.size()){
            return ;
        }
        ArrayDeque<Integer> temp=new ArrayDeque<>();
        
        int idx=0;
        while(!deq.isEmpty()){
            int val=deq.pollFirst();
            if( idx != X){
                temp.addLast(val);
            }
            idx++;
        }
        deq.addAll(temp);
        
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        
        // code here
        if(deq.isEmpty() || start>=end){
            return;
        }
        ArrayDeque<Integer> temp=new ArrayDeque<>();
        int idx=0;
        while(!deq.isEmpty()){
            int val=deq.pollFirst();
            if(idx<start || idx>=end){
                temp.addLast(val);
            } 
            idx++;
        }
        deq.addAll(temp);
    }

        
    public static void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}