import java.util.Arrays;

public class IntervalOverlapCheck {

    static class Interval implements Comparable<Interval> {
        int start, end;
        
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }


        public int compareTo(Interval other) {
            return this.start - other.start;
        }
    }


    public static String isOverlap(Interval[] intervals) {

        Arrays.sort(intervals);

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i].start <= intervals[i - 1].end) {
                return "Yes"; 
            }
        }
        return "No"; 
    }

    public static void main(String[] args) {
    
        Interval[] arr1 = {new Interval(1, 3), new Interval(5, 7), new Interval(2, 4), new Interval(6, 8)};
        System.out.println(isOverlap(arr1)); 

        Interval[] arr2 = {new Interval(1, 3), new Interval(7, 9), new Interval(4, 6), new Interval(10, 13)};
        System.out.println(isOverlap(arr2)); 
    }
}
