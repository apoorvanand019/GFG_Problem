class Solution {
    public static void utility(int number) {
        // Write the if, else if, else statements below
        int n=number;
        if(n>100){
            System.out.println("Big");
        }
        else if(n<10){
            System.out.println("Small");
        }
        else{
            System.out.println("Number");
        }
    }
}