class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>tripletset=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            Set<Integer>set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int k=-(nums[i]+nums[j]);
                if(set.contains(k)){
                    List<Integer>list=new ArrayList<>();
                    list.add(nums[i]);
                      list.add(nums[j]);
                        list.add(k);
                        Collections.sort(list);
                        tripletset.add(list);
                }
                set.add(nums[j]);
            }
                    }
                    List<List<Integer>>ans=new ArrayList<>(tripletset);
                    return ans;
    }
}