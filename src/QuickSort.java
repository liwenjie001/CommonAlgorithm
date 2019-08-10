/**
 * @ Author: Mr.Li
 * @ Date: 2019-08-10 10:45
 * @ Description: 快速排序
 **/
public class QuickSort {
    /**
     * 递归排序。
     * 以最高位置的为基准值位置。
     * 这个时间复杂度为O(n^2) 并且是递归调用，性能不好。
     * @param n 要排序的数组
     * @param left 小的数组下标
     * @param right 大的数组下标
     */
    public void quicksort(int n[], int left, int right){

        if(left > right){
            //如果只有一个元素，就不用再排下去了
            return;
        }
        else{
            //如果不止一个元素，继续划分两边递归排序下去
            int partition = partition(n, left, right);
            quicksort(n, left, partition-1);
            quicksort(n, partition+1, right);
        }
    }

    private int partition(int[] n, int left, int right) {
        int base = n[right];
        while (left<right){
            while (left<right && n[left]<=base){
                // 从左边开始遍历，如果比基数小就一直往右走。
                left++;
            }
            // 从上面的while循环结束之后，就代表n[left] 比 基数大了。然后进行交换
            if (left<right){
                int tmp = n[left];
                n[left] = n[right];
                n[right] = tmp;
                // 右边也要减去1
                right--;
            }
            // 然后进行从右边遍历，往左走
            while (left<right && n[right]>=base){
                // 如果大于基数那么就一直往左走
                right--;
            }
            if (left<right){
                int tmp = n[left];
                n[left] = n[right];
                n[right] = tmp;
                // 右边也要减去1
                left++;
            }

        }
        return right;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] n = {3,7,2,9,1,4,6,8,10,5};
        quickSort.quicksort(n, 0,n.length-1);
        for (int a :n){
            System.out.print(a+",");
        }

    }
}
