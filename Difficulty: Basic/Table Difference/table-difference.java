import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        int res= n2 - n1;
        
        for(int i=1;i<=10;i++){
            System.out.print((res * i) +" ");
        }
    }
}