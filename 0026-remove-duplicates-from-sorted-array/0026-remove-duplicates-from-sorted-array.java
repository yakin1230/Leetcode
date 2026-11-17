// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int i = 0;
//         for(int j=1; j<nums.length; j++){
//             if(nums[j] != nums[i]){
//                 i++;
//                 nums[i] = nums[j];
//             }
//         }
//         return i+1;
//     }
// }


class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=1;
        while(j < n){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}