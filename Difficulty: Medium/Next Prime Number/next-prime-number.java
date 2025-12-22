// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        int candidate=n + 1;
        while(!isPrime(candidate)){
            candidate++;
        }
        // return next prime number
        return candidate;
        
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}