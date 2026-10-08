class Solution {
    public int minimumRateToEatBananas(int[] nums, int h) {
   int n=nums.length;
   if(n>h)return-1;
   int maxi=Integer.MIN_VALUE;
   for(int i=0;i<n;i++)
   maxi=Math.max(nums[i],maxi);
   int low=1;int high=maxi;
   while(low<=high){
    int mid=(low+high)/2;
    int val=findSum(nums,mid);
    if(val<=h)
    high=mid-1;
    else
    low=mid+1;
   }
   return low;
    }
    static int findSum(int nums[],int mid){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        sum+=Math.ceil((double)nums[i]/(double)mid);
        return sum;
    }
}