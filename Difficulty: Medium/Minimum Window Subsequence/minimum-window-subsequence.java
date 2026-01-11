class Solution {
    public String minWindow(String s1, String s2) {
    int n = s1.length(), m = s2.length();
    String result = "";
    int minLen = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
        // Try to match s2 starting from s1[i]
        if (s1.charAt(i) == s2.charAt(0)) {
            int j = i, k = 0;

            // Forward scan: match s2 in s1
            while (j < n && k < m) {
                if (s1.charAt(j) == s2.charAt(k)) {
                    k++;
                }
                j++;
            }

            // If full s2 matched
            if (k == m) {
                // Backward scan: minimize window
                int end = j - 1;
                k = m - 1;
                while (end >= i) {
                    if (s1.charAt(end) == s2.charAt(k)) {
                        k--;
                        if (k < 0) break;
                    }
                    end--;
                }

                int start = end;
                int len = j - start;
                if (len < minLen) {
                    minLen = len;
                    result = s1.substring(start, j);
                }
            }
        }
    }
    return result;
}

}
