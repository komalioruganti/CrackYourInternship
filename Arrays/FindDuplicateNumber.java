//https://leetcode.com/problems/find-the-duplicate-number/

//1st Solution -- Using HashSet
//Time Complexity - O(N)+ O(logN) - worst case
//Space Complexity - O(N)

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int ans=-1;
        for(int i= 0;i<nums.length;i++){
          if(h.contains(nums[i])){
              ans = nums[i];
              break;
          }
          h.add(nums[i]);
        }
    return ans;
    }
}

//2nd Solution -- Using Array
//Time Compelxity  - O(N)
//Space Complexity - O(N)

class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
      int[] arr = new int[nums.length+1];
      for(int i = 0;i<nums.length;i++){
          if(arr[nums[i]] == 1)
            ans = nums[i];

            arr[nums[i]] = 1;
      }
    return ans;
    }
}