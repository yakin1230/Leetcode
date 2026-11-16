class Solution {
    public String digitSum(String s, int k) {
        while (k < s.length()) {
            int n1 = s.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n1; i += k) {
                int sum = 0;
                for (int j = i; j < i + k && j < n1; j++) {
                    sum += s.charAt(j) - '0';
                }
                sb.append(sum);
            }
            s = sb.toString();
        }
        return s;
    }
}