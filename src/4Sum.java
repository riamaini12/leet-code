class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length<4){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int left=j+1;
                int right = nums.length-1;
                while(left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[left]);
                        l.add(nums[right]);
                        res.add(l);
                    
                    int leftValue = nums[left];
                    while(left<nums.length && nums[left]==leftValue){
                        left++;
                    }
                    int rightValue = nums[right];
                    while(right>left && nums[right]==rightValue){
                        right--;
                    }
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                    
                
                }
                    while(j+1<nums.length && nums[j+1]==nums[j]){
                    j++;
                }
            }
            while(i+1<nums.length && nums[i+1]==nums[i]){
                i++;
            }
        }
        return res;
        
    }
}
