import java.util.Arrays;

public class NonOverlappingIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int removals = 0;
        int prevEnd = intervals[0][1]; 

        for (int i = 1; i < intervals.length; i++) {
 
            if (intervals[i][0] >= prevEnd) {
                prevEnd = intervals[i][1]; 
            } else {
           
                removals++;
            }
        }

        return removals;
    }

    public static void main(String[] args) {
  
        int[][] intervals1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println("Minimum removals: " + eraseOverlapIntervals(intervals1)); 


        int[][] intervals2 = {{1, 2}, {1, 2}, {1, 2}};
        System.out.println("Minimum removals: " + eraseOverlapIntervals(intervals2)); 


        int[][] intervals3 = {{1, 2}, {2, 3}};
        System.out.println("Minimum removals: " + eraseOverlapIntervals(intervals3));
    }
}

