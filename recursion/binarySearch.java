public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8, 9, 12};
        int target = 12;
        int l = 0;
        int r = arr.length - 1;
        int result = binSearch(arr, target, l, r);
        System.out.println(result);
    }

    public static int binSearch(int[] arr, int target, int l, int r) {
        if (l > r) {
            return -1;
        }
        int mid = l + (r - l) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binSearch(arr, target, l, mid - 1);
        } else {
            return binSearch(arr, target, mid + 1, r);
        }
    }
}
