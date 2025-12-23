// User function Template for Java
class Solution {
    public static void fizzBuzz(int number) {
        // Write your code here.
        int n=number;
         if(n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(n % 3 == 0){
            System.out.println("Fizz");
        }
        else if(n % 5 == 0){
            System.out.println("Buzz");
        }
       
        else{
            System.out.println(n);
        }
    }
}