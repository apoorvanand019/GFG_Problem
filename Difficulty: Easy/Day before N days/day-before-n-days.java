class Solution {
    String arr[] = {
        "Sunday",
        "Monnday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"
    };
    public int dayBefore(int d, int n) {
        // code here
        n= n % 7;
        int res=(d - n + 7) % 7;
        
        return res;
    }
}