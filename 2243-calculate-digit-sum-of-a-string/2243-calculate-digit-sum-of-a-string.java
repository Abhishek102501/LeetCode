class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            String ans = "";
            for(int i = 0; i < s.length(); i += k){
               String temp = s.substring(i, Math.min(i + k, s.length()));

               int sum = 0;
               for(int j = 0; j < temp.length(); j++){
                sum += temp.charAt(j) - '0';
               }
               ans += sum;
            }
            s = ans;
        }
        return s;
    }
}