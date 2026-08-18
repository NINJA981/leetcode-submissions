class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int extra =0;
        int max = 0;
        int start =0 ;
        int end = minutes - 1;
        int high = 0;
        int baseSatisfied = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                baseSatisfied += customers[i];
            }
        }

        for(int i = 0 ; i<=end ; i++){

            if (grumpy[i] == 1){
                extra += customers[i];
            }
            


        }
        while ( end < customers.length){
            
            if(extra>max){
                max = extra;
                

            }

            if(grumpy[start] == 1){
                extra -= customers[start];

            }

            start++;
            end++;

            if (end < customers.length && grumpy[end] == 1){
                extra += customers[end];
            }
        }

        return baseSatisfied + max;

        
    }
}