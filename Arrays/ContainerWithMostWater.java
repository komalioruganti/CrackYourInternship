// https://leetcode.com/problems/container-with-most-water/description/
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] arr) {
        int maxArea = 0;
        int i = 0,j=arr.length-1;
        while(i<=j){
            int len  = arr[i]<arr[j] ? arr[i] : arr[j];
            int area = (j-i)*len;
            maxArea = Math.max(area,maxArea);
            if(arr[i]<arr[j]) i++;
            else j--;
        }
    return maxArea;
    }
}