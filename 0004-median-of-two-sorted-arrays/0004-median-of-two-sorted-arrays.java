class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] sorted = new int[n1 + n2];
        double ans = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                sorted[k] = nums1[i];
                i++;
            } else {
                sorted[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            sorted[k] = nums1[i];
            k++;
            i++;
        }
        while (j < n2) {
            sorted[k] = nums2[j];
            k++;
            j++;
        }
        int median = (n1 + n2) / 2;
        if ((n1 + n2) % 2 == 0) {
            double sum = (double) sorted[median] + sorted[median - 1];
            ans = sum / 2;
        } else {
            ans = (double) sorted[median];
        }
        return ans;
    }
}