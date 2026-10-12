class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int n=weights.length;
       int ans=-1;
       int sum=0;
       int maxi=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        sum+=weights[i];
       maxi=Math.max(weights[i],maxi);
       }
       
       int low=maxi;int high=sum;
       while(low<=high){
        int mid=(low+high)/2;
        int totaldays=noOfDays(weights,mid);
        if(totaldays<=days){
            ans=mid;
        high=mid-1;
        }
        else
        low=mid+1;
       }
       return ans;
    }
    static int noOfDays(int []nums,int capacity){
        int n=nums.length;
        int days=1;int load=0;
        for(int i=0;i<n;i++){
            if(load+nums[i]>capacity){
                days++;
                load=nums[i];
            }
            else{
                load+=nums[i];
            }
        }
        return days;
    }
}