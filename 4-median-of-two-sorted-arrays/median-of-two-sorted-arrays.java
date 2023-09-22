class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int totalSize = n1+n2;
        int k = 0;
        int idx1 = (n2+n1)/2-1;
        int idx2 = (n2+n1)/2;
        int i = 0, j = 0;
        double ele1 = 0, ele2 = 0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                if(k == idx1){
                    ele1 = nums1[i];
                }
                if(k == idx2){
                    ele2 = nums1[i];
                }
                i++;
            }
            else{
                  if(k == idx1){
                    ele1 = nums2[j];
                }
                if(k == idx2){
                    ele2 = nums2[j];
                }
                j++;
            }
            k++;
        }   
        while(i<n1){
            if(k == idx1){
                ele1 = nums1[i];
            }
            if(k == idx2){
                ele2 = nums1[i];
            }
            k++;
            i++;
        }
        while(j<n2){
              if(k == idx1){
                ele1 = nums2[j];
            }
            if(k == idx2){
                ele2 = nums2[j];
            }
            k++;
            j++;
        }
        if(totalSize%2 == 1){
            return ele2;
        }
        return (ele1+ele2)/2.0;
    }
}