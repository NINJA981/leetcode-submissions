class Solution {
    public int subarraySum(int[] nums, int k) {
        int currentsum = 0 ; 
        int prefix = 0 ;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0 ; i<nums.length ; i++){
            currentsum += nums[i];
            prefix = currentsum - k;
            count += map.getOrDefault(prefix , 0);
            map.put(currentsum , map.getOrDefault(currentsum , 0)+1);

        }
        return count;
    }
}