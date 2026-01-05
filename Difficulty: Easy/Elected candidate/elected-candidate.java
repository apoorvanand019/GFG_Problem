// User function Template for Java

class Solution {
    public static String electionWinner(String arr[]) {
        // Your code here
        HashMap<String,Integer>map=new HashMap<>();
        
        for(String name : arr){
            map.put(name,map.getOrDefault(name,0)+1);
        }
        String winner="";
        int max=0;
        for(Map.Entry<String,Integer>entry : map.entrySet()){
            String candidate=entry.getKey();
            int votes=entry.getValue();
            
            if((votes>max) || (votes == max && candidate.compareTo(winner)<0)){
               max=votes;
               winner=candidate;
            }
        }
        return winner;
    }
}