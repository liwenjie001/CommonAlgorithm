/**
 * @ Author: Mr.Li
 * @ Date: 2019-08-24 20:21
 * @ Description: 冒泡排序
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0,5,4,2,3};
        System.out.println("排序之前的顺序为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");

        }
        System.out.println();
        // 双层for循环
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i]<arr[j+1]){
                    int tmp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("排序之后的顺序为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");

        }
    }
}
