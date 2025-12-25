// User function Template for Java
class Solution {
    public static void triangle(int s) {

        // Write your code here
        if(s==1){
            System.out.println("*");
            return;
        }
        System.out.println("*");
        for(int i=2;i<s;i++){
            System.out.print("*");
            for(int j=1;j<=2 * i  - 3;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=1;i<=s;i++){
            System.out.print("*");
            if(i<s){
                System.out.print(" ");
            }
        }
        System.out.println();
        
    }
}