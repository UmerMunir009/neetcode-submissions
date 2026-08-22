class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int j=0; j<nums.length; j++){
            if (numbers.contains(nums[j])) {
                return true;
            }
            numbers.add(nums[j]);
        }
        return false;
    }
}