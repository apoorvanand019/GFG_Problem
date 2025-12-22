class Solution {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
       
       ArrayList<Integer>ans=new ArrayList<>();
       HashMap<Integer,int[]>range=new HashMap<>();
       
       for(int i=0;i<arr.length;i++){
           if(!range.containsKey(arr[i])){
               range.put(arr[i],new int[]{i,i});
           }
           else{
               range.get(arr[i])[1]=i;
           }
       }
        
        for(int[] q : queries){
            int l=q[0];
            int r=q[1];
            int x=q[2];
            
           if(!range.containsKey(x)){
               ans.add(0);
               continue;
           }
            
           int[] pos=range.get(x);
           int start=Math.max(l,pos[0]);
           int end=Math.min(r,pos[1]);
           
           if(start>end){
               ans.add(0);
           }
           else{
               ans.add(end-start+1);
           }
            }
            return ans;
        }
       
    
   
}