// User function Template for Java
class Solution {
    public static int filterUsingStreams(int[] arr) {
        // Your code here
        return Arrays.stream(arr).filter(x-> x % 2 != 0).max().orElse(-1);

        // Use filter() to get only odd elements then apply max().getAsInt()
    }
}