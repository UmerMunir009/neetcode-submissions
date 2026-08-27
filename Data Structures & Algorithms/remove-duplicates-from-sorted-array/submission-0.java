class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int p1=0,p2=0;

        while(p2<n){
            nums[p1]=nums[p2];
            while(p2<n && nums[p2]==nums[p1]){
                p2++;
            }
            p1++;
        }

        return p1;
    }
}