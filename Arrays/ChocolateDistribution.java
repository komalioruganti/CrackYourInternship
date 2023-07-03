// https://www.geeksforgeeks.org/chocolate-distribution-problem/

//  Time Comlexity: O(NlogN)

class Solution{
    int findMinDiff(int[] arr,int m){
if(arr.length == 0 || m ==0){
    return 0;
}
Arrays.sort(arr);
if(m>arr.length){
    return -1;
}
int min = Integer.MAX_VALUE;
for(int i = 0;i<arr.length-m;i++){
   int diff = arr[m+i-1] - arr[i];
   if(diff<min){
    diff = min;
   }
}
    return diff;
}
}