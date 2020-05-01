/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return findBadVersion(1,n,n);
    }
    
    public int findBadVersion(int low, int high, int badVersion) {
        if (low <= high) {
            int mid =low + ((high-low)/2);
            if(isBadVersion(mid)) {
                return findBadVersion(low,mid-1,mid);
            } else {
                return findBadVersion(mid+1,high,badVersion);
            }
        }  
        return badVersion;
    }
}