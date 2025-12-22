class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        ArrayList<Integer>result=new ArrayList<>();
        
        int diagonalSum=0;
        
        for(int i=0;i<n;i++){
            diagonalSum += a[i][i];
        }
        
        int max=b[0];
        for(int i=1;i<n;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        result.add(diagonalSum);
        result.add(max);
        return result;
    }
}
