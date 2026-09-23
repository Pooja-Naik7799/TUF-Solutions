class Solution {
    public List<Integer> leaders(int[] nums) {
        List<Integer>list=new ArrayList<>();
       int n=nums.length; 
       int maxi=Integer.MIN_VALUE;
       for(int i=n-1;i>=0;i--){
        if(nums[i]> maxi){
        list.add(nums[i]);
        maxi=nums[i];
        }
       } 
       //using two pointer approach 
      int left=0;
      int right=list.size()-1;
      while(left<right){
        int temp=list.get(left);
        list.set(left,list.get(right));
        list.set(right,temp);
        left++;
        right--;
      }
    return list;

    }
}