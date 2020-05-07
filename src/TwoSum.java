class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        res[0]=-1;
        res[1]=-1;
        Map<Integer,Integer> map = new HashMap<>();
        if(nums==null || nums.length==0){
            return res;
        }
        for(int i=0;i<nums.length;i++){
            int other = target-nums[i];
            if(map.containsKey(other)){
                res[0]=map.get(other);
                res[1]=i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
