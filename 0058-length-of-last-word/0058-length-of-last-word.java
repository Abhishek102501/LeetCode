class Solution {
    public int lengthOfLastWord(String s) {
        // int i = s.length() - 1;
      
        // while(i >= 0 && s.charAt(i) == ' '){
        //     i--;
        // }
        //   int count = 0;
        // while(i >= 0 && s.charAt(i) != ' '){
        //     count++;
        //     i--;
        // }
        // return count;
        int count = 0;
        
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
            count++;
            }
            else if(count > 0){
                break;
            }
        }
    return count;
    }
}