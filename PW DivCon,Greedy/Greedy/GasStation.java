public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;   
        int currentTank = 0;  
        int startIndex = 0;   
        
        for (int i = 0; i < gas.length; i++) {
            int balance = gas[i] - cost[i];
            totalTank += balance;
            currentTank += balance;

            if (currentTank < 0) {
                startIndex = i + 1;  
                currentTank = 0;     
            }
        }

        return totalTank >= 0 ? startIndex : -1;
    }

    public static void main(String[] args) {

        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2};
        System.out.println("Starting Station: " + canCompleteCircuit(gas1, cost1)); 


        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        System.out.println("Starting Station: " + canCompleteCircuit(gas2, cost2)); 
    }
}
