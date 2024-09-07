import java.util.Arrays;

public class FixSwappedArray {
    public static void findAndFixSwapped(int[] arr) {
        int n = arr.length;
        int first = -1, second = -1;

        for (int i = 0; i < n - 1; i++) {
          
            if (arr[i] > arr[i + 1]) {
                
                if (first == -1) {
                    first = i;
                }

                second = i + 1;
            }
        }

        if (first != -1 && second != -1) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

    public static void main(String[] args) {
      
        int[] arr = {3, 8, 6, 7, 5, 9, 10};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        

        findAndFixSwapped(arr);
        
  
        System.out.println("Fixed array: " + Arrays.toString(arr));
    }
}
