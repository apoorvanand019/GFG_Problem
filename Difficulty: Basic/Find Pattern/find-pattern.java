class Solution {
    public static int findPattern(String s, String p) {
        // code here
        int n=s.length();
        int m=p.length();
        if(n<m){
            return -1;
        }
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(s.charAt(i+j) != p.charAt(j)){
                    break;
                }
                
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }
}
