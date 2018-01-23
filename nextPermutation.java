class Solution {
    
    public static void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
    
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int p = 0;
        int q = 0;
        for(int i=len-1; i>0 ; i--){ // Find the first entry that is greater than the previous entry
            if(nums[i-1]<nums[i]){
                p = i-1;
                break;
            }
        }    
        for(int i=len-1;i>0;i--){
            if(nums[i]>nums[p]){
                q = i;
                break;
            }
        }     
        if(p==0 && q==0){
            reverse(nums, 0, len-1);
            return;
        }   
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
        
        if(p<len-1){
            reverse(nums, p+1, len-1);
        }
    }
}
