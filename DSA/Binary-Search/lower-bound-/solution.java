class Solution {
    public int lowerBound(int[] nums, int x) {
       return helperFunction(nums,0,nums.length-1,x);
     }
     private static int helperFunction(int nums[],int low,int high,int tar){
          int ans=nums.length;
          while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=tar){
                ans=mid;
                  high=mid-1;
            }
            else 
            low=mid+1;
    
          }
          return ans;
     }
}
