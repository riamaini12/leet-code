class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0,i=0;
        int n= nums.length;
        while(i<n){
            if(nums[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
            i++;
        }
        return max;
    }
}
