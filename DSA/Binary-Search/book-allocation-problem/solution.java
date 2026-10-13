class Solution {
    public int findPages(int[] nums, int m) {
       int n=nums.length;
       if(m>n)return -1;
       int low=Integer.MIN_VALUE;
       int high=0;
       for(int i=0;i<n;i++){
        low=Math.max(nums[i],low);
        high+=nums[i];
       }
       while(low<=high){
        int mid=(low+high)/2;
        int students=countStudent(nums,mid);
       
        if(students>m)
        low=mid+1;
        else
        high=mid-1;
       }
       return low;
    }
    static int countStudent(int []nums,int pages){
        int n=nums.length;
        int student=1;
        int pageStudent=0;
        for(int i=0;i<n;i++){
            if(pageStudent+nums[i]<=pages){
                pageStudent+=nums[i];
            }
            else{
                student++;
                pageStudent=nums[i];
            }
        }
        return student;
    }
}