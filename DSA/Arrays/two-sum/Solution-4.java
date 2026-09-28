class Solution {
    public int[] twoSum(int[] nums, int target) {
Map<Integer,Integer>map=new HashMap<>();
int n=nums.length;
for(int i=0;i<n;i++){
    int moreneeded=target-nums[i];
    if(map.containsKey(moreneeded))
    return new int[]{map.get(moreneeded),i};
    map.put(nums[i],i);
}
return new int []{-1,-1};
    }
}