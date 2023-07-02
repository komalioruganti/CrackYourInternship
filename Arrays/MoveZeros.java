//https://leetcode.com/problems/move-zeroes/
//1st Solution Using Queue

//Time Complexity: O(N)
// Space Complexity: O(N)
class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> q = new LinkedList<>();
        int last = nums.length-1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                q.add(nums[i]);
            }
        }
        int l = q.size();
        for(int i = 0;i<nums.length;i++){
            if(i<l){
                nums[i] = q.remove();
            }else{
                nums[i] = 0;
            }
        }
    }
}

//2nd Solution - Optimised

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(i<nums.length){
            if(nums[i] != 0){
            nums[j] = nums[i];
            j++;
            }
            i++;
        }
    while(j<nums.length){
        nums[j] = 0;
        j++;
    }
    }
}