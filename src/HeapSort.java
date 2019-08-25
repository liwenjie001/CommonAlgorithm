/**
 * @ Author: Mr.Li
 * @ Date: 2019-08-25 09:27
 * @ Description: 这是一个堆排序
 **/
public class HeapSort {
    // 这个是对每一个子树变成堆的运算；
    public static void heapify(int[] tree,int n,int i){
        if (i>=n) return;
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1<n && tree[c1] > tree[max]){
            max = c1;
        }
        if (c2<n && tree[c2]>tree[max]){
            max = c2;
        }


        if (i!=max){
            sawp(tree, i, max);
            heapify(tree, n, max);
        }
    }
    // 比大小互换
    public static void sawp(int[] tree,int i,int max) {
        int tmp = tree[max];
        tree[max] = tree[i];
        tree[i] =tmp;
    }

    /**
     * 因为我们如果输入的顺序是打乱的，我们就需要从最后一个节点的父节点去计算
     * 倒叙的去计算，就可以创建一个堆的数据结构了。
     * @param tree
     * @param n
     */
    public static void buildHeap(int[] tree ,int n){
        int lastNode = n-1;
        int parentNode = (lastNode - 1) / 2;
        for (int i = parentNode ; i >= 0 ; i--) {
            heapify(tree, n, i);
        }
    }

    /**
     * 堆排序
     */
    public static void sordHead(int[] tree ,int n){
        // 先把数组变成一个堆
        buildHeap(tree, n);
        // 然后把堆中第一个元素和最后一个元素对换
        for (int i = n-1; i >=0; i--) {
            sawp(tree, i, 0);
            // 这块的长度设置为i 也就代表这把最大的元素去掉了，然后也就是把大的元素保存在原数组中了。
            heapify(tree, i, 0);
        }

    }

    /**
     * 思路：先把数组创建成一个堆。
     * @param args
     */
    public static void main(String[] args) {
        int[] tree = {1,3,10,9,7,8};
        int n = tree.length;
        System.out.println("排序之后的顺序为：");
        sordHead(tree, n);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i]+",");
        }
    }
}
