
class Solution {
    public int balancedStringSplit(String s) {
        int c=0,res=0;
        for(char i : s.toCharArray()){
            if(i=='R') c++;
            else c--;
            if(c==0) res+=1;
        }
        return res;
    }
}
