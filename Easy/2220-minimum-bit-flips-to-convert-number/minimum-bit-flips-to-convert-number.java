class Solution {
    public int minBitFlips(int start, int goal) {
        
        int bits = start^goal;
        int count = 0;
        while(bits != 0){
            bits = bits & (bits - 1);
            count++;
        }
        return count;
    }
}
        
    