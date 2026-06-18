class Solution {
    public int mySqrt(int x) {
        int right = x ;
        int left = 0; 
        int ans = 0;
        while ( left <=right){
                    int mid = left+(right - left)/2;
                    long square = (long) mid * mid;

        if (square == x){
            return mid;
        }
        else if ( square > x){
            right = mid-1 ;
        }
        else if(square < x){
            left = mid + 1;
            ans = mid;
            left = mid + 1;
        }
        }
    return ans;


        
    }
}