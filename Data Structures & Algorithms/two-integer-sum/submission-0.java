class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numbers = new HashMap<>();

        for (int j=0; j<nums.length; j++){
            int temp = target-nums[j];

            if (numbers.containsKey(temp)){
                return new int[] {numbers.get(temp), j};
            }
            numbers.put(nums[j],j);
         }
        return new int[] {};
    }
}
