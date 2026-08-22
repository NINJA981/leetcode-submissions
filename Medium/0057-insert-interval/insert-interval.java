class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> result = new ArrayList<>();
        

        for (int [] arr : intervals){
            if(newInterval[1] < arr[0]){
                result.add(newInterval);
                newInterval = arr;
            }
            else if ( newInterval[0] > arr[1]){
                result.add(arr);
            }
            else{
                newInterval[0] = Math.min(newInterval[0],arr[0]);
                newInterval[1] = Math.max(newInterval[1],arr[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
        
    }
}