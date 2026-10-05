class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
    int ind=-1;
    int mini=Integer.MAX_VALUE;
    int low=0;int high=nums.size()-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums.get(low)<=nums.get(mid)){
           if(nums.get(low)<mini){
            ind=low;
             mini=nums.get(low);
              
           }
           low=mid+1;
        }
        else{
          if(nums.get(mid)<mini){
             ind=mid;
           mini=nums.get(mid);
          
          }
            high=mid-1;
            
        }
    }
    return ind;
    }
}