//58. Length of Last Word
class Solution {
    public int lengthOfLastWord(String s){
        String[] res = s.split(" ");
        int len = res.length;
        return res[len-1].length();
    }
}
