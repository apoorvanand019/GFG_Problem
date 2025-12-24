class Solution {
    public int countLessEqual(int[] arr, int x) {
        // code here
        int n=arr.length;
        int pivot=findPivot(arr);
        int countRight=count(arr,pivot,n-1,x);
        int countLeft=count(arr,0,pivot-1,x);
        
        return countRight + countLeft;
        
    }
    public int findPivot(int[] arr){
        int low=0,high=arr.length-1;
        while(low<high){
            int mid= low +(high -low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                high =mid;
            }
        }
        return low;
    }
    public int count(int[] arr,int low,int high,int x){
        if(low>high){
            return 0;
            
        }
        int l=low,r=high;
        while(l<=r){
            int mid= l + (r-l) / 2;
            if(arr[mid]<=x){
                l=mid+1;
                
            }else{
                r=mid-1;
            }
        }
        return Math.max(0,r-low +1);
    }
}
