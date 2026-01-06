
class Solution {
    public double[] FindRoots(int A, int B, int C) {
        // code here
        double a=A,b=B,c=C;
        double disc= b*b - 4 * a * c;
        if(disc<0){
            return new double[]{-1};
        }
        double root1= (-b + Math.sqrt(disc))/(2*a);
         double root2= (-b - Math.sqrt(disc))/(2*a);
        if(root1>root2){
            double temp=root1;
            root1=root2;
            root2=temp;
        }
        
        return new double[]{root1,root2};
    }
}