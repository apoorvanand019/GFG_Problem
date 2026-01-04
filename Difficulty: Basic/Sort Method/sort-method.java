// User function Template for Java
class Solution {
    public static void sortArray(int arr[]) {
        // Your code here
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>=arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
          }
        }

        // You do not need to print
    }
}