class Solution {
    public int reverseBits(int n) {
        int answer = 0 ;
        int bit = 0;
        for (int i = 0 ; i<32 ; i++){
        bit = n & 1;
       answer = (answer << 1) | bit;
       n = n>>1; 
       }
       return answer;
    }
}