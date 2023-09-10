package DSA_Inteilj.src.DSA.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12,14,15};
        int target = 8;
        System.out.println(ans(nums, target));
    }
    static int ans(int[] nums, int target){
        int start = 0;
        int end = 1;
        while(target>nums[end])
        {
            int newStart = end + 1;
            end = (end - start + 1) * 2;
            start = newStart;
        }
            return Search(nums, target, start, end);
    }
    static int Search(int[] nums, int target, int start, int end){
        int middle;
        while(start<=end){
            middle = start + (end-start)/2;
            if(target<nums[middle]){
                start = start -1;
            }
            else if(target>nums[middle]){
                end = end + 1;
            }
            else return middle;
        }
        return -1;
    }
}
