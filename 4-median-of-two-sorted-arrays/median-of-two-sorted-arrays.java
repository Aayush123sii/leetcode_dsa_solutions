class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m =nums1.length;
        int n=nums2.length;
       int[]ans=new int[m+n] ;
       for(int i=0;i<m;i++){
           ans[i]=nums1[i];
       }
       int j=0;
       for(int i=m;i<m+n;i++){
           ans[i]=nums2[j];
           j++;
       }
       Arrays.sort(ans);
       
       if((m+n)%2==0){
           int aa=ans.length/2;
           double median=(double)(ans[aa-1]+ans[aa])/2;
        return median;
        }
        
        else {
            int bb=(m+n)/2;
            double med=ans[(int)(bb)];
        return med;
    }}
}