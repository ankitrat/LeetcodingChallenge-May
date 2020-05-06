/*
Possible Approaches - 
1) Brute Force, it will take O(n2) time complexity and O(1) space complexity.
2) Using HashMap, it will take O(n) time complexity and O(n) space complexity.
3) Boyer-Moore Voting Algorithm , it will take O(n) time complexity and O(1) space complexity.

Below solution used Boyer-Moore Voting Algorithm - 
	i) Initially Assumed Majority element as nums[0], chnage it to corresponding value if count is 0 any time.
	ii) Logic is to increament count by 1 if it is majority element, else decrease count by -1.
	
*/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int element = nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(count == 0) {
                element = nums[i];
            }
            count += (element == nums[i])? 1 : -1;
        }
        return element;
    }
}