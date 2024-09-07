import java.util.*;

public class MinSumProduct {


    static int minProductSum(int[] a, int[] b, int n, int k) {

        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += a[i] * b[i];
        }


        for (int mod = 0; mod < k; mod++) {
   
            int maxImpactIndex = 0;
            int maxImpactValue = Integer.MIN_VALUE; 

            for (int i = 0; i < n; i++) {
                int currentImpact = Math.abs(b[i]) * 2; 
                int potentialImpact = b[i] * 2; 
               
                if (potentialImpact > maxImpactValue) {
                    maxImpactValue = potentialImpact;
                    maxImpactIndex = i;
                }
            }

       
            currentSum -= maxImpactValue; 
            a[maxImpactIndex] += 2 * Integer.signum(b[maxImpactIndex]); 
        }

        return currentSum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3};
        int[] b = {-2, 3, -5};
        int k = 5;
        int n = a.length;

        int result = minProductSum(a, b, n, k);
        System.out.println("Minimum sum of product: " + result);

        int[] a2 = {2, 3, 4, 5, 4};
        int[] b2 = {3, 4, 2, 3, 2};
        int k2 = 3;
        int n2 = a2.length;

        int result2 = minProductSum(a2, b2, n2, k2);
        System.out.println("Minimum sum of product (Test case 2): " + result2);
    }
}
