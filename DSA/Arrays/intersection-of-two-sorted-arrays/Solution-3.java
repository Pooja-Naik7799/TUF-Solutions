class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        
        List<Integer>list=new ArrayList<>();
        int i=0;int j=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j])
            i++;
            else if(nums1[i]>nums2[j])
            j++;
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
       int []ans=new int[list.size()];
       int ind=0;
       for(int k=0;k<list.size();k++)
       ans[ind++]=list.get(k);
       return ans;


    }
}