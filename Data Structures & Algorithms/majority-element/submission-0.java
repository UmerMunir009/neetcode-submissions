class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> counts=new HashMap<>();
        int result=0;
        int maxCount=0;

        for (int j=0; j<nums.length; j++){
            counts.put(nums[j],counts.getOrDefault(nums[j],0)+1);
            if (counts.get(nums[j])>maxCount){
                result=nums[j];
                maxCount=counts.get(nums[j]);
            }
        }
        return result;
    }
}