//557. Reverse Words in a String III
class Solution {
    public String reverseWords(String s) {
        String[] res = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<res.length){
            StringBuilder t= new StringBuilder(res[i]);
            sb.append(t.reverse());
            if(i!=res.length-1) sb.append(" ");
            i++;
        }
        return sb.toString();
    }
}
