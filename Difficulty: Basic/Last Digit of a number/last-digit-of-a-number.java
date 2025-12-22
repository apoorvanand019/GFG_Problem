class Solution {
    public int lastDigit(int n) {
        // Code here
        int rem;
        rem= n % 10;
        return Math.abs(rem);
    }
}