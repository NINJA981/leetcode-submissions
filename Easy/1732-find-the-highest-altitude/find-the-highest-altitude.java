class Solution {
    public int largestAltitude(int[] gain) {
        int highest =0;
        int prefix = 0; 
        for( int num : gain){
            prefix += num;
            if ( prefix> highest){
                highest = prefix;
            }
        }
        return highest;
        
    }
}