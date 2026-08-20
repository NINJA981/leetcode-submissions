import java.util.Arrays;

class Solution {

    public int[][] merge(int[][] intervals) {


        Arrays.sort(intervals,( int[] a , int[] b) -> Integer.compare(a[0] , b[0]));
        int[][] result = new int[intervals.length][2];
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];
        int count = 0;
        for( int i = 1 ; i < intervals.length ; i++){


            if ( intervals[i][0] <= currentEnd){
                currentEnd = Math.max(currentEnd, intervals[i][1]);
     
            }
            else{
                result[count] = new int[]{currentStart, currentEnd};
                count++;
                currentStart = intervals[i][0];
                currentEnd = intervals[i][1];
            }
        }
        result[count] = new int[]{currentStart, currentEnd};
        count++;
        
        return Arrays.copyOf(result, count);

        
    }
}