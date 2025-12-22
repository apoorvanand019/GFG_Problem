// User function Template for Java
class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int sum1=0, sum2=0;
        for(int i=1;i<=N;i++){
            if(i % 2 == 0){
                sum1 += i;
            }
            if(i % 2 != 0){
                sum2 += i;
            }
            
        }
        result.add(sum1);
        result.add(sum2);
        
        return result;
    }
}