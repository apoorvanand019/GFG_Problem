class Solution {
    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        // code here
       
        
       int max=1_000_000;
       
       int[] freq=new int[max+1];
       for(int x : arr){
           freq[x]++;
       }
       for(int i=1;i<=max;i++){
           freq[i] += freq[i-1];
           
       }
       ArrayList<Integer>res=new ArrayList<>();
       for(int[] q: queries){
           int a=q[0];
           int b=q[1];
           
           int count;
           if(a==0){
               count=freq[b];
           }else{
               count=freq[b]-freq[a-1];
           }
           res.add(count);
       }
       return res;
    }
   
}
