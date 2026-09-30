class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int []ans=new int[2];
         int floor=findFloor(nums,0,nums.length-1,x);
            int ceil=findCeil(nums,0,nums.length-1,x);
              ans[0]=floor;
              ans[1]=ceil;
              return ans;
      
    }
    private static int findFloor(int nums[],int low,int high,int x){
        low=0;high=nums.length-1;int ans=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]<=x){
            ans=nums[mid];
            low=mid+1;
        }
        else
        high=mid-1;
        
    }
    return ans;
    }
    private static int findCeil(int nums[],int low,int high,int x){
        low=0;high=nums.length-1;int ans=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>=x){
            ans=nums[mid];
           high=mid-1;
        }
        else
        low=mid+1;
       
    }
    return ans;
}
}