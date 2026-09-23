class Solution {
    public int majorityElement(int[] nums) {
      int n=nums.length;
      int c=0;
      int maxi=Integer.MIN_VALUE;
   int ele=0;

      for(int i=0;i<n;i++){
        if(c==0){
            ele=nums[i];
            c=1;
        }
        else if(ele==nums[i])
        c++;
        else
        c--;
      }
      int count=0;
      for(int i=0;i<n;i++){
        if(ele==nums[i])
        count++;
      }
      int ans=0;
      if(count>n/2)
    return ele;
    return -1;
    }
}