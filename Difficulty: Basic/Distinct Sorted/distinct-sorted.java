// User function Template for Java

class Solution {
    public static ArrayList<Integer> uniqueSorted(int arr[]) {
        // Your code here
        HashSet<Integer> h= new HashSet<>();
        
        for(int x : arr){
            h.add(x);
        }
        ArrayList<Integer> arrL=new ArrayList<>(h);
        Collections.sort(arrL);
        
        return arrL;
    }
}