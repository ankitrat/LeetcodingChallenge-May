class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length ==1) {
            return 0;
        }
        int maxLen = 0;
        int count=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++) {
            count = count + (nums[i] == 0 ? -1 : +1);
            Integer temp = map.get(count);
            if(temp!=null) {
                maxLen = maxLen > i-temp ? maxLen : i-temp;
            } else {
                map.put(count,i);
            }
        }
        return maxLen;
        
    }
}