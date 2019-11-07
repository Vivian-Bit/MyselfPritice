import java.util.Scanner;

public class Finder {
    public static void quickSort(int[] array) { //当前形参不适合递归
        quickSortInter(array, 0, array.length - 1); //用quickSortInter实现递归 （数组，左下标，右下标）
    }
    // [left, right]
    private static void quickSortInter(int[] a, int left, int right) {
        if (left >= right) { //递归出口
            // 直到 长度 <= 1
            return;
        }
        // 1. 选择基准值 array[left]
        // 2. 做 partition
        int pivotIndex = partition(a, left, right);
        // 左边小区间 [left, pivotIndex - 1]
        // 右边小区间 [pivotIndex + 1, right]
        // 3. 分别对左右小区间按同样方式处理
        quickSortInter(a, left, pivotIndex - 1);
        quickSortInter(a, pivotIndex + 1, right);
    }
    private static int partition(int[] a, int left, int right) {
        int begin = left;
        int end = right;
        int pivot = a[left];
        // [left, begin)        <= pivot
        // (end, right]         >= pivot
        while (begin < end) {
            while (begin < end && a[end] >= pivot) {
                end--;
            }
            while (begin < end && a[begin] <= pivot) {
                begin++;
            }
            swap(a, begin, end);
        }
        swap(a, left, begin);
        return begin;
    }
    private static void swap(int[] a,int left,int right){
        int temp = 0;
        temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    public static int findKth(int[] a, int n, int K) {
        // write code here
        quickSort(a);
        return a[n-K];

    }

    public static void main(String[] args) {
        int[] a = {2,4,222,67,0,345}; //0 2 4 67 222 345
        int n = a.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int num = findKth( a, n, k);
        System.out.println(num);
    }
}