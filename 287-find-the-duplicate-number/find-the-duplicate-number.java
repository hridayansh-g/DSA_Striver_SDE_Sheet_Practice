class Solution {
    public int findDuplicate(int[] nums) {
       /* for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
        */

        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]] +=1;
            if((arr[nums[i]])>1){
                return (nums[i]);
            }

        }
    return -1;
    }
}