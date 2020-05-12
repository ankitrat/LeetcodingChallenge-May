class Solution {
    public int singleNonDuplicate(int[] nums) { 
        return findNonDuplicate(nums,0,nums.length-1);
    }
    
    public int findNonDuplicate(int[] nums, int low, int high) {
        
        if(low<=high) {
            if(low==high) {
                return nums[low];
            }
            int mid = low + ((high-low)/2);
            if(mid%2 ==0) {
                if(nums[mid]==nums[mid-1]) {
                    return findNonDuplicate(nums,low,mid-2);
                } else if(nums[mid]==nums[mid+1]) {
                    return findNonDuplicate(nums,mid+2,high);   
                }
                return nums[mid];
            }
            if(mid%2==1){
                if(nums[mid]==nums[mid-1]) {
                    return findNonDuplicate(nums,mid+1,high);
                } else if(nums[mid]==nums[mid+1]){
                     return findNonDuplicate(nums,low,mid-1);
                } 
                return nums[mid];
            }
        }
        return -1;
    }
}