//https://leetcode.com/problems/sort-colors/

// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        int s = 0,e = nums.length-1;
        for(int i = 0;i<nums.length;i++){
              if(nums[i] == 0){
                  swap(nums,s,i);
                  s++;
              }else if(nums[i] == 2){
                  swap(nums,e,i);
                  e--;
              }
        }
    }
public void sort(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}}

// Inbuilt sort function
// Time Complexity: O(NlogN)
// Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}