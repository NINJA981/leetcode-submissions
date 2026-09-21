class Solution {
    public long[] resultArray(int[] nums, int k) {

        long[] answer = new long[k];
        long[] prev = new long[k];

        for (int num : nums) {

            long[] curr = new long[k];

            int singleRemainder = num % k;
            curr[singleRemainder]++;

            for (int r = 0; r < k; r++) {

                if (prev[r] == 0) {
                    continue;
                }

                int newRemainder = (int) (((long) r * num) % k);

                curr[newRemainder] += prev[r];
            }

            for (int r = 0; r < k; r++) {
                answer[r] += curr[r];
            }

            prev = curr;
        }

        return answer;
    }
}