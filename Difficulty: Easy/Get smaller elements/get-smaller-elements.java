class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList<Integer> l=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<target){
                l.add(arr[i]);
            }
        }
        return l;
    }
}