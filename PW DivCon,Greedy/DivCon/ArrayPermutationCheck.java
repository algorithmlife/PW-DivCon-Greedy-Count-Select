import java.util.Arrays;

public class ArrayPermutationCheck {
    

    public static String isPossible(int[] a, int[] b, int k) {
        int n = a.length;

        Arrays.sort(a);
        
        Arrays.sort(b);
        for (int i = 0; i < n / 2; i++) {
            int temp = b[i];
            b[i] = b[n - i - 1];
            b[n - i - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) {
                return "No";
            }
        }
        return "Yes";
    }
    
    public static void main(String[] args) {

        int[] a1 = {2, 1, 3};
        int[] b1 = {7, 8, 9};
        int k1 = 10;
        System.out.println(isPossible(a1, b1, k1)); 
        
        int[] a2 = {1, 2, 2, 1};
        int[] b2 = {3, 3, 3, 4};
        int k2 = 5;
        System.out.println(isPossible(a2, b2, k2));
    }
}
