class Solution {
    public static void squareWall(int s) {
        // Write your code here
        int n=s;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}