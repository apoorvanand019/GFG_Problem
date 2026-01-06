// User function Template for Java
class Solution {
    public static String Sorted_Characters(String s) {
        // Your code here
        TreeSet<Character> set = new TreeSet<>();

        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
