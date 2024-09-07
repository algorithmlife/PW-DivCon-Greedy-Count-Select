import java.util.Arrays;

public class SegregatePositiveNegativeStable {


    public static void segregateNumbers(int[] arr) {
        int n = arr.length;
        int lastNegativeIndex = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {

                int temp = arr[i];

                for (int j = i; j > lastNegativeIndex; j--) {
                    arr[j] = arr[j - 1];
                }

                arr[lastNegativeIndex] = temp;

                lastNegativeIndex++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        

        segregateNumbers(arr);

        System.out.println("Segregated array: " + Arrays.toString(arr));
    }
}
