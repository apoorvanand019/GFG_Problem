// User function Template for Java
class Solution {
    public static int nextPrime(int n) {
        
        // code here to find next prime number
        int num=n+1;
        while(true){
            
        
        if(isPrime(num)){
            return num;
        }
        num++;
        }
        // return next prime number
     
    }
    
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}