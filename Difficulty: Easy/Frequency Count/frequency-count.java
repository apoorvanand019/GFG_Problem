class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        
        for(int x: arr){
            map.put(x,map.getOrDefault(x,0) + 1);
            
        }
        ArrayList<Integer>res= new ArrayList<>();
        for(int freq: map.values()){
            res.add(freq);
        }
        
        return res;
    }
}