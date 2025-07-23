class Solution {
    public int removeDuplicates(int[] nums) {
       int counter=1;
       int[] newnums = new int[nums.length];
       newnums[0]=nums[0];
       for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                newnums[counter]=nums[i];
                counter++;
            }
       }
       for(int j=0;j<newnums.length;j++) {
            nums[j]=newnums[j];
       }
       return counter;
    }
}