class Solution {
    public int[] searchRange(int[] nums, int target) {
      int firstoccurance=lowerBound(nums,target);
      if(firstoccurance==nums.length || nums[firstoccurance]!=target)return new int[]{-1,-1};
      int lastoccurnace=upperBound(nums,target)-1;
     return new int[]{firstoccurance,lastoccurnace};
    }
    private static int lowerBound(int []nums,int target){
        int n=nums.length;
        int low=0;int high=n-1;int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
return ans;
    }
     private static int upperBound(int []nums,int target){
        int n=nums.length;
        int low=0;int high=n-1;int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
return ans;
}
}