class Solution {
    public int removeElement(int[] nums, int val) {
        int arrLength = nums.length;
        int start = 0;
        while(start < arrLength){
            if(nums[start] == val){
                 nums[start] = nums[arrLength - 1];
                 arrLength--;
            }
            else{
                start++;
            }
        }
        return arrLength;

    }
}