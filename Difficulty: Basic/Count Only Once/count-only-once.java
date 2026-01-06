// User function Template for Java
class Solution {
    public static int countOnce(int arr[]) {
        // Your code here
        HashSet<Integer>set=new HashSet<>();
        
        for(int x: arr){
            set.add(x);
        }
        return set.size();
    }
}
