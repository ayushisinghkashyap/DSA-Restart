class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] temp = new int[l];
        for(int i=0;i<nums1.length;i++){
            temp[i] = nums1[i];
        }
        int j=0;
        for(int i=nums1.length;i<l;i++){
            temp[i] = nums2[j];
            j++;
        }

        Arrays.sort(temp);

        double num = 0;
        if(l%2 != 0){
            int n = l/2;
            num = temp[n];
        }
        else{
            int n = l/2;
            num = (float) (temp[n] + temp[n-1])/2;
        }

        return num;
    }
}