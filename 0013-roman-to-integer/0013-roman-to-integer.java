class Solution {
    public int romanToInt(String s) {
        int [] nums = new int []{1,5,10,50,100,500,1000};
        char [] chars = new char []{'I','V','X','L','C','D','M'};
        int answer=0 , current=0;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < chars.length; j++) {
                if (s.charAt(i) == chars[j]) {
                    if (nums[j] > current) {
                        answer = answer + nums[j] - 2 * current;
                    }
                     else {
                        answer = answer + nums[j];
                    }
                    current = nums[j];
                    break;
                }
            }   
        }
        return answer;
    }
}