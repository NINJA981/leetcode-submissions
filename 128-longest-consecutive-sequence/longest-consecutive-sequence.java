class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

for(int j : nums){
    set.add(j);
}


int max = 0;

for (int i : set) {

    if(!set.contains(i-1)){
        int current = i;
        int count = 1;
        while(set.contains(current+1)){
            count+=1;
            current+=1;
        }
        if(count>=max){
            max=count;
        }}      
}

return max;
    }}