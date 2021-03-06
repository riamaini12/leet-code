class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums== null || nums.length==0){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;++i){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    
                    int leftValue = nums[left];
                    while(left<nums.length && nums[left]==leftValue ){
                        ++left;
                    }
                    int rightValue = nums[right];
                    while(right>left && nums[right]==rightValue){
                        --right;
                    }
                }
                else if(sum<0){
                    ++left;
                }
                else{
                    --right;
                } 
                } 
           
            while(i+1 < nums.length && nums[i]==nums[i+1] ){
                ++i;
            }
        }
        return res;
    }
    
    
}
