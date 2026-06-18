/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n - 1;
        int possible = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean status = isBadVersion(mid);
            if (status == true) {
                 possible = mid;
                right = mid -1 ;

            } else if (status == false) {
                left = mid +1;
            } 

        }
        return possible;

    }
}