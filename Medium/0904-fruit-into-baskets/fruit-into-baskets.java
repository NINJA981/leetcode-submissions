class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer , Integer > map = new HashMap<>();

        int start = 0; 
        int end = 0; 
        int max=0;
        int sum=0;

        while( end < fruits.length){

            map.put(fruits[end] , map.getOrDefault(fruits[end],0)+1);


            while(map.size()>2){
                map.put(fruits[start] , map.getOrDefault(fruits[start],0)-1);

                if(map.get(fruits[start])== 0){
                    map.remove(fruits[start]);

                }
                start++;
            }
            sum = 0 ;
            for( int value : map.values()){
                sum += value; 
            }
            if( sum> max){
                max = sum;
            }

            end++;



            



            
        }

    return max;
        
    }
}