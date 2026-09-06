class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList();

        backtrack(candidates , target , current , result , 0 , 0 );
        return result;
        
    }
    public void backtrack(int [] candidates , int target , List<Integer> current , List<List<Integer>> result , int currentsum , int start)
    {   
        
        if ( currentsum == target){
            result.add(new ArrayList(current));
            return; 
        }

        if( currentsum > target){
            return ;
        }

        for( int i = start ; i < candidates.length ; i++){
            current.add(candidates[i]);
            currentsum+=candidates[i];
            backtrack(candidates , target , current , result , currentsum , i);
            current.remove(current.size()-1);
            currentsum-=candidates[i];


        }
        
    }
}