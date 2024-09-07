import java.util.*;

public class ActivitySelection {

    static class Activity {
        int start, finish, index;

        Activity(int start, int finish, int index) {
            this.start = start;
            this.finish = finish;
            this.index = index;
        }
    }

    static void selectActivities(int[] start, int[] finish, int n) {

        List<Activity> activities = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            activities.add(new Activity(start[i], finish[i], i));
        }

        activities.sort(Comparator.comparingInt(a -> a.finish));

        int lastFinishTime = activities.get(0).finish;
        System.out.print(activities.get(0).index + " "); 

        for (int i = 1; i < n; i++) {
   
            if (activities.get(i).start >= lastFinishTime) {
                System.out.print(activities.get(i).index + " "); 
                lastFinishTime = activities.get(i).finish; 
            }
        }
        System.out.println(); 
    }


    public static void main(String[] args) {

        int[] start1 = {10, 12, 20};
        int[] finish1 = {20, 25, 30};
        int n1 = start1.length;
        System.out.print("Selected activities: ");
        selectActivities(start1, finish1, n1); 

        int[] start2 = {1, 3, 0, 5, 8, 5};
        int[] finish2 = {2, 4, 6, 7, 9, 9};
        int n2 = start2.length;
        System.out.print("Selected activities: ");
        selectActivities(start2, finish2, n2); 
    }
}
