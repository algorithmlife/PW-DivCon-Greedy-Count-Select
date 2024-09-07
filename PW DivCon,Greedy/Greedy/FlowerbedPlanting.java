public class FlowerbedPlanting {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
        
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == length - 1 || flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                   
                    flowerbed[i] = 1;
                    n--;  

           
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        return n <= 0;
    }

    public static void main(String[] args) {

        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("Can place flowers: " + canPlaceFlowers(flowerbed1, n1)); 

  
        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println("Can place flowers: " + canPlaceFlowers(flowerbed2, n2));  
    }
}
