class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        if(s==null || s.isEmpty()){
            return len;
        }
        s=s.trim();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
              len++;  
        }
        return len;
    }
}
