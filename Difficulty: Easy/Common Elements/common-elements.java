// User function Template for Java

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        ArrayList<Integer>res=new ArrayList<>();
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int num : a){
            freq.put(num,freq.getOrDefault(num,0) + 1);
            
        }
        for(int num : b){
            if(freq.containsKey(num) && freq.get(num)>0){
                res.add(num);
                freq.put(num,freq.get(num)-1);
            }
        }
        Collections.sort(res);
        return res;
    }
}