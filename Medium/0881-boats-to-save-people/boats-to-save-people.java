import java.util.Arrays;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int min = 0;
        int max = people.length -1;
        int boat = 0;
        int count = 0;
        Arrays.sort(people);

        while ( min <= max){
            if(people[min] + people[max] <= limit){
                max--;
                min++;
            }
            else{
                max--;
            }
            count++;
  
        }
        return count;
        
    }
}