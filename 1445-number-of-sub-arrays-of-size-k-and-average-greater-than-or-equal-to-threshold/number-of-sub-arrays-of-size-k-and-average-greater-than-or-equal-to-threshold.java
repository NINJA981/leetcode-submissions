class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int end = k-1;
        int sum = 0;
        int count =0;

        for( int i = 0 ; i<=end ; i++){
            sum += arr[i];

        }

        int avg = sum/k;

        while (end<arr.length){
            
            
            if (sum >= k * threshold){
                count++;
            }
            sum-=arr[start];
            start++;
            end++;
            if (end < arr.length) {
                sum += arr[end];
            }
            
            
            
        }
        return count;

    
        
    }
}