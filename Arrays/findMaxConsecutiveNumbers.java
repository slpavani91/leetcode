/* Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxLength = 0;
        for(int num : nums) 
        {
            if(num == 0)
            {
                maxLength = Math.max(count, maxLength);
                count=0;
            }
            else 
                count++;
       }
      //  System.gc() ;
        return Math.max(count, maxLength);
    }
}
