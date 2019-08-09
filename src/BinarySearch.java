/**
 * @ Author: Mr.Li
 * @ Date: 2019-08-09 11:39
 * @ Description:二分查找法 ，前提数据必须是有序的。
 **/
public class BinarySearch {
    /**
     * 二分查找普遍存在
     * @param nums 有序数组
     * @param k 查找的元素
     * @return 不存在返回-1
     */
    public int binarySearch(int[] nums ,int k){
        int start = 0;
        int end = nums[nums.length-1];
        int mid;
        for (int i = 0; i < nums.length; i++) {
            mid = (end-start)/2+start;
            if (nums[mid]==k){
                return mid;
            }else if (nums[mid]<k){
                // 这个代表要查找的数据在mid~end 之间
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }

    /**
     * 采用递归的方式进行二分查找
     * @param nums 有序数组
     * @param k 要查找的元素
     * @param end 数组高地址下标
     * @param start 数组低地址下标
     * @return
     */
    public int binarySearch(int[] nums ,int k,int start,int end){
        int mid = (end-start)/2+start;
        if (nums[mid]==k){
            return mid;
        }else if (start>end){
            return -1;
        }else if (k > nums[mid]){
            binarySearch(nums, k, mid+1 , end);
        }else {
            binarySearch(nums, k, start, mid-1);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1,2,3,4,5};
        int i = binarySearch.binarySearch(nums, 3);
        System.out.println(i);
        System.out.println(binarySearch.binarySearch(nums, 3, 0, nums.length-1));
    }
}
