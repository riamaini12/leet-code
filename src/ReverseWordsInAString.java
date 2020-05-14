class Solution {
    public String reverseWords(String s) {
         String s1 = s.replaceAll("\\s+", " ");
        String k[] = s1.split(" ");
        String t= "";
        for(int i=k.length-1;i>=0;i--){
        t = t+k[i]+" ";
        
        }
      
        return t.trim();
    }
}
