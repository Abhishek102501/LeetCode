class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k == 2 || k == 5){
            return -1;
        }

        int remainder = 0;

        for(int length = 1;  length <= k; length++){
         remainder = (remainder * 10 + 1) % k; 

         if(remainder == 0){
            return length;
         }
        }
        return -1;
    }
}