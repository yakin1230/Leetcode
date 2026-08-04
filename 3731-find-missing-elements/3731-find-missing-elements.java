class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer>list = new ArrayList<>();
        int n = nums.length;
        int idx = 0;
        int min  = nums[0],max=nums[n-1];
        for(int i=min; i<=max; i++){
            if(i!=nums[idx]) {
                list.add(i);
            }else idx++;
        }
        return list;
    }
}