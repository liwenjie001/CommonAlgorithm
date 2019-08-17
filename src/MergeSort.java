/**
 * @ Author: Mr.Li
 * @ Date: 2019-08-17 12:36
 * @ Description: 归并排序
 **/
public class MergeSort {
    public static void main(String[] args) {
        int[] data = { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
        // 排序
        print(data);
        mergeSort(data);
        print(data);
    }
    public static void mergeSort(int[] data){
        sort(data, 0, data.length-1);
    }
    public static void sort(int[] data,int left,int right){
        if (left>=right) return;
        int center = (right + left)/2;
        // 对左边的数进行递归
        sort(data, left, center);
        // 对右边的数进行递归
        sort(data, center+1, right);
        // 合并
        merge(data, left,center, right);
    }

    /**
     * 将连哥哥数组进行归并，归并前两个数组已经有序，归并后依然有序
     * @param data
     * @param left
     * @param center
     * @param right
     */
    public static void merge(int[] data,int left,int center,int right){
        // 临时数组
        int[] tmpArr = new int[data.length];
        // 右数第一个元素索引
        int mid = center + 1;
        // thrid 记录临时数组索引
        int thrid = left;
        // 缓存左边第一个元素的索引
        int tmp = left;
        while (left<=center&&mid<=right){
            // 从两个数组中取出小的那个元素放入临时数组
            if(data[left]<=data[mid]){
                tmpArr[thrid++] = data[left++];
            }else {
                tmpArr[thrid++] = data[mid++];
            }

        }
        // 剩余部分依次放入临时数组
        while (mid<=right){
            tmpArr[thrid++] = data[mid++];
        }
        while (left<=center){
            tmpArr[thrid++] = data[left++];
        }
        // 将临时数组中的数据考回原先的数组中
        while (tmp<=right){
            data[tmp] = tmpArr[tmp++];
        }
    }

    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }

}
