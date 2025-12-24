
class Solution {
    public String average(int arr[]) {
        // code here
        int n=arr.length;
        double avg=0;
        double sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        avg =sum / n;
        return String.format("%.2f",avg);
        
    }
}