// User function Template for Java

class Solution {
    String findSum(String s1, String s2) {
        // code here
        StringBuilder res=new StringBuilder();
        int i=s1.length()-1;
        int j=s2.length()-1;
        
        int carry=0;
        
        while(i>=0 || j>=0 || carry>0){
        int sum=carry;
        
        if(i>=0){
            sum += s1.charAt(i) - '0';
            i--;
        }
        if(j>=0){
            sum += s2.charAt(j) - '0';
            j--;
        }
        res.append(sum % 10);
        carry =sum / 10;
    }
    res.reverse();
    
    int idx=0;
    while(idx<res.length() -1 && res.charAt(idx)=='0'){
        idx++;
    }
    return res.substring(idx);
    }
    
    
}