class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }

    static int binarySearch(int[] nums,int target,int si,int ei){
        if(si>ei)  return -1;
        int mid = si + (ei-si)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(target > nums[mid]){
            return binarySearch(nums,target,mid+1,ei);
        }
        else{
            return binarySearch(nums, target, si, mid-1);
        }
    }
}