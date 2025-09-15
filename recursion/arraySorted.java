public class arraySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6 };
        int i=0;
        System.out.println(isSorted(arr,i));

    }

    public static boolean isSorted(int[] arr, int idx) {
        if (idx == arr.length-1 || arr.length==0) {
            return true;
        } 
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        return isSorted(arr, idx + 1);
    }
}
