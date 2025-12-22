// User function Template for Java

class Solution {
    static int primeSum(int n) {
        // code here
      int sum=0;
        while(n!=0){
            int rem= n%10;
            if(isPrime(rem)){
                sum += rem;
            }
            n /= 10;
        }
        return sum;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
            
        }
        for(int i=2;i<=n/2;i++){
            if( n % i == 0){
                return false;
                
            }
            
        }
        return true;
    }
}
    
