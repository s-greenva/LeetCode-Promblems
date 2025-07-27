class Solution {
    public int lengthOfLastWord(String s) {
        int last=0, before=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                last++;
            }
            else{
                if(last!=0){
                    before=last;
                    last=0;
                }
            }
        }
        if(last==0)
            return before;
        return last;
    }
}