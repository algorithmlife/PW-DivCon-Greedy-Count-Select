import java.util.Arrays;

public class SegregatePositiveNegative
{ 
    public static void segregateNumbers(int[] arr)
    {
        int j = 0;  
     
        for (int i = 0; i < arr.length; i++)
        {
      
            if (arr[i] < 0)
            {
  
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
       
                j++;
            }
        }
    }
    
    public static void main(String[] args)
    {
  
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        segregateNumbers(arr);
        
        System.out.println("Segregated array: " + Arrays.toString(arr));
    }
}
