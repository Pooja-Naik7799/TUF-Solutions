class Solution {
    public int countOccurrences(int[] arr, int target) {
       int n=arr.length;
     
  int first=firstOccurence(arr,target);
  if(first==-1)return 0;
  int second=secondOccurence(arr,target);
  return (second-first)+1;
    }
    static int firstOccurence(int []a,int tar){
        int n=a.length;
        int low=0;int high=n-1;int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==tar){
            first=mid;
            high=mid-1;
            }
        else    if(a[mid]<tar)
            low=mid+1;
            else
            high=mid-1;
 
        }
        return first;
    }
     static int secondOccurence(int []a,int tar){
        int n=a.length;
        int low=0;int high=n-1;int second=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==tar){
            second=mid;
            low=mid+1;
            }
           else if(a[mid]<tar)
            low=mid+1;
            else
            high=mid-1;

        }
         return second;
}
}
