// https://leetcode.com/problems/two-sum/submissions/834558827/

// Time Compelxity: O(M*N)
// Space Complexity: O(N) worst Case

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        
        int ans[] = new int[2];
        for(int i = 0; i< nums.length-1; i++){
            for(int j =i+1; j< nums.length; j++){
                if((nums[i] + nums[j] )  == target){
                    ans[0] =i;
                    ans[1]  = j;
                }
            }
        }
   return ans; }
}

// Time Complexity: O(N^2)
// Space Complexity: O(1)
class Solution2 {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] ans = new int[2];
        for(int i =0;i<arr.length;i++){
            if(h.containsKey(target - arr[i]) ){
                ans[0] = h.get(target -arr[i]);
                ans[1] =i;
            }else{
                h.put(arr[i],i);
            }
        }
    return ans;
    }
}

