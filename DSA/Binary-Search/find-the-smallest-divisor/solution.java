class Solution {
    public int smallestDivisor(int[] nums, int limit) {
       int n=nums.length;
       if(n>limit)return -1;
       int maxi=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        maxi=Math.max(maxi,nums[i]);
       }
       int low=1;int high=maxi;
       while(low<=high){
        int mid=(low+high)/2;
        int val=sumDivisor(nums,mid);
        if(val<=limit){
            high=mid-1; 
        }
        else
            low=mid+1;
       }
  return low;
    }
    static int sumDivisor(int []nums,int mid){
        int sum=0;int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)nums[i]/(double)mid);
        }
        return sum;
    }
}