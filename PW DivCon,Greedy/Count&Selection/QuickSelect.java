public class QuickSelect {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) { 
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static int QuickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pi = partition(arr, low, high);
            if (pi == k) {
                return arr[pi];
            } else if (pi < k) {
                return QuickSelect(arr, pi + 1, high, k);
            } else {
                return QuickSelect(arr, low, pi - 1, k);
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        return QuickSelect(arr, 0, n - 1, k - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 4, 5, 6, 7};
        int k1 = 3;
        System.out.println("The " + k1 + "rd largest element is " + findKthLargest(arr1, k1));

        int[] arr2 = {4, 3, 3, 2, 1};
        int k2 = 4;
        System.out.println("The " + k2 + "th largest element is " + findKthLargest(arr2, k2));
    }
}
