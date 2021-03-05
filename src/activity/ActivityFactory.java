package activity;

import java.util.*;

public class ActivityFactory {

    public static HashMap<String, Activity> hm = new HashMap<>();

    public static Activity getInstanceOfActivity(String title, String notes, Date dueDate) {
        Activity a;
        if (hm.isEmpty()) {
            a = new Activity(title, notes, dueDate);
            hm.put(title.toLowerCase(), a);
            System.out.println(a);
            return a;
        } else {
            Activity activity = hm.get(title.toLowerCase());
            if (activity == null) {
                a = new Activity(title, notes, dueDate);
                hm.put(title.toLowerCase(), a);
                System.out.println(a);
                return a;
            }
            else return null;
        }


    }



}
