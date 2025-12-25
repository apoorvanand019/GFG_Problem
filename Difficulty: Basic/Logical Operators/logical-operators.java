class Solution {
    public String booleanOperations(boolean a, boolean b) {
        // Code here
        boolean res1=a && b;
        boolean res2=a || b;
        boolean res3= !a;
        
        return res1 + " " + res2 + " " + res3;
    }
}