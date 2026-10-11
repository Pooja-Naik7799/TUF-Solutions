
class Solution {
    public int roseGarden(int n, int[] nums, int k, int m) {
        if((long)m*k>n)return -1;
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(nums[i],mini);
            maxi=Math.max(nums[i],maxi);
        }
        int low=mini;int high=maxi;int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(nums,mid,m,k)){
                ans=mid;
            high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
    static boolean isPossible(int nums[],int day,int m,int k){
        int n=nums.length;int cnt=0; int noOfBoquets=0;
        for(int i=0;i<n;i++){
            if(nums[i]<=day){
                cnt++;
            }
            else{
                noOfBoquets+=(cnt/k);
                cnt=0;
            }
        }
        noOfBoquets+=(cnt/k);
         if(noOfBoquets>=m)
         return true;
         else
          return false;
    }
}


