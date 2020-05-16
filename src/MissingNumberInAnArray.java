class Solution {
    public int missingNumber(int[] nums) {
            int sumN=0;
   int sumArr=0;
   
  int missingNum=0;
        int n = nums.length;
        
        for(int i=0;i<nums.length;i++){
            sumArr= sumArr+nums[i];
            
        }
        sumN=n*(n+1)/2;
       missingNum = sumN-sumArr;
       return missingNum;
    }
}
